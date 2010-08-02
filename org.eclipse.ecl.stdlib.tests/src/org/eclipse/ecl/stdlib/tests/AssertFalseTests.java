package org.eclipse.ecl.stdlib.tests;

import static org.eclipse.ecl.stdlib.tests.TestUtils.exec;
import junit.framework.TestCase;

import org.eclipse.core.runtime.Status;

public class AssertFalseTests extends TestCase {
	public final static String PLUGIN_ID = "org.eclipse.ecl.core";

	public void testAssertFalse_001() throws Exception {
		exec("AssertFalse", new Object[] { false });
	}

	public void testAssertFalse_002() throws Exception {
		exec("AssertFalse", new Object[] { true }, new Status(Status.ERROR,
				PLUGIN_ID, "Assertion failed"));
	}

	public void testAssertFalse_003() throws Exception {
		exec("AssertFalse", new Object[] { 2 }, new Status(Status.ERROR,
				PLUGIN_ID, "Invalid pipe content"));
	}
}
