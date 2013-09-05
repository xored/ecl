package org.eclipse.ecl.internal.dispatch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.ecl.dispatch.IScriptletExtension;
import org.eclipse.ecl.internal.core.ScriptletDefinitionBase;
import org.eclipse.ecl.runtime.FQName;

public class ScriptletExtensionPack extends ScriptletDefinitionBase {

	private final List<IConfigurationElement> configs = new ArrayList<IConfigurationElement>(1);

	public ScriptletExtensionPack(FQName fqn, IConfigurationElement config) {
		super(fqn.ns, fqn.name);
		addConfig(config);
	}

	public void addConfig(IConfigurationElement config) {
		configs.add(config);
	}

	public List<IScriptletExtension> getExtensions() throws CoreException {
		List<IScriptletExtension> exts = new ArrayList<IScriptletExtension>(configs.size());
		for (IConfigurationElement conf : configs)
			exts.add((IScriptletExtension) createServiceFrom(conf));
		// not caching 'exts' because the 'configs' list can be changed
		// (theoretically, although this method should not be called before all 'configs' are loaded)
		return exts;
	}

}
