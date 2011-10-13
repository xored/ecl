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
package org.eclipse.ecl.telnet.server.ui;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.telnet.server.EclTelnetServerPlugin;
import org.eclipse.ui.IStartup;

public class ServerStarter implements IStartup {

	public void earlyStartup() {
		try {
			EclTelnetServerPlugin.getDefault().startServer(2323);
		} catch (IOException e) {
			EclTelnetServerPlugin.getDefault().getLog().log(
					new Status(IStatus.ERROR, EclTelnetServerPlugin.PLUGIN_ID,
							"Failed to start server", e)
				);
		}
	}
}
