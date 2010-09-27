package org.eclipse.ecl.core.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
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
		} else {
			convertSimple(command, formatter);
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
		String commandName = getScriptletNameByClass(command);
		formatter.addCommandName(commandName);

		Map<EStructuralFeature, Command> bindingMap = new HashMap<EStructuralFeature, Command>();
		for (Binding b : command.getBindings()) {
			bindingMap.put(b.getFeature(), b.getCommand());
		}

		List<EStructuralFeature> attributes = command.eClass()
				.getEAllStructuralFeatures();

		for (EStructuralFeature feature : attributes) {
			String name = feature.getName();
			Object val = command.eGet(feature);
			if (val != null) {
				if (feature instanceof EAttribute) {
					EAttribute attr = (EAttribute) feature;
					String type = attr.getEAttributeType()
							.getInstanceTypeName();
					String value = new String(val.toString());
					if (type.equals("boolean") && value.equals("false")
							|| type.equals("int") && value.equals("0"))
						continue;

					String opening = "", closing = "";
					if (type.equals("boolean") && value.equals("true")) {
						value = "";
					} else {
						if (!value.matches("[a-zA-Z0-9]*")) {
							opening = "\"";
							closing = "\"";
						}
					}
					formatter.addAttrName(name);
					formatter.addAttrValue(opening + value + closing);
				} else {
					EReference ref = (EReference) feature;
					EClass eclass = ref.getEReferenceType();
					if (eclass.getClassifierID() == CorePackage.COMMAND) {
						Command inner = (Command) val;
						formatter.addAttrName(name);
						if (inner instanceof Sequence) {
							// TODO FIXIT!!!
							formatter.openGroup();
							doConvert(inner, formatter);
							formatter.closeGroup();
						} else {
							formatter.openExec();
							doConvert(inner, formatter);
							formatter.closeExec();
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

	protected String getScriptletNameByClass(Command command) {

		String className = command.eClass().getName();

		int startPos = className.lastIndexOf('.');
		if (startPos != -1) {
			className = className.substring(startPos);
		}
		if (className.endsWith("Impl")) {
			className = className.substring(0, className.length() - 4);
		}

		if (className.endsWith("Command")) {
			className = className.substring(0, className.length() - 9);
		}
		StringBuffer result = new StringBuffer();
		for (int index = 0; index < className.length(); index++) {
			char symbol = className.charAt(index);
			if (Character.isUpperCase(symbol)) {
				if (index != 0)
					result.append('-');
				symbol = Character.toLowerCase(symbol);
			}
			result.append(symbol);
		}

		return result.toString();

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
