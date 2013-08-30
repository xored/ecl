/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Yuri Strot)
 *******************************************************************************/
package org.eclipse.ecl.debug.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.debug.model.Event;


public interface DebuggerTransport {

	public void request(Event event) throws CoreException;

	public void setCallback(DebuggerCallback callback);

}
