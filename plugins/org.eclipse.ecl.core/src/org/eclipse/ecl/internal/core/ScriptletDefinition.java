package org.eclipse.ecl.internal.core;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.ecl.runtime.ICommandService;

public final class ScriptletDefinition extends ScriptletDefinitionBase {

	private final IConfigurationElement config;
	private Set<String> friendlyNames;
	private ICommandService service;

	ScriptletDefinition(String ns, String name, IConfigurationElement config) {
		super(ns, name);
		this.config = config;
	}

	Set<String> getFriendlyNames() {
		if (friendlyNames == null) {
			friendlyNames = new HashSet<String>();
			IConfigurationElement[] elements = config
					.getChildren("friendly_name");
			for (IConfigurationElement e : elements) {
				String name = e.getAttribute("value");
				friendlyNames.add(name);
			}
		}
		return friendlyNames;
	}

	ICommandService getService() throws CoreException {
		if (service == null)
			service = createServiceFrom(config);
		return service;
	}
}