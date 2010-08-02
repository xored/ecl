package org.eclipse.ecl.parser.test;

import junit.framework.TestCase;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class SyntaxTestCore extends TestCase {
	public final static String PLUGIN_ID = "org.eclipse.ecl.core.tests";

	private final static String TEST_NS = "http://www.eclipse.org/ecl/tests/model.ecore";

	private Command createTestCommand(String s) {
		return createCommand("TestCommand -hello=" + s);
	}

	public void testHWCommand() throws Exception {
		ISession session = EclRuntime.createSession();
		IProcess rc = session.execute(createTestCommand("world"), null, null);
		assertEquals("Hello, world", rc.waitFor().getMessage());
	}

	private Command createCommand(String cmd) {
		return EclCoreParser.newCommand(cmd);
	}

	public void testExecSequence() throws Exception {
		ISession session = EclRuntime.createSession();
		TestCore.reset();

		Command cmd = createCommand("TestCommand -hello=1;TestCommand -hello=2;TestCommand -hello=3;");
		IProcess rc = session.execute(cmd, null, null);
		assertEquals("Hello, 3", rc.waitFor().getMessage());
		assertEquals(3, TestCore.getCount());
	}

	public void testExecParallel() throws Exception {
		ISession session = EclRuntime.createSession();
		TestCore.reset();
		Command cmd = createCommand("TestCommand -hello=1&SlowCommand&TestCommand -hello=3;");
		IProcess rc = session.execute(cmd, null, null);
		Thread.sleep(1000);
		assertEquals(2, TestCore.getCount());
		rc.waitFor();
		assertEquals(3, TestCore.getCount());
	}

	public void testPipeline() throws Exception {
		ISession session = EclRuntime.createSession();
		Command cmd = createCommand("IncrementCommand|IncrementCommand|IncrementCommand");

		IPipe source = session.createPipe();
		IPipe sink = session.createPipe();
		session.execute(cmd, source, sink);

		source.write(new Integer(42));
		Integer res = (Integer) sink.take(ISession.DEFAULT_TAKE_TIMEOUT);
		assertEquals(45, res.intValue());
	}

	/*
	 * Execute "EmitData 42" via Exec
	 */
	public void testExec1() throws Exception {
		ISession session = EclRuntime.createSession();
		Command cmd = createCommand("EmitData 42");

		IPipe pipe = session.createPipe();
		session.execute(cmd, null, pipe);

		Integer res = (Integer) pipe.take(ISession.DEFAULT_TAKE_TIMEOUT);
		assertEquals(42, res.intValue());
	}

	/*
	 * Execute: "EmitData [EmitData 42]" via Exec
	 */
	public void testExec2() throws Exception {
		ISession session = EclRuntime.createSession();

		Command cmd = createCommand("EmitData [EmitData 42]");

		IPipe pipe = session.createPipe();
		session.execute(cmd, null, pipe);

		Integer res = (Integer) pipe.take(ISession.DEFAULT_TAKE_TIMEOUT);
		assertEquals(42, res.intValue());
	}

	public void testRandom() throws Exception {
		ISession session = EclRuntime.createSession();

		Command cmd = createCommand("Random 10");

		IPipe pipe = session.createPipe();
		session.execute(cmd, null, pipe);

		while (true) {
			Integer res = (Integer) pipe.take(ISession.DEFAULT_TAKE_TIMEOUT);
			if (res == null) {
				break;
			}
			System.out.println(res.intValue());
			// assertEquals(42, res.intValue());
		}
	}

}
