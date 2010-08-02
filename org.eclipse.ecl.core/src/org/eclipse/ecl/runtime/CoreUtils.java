package org.eclipse.ecl.runtime;

import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.EMFStreamPipe;

public class CoreUtils {

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

	public static IPipe createEMFPipe(InputStream in, OutputStream out) {
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
	 * 
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
}
