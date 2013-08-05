/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.internal.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.ExecutableParameter;
import org.eclipse.ecl.core.LiteralParameter;
import org.eclipse.ecl.core.Parameter;
import org.eclipse.ecl.core.util.EclCommandNameConvention;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.ParamConverterManager;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.FQName;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IParamConverter;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.NLS;

public class ExecService implements ICommandService {

	public IStatus service(Command command, IProcess process)
			throws InterruptedException, CoreException {
		Exec exec = (Exec) command;
		List<Object> input = CoreUtils.readPipeContent(process.getInput());
		return exec(
				new FQName(null, EclCommandNameConvention.toScriptletName(exec
						.getName())), exec.getParameters(), process, input);
	}

	private IStatus exec(FQName fqn, List<Parameter> params, IProcess process,
			List<Object> input) throws CoreException, InterruptedException {
		Command target = CoreUtils.createCommand(fqn.ns, fqn.name);

		List<Object> inputList = new ArrayList<Object>(input);

		IStatus status = evalParameters(target, params, process, inputList);
		if (!status.isOK())
			return status;

		IPipe inputPipe = process.getSession().createPipe();
		for (Object o : inputList)
			inputPipe.write(o);
		inputPipe.close(Status.OK_STATUS);
		IProcess targetProcess = process.getSession().execute(target,
				inputPipe, process.getOutput());
		return targetProcess.waitFor();
	}

	private IStatus evalParameters(Command target, List<Parameter> params,
			IProcess process, List<Object> input) throws CoreException,
			InterruptedException {
		EClass targetClass = target.eClass();

		List<EStructuralFeature> features = CoreUtils.getFeatures(targetClass);
		int cmdCommandSize = 0;
		Map<String, EStructuralFeature> map = new HashMap<String, EStructuralFeature>();
		boolean hasNonLimited = false;
		for (EStructuralFeature feature : features) {
			if (isInternalFeature(feature)) {
				// Skipping internal parameter
				continue;
			}
			String name = feature.getName();
			if (map.containsKey(name)) {
				return createErrorStatus(NLS.bind(
						"Duplicate parameter name: {0}", name));
			}
			map.put(name, feature);
			int upperBound = feature.getUpperBound();
			if (upperBound == -1) {
				hasNonLimited = true;
			}
			cmdCommandSize += upperBound;
		}

		int i = 0;
		boolean processUnnamed = canProcessUnnamed(targetClass);
		boolean fullSet = (params.size() == cmdCommandSize) && !hasNonLimited;
		boolean inputUsed = false;
		for (Parameter param : params) {
			if (param.eIsSet(CorePackage.eINSTANCE.getParameter_Name())) {
				processUnnamed = false;
			} else {
				if (!processUnnamed) {
					return createErrorStatus("Unnamed parameters disallowed after named ones");
				}
			}
			EStructuralFeature feature = processUnnamed ? features.get(i++)
					: map.get(param.getName());

			if (feature == null) {
				return createErrorStatus(NLS.bind(
						"Invalid parameter name: {0}", param.getName()));
			}
			if (processUnnamed && isInputFeature(feature)
					&& (input.size() > 0 && !fullSet)) {
				// Skipping input parameter
				feature = features.get(i++);
			}
			if (isInternalFeature(feature)) {
				// Skipping internal parameter
				feature = features.get(i++);
			}

			evalParameterValue(target, param, feature, process, input);
			if (isInputFeature(feature)) {
				inputUsed = true;
			}
			// TODO support any upper bound
			if (feature.getUpperBound() == -1)
				i--;
		}

		if (inputUsed) {
			input.clear();
		}
		return Status.OK_STATUS;
	}

	private boolean isInternalFeature(EStructuralFeature feature) {
		return feature.getEAnnotation(CoreUtils.INTERNAL_ANN) != null;
	}

	private boolean isInputFeature(EStructuralFeature feature) {
		return feature.getEAnnotation(CoreUtils.INPUT_ANN) != null;
	}

	private void evalParameterValue(Command target, Parameter param,
			EStructuralFeature feature, IProcess process, List<Object> input)
			throws CoreException, InterruptedException {
		Object value = null;
		if (param instanceof LiteralParameter) {
			LiteralParameter literal = (LiteralParameter) param;
			Class<?> instanceClass = feature.getEType().getInstanceClass();
			List<String> allowedTypes = CoreUtils.getMetaTypeList(feature);
			try {
				if (feature.getEType() instanceof EEnum) {
					value = processEnumValue(feature, literal);
				}
				// Type to converter thought IParamConverter
				if (value == null) {
					value = convertValue(value, literal, instanceClass,
							allowedTypes);
				}

				if (value == null) {
					value = getBoxedValue(literal, instanceClass, allowedTypes);
				}
				// Type to converter thought EcoreUtil.createFromString
				if (value == null && feature.getEType() instanceof EDataType) {
					value = EcoreUtil.createFromString(
							(EDataType) feature.getEType(),
							literal.getLiteral());
				}
			} catch (Exception e) {
				// Exception while converting
				if (e instanceof CoreException) {
					throw (CoreException) e;
				}
				IStatus status = new Status(IStatus.ERROR,
						CorePlugin.PLUGIN_ID, "Parameter conversion failed: "
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
		} else if (param instanceof ExecutableParameter) {
			value = processExecutableValue(param, process, input);
		} else {
			throw new RuntimeException("Invalid parameter");
		}

		try {
			// box or unbox
			value = processBoxUnbox(feature, value);

			if (feature.getUpperBound() == 1) {
				target.eSet(feature, value);
			} else {
				@SuppressWarnings("unchecked")
				List<Object> list = (List<Object>) target.eGet(feature);
				if (value instanceof List)
					list.addAll((List<?>) value);
				else
					list.add(value);
			}
		} catch (ClassCastException cce) {
			IStatus status = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"Can't assign value " + value + " to parameter "
							+ feature.getName(), cce);
			throw new CoreException(status);
		}
	}

	private Object processBoxUnbox(EStructuralFeature feature, Object value) {
		if (value instanceof List) {
			value = CoreUtils.convert((List<Object>) value, feature);
		} else {
			value = CoreUtils.convert(Arrays.asList(value), feature).get(0);
		}
		return value;
	}

	private Object processExecutableValue(Parameter param, IProcess process,
			List<Object> input) throws CoreException, InterruptedException {
		Object value;
		ExecutableParameter execParam = (ExecutableParameter) param;
		IPipe childInput = process.getSession().createPipe();
		IPipe childOutput = process.getSession().createPipe();
		for (Object o : input)
			childInput.write(o);
		childInput.close(Status.OK_STATUS);
		IProcess childProcess = process.getSession().execute(
				execParam.getCommand(), childInput, childOutput);
		IStatus status = childProcess.waitFor();
		if (!status.isOK())
			throw new CoreException(status);
		List<Object> content = CoreUtils.readPipeContent(childOutput);
		if (content.size() == 1) {
			value = content.get(0);
		} else {
			value = content;
		}
		return value;
	}

	private Object convertValue(Object value, LiteralParameter literal,
			Class<?> instanceClass, List<String> allowedTypes)
			throws CoreException {
		IParamConverter<?> converter = ParamConverterManager.getInstance()
				.getConverter(instanceClass);
		if (converter != null) {
			value = converter.convert(literal, allowedTypes);
		}
		return value;
	}

	private Object processEnumValue(EStructuralFeature feature,
			LiteralParameter literal) throws CoreException {
		Object value;
		EEnum en = (EEnum) feature.getEType();
		EEnumLiteral eEnumLiteral = en.getEEnumLiteral(literal.getLiteral());
		if (eEnumLiteral == null) {
			IStatus status = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"Invalid constant: " + literal.getLiteral());
			throw new CoreException(status);
		}
		value = eEnumLiteral.getInstance();
		return value;
	}

	private Object getBoxedValue(LiteralParameter literal,
			Class<?> instanceClass, List<String> allowedTypes)
			throws CoreException {
		if (!instanceClass.equals(EObject.class)) {
			return null;
		}
		Object val = literal.getLiteral();
		IParamConverter<Object> converter = ParamConverterManager.getInstance()
				.getConverter(Object.class);
		if (converter != null) {
			val = converter.convert(literal, allowedTypes);
		}

		return val;
	}

	private boolean canProcessUnnamed(EClass targetClass) throws CoreException {
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

	private void checkBounds(int lower, int upper) throws CoreException {
		if (lower < 0) {
			throw new CoreException(createErrorStatus(NLS.bind(
					"Lower bounds is invalid: {0}", lower)));
		}
		if (upper == 0 || upper < -1) {
			throw new CoreException(createErrorStatus(NLS.bind(
					"Upper bounds is invalid: {0}", upper)));
		}
	}

	private Status createErrorStatus(String message) {
		return new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID, message);
	}

}
