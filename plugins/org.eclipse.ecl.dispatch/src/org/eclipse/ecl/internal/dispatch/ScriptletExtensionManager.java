package org.eclipse.ecl.internal.dispatch;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.dispatch.IScriptletExtension;
import org.eclipse.ecl.internal.core.AbstractScriptletManager;
import org.eclipse.ecl.runtime.FQName;

public class ScriptletExtensionManager extends AbstractScriptletManager<ScriptletExtensionPack> {

	private static final String SCRIPTLET_EXTENSION_EXTPT = "org.eclipse.ecl.dispatch.scriptletExtension";

	public ScriptletExtensionManager() {
		super(SCRIPTLET_EXTENSION_EXTPT);
	}

	@Override
	protected void createAndPutScriptletDefinition(FQName fqn, IConfigurationElement config) {
		if (scriptlets.containsKey(fqn))
			scriptlets.get(fqn).addConfig(config);
		else
			scriptlets.put(fqn, new ScriptletExtensionPack(fqn, config));
	}

	public IScriptletExtension getScriptletExtension(Command scriptled) throws CoreException {
		ScriptletExtensionPack extPack = getScriptletDefinition(scriptled);
		List<IScriptletExtension> exts = extPack.getExtensions();

		// TODO check extension ability to handle & uniqueness

		return exts.get(0);
	}

}
