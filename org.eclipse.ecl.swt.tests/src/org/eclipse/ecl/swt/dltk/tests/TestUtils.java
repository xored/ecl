package org.eclipse.ecl.swt.dltk.tests;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class TestUtils {

	public static List<Object> execute(String script, Object[] input,
			IStatus expected) throws Exception {
		ISession session = EclRuntime.createSession();
		Command command = EclCoreParser.newCommand(script);
		IPipe source = session.createPipe();
		for (Object o : input) {
			source.write(o);
		}
		IPipe sink = session.createPipe();
		IProcess process = session.execute(command, source, sink);
		TestCase
				.assertEquals(expected.toString(), process.waitFor().toString());
		Object o;
		List<Object> list = new ArrayList<Object>();
		while ((o = sink.take(ISession.DEFAULT_TAKE_TIMEOUT)) != null) {
			list.add(o);
		}
		return list;
	}

	public static List<Object> execute(String script, Object[] input)
			throws Exception {
		return execute(script, input, Status.OK_STATUS);
	}

	public static List<Object> execute(String script, IStatus expected)
			throws Exception {
		return execute(script, new Object[] {}, expected);
	}

	public static List<Object> execute(String script) throws Exception {
		return execute(script, new Object[] {});
	}
}
