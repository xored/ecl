package org.eclipse.ecl.internal.dispatch;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.ecl.internal.dispatch.messages"; //$NON-NLS-1$

	private Messages() {
		// Do not instantiate
	}

	public static String NotUniqueExtension;

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}