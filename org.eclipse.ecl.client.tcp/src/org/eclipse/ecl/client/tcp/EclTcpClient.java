package org.eclipse.ecl.client.tcp;

import java.io.IOException;
import java.net.InetAddress;

import org.eclipse.ecl.runtime.ISession;

public class EclTcpClient {

	public final static int DEFAULT_PORT = EclTcpClientPlugin.DEFAULT_PORT;

	public static ISession startSession(InetAddress address, int port,
			InetAddress localAddress, int localPort) throws IOException {
		return EclTcpClientPlugin.startSession(address, port, localAddress, localPort);
	}
	public static ISession startSession(InetAddress address, int port) throws IOException {
		return EclTcpClientPlugin.startSession(address, port);
	}
}
