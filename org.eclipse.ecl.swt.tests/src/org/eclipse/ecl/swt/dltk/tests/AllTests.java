package org.eclipse.ecl.swt.dltk.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.ecl.swt.dltk.tests");
		// $JUnit-BEGIN$
		suite.addTestSuite(ProjectTests.class);
		// $JUnit-END$
		return suite;
	}

}
