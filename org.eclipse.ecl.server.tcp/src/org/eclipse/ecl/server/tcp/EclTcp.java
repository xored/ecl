package org.eclipse.ecl.server.tcp;

import java.io.IOException;

import org.eclipse.ecl.internal.server.tcp.Activator;
import org.eclipse.ecl.internal.server.tcp.TcpServer;

public class EclTcp {

	public static void runServer(int port, boolean restart) throws IOException {
		Activator activator = Activator.getDefault();
		if (activator.getServer() == null) {
			activator.setServer(new TcpServer(port));
		} else {
			TcpServer server = activator.getServer();
			int oldPort = server.getPort();
			if (oldPort != port) {
				if (restart) {
					server.interrupt();
					activator.setServer(new TcpServer(port));
				}
			}
			// throw new IOException("server already running");
		}
	}

	public static TcpServer getServer() {
		return Activator.getDefault().getServer();
	}
}
