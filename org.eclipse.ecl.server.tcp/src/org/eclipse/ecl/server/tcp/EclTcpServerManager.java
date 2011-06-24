package org.eclipse.ecl.server.tcp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public enum EclTcpServerManager {
	Instance;

	private final Map<Integer, EclTcpServer> servers = new HashMap<Integer, EclTcpServer>();

	public synchronized EclTcpServer startServer(int port) throws IOException {
		EclTcpServer server = servers.get(port);
		if (server == null) {
			EclTcpServer newServer = new EclTcpServer(port);
			newServer.start();
			while (newServer.isStarting()) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// Ignore
				}
			}
			servers.put(port, newServer);
			return newServer;
		} else {
			throw new IOException("Another server is already running on port "
					+ port);
		}
	}

	public synchronized void stopServer(int port) throws IOException {
		EclTcpServer server = servers.get(port);
		if (server != null) {
			server.interrupt();
		} else {
			throw new IOException("No server found on port " + port);
		}
	}

	public synchronized EclTcpServer getServer(int port) {
		return servers.get(port);
	}
}
