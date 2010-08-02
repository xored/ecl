package org.eclipse.dltk.tcl.ui.tests.ecl.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class EclSWTTestsRunner extends EclSWTTestCase {

	static final String CHARSET = "ISO-8859-1";

	private final String content;

	public EclSWTTestsRunner(String name, String content) {
		super(name);
		this.content = content;
	}

	public static String getScriptsRoot() {
		return null;
	}

	public static String getPlugin() {
		return null;
	}

	public static TestSuite suite() {
		return doSuite(getPlugin(), getScriptsRoot());
	}

	public static TestSuite doSuite(String plugin, String root) {
		final TestSuite suite = new TestSuite();
		Bundle bundle = Platform.getBundle(plugin);
		try {
			addTestsFromPath(root, suite, bundle, bundle.getEntryPaths(root));
		} catch (final IOException e) {
			suite.addTest(new TestCase("IOException") {
				protected void runTest() throws Throwable {
					throw e;
				}
			});
		}
		if (suite.countTestCases() == 0) {
			suite.addTest(new TestCase("Error") { //$NON-NLS-1$
						protected void runTest() throws Throwable {
							fail("No scripts was found"); //$NON-NLS-1$
						}
					});
		}
		return suite;
	}

	private static void addTestsFromPath(String root, final TestSuite suite,
			Bundle bundle, Enumeration paths) throws IOException {
		if (paths == null)
			return;
		while (paths.hasMoreElements()) {
			String path = (String) paths.nextElement();
			URL url = FileLocator.resolve(bundle.getEntry(path));
			if (url.getFile().endsWith(".ecl")) {
				String testName = url.getFile();
				testName = testName.substring(testName.indexOf(root)
						+ root.length() + 1, testName.length()
						- ".ecl".length());
				String contents = getContents(url.openStream());
				suite.addTest(new EclSWTTestsRunner(testName, contents));
			}
			addTestsFromPath(root, suite, bundle, bundle.getEntryPaths(path));
		}
	}

	protected void runTest() throws Throwable {
		exec(String.valueOf(content));
	}

	private static String getContents(InputStream input) throws IOException {
		StringBuffer result = new StringBuffer();
		input = new BufferedInputStream(input, 4096);
		try {
			// Simple copy
			int ch = -1;
			while ((ch = input.read()) != -1) {
				result.append((char) ch);
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}
		return result.toString();
	}
}
