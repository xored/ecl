package org.eclipse.ecl.internal.client.tcp.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.ecl.internal.client.tcp.tests");
		//$JUnit-BEGIN$
//		suite.addTestSuite(TestTcpSession.class);
		//$JUnit-END$
		return suite;
	}

}
