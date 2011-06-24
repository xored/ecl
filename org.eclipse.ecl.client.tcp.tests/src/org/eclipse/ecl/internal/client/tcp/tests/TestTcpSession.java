package org.eclipse.ecl.internal.client.tcp.tests;

import java.io.IOException;
import java.net.InetAddress;

import org.eclipse.ecl.client.tcp.EclTcpClientManager;
import org.eclipse.ecl.core.tests.AbstractCoreTest;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.ecl.server.tcp.EclTcpServerManager;

public class TestTcpSession extends AbstractCoreTest {

	@Override
	protected ISession createSession() throws Exception {
		return EclTcpClientManager.Instance.startClientSession(
				InetAddress.getLocalHost(),
				EclTcpClientManager.DEFAULT_PORT + 1);
	}

	static {
		try {
			EclTcpServerManager.Instance
					.startServer(EclTcpClientManager.DEFAULT_PORT + 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
