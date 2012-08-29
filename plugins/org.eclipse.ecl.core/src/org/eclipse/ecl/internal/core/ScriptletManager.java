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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.util.EclCommandNameConvention;
import org.eclipse.ecl.core.util.EclTypeNameConvention;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.FQName;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ScriptletManager {

	private final static String SCRIPTLET_EXTPT = "org.eclipse.ecl.core.scriptlet";
	private final static String SCRIPTLET_NAME_ATTR = "name";
	private final static String SCRIPTLET_NAMESPACE_ATTR = "namespace";
	private final static String SCRIPTLET_CLASS_ATTR = "class";

	public static final boolean TRACE_REGISTERED_COMMANDS = Boolean.valueOf(
			Platform.getDebugOption(CorePlugin.PLUGIN_ID
					+ "/traceRegisteredCommands")).booleanValue();

	private final static class Documentation {

		private EMap<String, String> details = null;

		public Documentation(EModelElement element) {
			EAnnotation ann = element.getEAnnotation(CoreUtils.DOCS_ANN);
			if (ann == null)
				return;
			this.details = ann.getDetails();
		}

		public String get(String key) {
			if (details == null || !details.containsKey(key))
				return null;
			return details.get(key);
		}
	}

	public final static class ParameterDocumentation {
		private Documentation docs;

		public ParameterDocumentation(ParameterDefinition def) {
			docs = new Documentation(def.getEFeature());
		}

		public String getDescription() {
			return docs.get(CoreUtils.DESCRIPTION_DET);
		}
	}

	public final static class ScriptletDocumentation {
		private Documentation docs;

		public ScriptletDocumentation(ScriptletDefinition def) {
			docs = new Documentation(def.getEClass());
		}

		public String getDescription() {
			return docs.get(CoreUtils.DESCRIPTION_DET);
		}

		public String getReturns() {
			return docs.get(CoreUtils.RETURNS_DET);
		}

		public String getExample() {
			return docs.get(CoreUtils.EXAMPLE_DET);
		}
	}

	public final static class ParameterDefinition {
		private EStructuralFeature feature;
		private ParameterDocumentation docs;

		public ParameterDefinition(EStructuralFeature feature) {
			this.feature = feature;
		}

		public String getName() {
			return feature.getName();
		}

		public boolean isInternal() {
			return feature.getEAnnotation(CoreUtils.INTERNAL_ANN) != null;
		}

		public boolean isInput() {
			return feature.getEAnnotation(CoreUtils.INPUT_ANN) != null;
		}

		public boolean isOptional() {
			return !feature.isRequired();
		}

		public String getTypeName() {
			return feature.getEType().getName();
		}

		public String getFriendlyTypeName() {
			return EclTypeNameConvention.toTypeName(getTypeName());
		}

		public String getFriendlyDefaultLiteral() {
			String result = feature.getDefaultValueLiteral();
			if (!getFriendlyTypeName().equals("String"))
				return result;

			if (result == null || result.length() == 0)
				return "\"\"";
			else
				return '"' + result + '"';
		}

		public ParameterDocumentation getDocumentation() {

			if (docs == null)
				docs = new ParameterDocumentation(this);
			return docs;
		}

		public EStructuralFeature getEFeature() {
			return feature;
		}

		public int getLowerBound() {
			return feature.getLowerBound();
		}

		public int getUpperBound() {
			return feature.getUpperBound();
		}
	}

	public final static class ScriptletDefinition {

		private final String name;
		private final String namespace;
		private final IConfigurationElement config;
		private Set<String> friendlyNames;
		private ICommandService service;
		private ScriptletDocumentation docs;
		private ArrayList<ParameterDefinition> params;

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
			if (service == null) {
				service = (ICommandService) config
						.createExecutableExtension(SCRIPTLET_CLASS_ATTR);
			}
			return service;
		}

		public EClass getEClass() {
			EPackage epackage = EPackage.Registry.INSTANCE
					.getEPackage(namespace);
			return (EClass) epackage.getEClassifier(name);
		}

		public String getCommandName() {
			return EclCommandNameConvention
					.toCommandName(getEClass().getName());
		}

		public boolean isInternal() {
			return getEClass().getEAnnotation(CoreUtils.INTERNAL_ANN) != null;
		}

		public ScriptletDocumentation getDocumentation() {
			if (docs == null)
				docs = new ScriptletDocumentation(this);
			return docs;
		}

		public List<ParameterDefinition> getParameters() {
			if (params != null)
				return params;

			params = new ArrayList<ParameterDefinition>();
			EList<EStructuralFeature> features = getEClass()
					.getEAllStructuralFeatures();
			for (EStructuralFeature f : features)
				params.add(new ParameterDefinition(f));

			return params;
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
		return getScriptletDefinition(ns, name).getEClass();
	}

	synchronized public Command createCommand(String ns, String name)
			throws CoreException {
		EClass clazz = getScriptletDefinition(ns, name).getEClass();
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
		if (scriptlets == null)
			loadScriptlets();
		return scriptlets.keySet();
	}

	synchronized public Set<String> getAllFriendlyNames() {
		if (scriptlets == null)
			loadScriptlets();
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

	synchronized public Collection<ScriptletDefinition> getAllScriptlets() {
		if (scriptlets == null)
			loadScriptlets();
		return scriptlets.values();
	}

	private void loadScriptlets() {
		scriptlets = new HashMap<FQName, ScriptletDefinition>();
		IConfigurationElement[] configs = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(SCRIPTLET_EXTPT);
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
				scriptlets.put(fqn, new ScriptletDefinition(ns, name, config));
			} catch (Exception e) {
				CorePlugin.log(CorePlugin.err("Failed to load scriptlet "
						+ name + ": " + e.getMessage(), e));
			}
		}
	}
}
