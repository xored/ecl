package org.eclipse.ecl.operations.internal;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class OperationsPlugin extends Plugin {

	private static OperationsPlugin plugin = null;
	public static final String PLUGIN_ID = "org.eclipse.ecl.operations";
	
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
	
	public static OperationsPlugin getDefault() {
		return plugin;
	}
}
