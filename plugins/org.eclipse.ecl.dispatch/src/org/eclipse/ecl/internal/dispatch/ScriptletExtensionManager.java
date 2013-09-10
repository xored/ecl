package org.eclipse.ecl.internal.dispatch;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
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

	/**
	 * @return suitable extension or null, if the extensions are not suitable or no extension is available
	 */
	public IScriptletExtension getScriptletExtension(Command scriptlet) throws CoreException {
		ScriptletExtensionPack extPack = getScriptletDefinition(scriptlet);
		if (extPack == null)
			return null;
		List<IScriptletExtension> exts = extPack.getExtensions();
		
		IScriptletExtension suitableExt = null;
		for (IScriptletExtension ext : exts) {
			if (ext.canHandle(scriptlet)) {
				if (suitableExt != null)
					errorNotUnique(scriptletFQName(scriptlet));

				suitableExt = ext;
				// and check that others can't handle that,
				// so we don't break out from here
			}
		}

		return suitableExt;
	}

	@Override
	protected void scriptletNotFound(FQName fqn) throws CoreException {
		// do nothing, just pass to default service
	}

	//

	public static final String PLUGIN_ID = "org.eclipse.ecl.dispatch";

	private void errorNotUnique(FQName fqn) throws CoreException {
		IStatus status = new Status(IStatus.ERROR, PLUGIN_ID,
				Messages.bind(Messages.NotUniqueExtension, fqn.name));
		throw new CoreException(status);
	}

}
