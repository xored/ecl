package org.eclipse.ecl.interop.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class EclInteropPlugin extends Plugin {

	public static final String PLUGIN_ID = "org.eclipse.ecl.interop";
	private static EclInteropPlugin plugin = null;

	public static EclInteropPlugin getDefault() {
		return plugin;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static Status error(String message) {
		return new Status(Status.ERROR, PLUGIN_ID, message);
	}

	public static Status error(String message, Object... args) {
		return error(String.format(message, args));
	}

	public static IStatus error(Throwable cause, String format, Object... args) {
		return new Status(IStatus.ERROR, PLUGIN_ID, String.format(format, args), cause);
	}

}
