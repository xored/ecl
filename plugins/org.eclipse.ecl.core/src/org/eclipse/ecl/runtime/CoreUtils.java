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
package org.eclipse.ecl.runtime;

import java.io.InputStream;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.EclInteger;
import org.eclipse.ecl.core.EclString;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.EMFStreamPipe;
import org.eclipse.ecl.internal.core.IMarkeredPipe;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class CoreUtils {

	public static final String INPUT_ANN = "http://www.eclipse.org/ecl/input";
	public static final String INTERNAL_ANN = "http://www.eclipse.org/ecl/internal";

	/**
	 * Creates command parameters class using namespace and name specified
	 * 
	 * @param namespace
	 *            EMF package namespace
	 * @param name
	 *            class name from EMF package
	 * @return
	 * @throws CoreException
	 */
	public static Command createCommand(String namespace, String name)
			throws CoreException {
		return CorePlugin.getScriptletManager().createCommand(namespace, name);
	}

	public static Set<String> getFriendlyNames(String ns, String name)
			throws CoreException {
		return CorePlugin.getScriptletManager().getFriendlyNames(ns, name);
	}

	public static IMarkeredPipe createEMFPipe(InputStream in, OutputStream out) {
		return new EMFStreamPipe(in, out);
	}

	/**
	 * It tries to cast <code>value</code> into {@link Integer}, then into
	 * {@link Double} and finally into {@link Boolean}. If it is failed, return
	 * <code>value</code> itself as {@link String}
	 * 
	 * @param value
	 * @return casted object
	 */
	public static Object createPrimitiveFromString(String value) {
		try {
			return Integer.decode(value);
		} catch (NumberFormatException e0) {
			try {
				return Double.valueOf(value);
			} catch (NumberFormatException e1) {
				if (value.equalsIgnoreCase("true")
						|| value.equalsIgnoreCase("false")) {
					return Boolean.valueOf(value);
				}
				return value;
			}
		}
	}

	/**
	 * It returns suitable primitive type if possible or throw
	 * {@link ClassNotFoundException} otherwise
	 * 
	 * @param o
	 * @return suitable primitive type for <code>o</code>
	 * @throws ClassNotFoundException
	 */
	public static Class<?> getPrimitiveType(Object o)
			throws ClassNotFoundException {
		if (o instanceof Integer) {
			return int.class;
		} else if (o instanceof Double) {
			return double.class;
		} else if (o instanceof Boolean) {
			return boolean.class;
		}
		throw new ClassNotFoundException();
	}

	public static List<EStructuralFeature> getFeatures(EClass targetClass) {
		List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
		final List<EClass> classes = new ArrayList<EClass>(
				targetClass.getEAllSuperTypes());
		classes.add(targetClass);
		features.addAll(targetClass.getEAllStructuralFeatures());
		Collections.sort(features, new Comparator<EStructuralFeature>() {
			public int compare(EStructuralFeature o1, EStructuralFeature o2) {
				try {
					EClass eClass1 = o1.getEContainingClass();
					EClass eClass2 = o2.getEContainingClass();
					int i1 = classes.indexOf(eClass1);
					int i2 = classes.indexOf(eClass2);
					return i2 - i1;
				} catch (Exception e) {
					CorePlugin.err(e.getMessage(), e);
				}
				return 0;
			}
		});
		return features;
	}

	public static String getScriptletNameByClass(EClass eClass) {

		String className = eClass.getName();

		int startPos = className.lastIndexOf('.');
		if (startPos != -1) {
			className = className.substring(startPos);
		}
		if (className.endsWith("Impl")) {
			className = className.substring(0, className.length() - 4);
		}

		if (className.endsWith("Command")) {
			className = className.substring(0, className.length() - 7);
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

	public static List<Object> readPipeContent(IPipe pipe) throws CoreException {
		List<Object> pipeContent = new ArrayList<Object>();
		Object o = null;
		while (true) {
			o = pipe.take(Long.MAX_VALUE); // wait forever to take
											// content
			if (o instanceof IStatus)
				break;
			pipeContent.add(o);
		}
		// Now pipe is empty for sure
		IStatus status = (IStatus) o;
		if (status.getSeverity() != IStatus.OK) {
			throw new CoreException(status);
		}
		return pipeContent;
	}

	@SuppressWarnings("unchecked")
	public static void featureSafeSet(EObject object,
			EStructuralFeature feature, List<?> value) throws CoreException {
		checkBounds(feature, value);
		if (value.size() > 0) {
			value = convert((List<Object>) value, feature);
			if (feature.getUpperBound() == 1)
				object.eSet(feature, value.get(0));
			else
				object.eSet(feature, value);
		}
	}

	/**
	 * Performs {@link #box(Object)} or {@link #unbox(Object)} operations on
	 * every object in given list of values based on feature type. Thus, if
	 * feature is {@link EReference}, values are boxed, if feature is
	 * {@link EAttribute}, values are unboxed.
	 * 
	 * @param values
	 * @param feature
	 * @return
	 */
	public static List<Object> convert(List<Object> values,
			EStructuralFeature feature) {
		boolean box = feature instanceof EReference;
		List<Object> result = new ArrayList<Object>();
		for (Object value : values) {
			result.add(box ? box(value) : unbox(value));
		}
		return result;
	}

	public static void checkBounds(EStructuralFeature feature, Object value)
			throws CoreException {
		int actual = 0;
		if (value instanceof List<?>) {
			actual = ((List<?>) value).size();
		} else if (value != null) {
			actual = 1;
		}
		int lower = feature.getLowerBound();
		int upper = feature.getUpperBound();
		if (upper != -1 && actual > upper) {
			throw new CoreException(CorePlugin.err(MessageFormat.format(
					"Parameter {2} is already assigned", actual, upper,
					feature.getName())));
		}
		if (actual < lower) {
			throw new CoreException(CorePlugin.err(MessageFormat.format(
					"Parameter {2} is not assigned", actual, lower,
					feature.getName())));
		}
	}

	public static Set<EClass> collectScriptlets(EPackage ePackage) {
		Set<EClass> scriplets = new HashSet<EClass>();
		EList<EObject> eContents = ePackage.eContents();
		EClass commandClass = CorePackage.eINSTANCE.getCommand();
		for (EObject o : eContents) {
			if (o instanceof EClass) {
				EClass eClass = (EClass) o;
				if (eClass.getEAnnotation(CoreUtils.INTERNAL_ANN) != null)
					continue;
				if (eClass.getEAllSuperTypes().contains(commandClass)) {
					scriplets.add(eClass);
				}
			}
		}
		return scriplets;
	}

	private static final String VALUE_FEATURE = "value";
	private static final Map<String, String> TO_BOXED_TYPE = new HashMap<String, String>();
	private static final Map<String, String> FROM_BOXED_TYPE = new HashMap<String, String>();
	static {
		TO_BOXED_TYPE.put(String.class.getName(), CorePackage.eINSTANCE
				.getEclString().getName());
		TO_BOXED_TYPE.put(Boolean.class.getName(), CorePackage.eINSTANCE
				.getEclBoolean().getName());
		TO_BOXED_TYPE.put(Integer.class.getName(), CorePackage.eINSTANCE
				.getEclInteger().getName());
		TO_BOXED_TYPE.put(Long.class.getName(), CorePackage.eINSTANCE
				.getEclLong().getName());
		TO_BOXED_TYPE.put(Float.class.getName(), CorePackage.eINSTANCE
				.getEclFloat().getName());

		for (Entry<String, String> entry : TO_BOXED_TYPE.entrySet()) {
			FROM_BOXED_TYPE.put(entry.getValue(), entry.getKey());
		}
	}

	/**
	 * Wraps any object into {@link EObject}. If object is already EObject, no
	 * conversions performed, therefore this method is idempotent, i.e.
	 * <code>box(box(box(box(foo))))</code> equals to <code>box(foo)</code>.
	 * 
	 * If object is not null and not EObject, performs conversion according to
	 * object type so that {@link String} is converted to {@link EclString},
	 * {@link Integer} to {@link EclInteger} and so on
	 * 
	 * @param object
	 * @return {@link EObject} or <code>null</code>, if input is null.
	 * @throws IllegalArgumentException
	 *             when appropriate boxing type could not be found
	 */
	public static EObject box(Object object) {
		if (object == null) {
			return null;
		}
		if (object instanceof EObject) {
			return (EObject) object;
		}

		String className = object.getClass().getName();
		if (!TO_BOXED_TYPE.containsKey(className)) {
			throw new IllegalArgumentException(String.format(
					"Do not know how to box value of type '%s'", object
							.getClass().getName()));
		}
		EClass boxedType = (EClass) CorePackage.eINSTANCE
				.getEClassifier(TO_BOXED_TYPE.get(object.getClass().getName()));
		EObject result = CoreFactory.eINSTANCE.create(boxedType);
		result.eSet(boxedType.getEStructuralFeature(VALUE_FEATURE), object);
		return result;
	}

	/**
	 * Unwraps an object if it has been boxed to {@link EObject}. This method is
	 * idempotent, i.e. <code>unbox(unbox(unbox(unbox(foo))))</code> equals to
	 * <code>unbox(foo)</code>.
	 * 
	 * @param object
	 * @return
	 */
	public static Object unbox(Object object) {
		if (object == null) {
			return null;
		}
		if (!(object instanceof EObject)) {
			return object;
		}

		EClass eClass = ((EObject) object).eClass();
		if (FROM_BOXED_TYPE.containsKey(eClass.getName())) {
			return ((EObject) object).eGet(eClass
					.getEStructuralFeature(VALUE_FEATURE));
		}
		return object;
	}

	private CoreUtils() {
		throw new AssertionError();
	}
}
