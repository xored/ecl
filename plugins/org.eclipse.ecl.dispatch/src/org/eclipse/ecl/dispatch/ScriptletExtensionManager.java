package org.eclipse.ecl.dispatch;

import org.eclipse.ecl.internal.core.ScriptletManager;

public class ScriptletExtensionManager extends ScriptletManager {

	private static final String SCRIPTLET_EXTENSION_EXTPT = "org.eclipse.ecl.dispatch.scriptletExtension";

	public ScriptletExtensionManager() {
		super(SCRIPTLET_EXTENSION_EXTPT);
	}

}
