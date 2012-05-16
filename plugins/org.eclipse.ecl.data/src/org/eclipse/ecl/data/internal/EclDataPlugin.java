package org.eclipse.ecl.data.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class EclDataPlugin extends Plugin {

	public static final String PLUGIN_ID = "org.eclipse.ecl.data";
	private static EclDataPlugin plugin;

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static EclDataPlugin getDefault() {
		return plugin;
	}

	public static IStatus createErr(String format, Object... args) {
		return createErr(null, format, args);
	}

	public static IStatus createErr(Throwable e, String format, Object... args) {
		return new Status(IStatus.ERROR, PLUGIN_ID,
				String.format(format, args), e);
	}

}
