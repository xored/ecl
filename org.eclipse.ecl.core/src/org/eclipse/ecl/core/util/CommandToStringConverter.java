package org.eclipse.ecl.core.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.ExecutableParameter;
import org.eclipse.ecl.core.LiteralParameter;
import org.eclipse.ecl.core.Parameter;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class CommandToStringConverter {

	public String convert(Command command) {
		return convert(command, new DefaultFormatter());
	}

	public String convert(Command command, ICommandFormatter formatter) {
		doConvert(command, formatter);
		return formatter.toString();
	}

	protected void doConvert(Command command, ICommandFormatter formatter) {
		if (command instanceof Sequence) {
			convertSequence((Sequence) command, formatter);
		} else if (command instanceof Pipeline) {
			convertPipeline((Pipeline) command, formatter);
		} else if (command instanceof Exec) {
			convertExec((Exec) command, formatter);
		} else {
			convertSimple(command, formatter);
		}
	}

	private void convertExec(Exec exec, ICommandFormatter formatter) {
		if (exec.getNamespace() != null)
			formatter.addCommandName(exec.getNamespace() + "::"
					+ exec.getName());
		else
			formatter.addCommandName(exec.getName());
		for (Parameter p : exec.getParameters()) {
			formatter.addAttrName(p.getName());
			if (p instanceof LiteralParameter)
				formatter.addAttrValue(((LiteralParameter) p).getLiteral());
			else if (p instanceof ExecutableParameter) {
				formatter.openExec();
				doConvert(((ExecutableParameter) p).getCommand(), formatter);
				formatter.openExec();
			}
			// TODO else what?? exception or log or what?
		}
	}

	protected void convertSequence(Sequence sequence,
			ICommandFormatter formatter) {
		List<Command> commands = sequence.getCommands();
		for (int i = 0; i < commands.size(); i++) {
			formatter.newSequenceCommand();
			doConvert(commands.get(i), formatter);
		}
	}

	protected void convertPipeline(Pipeline pipeline,
			ICommandFormatter formatter) {
		List<Command> commands = pipeline.getCommands();
		for (int i = 0; i < commands.size(); i++) {
			formatter.newPipeCommand();
			doConvert(commands.get(i), formatter);
		}
	}

	protected void convertSimple(Command command, ICommandFormatter formatter) {
		String commandName = CoreUtils
				.getScriptletNameByClass(command.eClass());
		formatter.addCommandName(commandName);

		Map<EStructuralFeature, Command> bindingMap = new HashMap<EStructuralFeature, Command>();
		for (Binding b : command.getBindings()) {
			bindingMap.put(b.getFeature(), b.getCommand());
		}

		List<EStructuralFeature> attributes = CoreUtils.getFeatures(command
				.eClass());

		for (EStructuralFeature feature : attributes) {
			String name = feature.getName();
			Object val = command.eGet(feature);
			if (val != null) {
				if (feature instanceof EAttribute) {
					EAttribute attr = (EAttribute) feature;
					String type = attr.getEAttributeType()
							.getInstanceTypeName();
					// formatter.addAttrName(name);
					if (val instanceof List<?>) {
						List<?> list = (List<?>) val;
						for (Object o : list) {
							String value = convertValue(o, type);
							if (value != null) {
								formatter.addAttrValue(value);
							}
						}
					} else {
						String value = convertValue(val, type);
						if (value != null) {
							formatter.addAttrValue(value);
						}
					}
				} else {
					EReference ref = (EReference) feature;
					EClass eclass = ref.getEReferenceType();
					if (eclass.getClassifierID() == CorePackage.COMMAND) {
						Command inner = (Command) val;
						// formatter.addAttrName(name);
						if (inner instanceof Sequence) {
							// TODO FIXIT!!!
							formatter.openGroup(false);
							doConvert(inner, formatter);
							formatter.closeGroup(false);
						} else {
							formatter.openGroup(true);
							doConvert(inner, formatter);
							formatter.closeGroup(true);
						}
					}
				}
			} else {
				Command c = bindingMap.get(feature);
				if (c != null) {
					formatter.openExec();
					doConvert(c, formatter);
					formatter.closeExec();
				}
			}
		}
	}

	protected String convertValue(Object val, String type) {
		String value = new String(val.toString());
		if (type.equals("boolean") && value.equals("false")
				|| type.equals("int") && value.equals("0"))
			return null;

		String opening = "", closing = "";
		if (type.equals("boolean") && value.equals("true")) {
			value = "";
		} else {
			if (!value.matches("[a-zA-Z0-9]*") || value.length() == 0) {
				value = value.replace("\"", "\\\"");
				opening = "\"";
				closing = "\"";
			}
		}
		return opening + value + closing;
	}

	protected static class Counter {
		private int value;

		public Counter(int startValue) {
			this.value = startValue;
		}

		public int getNextValue() {
			return ++value;
		}
	}
}
