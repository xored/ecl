package org.eclipse.ecl.internal.debug.runtime;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;

public class Log {

	public static final String PLUGIN_ID = "org.eclipse.ecl.debug.runtime";

	public static IStatus status(Throwable t) {
		return new Status(IStatus.ERROR, PLUGIN_ID, t.getMessage(), t);
	}

	public static void log(Throwable t) {
		log(status(t));
	}

	public static void log(IStatus status) {
		Bundle bundle = Platform.getBundle(PLUGIN_ID);
		ILog log = Platform.getLog(bundle);
		log.log(status);
	}
}
