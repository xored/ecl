package org.eclipse.ecl.perf.internal.commands;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.ecl.perf.internal.commands.messages"; //$NON-NLS-1$
	public static String MaxConstraintViolation;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}

	public static String getMaxConstraintViolation(String name,
			String property, int actual, int expected) {
		return NLS.bind(MaxConstraintViolation, new Object[] { name, property,
				actual, expected });
	}
}
