package org.eclipse.ecl.server.tcp;

import java.io.IOException;

import org.eclipse.ecl.internal.server.tcp.Activator;
import org.eclipse.ecl.internal.server.tcp.TcpServer;

public class EclTcp {

	public static void runServer(int port) throws IOException {
		if(Activator.getDefault().server == null) {
			Activator.getDefault().server = new TcpServer(port);
		} else {
			throw new IOException("server already running");
		}
	}
}
