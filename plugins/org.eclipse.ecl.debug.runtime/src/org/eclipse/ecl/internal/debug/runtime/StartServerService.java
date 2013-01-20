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
package org.eclipse.ecl.internal.debug.runtime;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.debug.commands.CommandsFactory;
import org.eclipse.ecl.debug.commands.ServerInfo;
import org.eclipse.ecl.debug.commands.StartServer;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class StartServerService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		try {
			StartServer startCommand = ((StartServer) command);
			DebugServer server = DebugServer.start(startCommand.getId());
			ServerInfo info = CommandsFactory.eINSTANCE.createServerInfo();
			info.setPort(server.getPort());
			context.getOutput().write(info);
		} catch (IOException e) {
			throw new CoreException(Log.status(e));
		}
		return Status.OK_STATUS;
	}

}
