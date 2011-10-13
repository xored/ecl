/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
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
