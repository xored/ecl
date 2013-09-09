package org.eclipse.ecl.internal.core;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.FQName;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractScriptletManager<T extends ScriptletDefinitionBase> {

	private static final String SCRIPTLET_NAME_ATTR = "name";
	private static final String SCRIPTLET_NAMESPACE_ATTR = "namespace";
	protected static final String SCRIPTLET_CLASS_ATTR = "class";

	public static final boolean TRACE_REGISTERED_COMMANDS = Boolean.valueOf(
				Platform.getDebugOption(CorePlugin.PLUGIN_ID
						+ "/traceRegisteredCommands")).booleanValue();

	protected final String extPoint;
	protected Map<FQName, T> scriptlets;

	public AbstractScriptletManager(String extPoint) {
		this.extPoint = extPoint;
	}

	//

	public synchronized EClass findCommand(String ns, String name) throws CoreException {
		return getScriptletDefinition(ns, name).getEClass();
	}

	public synchronized Command createCommand(String ns, String name) throws CoreException {
		EClass clazz = getScriptletDefinition(ns, name).getEClass();
		return (Command) clazz.getEPackage().getEFactoryInstance()
				.create(clazz);
	}

	protected FQName scriptletFQName(Command scriptlet) {
		String ns = scriptlet.eClass().getEPackage().getNsURI();
		String name = scriptlet.eClass().getName();
		return new FQName(ns, name);
	}

	protected T getScriptletDefinition(Command scriptlet) throws CoreException {
		FQName fqn = scriptletFQName(scriptlet);
		return getScriptletDefinition(fqn.ns, fqn.name);
	}

	protected synchronized T getScriptletDefinition(String ns, String name) throws CoreException {
		if (scriptlets == null)
			loadScriptlets();
		FQName fqn = new FQName(ns, name);
		T def = scriptlets.get(fqn);
		// Search unique scriptlet
		if (def == null) {
			FQName fqname = null;
			for (FQName d : scriptlets.keySet()) {
				if (checkScriptletName(d, name)) {
					if (fqname == null) {
						fqname = d;
					} else {
						fqname = null;
						break;
					}
				}
			}
			if (fqname != null) {
				def = scriptlets.get(fqname);
			}
		}
		if (def == null) {
			IStatus status = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					MessageFormat.format("Scriptlet {0} not found",
							new Object[] { fqn }));
			if (TRACE_REGISTERED_COMMANDS)
				System.out.println(status.getMessage());
	
			throw new CoreException(status);
		}
		return def;
	}

	protected boolean checkScriptletName(FQName d, String name) {
		return d.name.equals(name);
	}

	protected void loadScriptlets() {
		scriptlets = new HashMap<FQName, T>();
		IConfigurationElement[] configs = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(extPoint);
		for (IConfigurationElement config : configs) {
			String ns = config.getAttribute(SCRIPTLET_NAMESPACE_ATTR);
			String name = config.getAttribute(SCRIPTLET_NAME_ATTR);
			try {
				EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(ns);
				Assert.isLegal(ePackage != null, "Unknown package nsURI=" + ns);
				Assert.isLegal(
						ePackage.getEClassifier(name) != null,
						"Unknown class=" + name + " in package="
								+ ePackage.getName());
				FQName fqn = new FQName(ns, name);
				if (TRACE_REGISTERED_COMMANDS)
					System.out.println("Loaded definition of command " + fqn);
				createAndPutScriptletDefinition(fqn, config);
			} catch (Exception e) {
				CorePlugin.log(CorePlugin.err("Failed to load scriptlet "
						+ name + ": " + e.getMessage(), e));
			}
		}
	}

	protected abstract void createAndPutScriptletDefinition(FQName fqn, IConfigurationElement config);

}