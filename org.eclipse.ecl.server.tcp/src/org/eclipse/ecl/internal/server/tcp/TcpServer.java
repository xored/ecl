package org.eclipse.ecl.internal.server.tcp;

import java.io.IOException;
import java.net.ServerSocket;

import org.eclipse.core.runtime.Status;

public class TcpServer extends Thread {

	private ServerSocket socket;
	private int port;

	public TcpServer(int port) throws IOException {
		super("ECL tcp server");
		socket = new ServerSocket(port);
		this.port = port;
	}

	@Override
	public void run() {
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
	}

	public int getPort() {
		return port;
	}
}
