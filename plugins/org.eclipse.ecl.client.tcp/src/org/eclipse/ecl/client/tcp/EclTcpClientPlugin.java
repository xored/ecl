/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.client.tcp;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
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

	public static void logInfo(String format, Object... args) {
		log(new Status(IStatus.INFO, PLUGIN_ID, String.format(format, args)));
	}

	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}

	public static CoreException makeCoreException(String message, Throwable e) {
		return new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, message,
				e));
	}

}
