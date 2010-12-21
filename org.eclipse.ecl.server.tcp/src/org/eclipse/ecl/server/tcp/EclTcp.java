package org.eclipse.ecl.server.tcp;

import java.io.IOException;

import org.eclipse.ecl.internal.server.tcp.Activator;
import org.eclipse.ecl.internal.server.tcp.TcpServer;

public class EclTcp {

	public static synchronized void runServer(int port, boolean restart)
			throws IOException {
		Activator activator = Activator.getDefault();
		if (activator.getServer() == null) {
			TcpServer newServer = new TcpServer(port);
			activator.setServer(newServer);
			newServer.start();
		} else {
			TcpServer server = activator.getServer();
			int oldPort = server.getPort();
			if (oldPort != port) {
				if (restart) {
					server.interrupt();
					TcpServer newServer = new TcpServer(port);
					activator.setServer(newServer);
					newServer.start();
				}
			}
			// throw new IOException("server already running");
		}
	}

	public synchronized static TcpServer getServer() {
		return Activator.getDefault().getServer();
	}
}
