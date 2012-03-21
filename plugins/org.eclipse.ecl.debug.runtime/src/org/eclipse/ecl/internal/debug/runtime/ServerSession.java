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

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CommandStack;
import org.eclipse.ecl.core.IStackListener;
import org.eclipse.ecl.core.Parallel;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.debug.commands.DebugCommand;
import org.eclipse.ecl.debug.runtime.Session;
import org.eclipse.ecl.debug.runtime.StackFrame;
import org.eclipse.ecl.debug.runtime.SuspendManager;
import org.eclipse.ecl.debug.runtime.events.BreakpointEvent;
import org.eclipse.ecl.debug.runtime.events.BreakpointHitEvent;
import org.eclipse.ecl.debug.runtime.events.Event;
import org.eclipse.ecl.debug.runtime.events.EventType;
import org.eclipse.ecl.debug.runtime.events.SkipAllEvent;
import org.eclipse.ecl.debug.runtime.events.StepEndEvent;
import org.eclipse.ecl.debug.runtime.events.SuspendEvent;
import org.eclipse.ecl.gen.ast.AstExec;
import org.eclipse.ecl.gen.ast.AstNode;

public class ServerSession extends Session implements IStackListener {

	private int lastLine = -1;

	public ServerSession(Socket socket, String id) throws IOException {
		super(socket);
		this.id = id;
		CommandStack.addListener(this);
		request(new Event(EventType.STARTED));
	}

	@Override
	public void terminate() {
		CommandStack.removeListener(this);
		super.terminate();
		latch.unlock();
	}

	@Override
	public void enter(CommandStack stack) {
		try {
			StackFrame[] frames = getFrames(stack);
			if (frames != null) {
				if (latch.isLocked()) {
					if (stepOver) {
						if (lastLine != frames[0].getLine()) {
							lastLine = frames[0].getLine();
							// Command commandParent = getCommandParent(stack);
							// if (((commandParent == null) || commandParent
							// instanceof Sequence)
							// && !(stack.getCommand() instanceof Pipeline)) {
							request(new StepEndEvent(frames));
							await();
							// }
						}
					} else {
						if (step) {
							request(new StepEndEvent(frames));
						} else {
							request(new SuspendEvent(frames));
						}
						await();
					}
				} else if (isHitBreakpoint(frames[0])) {
					if (lastLine != frames[0].getLine()) {
						lastLine = frames[0].getLine();
						latch.lock();
						request(new BreakpointHitEvent(frames));
						await();
					}
				}
			}
		} catch (InterruptedException e) {
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

	@Override
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

	private StackFrame[] getFrames(CommandStack stack) {
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
		List<StackFrame> frames = new ArrayList<StackFrame>();
		do {
			Command command = stack.getCommand();
			if (command instanceof AstExec) {
				AstExec exec = (AstExec) command;
				StackFrame frame = new StackFrame(path, exec.getName(),
						exec.getLine());
				frames.add(frame);
			}
			stack = stack.getParent();
		} while (stack != null);
		if (frames.size() == 0)
			return null;
		return frames.toArray(new StackFrame[0]);
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
		request(new Event(EventType.RESUMED));
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
