/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Yuri Strot)
 *******************************************************************************/
package org.eclipse.ecl.internal.debug.runtime;

import static org.eclipse.ecl.debug.runtime.ModelUtils.createEvent;
import static org.eclipse.ecl.debug.runtime.ModelUtils.createStackEvent;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CommandStack;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.Declaration;
import org.eclipse.ecl.core.GetVal;
import org.eclipse.ecl.core.IStackListener;
import org.eclipse.ecl.core.Parallel;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.ProcInstance;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.debug.commands.DebugCommand;
import org.eclipse.ecl.debug.model.BreakpointEvent;
import org.eclipse.ecl.debug.model.Event;
import org.eclipse.ecl.debug.model.EventType;
import org.eclipse.ecl.debug.model.ModelFactory;
import org.eclipse.ecl.debug.model.SkipAllEvent;
import org.eclipse.ecl.debug.model.StackFrame;
import org.eclipse.ecl.debug.model.Variable;
import org.eclipse.ecl.debug.runtime.Session;
import org.eclipse.ecl.debug.runtime.SuspendManager;
import org.eclipse.ecl.gen.ast.AstExec;
import org.eclipse.ecl.gen.ast.AstNode;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.DeclarationContainer;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ServerSession extends Session implements IStackListener {

	private int lastLine = -1;

	public ServerSession(Socket socket, String id) throws CoreException {
		super(socket);
		this.id = id;
		CommandStack.addListener(this);

		request(createEvent(EventType.STARTED));
	}

	@Override
	public void terminate() {
		CommandStack.removeListener(this);
		super.terminate();
		latch.unlock();
	}

	public void enter(CommandStack stack) {
		try {
			List<StackFrame> frames = getFrames(stack);
			if (frames != null) {
				if (stack.getCommand() instanceof GetVal) {
					// Skip get-val commands in processing.
					return;
				}
				if (lastLine != frames.get(0).getLine()) {
					lastLine = -1;
				}
				if (latch.isLocked()) {
					if (stepOver) {
						if (lastLine != frames.get(0).getLine()) {
							lastLine = frames.get(0).getLine();

							request(createStackEvent(EventType.STEP_ENDED, frames));
							await();
						}
					} else {
						if (step) {
							request(createStackEvent(EventType.STEP_ENDED, frames));
						} else {
							request(createStackEvent(EventType.SUSPEND, frames));
						}
						await();
					}
				} else if (isHitBreakpoint(frames.get(0))) {
					if (lastLine != frames.get(0).getLine()) {
						lastLine = frames.get(0).getLine();
						latch.lock();
						request(createStackEvent(EventType.BREAKPOINT_HIT, frames));
						await();
					}
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		} catch (CoreException e) {
			CorePlugin.err(e.getMessage(), e);
			Thread.currentThread().interrupt();
		}
	}

	private Command getCommandParent(CommandStack stack) {
		CommandStack parent = stack.getParent();
		while (parent != null) {
			Command cmd = parent.getCommand();
			if (cmd instanceof Sequence) {
				return cmd;
			} else if (cmd instanceof Pipeline) {
				return cmd;
			} else if (cmd instanceof Parallel) {
				return cmd;
			}
			parent = parent.getParent();
		}
		return null;
	}

	private boolean isHitBreakpoint(StackFrame data) {
		if (skip) {
			// skip all breakpoints
			return false;
		}
		String file = data.getFile();
		Set<Integer> lines = breakpoints.get(file);
		if (lines != null) {
			return lines.contains(data.getLine());
		}
		return false;
	}

	private void await() throws InterruptedException {
		SuspendManager.INSTANCE.fireSuspend();
		try {
			latch.await();
		} finally {
			SuspendManager.INSTANCE.fireResume();
		}
	}

	public void exit(CommandStack stack) {
	}

	@Override
	protected void handle(Event event) {
		switch (event.getType()) {
		case SUSPEND:
			suspend();
			break;
		case RESUME:
			resume();
			break;
		case STEP:
			step();
			break;
		case STEP_OVER:
			stepOver();
			break;
		case BREAKPOINT_ADD:
			addBreakpoint((BreakpointEvent) event);
			break;
		case BREAKPOINT_REMOVE:
			removeBreakpoint((BreakpointEvent) event);
			break;
		case SKIP_ALL:
			skip = ((SkipAllEvent) event).isSkip();
			break;
		default:
			throw new IllegalArgumentException("Unexpected request: " + event);
		}
	}

	@Override
	protected void handle(Exception e) {
		Log.log(e);
	}

	private List<StackFrame> getFrames(CommandStack stack) {
		if (getSource(stack) == null) {
			// no source information for this command stack
			return null;
		}
		DebugCommand debug = getRoot(stack);
		if (debug == null || !id.equals(debug.getSession())) {
			// another session
			return null;
		}
		String path = debug.getPath();
		EMap<String, String> paths = debug.getPaths();
		List<StackFrame> frames = new ArrayList<StackFrame>();
		Command lastCommand = null;
		int id = 0;
		do {
			Command command = stack.getCommand();
			if (command instanceof AstExec) {
				AstExec exec = (AstExec) command;
				String currentPath = getCurrentPath(path, paths, exec);
				StackFrame frame = ModelFactory.eINSTANCE.createStackFrame();
				frame.setFile(currentPath);
				frame.setCommand(exec.getName());
				frame.setLine(exec.getLine());
				frame.getVariables().addAll(extractArgs(lastCommand));

				// Add all variables
				CommandStack current = stack;
				Set<String> variables = new HashSet<String>();
				while (current != null) {
					DeclarationContainer declarations = current.getDeclarations();
					if (declarations != null) {
						for (Declaration d : declarations.declarations()) {
							if (d instanceof Val) {
								Val v = (Val) d;
								if (variables.add(v.getName())) {
									Variable var = ModelFactory.eINSTANCE.createVariable();
									var.setName(v.getName());
									processVariable(var, v.getValue());
									frame.getVariables().add(var);
								}
							}
						}
					}
					if (current.getCommand() instanceof ProcInstance) {
						current = null;
					}
					else {
						current = current.getParent();
					}
				}

				frame.setId(id);
				id++;
				frames.add(frame);
			} else {
				lastCommand = command;
			}
			stack = stack.getParent();
		} while (stack != null);
		return frames;
	}

	private static void processVariable(Variable var, Object value) {
		if (value != null) {
			if (value instanceof EObject) {
				var.setType(((EObject) value).eClass().getName());
			}
			else {
				var.setType(value.getClass().getName());
			}
			if (value instanceof BoxedValue) {
				var.setValue(EcoreUtil.copy((BoxedValue) value));
			}
			else if( value instanceof EObject) {
				EObject obj = (EObject) value;
				for (EStructuralFeature f : obj.eClass()
						.getEAllStructuralFeatures()) {
					if (!obj.eIsSet(f) || f == CorePackage.eINSTANCE.getCommand_Host()
							|| f == CorePackage.eINSTANCE.getCommand_Bindings()) {
						continue;
					}

					Object childValue = obj.eGet(f);
					Variable childVar = ModelFactory.eINSTANCE.createVariable();
					childVar.setType(f.getEType().toString());
					childVar.setName(f.getName());
					if (childValue instanceof EObject) {
						var.setObjectRef((EObject) childValue);
					}
					processVariable(childVar, childValue);

					var.getChildren().add(childVar);
				}
			}
			else {
				var.setValue(BoxedValues.box(value.toString()));
			}
		}
	}

	private String getCurrentPath(String path, EMap<String, String> paths, AstExec exec) {
		String currentPath = path;
		if (exec.getResourceID() != null && paths.containsKey(exec.getResourceID())) {
			currentPath = paths.get(exec.getResourceID());
		}
		return currentPath;
	}

	private static List<Variable> extractArgs(Command command) {
		List<Variable> result = new ArrayList<Variable>();
		if (command == null) {
			return result;
		}
		Variable cmd = ModelFactory.eINSTANCE.createVariable();
		cmd.setName(command.eClass().getName());
		for (EStructuralFeature f : command.eClass()
				.getEAllStructuralFeatures()) {
			if (!command.eIsSet(f) || f == CorePackage.eINSTANCE.getCommand_Host()
					|| f == CorePackage.eINSTANCE.getCommand_Bindings()) {
				continue;
			}

			Object value = command.eGet(f);
			Variable var = ModelFactory.eINSTANCE.createVariable();
			var.setType(f.getEType().toString());
			var.setName(f.getName());
			if (value instanceof EObject) {
				var.setObjectRef((EObject) value);
			}
			processVariable(var, value);

			cmd.getChildren().add(var);
		}
		result.add(cmd);

		return result;
	}

	private AstNode getSource(CommandStack stack) {
		stack = stack.getParent();
		if (stack != null) {
			Command command = stack.getCommand();
			if (command instanceof AstExec) {
				return (AstExec) command;
			}
		}
		return null;
	}

	private static DebugCommand getRoot(CommandStack stack) {
		do {
			Command command = stack.getCommand();
			if (command instanceof DebugCommand) {
				return (DebugCommand) command;
			}
			stack = stack.getParent();
		} while (stack != null);
		return null;
	}

	private synchronized void suspend() {
		latch.lock();
	}

	private synchronized void resume() {
		step = false;
		stepOver = false;
		latch.unlock();
		try {
			request(createEvent(EventType.RESUMED));
		} catch (CoreException e) {
			CorePlugin.err(e.getMessage(), e);
		}
	}

	private void step() {
		step = true;
		stepOver = false;
		latch.lockAfterUnlock();
	}

	private void stepOver() {
		step = false;
		stepOver = true;
		latch.lockAfterUnlock();
	}

	private void addBreakpoint(BreakpointEvent event) {
		Set<Integer> set = breakpoints.get(event.getPath());
		if (set == null) {
			set = new HashSet<Integer>();
			breakpoints.put(event.getPath(), set);
		}
		set.add(event.getLine());
	}

	private void removeBreakpoint(BreakpointEvent event) {
		Set<Integer> set = breakpoints.get(event.getPath());
		if (set != null) {
			set.remove(event.getLine());
		}
		if (set.isEmpty()) {
			breakpoints.remove(event.getPath());
		}
	}

	private volatile boolean step = false;
	private volatile boolean stepOver = false;
	private volatile boolean skip = false;
	private final MultiLatch latch = new MultiLatch();

	private final String id;
	private final Map<String, Set<Integer>> breakpoints = new HashMap<String, Set<Integer>>();

}
