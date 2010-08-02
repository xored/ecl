package org.eclipse.ecl.internal.server.tcp;

import java.io.IOException;
import java.net.ServerSocket;

public class TcpServer extends Thread {
	
	private ServerSocket socket;

	public TcpServer(int port) throws IOException {
		socket = new ServerSocket(port);
		start();
	}

	@Override
	public void run() {
		try {
			while(!interrupted())
				new Session(socket.accept());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
