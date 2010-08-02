package org.eclipse.ecl.swt.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.ecl.swt.tests");
		// $JUnit-BEGIN$
		suite.addTestSuite(GetMenuTest.class);
		suite.addTestSuite(GetControlTest.class);
		// $JUnit-END$
		return suite;
	}

}
