package org.eclipse.ecl.internal.client.tcp.tests;

import java.io.IOException;
import java.net.InetAddress;

import org.eclipse.ecl.client.tcp.EclTcpClient;
import org.eclipse.ecl.core.tests.AbstractCoreTest;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.ecl.server.tcp.EclTcp;

public class TestTcpSession extends AbstractCoreTest {

	@Override
	protected ISession createSession() throws Exception {
		return EclTcpClient.startSession(InetAddress.getLocalHost(),
				EclTcpClient.DEFAULT_PORT);
	}

	static {
		try {
			EclTcp.runServer(EclTcpClient.DEFAULT_PORT, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void testExec1() throws Exception {
		if (TestSupport.notYetImplemented(this))
			return;
		super.testExec1();
	}

	@Override
	public void testExec2() throws Exception {
		if (TestSupport.notYetImplemented(this))
			return;
		super.testExec2();
	}

	@Override
	public void testIsPipeEmpty() throws Exception {
		if (TestSupport.notYetImplemented(this))
			return;
		super.testIsPipeEmpty();
	}

	@Override
	public void testIsPipeEmpty2() throws Exception {
		if (TestSupport.notYetImplemented(this))
			return;
		super.testIsPipeEmpty2();
	}

	@Override
	public void testPipeline() throws Exception {
		if (TestSupport.notYetImplemented(this))
			return;
		super.testPipeline();
	}

	@Override
	public void testReadFromFinishedCommand() throws Exception {
		if (TestSupport.notYetImplemented(this))
			return;
		super.testReadFromFinishedCommand();
	}
}
