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
package org.eclipse.ecl.core.tests.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.tests.AbstractCoreTest;
import org.eclipse.ecl.core.tests.model.TestCommand;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class TestCommandService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		TestCommand tc = (TestCommand) command;
		AbstractCoreTest.inc();
		return new Status(IStatus.OK, AbstractCoreTest.PLUGIN_ID, "Hello, "
				+ tc.getHello());
	}

}
