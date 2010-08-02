package org.eclipse.ecl.core.tests.all;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.ecl.core.tests.LocalCoreTest;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.ecl.core.tests");
		// $JUnit-BEGIN$
		suite.addTestSuite(LocalCoreTest.class);
		// $JUnit-END$
		return suite;
	}

}
