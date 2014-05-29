package org.eclipse.ecl.filesystem;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EclFilesystemPlugin extends Plugin implements BundleActivator {
	
	private static EclFilesystemPlugin plugin = null;
	
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
		plugin = this;
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
	
	public static void logWarning(String message, Throwable e) {
		EclFilesystemPlugin plugin = getDefault();
		if (null != plugin) {
			plugin.getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, message, e));
			plugin = null;
		}
	}
	
	public static void logWarning(String message) {
		logWarning(message, null);
	}
	
	public static EclFilesystemPlugin getDefault() {
		return plugin;
	}
	
	public static Status createError(String message, Throwable throwable) {
		return new Status(IStatus.ERROR, EclFilesystemPlugin.PLUGIN_ID, message, throwable);
	}

	public static Status createError(String message) {
		return createError(message, null);
	}
}
