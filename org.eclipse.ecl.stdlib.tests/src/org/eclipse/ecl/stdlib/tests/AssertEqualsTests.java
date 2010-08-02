package org.eclipse.ecl.stdlib.tests;

import static org.eclipse.ecl.stdlib.tests.TestUtils.exec;
import junit.framework.TestCase;

import org.eclipse.core.runtime.Status;

public class AssertEqualsTests extends TestCase {
	public final static String PLUGIN_ID = "org.eclipse.ecl.core";

	public void testAssertEquals_001() throws Exception {
		exec("AssertEquals 2", new Object[] { 2 });
	}

	public void testAssertEquals_002() throws Exception {
		exec("AssertEquals true", new Object[] { true });
	}

	public void testAssertEquals_003() throws Exception {
		exec("AssertEquals false", new Object[] { false });
	}

	public void testAssertEquals_004() throws Exception {
		exec("AssertEquals 2", new Object[] { "2" }, new Status(Status.ERROR,
				PLUGIN_ID, "Assertion failed"));
	}

	/*
	 * TODO public void testAssertEquals_005() throws Exception {
	 * TestUtils.execute("AssertEquals 2.0", new Object[] { 2.0 },
	 * Status.OK_STATUS); }
	 */
}
