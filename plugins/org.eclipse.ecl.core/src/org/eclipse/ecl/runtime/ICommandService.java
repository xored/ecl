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
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;

/** Executes a command
 * Handles a set of supported commands.
 * */
public interface ICommandService {
	
	/**
	 * Executes a command.
	 * @param command - a command supported by this service. Usually a service is explicitly registered to handle specific commands. See {@link org.eclipse.ecl.internal.core.CorePlugin.getScriptletManager}. 
	 * @param context - provides support for command's input, output and context
	 * @return execution status
	 */
	IStatus service(Command command, IProcess context) throws InterruptedException, CoreException;

}
