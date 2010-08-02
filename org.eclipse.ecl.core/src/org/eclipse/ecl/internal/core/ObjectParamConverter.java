package org.eclipse.ecl.internal.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.runtime.IParamConverter;

public class ObjectParamConverter implements IParamConverter<Object> {

	public Object convert(String original) throws CoreException {
		try {
			return Integer.decode(original);
		} catch (NumberFormatException e0) {
			try {
				return Double.valueOf(original);
			} catch (NumberFormatException e1) {
				if (original.equalsIgnoreCase("true")
						|| original.equalsIgnoreCase("false")) {
					return Boolean.valueOf(original);
				}
				return original;
			}
		}
	}

	public Class<Object> forType() {
		return Object.class;
	}

}
