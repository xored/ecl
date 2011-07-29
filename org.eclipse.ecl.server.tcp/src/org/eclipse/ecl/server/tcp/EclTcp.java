package org.eclipse.ecl.server.tcp;

import java.io.IOException;

import org.eclipse.ecl.internal.server.tcp.Activator;
import org.eclipse.ecl.internal.server.tcp.TcpServer;

/**
 * @deprecated Replaced by
 *             {@link org.eclipse.ecl.server.tcp.EclTcpServerManager}
 */
@Deprecated
public class EclTcp {

	public static synchronized void runServer(int port, boolean restart)
			throws IOException {
		Activator activator = Activator.getDefault();
		if (activator.getServer() == null) {
			TcpServer newServer = new TcpServer(port);
			activator.setServer(newServer);
			newServer.start();
			while (newServer.isStarting()) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					//
				}
			}
		} else {
			TcpServer server = activator.getServer();
			int oldPort = server.getPort();
			if (oldPort != port) {
				if (restart) {
					server.interrupt();
					TcpServer newServer = new TcpServer(port);
					activator.setServer(newServer);
					newServer.start();
					while (newServer.isStarting()) {
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							//
						}
					}
				}
			}
			// throw new IOException("server already running");
		}
	}

	public synchronized static TcpServer getServer() {
		return Activator.getDefault().getServer();
	}
}
