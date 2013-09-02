package org.eclipse.ecl.internal.debug.runtime;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CommandStack;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.Declaration;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Proc;
import org.eclipse.ecl.core.ProcInstance;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.core.util.CommandToStringConverter;
import org.eclipse.ecl.debug.commands.DebugCommand;
import org.eclipse.ecl.debug.model.ModelFactory;
import org.eclipse.ecl.debug.model.StackFrame;
import org.eclipse.ecl.debug.model.Variable;
import org.eclipse.ecl.gen.ast.AstExec;
import org.eclipse.ecl.gen.ast.AstNode;
import org.eclipse.ecl.internal.core.DeclarationContainer;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EclStackSupport {
	private String id;
	private CommandToStringConverter converter = new CommandToStringConverter();
	private long varId = 0;

	public EclStackSupport(String id) {
		this.id = id;
	}

	private DebugCommand getRoot(CommandStack stack) {
		do {
			Command command = stack.getCommand();
			if (command instanceof DebugCommand) {
				return (DebugCommand) command;
			}
			stack = stack.getParent();
		} while (stack != null);
		return null;
	}

	public List<StackFrame> getFrames(CommandStack stack) {
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
				frame.getVariables().addAll(createCommandVariable(lastCommand));

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
									Variable var = createVariable(v.getValue());
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

	private void processVariable(Variable var, Object value) {
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
			else if (!isComplexValue(value)) {
				var.setValue(BoxedValues.box(value.toString()));
			}
		}
	}

	private boolean isComplexValue(Object value) {
		if( value instanceof BoxedValue) {
			return false;
		}
		return value instanceof EObject || value instanceof List;
	}

	public void processObjectValue(Variable var, Object value) {
		if (!isComplexValue(value)) {
			return;
		}
		if (value instanceof EObject) {
			var.getChildren().clear();
			processEObject(var, value);
		}
		else if (value instanceof List) {
			var.getChildren().clear();
			List list = (List) value;
			int index = 0;
			var.setType(List.class.getName());
			for (Object object : list) {
				Variable childVar = createVariable(object);
				childVar.setName("[" + Integer.toString(index) + "]");
				processVariable(childVar, object);
				var.getChildren().add(childVar);
				index++;
			}
		}
	}

	private void processEObject(Variable var, Object value) {
		EObject obj = (EObject) value;
		for (EStructuralFeature f : obj.eClass()
				.getEAllStructuralFeatures()) {
			if (!obj.eIsSet(f) || f == CorePackage.eINSTANCE.getCommand_Host()
					|| f == CorePackage.eINSTANCE.getCommand_Bindings()) {
				continue;
			}

			Object childValue = obj.eGet(f);

			if (isChildFiltered(childValue)) {
				continue;
			}

			Variable childVar = createVariable(childValue);
			childVar.setType(f.getEType().toString());
			childVar.setName(f.getName());
			processVariable(childVar, childValue);

			var.getChildren().add(childVar);
		}
	}

	private boolean isChildFiltered(Object childValue) {
		if (childValue instanceof AstExec || childValue instanceof Pipeline || childValue instanceof Sequence
				|| childValue instanceof Proc) {
			return true;
		}
		return false;
	}

	private String getCurrentPath(String path, EMap<String, String> paths, AstExec exec) {
		String currentPath = path;
		if (exec.getResourceID() != null && paths.containsKey(exec.getResourceID())) {
			currentPath = paths.get(exec.getResourceID());
		}
		return currentPath;
	}

	private List<Variable> createCommandVariable(Command command) {
		List<Variable> result = new ArrayList<Variable>();
		if (command == null) {
			return result;
		}
		Variable cmd = createVariable(command);
		cmd.setName(converter.convert(command));
		for (EStructuralFeature f : command.eClass()
				.getEAllStructuralFeatures()) {
			if (!command.eIsSet(f) || f == CorePackage.eINSTANCE.getCommand_Host()
					|| f == CorePackage.eINSTANCE.getCommand_Bindings()) {
				continue;
			}

			Object value = command.eGet(f);
			if (isChildFiltered(value)) {
				continue;
			}
			Variable var = createVariable(value);
			var.setType(f.getEType().toString());
			var.setName(f.getName());
			processVariable(var, value);

			cmd.getChildren().add(var);
		}
		result.add(cmd);

		return result;
	}

	private synchronized Variable createVariable(Object value) {
		Variable cmd = ModelFactory.eINSTANCE.createVariable();
		cmd.setId(this.id + varId);
		varId++;
		cmd.setComplex(isComplexValue(value));
		cmd.setObjectRef(value);
		return cmd;
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

	public void resolveVariable(Variable var) {
		if (var.getObjectRef() != null) {
			processObjectValue(var, var.getObjectRef());
		}
	}

}
