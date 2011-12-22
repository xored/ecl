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
package org.eclipse.ecl.internal.debug.commands;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.debug.DebugServer;
import org.eclipse.ecl.debug.EclDebugConstants;
import org.eclipse.ecl.debug.commands.CommandsFactory;
import org.eclipse.ecl.debug.commands.ServerInfo;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;

public class StartServerService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		IPipe output = context.getOutput();
		DebugServer server;
		try {
			server = DebugServer.start();
			ServerInfo info = CommandsFactory.eINSTANCE.createServerInfo();
			info.setPort(server.getPort());
			output.write(info);
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					EclDebugConstants.PLUGIN_ID, e.getMessage(), e));
		}
		return Status.OK_STATUS;
	}

}
