package org.eclipse.ecl.runtime;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Block;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.ExecutableParameter;
import org.eclipse.ecl.core.LiteralParameter;
import org.eclipse.ecl.core.Parallel;
import org.eclipse.ecl.core.Parameter;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.core.util.EclCommandNameConvention;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.ParamConverterManager;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EclCompiler {
	public static Command compile(Command command) throws CoreException {
		return compile(command, false);
	}

	public static Command compile(Command command, boolean hasInput)
			throws CoreException {
		if (command instanceof Exec) {
			Exec exec = (Exec) command;
			return compile(
					new FQName(null,
							EclCommandNameConvention.toScriptletName(exec
									.getName())), exec.getParameters(),
					hasInput);
		}
		if (command instanceof Block) {
			Block block = (Block) command;
			for (int i = 0; i < block.getCommands().size(); i++) {
				boolean innerHasInput = false;
				if (block instanceof Sequence)
					innerHasInput = hasInput;
				else if (block instanceof Pipeline)
					if (i == 0)
						innerHasInput = hasInput;
					else
						innerHasInput = true;
				else if (block instanceof Parallel)
					innerHasInput = hasInput;
				block.getCommands().set(i,
						compile(block.getCommands().get(i), innerHasInput));
			}
		}
		return command;
	}

	public static Command compile(FQName fqn, List<Parameter> params,
			boolean hasInput) throws CoreException {
		Command target = CoreUtils.createCommand(fqn.ns, fqn.name);
		EClass targetClass = target.eClass();

		List<EStructuralFeature> features = CoreUtils.getFeatures(targetClass);
		Map<String, EStructuralFeature> map = new HashMap<String, EStructuralFeature>();
		for (EStructuralFeature feature : features) {
			map.put(feature.getName(), feature);
			// FIXME handle name conflicts!!!!
		}

		int i = 0;
		boolean processUnnamed = canProcessUnnamed(targetClass);
		for (Parameter param : params) {
			if (param.eIsSet(CorePackage.eINSTANCE.getParameter_Name())) {
				processUnnamed = false;
			} else {
				if (!processUnnamed) {
					IStatus status = new Status(IStatus.ERROR,
							CorePlugin.PLUGIN_ID,
							"Unnamed parameters disallowed after named ones");
					throw new CoreException(status);
				}
			}

			EStructuralFeature feature = processUnnamed ? features.get(i++)
					: map.get(param.getName());

			if (feature == null) {
				IStatus status = new Status(IStatus.ERROR,
						CorePlugin.PLUGIN_ID, MessageFormat.format(
								"Invalid parameter name: {0}",
								new Object[] { param.getName() }));
				throw new CoreException(status);
			}
			if (processUnnamed
					&& feature.getEAnnotation(CoreUtils.INPUT_ANN) != null
					&& hasInput)
				feature = features.get(i++);
			evalFeatureValue(target, param, feature, hasInput);
			// TODO support any upper bound
			if (feature.getUpperBound() == -1)
				i--;
		}
		return target;
	}

	private static boolean canProcessUnnamed(EClass targetClass)
			throws CoreException {
		boolean wasOptional = false;
		for (EStructuralFeature feature : targetClass.getEStructuralFeatures()) {
			int lower = feature.getLowerBound();
			int upper = feature.getUpperBound();
			checkBounds(lower, upper);
			if (lower == 0) {
				wasOptional = true;
			} else if (wasOptional) {
				return false;
			}
		}
		return true;
	}

	private static void checkBounds(int lower, int upper) throws CoreException {
		if (lower < 0) {
			IStatus status = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"Lower bounds is negative");
			throw new CoreException(status);
		}
		if (upper > 1) {
			// TODO correct message
			IStatus status = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"Upper bounds more than one is not supported yet");
			throw new CoreException(status);
		}
	}

	private static void evalFeatureValue(Command target, Parameter param,
			EStructuralFeature feature, boolean hasInput) throws CoreException {
		Object value = null;
		switch (param.eClass().getClassifierID()) {
		case CorePackage.LITERAL_PARAMETER:
			LiteralParameter literal = (LiteralParameter) param;
			Class<?> instanceClass = feature.getEType().getInstanceClass();
			try {
				if (feature.getEType() instanceof EEnum) {
					EEnum en = (EEnum) feature.getEType();
					EEnumLiteral eEnumLiteral = en.getEEnumLiteral(literal
							.getLiteral());
					if (eEnumLiteral == null) {
						IStatus status = new Status(IStatus.ERROR,
								CorePlugin.PLUGIN_ID, "Invalid constant: "
										+ literal.getLiteral());
						throw new CoreException(status);
					}
					value = eEnumLiteral.getInstance();
				}
				// Type to converter thought IParamConverter
				if (value == null) {
					IParamConverter<?> converter = ParamConverterManager
							.getInstance().getConverter(instanceClass);
					if (converter != null) {
						value = converter.convert(literal.getLiteral());
						if (value instanceof Command) {
							value = compile((Command) value, true);
						}
					}
				}
				// Type to converter thought EcoreUtil.createFromString
				if (value == null && feature.getEType() instanceof EDataType) {
					value = EcoreUtil.createFromString(
							(EDataType) feature.getEType(),
							literal.getLiteral());
				}
			} catch (Exception e) {
				// Exception while converting
				IStatus status = new Status(IStatus.ERROR,
						CorePlugin.PLUGIN_ID, "Can't assign value " + value
								+ " to attribute " + feature.getName() + ": "
								+ e.getMessage(), e);
				throw new CoreException(status);
			}
			// If failed to convert emit error
			if (value == null) {
				IStatus status = new Status(IStatus.ERROR,
						CorePlugin.PLUGIN_ID, "Can't convert value "
								+ literal.getLiteral() + " to type "
								+ instanceClass.getSimpleName());
				throw new CoreException(status);
			}
			try {
				if (feature.getUpperBound() == 1) {
					target.eSet(feature, value);
				} else {
					@SuppressWarnings("unchecked")
					List<Object> list = (List<Object>) target.eGet(feature);
					list.add(value);
				}
			} catch (ClassCastException cce) {
				IStatus status = new Status(IStatus.ERROR,
						CorePlugin.PLUGIN_ID, "Can't assign value " + value
								+ " to attribute " + feature.getName(), cce);
				throw new CoreException(status);
			}
			break;
		case CorePackage.EXECUTABLE_PARAMETER:
			Binding binding = CoreFactory.eINSTANCE.createBinding();
			binding.setFeature(feature);
			ExecutableParameter execParam = (ExecutableParameter) param;
			binding.setCommand(compile(execParam.getCommand(), hasInput));
			target.getBindings().add(binding);
			break;
		default:
			throw new RuntimeException("Invalid parameter");
		}
	}
}
