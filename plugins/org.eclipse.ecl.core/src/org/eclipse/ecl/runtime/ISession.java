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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.Command;

public interface ISession {

	public final static long DEFAULT_TAKE_TIMEOUT = 1000;

	IProcess execute(Command command) throws CoreException;

	IProcess execute(Command command, IPipe in, IPipe out) throws CoreException;

	IPipe createPipe();

	/**
	 * FIXME This is temporary method. Need to rethink this
	 */
	//void reconnect() throws CoreException;

	void close() throws CoreException;

	boolean isClosed();
}
