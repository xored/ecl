package org.eclipse.ecl.stdlib.tests;

import static org.eclipse.ecl.stdlib.tests.TestUtils.exec;
import junit.framework.TestCase;

import org.eclipse.core.runtime.Status;

public class AssertTrueTests extends TestCase {
	public final static String PLUGIN_ID = "org.eclipse.ecl.core";

	public void testAssertTrue_001() throws Exception {
		exec("AssertTrue", new Object[] { true });
	}

	public void testAssertTrue_002() throws Exception {
		exec("AssertTrue", new Object[] { false }, new Status(Status.ERROR,
				PLUGIN_ID, "Assertion failed"));
	}

	public void testAssertTrue_003() throws Exception {
		exec("AssertTrue", new Object[] { 2 }, new Status(Status.ERROR,
				PLUGIN_ID, "Invalid pipe content"));
	}
}
