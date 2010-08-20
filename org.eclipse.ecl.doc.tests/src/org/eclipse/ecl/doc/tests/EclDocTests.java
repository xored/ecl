package org.eclipse.ecl.doc.tests;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;

import junit.framework.TestCase;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.ecl.doc.EclDocPlugin;
import org.eclipse.emf.ecore.EPackage;

public class EclDocTests extends TestCase {
	public void test01() throws Exception {
		EPackage[] ePackages = new EPackage[] {
				EPackage.Registry.INSTANCE
						.getEPackage("http://www.eclipse.org/ecl/stdlib.ecore"),
				EPackage.Registry.INSTANCE
						.getEPackage("http://www.eclipse.org/ecl/tesla/common.ecore"),
				EPackage.Registry.INSTANCE
						.getEPackage("http://www.eclipse.org/ecl/tesla/diagram.ecore") };
		EclDocPlugin.genPackagesInfo(ePackages, getOutput());
	}

	private Writer getOutput() throws IOException {
		URL entry = Activator.getDefault().getBundle()
				.getEntry("output/core.html");
		entry = FileLocator.resolve(entry);
		String file = entry.getFile();
		FileWriter fw = new FileWriter(file);
		return fw;
	}
}
