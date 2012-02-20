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
package org.eclipse.ecl.server.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.eclipse.ecl.internal.core.CorePlugin;

public class EclTcpServer extends Thread {
	private final ServerSocket socket;
	private final int port;
	private volatile boolean starting = true;
	private SessionManager manager = null;

	public boolean isStarting() {
		return starting;
	}

	public EclTcpServer(int port, boolean useJobs) throws IOException {
		super("ECL TCP server: " + port + " main");
		this.socket = new ServerSocket(port);
		this.port = port;
		manager = new SessionManager(useJobs);
	}

	@Override
	public void run() {
		starting = false;
		try {
			while (!isInterrupted()) {
				Socket client = socket.accept();
				manager.acceptNewConnection(client);
			}
			if (socket != null) {
				socket.close();
			}
		} catch (Exception e) {
			CorePlugin.log(CorePlugin.err("Failed to start ECL TCP server", e));
		}
	}

	public int getPort() {
		return port;
	}
}
