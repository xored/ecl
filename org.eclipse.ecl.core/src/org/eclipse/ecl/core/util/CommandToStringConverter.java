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
		doConvert(command, formatter, false);
		return formatter.toString();
	}

	protected void doConvert(Command command, ICommandFormatter formatter,
			boolean hasInput) {
		if (command instanceof Sequence) {
			convertSequence((Sequence) command, formatter, hasInput);
		} else if (command instanceof Pipeline) {
			convertPipeline((Pipeline) command, formatter, hasInput);
		} else if (command instanceof Exec) {
			convertExec((Exec) command, formatter, hasInput);
		} else {
			convertSimple(command, formatter, hasInput);
		}
	}

	private void convertExec(Exec exec, ICommandFormatter formatter,
			boolean hasInput) {
		if (exec.getNamespace() != null)
			formatter.addCommandName(exec.getNamespace() + "::"
					+ exec.getName());
		else
			formatter.addCommandName(exec.getName());
		for (Parameter p : exec.getParameters()) {
			formatter.addAttrName(p.getName(), p.getName() != null
					&& p.getName().length() > 0);
			if (p instanceof LiteralParameter)
				formatter.addAttrValue(((LiteralParameter) p).getLiteral());
			else if (p instanceof ExecutableParameter) {
				formatter.openExec();
				doConvert(((ExecutableParameter) p).getCommand(), formatter,
						hasInput);
				formatter.openExec();
			}
			// TODO else what?? exception or log or what?
		}
	}

	protected void convertSequence(Sequence sequence,
			ICommandFormatter formatter, boolean hasInput) {
		List<Command> commands = sequence.getCommands();
		for (int i = 0; i < commands.size(); i++) {
			formatter.newSequenceCommand();
			doConvert(commands.get(i), formatter, hasInput);
		}
	}

	protected void convertPipeline(Pipeline pipeline,
			ICommandFormatter formatter, boolean hasInput) {
		List<Command> commands = pipeline.getCommands();
		for (int i = 0; i < commands.size(); i++) {
			formatter.newPipeCommand();
			doConvert(commands.get(i), formatter, i > 0 || hasInput);
		}
	}

	protected void convertSimple(Command command, ICommandFormatter formatter,
			boolean hasInput) {
		String commandName = CoreUtils
				.getScriptletNameByClass(command.eClass());
		formatter.addCommandName(commandName);

		Map<EStructuralFeature, Command> bindingMap = new HashMap<EStructuralFeature, Command>();
		for (Binding b : command.getBindings()) {
			bindingMap.put(b.getFeature(), b.getCommand());
		}

		List<EStructuralFeature> attributes = CoreUtils.getFeatures(command
				.eClass());

		boolean forced = false;

		for (EStructuralFeature feature : attributes) {
			if (feature.getEAnnotation(CoreUtils.INPUT_ANN) != null)
				continue;
			String name = feature.getName();
			if ("index".equals(name) || "after".equals(name))
				forced = true;
			Object val = command.eGet(feature);
			boolean skippped = true;
			if (val != null) {
				if (feature instanceof EAttribute) {
					EAttribute attr = (EAttribute) feature;
					String type = attr.getEAttributeType()
							.getInstanceTypeName();
					if (val instanceof List<?>) {
						List<?> list = (List<?>) val;
						for (Object o : list) {
							String value = convertValue(o, type);
							if (value != null) {
								formatter.addAttrName(name, forced);
								formatter.addAttrValue(value);
								skippped = false;
							}
						}
					} else {
						String value = convertValue(val, type);
						if (value != null) {
							formatter.addAttrName(name, forced);
							formatter.addAttrValue(value);
							skippped = false;
						}
					}
				} else {
					EReference ref = (EReference) feature;
					EClass eclass = ref.getEReferenceType();
					if (eclass.getClassifierID() == CorePackage.COMMAND) {
						Command inner = (Command) val;
						if (inner instanceof Sequence) {
							// TODO FIXIT!!!
							formatter.addAttrName(name, forced);
							formatter.openGroup(false);
							doConvert(inner, formatter, hasInput);
							formatter.closeGroup(false);
						} else {
							formatter.addAttrName(name, forced);
							formatter.openGroup(true);
							doConvert(inner, formatter, hasInput);
							formatter.closeGroup(true);
						}
						skippped = false;
					}
				}
			} else {
				Command c = bindingMap.get(feature);
				if (c != null) {
					formatter.addAttrName(name, forced);
					formatter.openExec();
					doConvert(c, formatter, hasInput);
					formatter.closeExec();
					skippped = false;
				}
			}
			if (skippped)
				forced = true;
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
				value = value.replace("\t", "\\t");
				value = value.replace("\b", "\\b");
				value = value.replace("\n", "\\n");
				value = value.replace("\r", "\\r");
				value = value.replace("\f", "\\f");
				value = value.replace("'", "\\'");
				value = value.replace("\"", "\\\"");
				value = value.replace("\\", "\\\\");
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
