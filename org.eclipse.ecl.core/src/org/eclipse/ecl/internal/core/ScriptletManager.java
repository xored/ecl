/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Andrey Platov)
 *******************************************************************************/

package org.eclipse.ecl.internal.core;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.FQName;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

public class ScriptletManager {

	private final static String SCRIPTLET_EXTPT = "org.eclipse.ecl.core.scriptlet";
	private final static String SCRIPTLET_NAME_ATTR = "name";
	private final static String SCRIPTLET_NAMESPACE_ATTR = "namespace";
	private final static String SCRIPTLET_CLASS_ATTR = "class";

	public static final boolean TRACE_REGISTERED_COMMANDS = Boolean.valueOf(
			Platform.getDebugOption(CorePlugin.PLUGIN_ID
					+ "/traceRegisteredCommands")).booleanValue();

	final static class ScriptletDefinition {

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
				String commandName = CoreUtils
						.getScriptletNameByClass(getParametersClass());
				friendlyNames.add(commandName);
			}
			return friendlyNames;
		}

		ICommandService getService() throws CoreException {
			if (service == null) {
				service = (ICommandService) config
						.createExecutableExtension(SCRIPTLET_CLASS_ATTR);
			}
			return service;
		}

		EClass getParametersClass() {
			EPackage epackage = EPackage.Registry.INSTANCE
					.getEPackage(namespace);
			return (EClass) epackage.getEClassifier(name);
		}
	}

	private Map<FQName, ScriptletDefinition> scriptlets;

	synchronized ICommandService getScriptletService(Command scriptlet)
			throws CoreException {
		String ns = scriptlet.eClass().getEPackage().getNsURI();
		String name = scriptlet.eClass().getName();
		return getScriptletDefinition(ns, name).getService();
	}

	synchronized public EClass findCommand(String ns, String name)
			throws CoreException {
		return getScriptletDefinition(ns, name).getParametersClass();
	}

	synchronized public Command createCommand(String ns, String name)
			throws CoreException {
		EClass clazz = getScriptletDefinition(ns, name).getParametersClass();
		return (Command) clazz.getEPackage().getEFactoryInstance()
				.create(clazz);
	}

	private synchronized ScriptletDefinition getScriptletDefinition(String ns,
			String name) throws CoreException {
		if (scriptlets == null)
			loadScriptlets();
		FQName fqn = new FQName(ns, name);
		ScriptletDefinition def = scriptlets.get(fqn);
		// Search unique scriptlet
		if (def == null) {
			FQName fqname = null;
			for (FQName d : scriptlets.keySet()) {
				if (d.name.equals(name)) {
					if (fqname == null) {
						fqname = d;
					} else {
						fqname = null;
						break;
					}
				} else {
					ScriptletDefinition sd = scriptlets.get(d);
					Set<String> friendlyNames = sd.getFriendlyNames();
					if (friendlyNames.contains(name)) {
						if (fqname == null) {
							fqname = d;
						} else {
							fqname = null;
							break;
						}
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

	synchronized public Set<FQName> getAllCommandNames() {
		return scriptlets.keySet();
	}

	synchronized public Set<String> getAllFriendlyNames() {
		Set<String> all = new HashSet<String>();
		for (ScriptletDefinition def : scriptlets.values()) {
			all.addAll(def.getFriendlyNames());
		}
		return all;
	}

	synchronized public Set<String> getFriendlyNames(String ns, String name)
			throws CoreException {
		ScriptletDefinition def = getScriptletDefinition(ns, name);
		return def == null ? null : def.getFriendlyNames();
	}

	private void loadScriptlets() {
		scriptlets = new HashMap<FQName, ScriptletDefinition>();
		IConfigurationElement[] configs = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(SCRIPTLET_EXTPT);
		for (IConfigurationElement config : configs) {
			String ns = config.getAttribute(SCRIPTLET_NAMESPACE_ATTR);
			String name = config.getAttribute(SCRIPTLET_NAME_ATTR);
			FQName fqn = new FQName(ns, name);
			scriptlets.put(fqn, new ScriptletDefinition(ns, name, config));
			if (TRACE_REGISTERED_COMMANDS)
				System.out.println("Loaded definition of command " + fqn);
		}
	}
}
