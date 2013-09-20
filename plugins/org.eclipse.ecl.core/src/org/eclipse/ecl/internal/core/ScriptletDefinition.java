package org.eclipse.ecl.internal.core;

import static org.eclipse.ecl.internal.core.ScriptletManager.SCRIPTLET_CLASS_ATTR;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.ecl.core.util.EclCommandNameConvention;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

public final class ScriptletDefinition {
	private final String name;
	private final String namespace;
	private final IConfigurationElement config;
	private Set<String> friendlyNames;
	private ICommandService service;

	ScriptletDefinition(String ns, String name, IConfigurationElement config) {
		this.namespace = ns;
		this.name = name;
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
			service = (ICommandService) config.createExecutableExtension(SCRIPTLET_CLASS_ATTR);
		return service;
	}

	public EClass getEClass() {
		EPackage epackage = EPackage.Registry.INSTANCE.getEPackage(namespace);
		return (EClass) epackage.getEClassifier(name);
	}

	public String getCommandName() {
		return EclCommandNameConvention.toCommandName(getEClass().getName());
	}

	public boolean isInternal() {
		return getEClass().getEAnnotation(CoreUtils.INTERNAL_ANN) != null;
	}

}