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
import java.net.ServerSocket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DebugServer {

	public static DebugServer start() throws IOException {
		DebugServer server = new DebugServer();
		servers.put(server.getPort(), server);
		return server;
	}

	public static DebugServer get(int port) {
		return servers.get(port);
	}

	public int getPort() {
		return socket.getLocalPort();
	}

	public void stop() {
		servers.remove(getPort());
		try {
			socket.close();
		} catch (IOException e) {
			// safe close
		}
		if (transport != null) {
			transport.close();
		}
	}

	private DebugServer() throws IOException {
		socket = new ServerSocket(0);

		new Thread() {
			public void run() {
				accept();
			};
		}.start();
	}

	private void accept() {
		try {
			transport = new ServerSession(socket.accept(),
					Integer.toString(getPort()));
		} catch (Exception e) {
			Log.log(e);
		}
	}

	private final static Map<Integer, DebugServer> servers = new ConcurrentHashMap<Integer, DebugServer>();

	private final ServerSocket socket;

	private ServerSession transport;

}
