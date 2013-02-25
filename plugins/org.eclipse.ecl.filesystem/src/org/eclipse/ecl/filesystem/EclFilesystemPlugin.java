package org.eclipse.ecl.filesystem;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EclFilesystemPlugin implements BundleActivator {

	public static final String PLUGIN_ID = "org.eclipse.ecl.filesystem";

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		EclFilesystemPlugin.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		EclFilesystemPlugin.context = null;
	}

}
