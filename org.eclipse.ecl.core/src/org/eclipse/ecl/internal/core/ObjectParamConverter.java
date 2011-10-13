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
package org.eclipse.ecl.internal.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.LiteralParameter;
import org.eclipse.ecl.runtime.IParamConverter;

public class ObjectParamConverter implements IParamConverter<Object> {

	public Object convert(LiteralParameter parameter) throws CoreException {
		String original = parameter.getLiteral();
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
