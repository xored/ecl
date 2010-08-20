package org.eclipse.ecl.doc;

import java.io.IOException;
import java.io.Writer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.internal.doc.HtmlDocWriter;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.BundleContext;

public class EclDocPlugin extends Plugin {

	public static final String PLUGIN_ID = "org.eclipse.ecl.doc";

	private static EclDocPlugin plugin;

	/**
	 * The constructor
	 */
	public EclDocPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static EclDocPlugin getDefault() {
		return plugin;
	}

	public static IStatus err(String message) {
		return err(message, null);
	}

	public static IStatus err(String message, Throwable throwable) {
		return new Status(IStatus.ERROR, PLUGIN_ID, message);
	}

	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}

	public static void genPackagesInfo(EPackage[] packages, Writer writer)
			throws IOException {
		new HtmlDocWriter().packages(packages, writer);
	}

}
