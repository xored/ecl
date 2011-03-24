package org.eclipse.ecl.telnet.server;

import java.io.IOException;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class EclTelnetServerPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.ecl.telnet.server";

	// The shared instance
	private static EclTelnetServerPlugin plugin;

	private EclTelnetServer server;

	/**
	 * The constructor
	 */
	public EclTelnetServerPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
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
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		server.stop();
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static EclTelnetServerPlugin getDefault() {
		return plugin;
	}

	public void startServer(int port) throws IOException {
		server = new EclTelnetServer(port);
		server.start();
	}
	
	public EclTelnetServer getServer() {
		return server;
	}
}
