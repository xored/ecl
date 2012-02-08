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
package org.eclipse.ecl.internal.server.tcp;

import java.io.IOException;
import java.net.ServerSocket;

import org.eclipse.core.runtime.Status;

/**
 * @deprecated Replaced by {@link org.eclipse.ecl.server.tcp.EclTcpServer}
 */
@Deprecated
public class TcpServer extends Thread {

	private ServerSocket socket;
	private int port;
	private boolean starting = true;

	public TcpServer(int port) throws IOException {
		super("ECL tcp server");
		socket = new ServerSocket(port);
		this.port = port;
	}

	public boolean isStarting() {
		return starting;
	}

	@Override
	public void run() {
		starting = false;
		try {
			while (!isInterrupted()) {
				new Session(socket.accept());
			}
		} catch (IOException e) {
			Activator
					.getDefault()
					.getLog()
					.log(new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		}
		if (socket != null) {
			try {
				socket.close();
			} catch (IOException e) {
				// ignore
			}
		}
	}

	public int getPort() {
		return port;
	}
}
