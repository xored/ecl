/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Andrey Platov)
 *******************************************************************************/

package org.eclipse.ecl.runtime;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.LiteralParameter;

public interface IParamConverter<T> {

	Class<T> forType();

	T convert(LiteralParameter literal, List<String> allowedTypes, String id)
			throws CoreException;
	
	T convert(LiteralParameter literal, List<String> allowedTypes)
			throws CoreException;

	String convertToCode(Object value) throws CoreException;
}
