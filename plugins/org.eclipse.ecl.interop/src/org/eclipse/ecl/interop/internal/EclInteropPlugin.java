package org.eclipse.ecl.interop.internal;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;

public class EclInteropPlugin extends Plugin {
	
	public static final String PLUGIN_ID = "org.eclipse.ecl.interop";

	public static Status error(String message) {
		return new Status(Status.ERROR, PLUGIN_ID, message);
	}

	public static Status error(String message, Object... args) {
		return error(String.format(message, args));
	}

}
