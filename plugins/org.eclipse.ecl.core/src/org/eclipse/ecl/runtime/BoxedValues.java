package org.eclipse.ecl.runtime;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.EclBoolean;
import org.eclipse.ecl.core.EclInteger;
import org.eclipse.ecl.core.EclString;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class BoxedValues {
	private BoxedValues() {
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

	public static Boolean toBoolean(BoxedValue boxed) {
		switch (boxed.eClass().getClassifierID()) {
		case CorePackage.ECL_BOOLEAN:
			return ((EclBoolean) boxed).isValue();
		case CorePackage.ECL_STRING:
			return Boolean.toString(true).equalsIgnoreCase(
					((EclString) boxed).getValue());
		case CorePackage.ECL_INTEGER:
		case CorePackage.ECL_LONG:
		case CorePackage.ECL_FLOAT:
			return new Float(boxed.eGet(
					boxed.eClass().getEStructuralFeature(VALUE_FEATURE))
					.toString()).equals(0);
		}
		throw new IllegalArgumentException(String.format(
				"Cannot convert value of type '%s' to boolean", boxed.eClass()
						.getName()));
	}
}
