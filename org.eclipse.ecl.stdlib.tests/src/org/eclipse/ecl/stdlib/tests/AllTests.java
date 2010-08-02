package org.eclipse.ecl.stdlib.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.ecl.stdlib.tests");
		// $JUnit-BEGIN$
		suite.addTestSuite(AssertEqualsTests.class);
		suite.addTestSuite(AssertFalseTests.class);
		suite.addTestSuite(AssertTrueTests.class);
		suite.addTestSuite(LengthTest.class);
		// $JUnit-END$
		return suite;
	}

}
