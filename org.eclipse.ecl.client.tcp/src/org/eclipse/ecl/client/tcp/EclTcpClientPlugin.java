package org.eclipse.ecl.client.tcp;

import java.io.IOException;
import java.net.InetAddress;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.internal.client.tcp.TcpSession;
import org.eclipse.ecl.runtime.ISession;
import org.osgi.framework.BundleContext;

public class EclTcpClientPlugin extends Plugin {

	public static final String PLUGIN_ID = "org.eclipse.ecl.client.tcp";
	public static final int DEFAULT_PORT = 5378;

	private static EclTcpClientPlugin plugin;

	/**
	 * The constructor
	 */
	public EclTcpClientPlugin() {
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
	public static EclTcpClientPlugin getDefault() {
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

	public static CoreException makeCoreException(String message, Throwable e) {
		return new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, message,
				e));
	}

	/**
	 * @deprecated Use
	 *             {@link org.eclipse.ecl.client.tcp.EclTcpClientManager#startClientSession(InetAddress, int)}
	 *             instead
	 */
	@Deprecated
	public static ISession startLocalSession() throws IOException {
		return new TcpSession(InetAddress.getByName("localhost"), DEFAULT_PORT);
	}

	/**
	 * @deprecated Use
	 *             {@link org.eclipse.ecl.client.tcp.EclTcpClientManager#startClientSession(InetAddress, int)}
	 *             instead
	 */
	@Deprecated
	public static ISession startSession(InetAddress address, int port)
			throws IOException {
		return new TcpSession(address, port);
	}
}
