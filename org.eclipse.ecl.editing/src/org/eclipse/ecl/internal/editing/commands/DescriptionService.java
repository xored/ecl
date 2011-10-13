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
package org.eclipse.ecl.internal.editing.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.ScriptletManager;
import org.eclipse.ecl.internal.editing.parser.PegParser;
import org.eclipse.ecl.model.editing.Description;
import org.eclipse.ecl.model.editing.Doc;
import org.eclipse.ecl.model.editing.EditingFactory;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.cisco.peg.Block;

public class DescriptionService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Description dc = (Description) command;
		Doc doc = EditingFactory.eINSTANCE.createDoc();
		String desc = getDescription(dc.getText(), dc.getOffset());
		doc.setText(desc);
		context.getOutput().write(doc);
		return Status.OK_STATUS;
	}

	private String getDescription(String text, int offset) throws CoreException {
		Block result = PegParser.parse(text);
		Block target = PegParser.findBlock(result, offset);
		if (target != null) {
			String type = PegParser.getNameByType(target.getType());
			if ("command_name".equals(type)) {
				return getCommandOverview(target.getSubtext());
			} else {
				String name = PegParser.findCommand(result, offset);
				return getCommandOverview(name);
			}
		}
		return null;
	}

	public String getCommandOverview(String command) {
		StringBuilder overview = new StringBuilder();
		ScriptletManager manager = CorePlugin.getScriptletManager();
		String ns = null;
		String name = command;
		int i = command.indexOf("::");
		if (i != -1) {
			name = name.substring(i + 2);
			ns = name.substring(0, i);
		}
		try {
			EClass c = manager.findCommand(ns, name);
			overview.append(c.getName());
			for (EStructuralFeature sf : c.getEAllStructuralFeatures()) {
				if (sf.getEAnnotation("internal") != null) {
					continue;
				}
				overview.append(" -");
				overview.append(sf.getName());
				overview.append(':').append(sf.getEType().getName());
				int lower = sf.getLowerBound();
				int upper = sf.getUpperBound();
				if (lower == 1 && upper == 1)
					;
				else if (lower == 0 && upper == 1)
					overview.append('?');
				else if (lower == 0 && upper < 0)
					overview.append('*');
				else
					overview.append("[" + lower + ".." + upper + "]");
			}
		} catch (CoreException e) {
			// do nothing
		}
		return overview.toString();
	}
}
