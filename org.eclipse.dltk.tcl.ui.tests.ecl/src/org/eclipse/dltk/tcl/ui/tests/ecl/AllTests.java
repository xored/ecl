package org.eclipse.dltk.tcl.ui.tests.ecl;

import junit.framework.TestSuite;

import org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest.DLTKTestUtils;
import org.eclipse.dltk.tcl.ui.tests.ecl.util.EclSWTTestsRunner;

public class AllTests extends EclSWTTestsRunner {
	public static final String ALL_SCRIPTS_ROOT = "/scripts";

	public AllTests(String name, String content) {
		super(name, content);
	}

	public static String getScriptsRoot() {
		return ALL_SCRIPTS_ROOT;
	}

	public static String getPlugin() {
		return DLTKTestUtils.PLUGIN_ID;
	}

	public static TestSuite suite() {
		return EclSWTTestsRunner.doSuite(getPlugin(), getScriptsRoot());
	}
}
