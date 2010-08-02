package org.eclipse.ecl.internal.swt;

import java.text.MessageFormat;

import org.eclipse.osgi.util.NLS;

public class ServiceMessages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.dltk.ui.tests.swtbot.operations.ServiceMessages"; //$NON-NLS-1$

	public static String Service_No_shell_found;
	public static String Service_Display_disposed;

	public static String Service_Invalid_pipe_content;
	public static String Service_Pipe_was_empty;

	public static String Service_Invalid_result;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, ServiceMessages.class);
	}

	private ServiceMessages() {
	}

	public static String format(String message, Object object) {
		return MessageFormat.format(message, new Object[] { object });
	}

	public static String format(String message, Object[] objects) {
		return MessageFormat.format(message, objects);
	}

}
