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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.editing.EclEditingPlugin;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.ScriptletManager;
import org.eclipse.ecl.internal.editing.parser.PegParser;
import org.eclipse.ecl.model.editing.Complete;
import org.eclipse.ecl.model.editing.EditingFactory;
import org.eclipse.ecl.model.editing.Proposal;
import org.eclipse.ecl.model.editing.ProposalType;
import org.eclipse.ecl.runtime.FQName;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.xored.peg.Block;

public class CompleteService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Complete cc = (Complete) command;
		String text = cc.getText();
		int offset = cc.getOffset();
		List<Proposal> proposals = findProposals(text, offset);
		for (Proposal p : proposals) {
			context.getOutput().write(p);
		}
		return Status.OK_STATUS;
	}

	private List<Proposal> findProposals(String text, int offset)
			throws CoreException {
		if (text.substring(0, offset).trim().length() == 0)
			return findCommandNameProposals("");
		Block result = PegParser.parse(text);
		Block target = PegParser.findBlock(result, offset);
		if (target != null) {
			String type = PegParser.getNameByType(target.getType());
			String nameStart = target.getText().substring(target.getBegin(),
					offset).trim();
			if ("command_name".equals(type)) {
				return findCommandNameProposals(nameStart);
			} else if ("argument_name".equals(type)) {
				String name = PegParser.findCommand(result, offset);
				List<String> names = PegParser.findParams(result, offset);
				return findParamNameProposals(name, nameStart, names);
			} else if ("Spacing".equals(type)) {
				String name = PegParser.findCommand(result, offset);
				if (name != null) {
					List<String> names = PegParser.findParams(result, offset);
					return findParamNameProposals(name, nameStart, names);
				}
			}
		}
		return Collections.emptyList();
	}

	private List<Proposal> findCommandNameProposals(String prefix) {
		int start = prefix.length();
		List<Proposal> proposals = new ArrayList<Proposal>();
		ScriptletManager manager = CorePlugin.getScriptletManager();
		for (FQName fqn : manager.getAllCommandNames()) {
			if (fqn.name.startsWith(prefix)) {
				Proposal p = EditingFactory.eINSTANCE.createProposal();
				p.setDisplay(fqn.name);
				p.setInsert(p.getDisplay().substring(start));
				p.setType(ProposalType.COMMAND_NAME);
				proposals.add(p);
			}
		}
		for (String name : manager.getAllFriendlyNames()) {
			if (name.startsWith(prefix)) {
				Proposal p = EditingFactory.eINSTANCE.createProposal();
				p.setDisplay(name);
				p.setInsert(p.getDisplay().substring(start));
				p.setType(ProposalType.COMMAND_NAME);
				proposals.add(p);
			}
		}
		return proposals;
	}

	private List<Proposal> findParamNameProposals(String command, String text,
			List<String> exclude) {
		String prefix = text;
		String add = "-";
		if (prefix.startsWith("-")) {
			prefix = prefix.substring(1);
			add = "";
		}
		int start = prefix.length();
		List<Proposal> proposals = new ArrayList<Proposal>();
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
			if (c != null) {
				for (EStructuralFeature sf : c.getEAllStructuralFeatures()) {
					if (sf.getEAnnotation("internal") != null)
						continue;
					String sfName = sf.getName();
					if (sfName.startsWith(prefix)) {
						if (!exclude.contains("-" + sfName)) {
							Proposal p = EditingFactory.eINSTANCE
									.createProposal();
							p.setDisplay(sfName);
							p.setInsert(add + p.getDisplay().substring(start));
							p.setType(ProposalType.PARAM_NAME);
							proposals.add(p);
						}
					}
				}
			}
		} catch (CoreException e) {
			EclEditingPlugin.logError(e);
		}
		return proposals;
	}
}
