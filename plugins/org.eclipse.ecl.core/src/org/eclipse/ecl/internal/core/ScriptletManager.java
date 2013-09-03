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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.FQName;
import org.eclipse.ecl.runtime.ICommandService;

public class ScriptletManager extends AbstractScriptletManager<ScriptletDefinition> {

	private final static String SCRIPTLET_EXTPT = "org.eclipse.ecl.core.scriptlet";

	public ScriptletManager() {
		super(SCRIPTLET_EXTPT);
	}

	//

	public synchronized ICommandService getScriptletService(Command scriptlet)
			throws CoreException {
		return getScriptletDefinition(scriptlet).getService();
	}

	@Override
	protected boolean checkScriptletName(FQName d, String name) {
		if (super.checkScriptletName(d, name))
			return true;
		else {
			ScriptletDefinition sd = scriptlets.get(d);
			Set<String> friendlyNames = sd.getFriendlyNames();
			if (friendlyNames.contains(name))
				return true;
		}
		return false;
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
		ScriptletDefinition def = (ScriptletDefinition) getScriptletDefinition(ns, name);
		return def == null ? null : def.getFriendlyNames();
	}

	@Override
	protected void createAndPutScriptletDefinition(FQName fqn, IConfigurationElement config) {
		scriptlets.put(fqn, new ScriptletDefinition(fqn.ns, fqn.name, config));
	}
}
