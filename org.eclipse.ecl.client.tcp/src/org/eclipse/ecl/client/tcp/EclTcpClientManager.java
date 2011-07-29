package org.eclipse.ecl.client.tcp;

import java.io.IOException;
import java.net.InetAddress;

import org.eclipse.ecl.runtime.ISession;

public enum EclTcpClientManager {

	Instance;

	public final static int DEFAULT_PORT = EclTcpClientPlugin.DEFAULT_PORT;

	public ISession startClientSession(InetAddress address, int port)
			throws IOException {
		return new EclTcpSession(address, port);
	}
}
