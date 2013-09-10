package org.eclipse.ecl.internal.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.ecl.core.util.EclCommandNameConvention;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

public abstract class ScriptletDefinitionBase {

	protected final String name;
	protected final String namespace;

	public ScriptletDefinitionBase(String ns, String name) {
		this.namespace = ns;
		this.name = name;
	}

	protected ICommandService createServiceFrom(IConfigurationElement config) throws CoreException {
		return (ICommandService) config.createExecutableExtension(ScriptletManager.SCRIPTLET_CLASS_ATTR);
	}

	//

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