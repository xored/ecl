package org.eclipse.ecl.client.tcp;

import java.io.IOException;
import java.net.InetAddress;

import org.eclipse.ecl.internal.client.tcp.TcpSession;
import org.eclipse.ecl.runtime.ISession;

public class EclTcpClient {
	
	public final static int DEFAULT_PORT = 5378;

	public static ISession startSession(InetAddress address, int port) throws IOException {
		return new TcpSession(address, port);
	}
}
