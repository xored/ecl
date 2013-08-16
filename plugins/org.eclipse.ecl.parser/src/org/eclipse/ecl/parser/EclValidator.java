/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.parser;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.util.DeclarationInfo;
import org.eclipse.ecl.core.util.DeclarationInfo.DeclarationInfoType;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.runtime.EclCompiler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.xored.q7.ecl.parser.EclViewerParser;

public enum EclValidator {

	Instanse;

	public IStatus validate(String content) {
		try {
			Command raw = EclCoreParser.newCommand(content);
			if (raw instanceof Exec) {
				validate((Exec) raw);
			}
		} catch (CoreException e) {
			return e.getStatus();
		}
		return Status.OK_STATUS;
	}

	public IStatus[] validateReferences(String content, Map<String, List<String>> mapIdToParameters, Map<String, String> mapIdToScripts) {
		EclViewerParser parser = new EclViewerParser();
		Map<String, List<DeclarationInfo>> mapOfDeclarations = parser.getAllDeclarations(content, mapIdToParameters, mapIdToScripts, false);

		if (mapOfDeclarations == null)
			return new IStatus[] { Status.OK_STATUS };

		if (mapOfDeclarations.size() == 0)
			return new IStatus[] { Status.OK_STATUS };

		Iterator<Entry<String, List<DeclarationInfo>>> it = mapOfDeclarations.entrySet().iterator();
		List<IStatus> statuses = new ArrayList<IStatus>();

		while (it.hasNext()) {
			Entry<String, List<DeclarationInfo>> entry = it.next();
			List<DeclarationInfo> listOfDeclarationInfos = entry.getValue();

			if (listOfDeclarationInfos == null)
				continue;

			int size = listOfDeclarationInfos.size();
			for (int i = 0; i < size; ++i) {
				DeclarationInfo declInfo = listOfDeclarationInfos.get(i);

				if (size == 1) {
					if (declInfo.getType() == DeclarationInfoType.NonExisting) {
						statuses.add(new ScriptErrorStatus(IStatus.ERROR, CorePlugin.PLUGIN_ID, entry.getKey() + " cannot be resolved as refernece or procedure.", declInfo
								.getDeclarationOffset(), 1, entry.getKey().length()));
					}
				} else {
					String statusMessage = "Duplicate declaration of " + entry.getKey() + ".";
					
					if(declInfo.getType() == DeclarationInfoType.Parameter){
						statusMessage = " Also declared as parameter.";
					}
					
					statuses.add(new ScriptErrorStatus(IStatus.WARNING, CorePlugin.PLUGIN_ID, statusMessage, declInfo
							.getDeclarationOffset(), 1, entry.getKey().length()));
				}
			}
		}

		if (statuses.size() > 0) {
			return statuses.toArray(new IStatus[statuses.size()]);
		}

		return new IStatus[] { Status.OK_STATUS };
	}

	private IStatus validate(Exec exec) throws CoreException {
		Command command = EclCompiler.compile(exec);
		EList<EObject> eContents = command.eContents();
		for (EObject e : eContents) {
			if (e instanceof Exec) {
				validate((Exec) e);
			}
		}
		return Status.OK_STATUS;
	}
}
