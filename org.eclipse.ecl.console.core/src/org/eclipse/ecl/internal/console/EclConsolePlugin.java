package org.eclipse.ecl.internal.console;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class EclConsolePlugin extends Plugin {

	public static final String PLUGIN_ID = "org.eclipse.ecl.console";

	private static EclConsolePlugin plugin;

	/**
	 * The constructor
	 */
	public EclConsolePlugin() {
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
	public static EclConsolePlugin getDefault() {
		return plugin;
	}

	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}

	public static void log(CoreException e) {
		log(e.getStatus());
	}

	public static void logWarn(String message, Exception e) {
		log(new Status(IStatus.WARNING, PLUGIN_ID, message, e));
	}

	public static void logErr(String message, Exception e) {
		log(new Status(IStatus.ERROR, PLUGIN_ID, message, e));
	}

}
