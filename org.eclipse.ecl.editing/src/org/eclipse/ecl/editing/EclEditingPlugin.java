package org.eclipse.ecl.editing;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class EclEditingPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.ecl.editing";

	// The shared instance
	private static EclEditingPlugin plugin;

	/**
	 * The constructor
	 */
	public EclEditingPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
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
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
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
	public static EclEditingPlugin getDefault() {
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

	public static void log(CoreException ce) {
		log(ce.getStatus());
	}

	public static void logError(Exception e) {
		log(err(e.getMessage(), e));
	}

	public static CoreException makeCoreException(String message, Throwable e) {
		return new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, message,
				e));
	}

	public static String readFile(String file) throws Exception {
		InputStream openStream = getInputStream(file);
		byte[] content = getContent(openStream);
		return new String(content).replace("\r\n", "\n");
	}

	public static InputStream getInputStream(String file) throws IOException {
		URL entry = getDefault().getBundle().getEntry(file);
		InputStream openStream = entry.openStream();
		return openStream;
	}

	public static byte[] getContent(InputStream input) throws IOException {
		final BufferedInputStream buffer = new BufferedInputStream(input);
		final ByteArrayOutputStream output = new ByteArrayOutputStream(100000);
		try {
			final byte[] bytes = new byte[8192];
			int length = 0;
			while ((length = buffer.read(bytes)) > 0) {
				output.write(bytes, 0, length);
			}
		} finally {
			buffer.close();
		}
		return output.toByteArray();
	}
}
