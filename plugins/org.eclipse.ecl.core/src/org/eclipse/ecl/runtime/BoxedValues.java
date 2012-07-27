package org.eclipse.ecl.runtime;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.EclBoolean;
import org.eclipse.ecl.core.EclByte;
import org.eclipse.ecl.core.EclChar;
import org.eclipse.ecl.core.EclDouble;
import org.eclipse.ecl.core.EclFloat;
import org.eclipse.ecl.core.EclInteger;
import org.eclipse.ecl.core.EclLong;
import org.eclipse.ecl.core.EclShort;
import org.eclipse.ecl.core.EclString;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class BoxedValues {
	private BoxedValues() {
	}

	private static final String VALUE_FEATURE = "value";
	private static final Map<String, String> TO_BOXED_TYPE = new HashMap<String, String>();
	private static final Map<String, String> FROM_BOXED_TYPE = new HashMap<String, String>();
	static {
		TO_BOXED_TYPE.put(Byte.class.getName(), CorePackage.eINSTANCE
				.getEclByte().getName());
		TO_BOXED_TYPE.put(Short.class.getName(), CorePackage.eINSTANCE
				.getEclShort().getName());
		TO_BOXED_TYPE.put(Integer.class.getName(), CorePackage.eINSTANCE
				.getEclInteger().getName());
		TO_BOXED_TYPE.put(Long.class.getName(), CorePackage.eINSTANCE
				.getEclLong().getName());

		TO_BOXED_TYPE.put(Float.class.getName(), CorePackage.eINSTANCE
				.getEclFloat().getName());
		TO_BOXED_TYPE.put(Double.class.getName(), CorePackage.eINSTANCE
				.getEclDouble().getName());
		
		TO_BOXED_TYPE.put(Boolean.class.getName(), CorePackage.eINSTANCE
				.getEclBoolean().getName());

		TO_BOXED_TYPE.put(Character.class.getName(), CorePackage.eINSTANCE
				.getEclChar().getName());
		TO_BOXED_TYPE.put(String.class.getName(), CorePackage.eINSTANCE
				.getEclString().getName());

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
		case CorePackage.ECL_BYTE:
			return ((EclByte) boxed).getValue() != 0;
		case CorePackage.ECL_SHORT:
			return ((EclShort) boxed).getValue() != 0;
		case CorePackage.ECL_INTEGER:
			return ((EclInteger) boxed).getValue() != 0;
		case CorePackage.ECL_LONG:
			return ((EclLong) boxed).getValue() != 0;

		case CorePackage.ECL_FLOAT:
			return ((EclFloat) boxed).getValue() != 0;
		case CorePackage.ECL_DOUBLE:
			return ((EclDouble) boxed).getValue() != 0;

		case CorePackage.ECL_BOOLEAN:
			return ((EclBoolean) boxed).isValue();

		case CorePackage.ECL_CHAR:
			return ((EclChar) boxed).getValue() != 0;
		case CorePackage.ECL_STRING:
			return Boolean.toString(true).equalsIgnoreCase(
					((EclString) boxed).getValue());
		}
		throw new IllegalArgumentException(String.format(
				"Cannot convert value of type '%s' to Boolean", boxed.eClass()
						.getName()));
	}

	public static String toString(BoxedValue boxed) {
		return boxed.eGet(boxed.eClass().getEStructuralFeature(VALUE_FEATURE))
				.toString();
	}

	public static Integer toInteger(BoxedValue boxed) throws CoreException {
		switch (boxed.eClass().getClassifierID()) {
		case CorePackage.ECL_BYTE:
			return (int) ((EclByte) boxed).getValue();
		case CorePackage.ECL_SHORT:
			return (int) ((EclShort) boxed).getValue();
		case CorePackage.ECL_INTEGER:
			return ((EclInteger) boxed).getValue();
		case CorePackage.ECL_LONG:
			long val = ((EclLong) boxed).getValue();
			if (val < Integer.MIN_VALUE || val > Integer.MAX_VALUE) {
				throw new CoreException(createConversionError(toString(boxed),
						"Long", "Integer"));
			}
			return (int) val;
			
		case CorePackage.ECL_FLOAT:
			return new Float(((EclFloat) boxed).getValue()).intValue();
		case CorePackage.ECL_DOUBLE:
			return new Double(((EclDouble) boxed).getValue()).intValue();
			
		case CorePackage.ECL_BOOLEAN:
			return ((EclBoolean) boxed).isValue() ? 1 : 0;

		case CorePackage.ECL_CHAR:
			return (int) ((EclChar) boxed).getValue();
		case CorePackage.ECL_STRING:
			try {
				return Integer.parseInt(((EclString) boxed).getValue());
			} catch (NumberFormatException e) {
				throw new CoreException(createConversionError(toString(boxed),
						"String", "Integer"));
			}
		}
		throw new IllegalArgumentException(String.format(
				"Cannot convert value of type '%s' to Integer", boxed.eClass()
						.getName()));
	}

	public static Long toLong(BoxedValue boxed) throws CoreException {
		switch (boxed.eClass().getClassifierID()) {
		case CorePackage.ECL_BYTE:
			return (long) ((EclByte) boxed).getValue();
		case CorePackage.ECL_SHORT:
			return (long) ((EclShort) boxed).getValue();
		case CorePackage.ECL_INTEGER:
			return (long) ((EclInteger) boxed).getValue();
		case CorePackage.ECL_LONG:
			return ((EclLong) boxed).getValue();

		case CorePackage.ECL_FLOAT:
			return new Float(((EclFloat) boxed).getValue()).longValue();
		case CorePackage.ECL_DOUBLE:
			return new Double(((EclDouble) boxed).getValue()).longValue();

		case CorePackage.ECL_BOOLEAN:
			return ((EclBoolean) boxed).isValue() ? 1L : 0L;

		case CorePackage.ECL_CHAR:
			return (long) ((EclChar) boxed).getValue();
		case CorePackage.ECL_STRING:
			try {
				return Long.parseLong(((EclString) boxed).getValue());
			} catch (NumberFormatException e) {
				throw new CoreException(createConversionError(toString(boxed),
						"String", "Long"));
			}
		}
		throw new IllegalArgumentException(String.format(
				"Cannot convert value of type '%s' to Long", boxed.eClass()
						.getName()));
	}

	public static Float toFloat(BoxedValue boxed) throws CoreException {
		switch (boxed.eClass().getClassifierID()) {
		case CorePackage.ECL_BYTE:
			return (float) ((EclByte) boxed).getValue();
		case CorePackage.ECL_SHORT:
			return (float) ((EclShort) boxed).getValue();
		case CorePackage.ECL_INTEGER:
			return (float) ((EclInteger) boxed).getValue();
		case CorePackage.ECL_LONG:
			return (float) ((EclLong) boxed).getValue();

		case CorePackage.ECL_FLOAT:
			return ((EclFloat) boxed).getValue();
		case CorePackage.ECL_DOUBLE:
			double d = ((EclDouble) boxed).getValue();
			if (d >= Float.MIN_VALUE && d <= Float.MIN_VALUE) 
				return new Float((float) d);
			else throw new CoreException(createConversionError(toString(boxed),
					"Double", "Float"));

			
		case CorePackage.ECL_BOOLEAN:
			throw new CoreException(createConversionError(toString(boxed),
					"Boolean", "Float"));

		case CorePackage.ECL_CHAR:
			return (float) ((EclChar) boxed).getValue();
		case CorePackage.ECL_STRING:
			try {
				return Float.parseFloat(((EclString) boxed).getValue());
			} catch (NumberFormatException e) {
				throw new CoreException(createConversionError(toString(boxed),
						"String", "Float"));
			}
		}
		throw new IllegalArgumentException(String.format(
				"Cannot convert value of type '%s' to boolean", boxed.eClass()
						.getName()));
	}

	private static IStatus createConversionError(String value, String from,
			String to) {
		return new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID, String.format(
				"Cannot convert value '%s' from %s to %s", value, from, to));
	}
}
