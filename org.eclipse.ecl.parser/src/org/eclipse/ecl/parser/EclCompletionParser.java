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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.ecl.core.util.EclCommandNameConvention;
import org.eclipse.ecl.internal.parser.EclParserPlugin;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.xored.peg.Block;
import com.xored.peg.PEGParser;
import com.xored.peg.ParsingExpressionGrammar;
import com.xored.peg.ParsingGrammar;
import com.xored.peg.TreeOptimizer;

public class EclCompletionParser {

	private static enum Rules {
		Commands, // 0
		Sequence, // 1
		Pipeline, // 2
		Command, // 3
		CommandName, // 4
		Parameter, // 5
		ParameterName, // 6
		ParameterValue, // 7
		Substitution, // 8
		CurlyExpression, // 9
		Identifier, // 10
		Number, // 11
		String, // 12
		Colon, // 13
		Pipe, // 14
		LCurly, // 15
		RCurly, // 16
		LBrack, // 17
		RBrack, // 18
		Spacing, // 19
		ParameterDelim, // 20
		CommandSpacing, // 21
		EndOfLine, // 22
	}

	public interface CompletionProposalReporter {
		void reportCommandName(String replacement, int offset, String display);

		void reportParameterName(String replacement, int offset, String display);
	}

	private static PEGParser parser = null;

	private static PEGParser getParser() {
		if (parser == null) {
			String grammarText = null;
			try {
				grammarText = EclParserPlugin.readFile("grammar/Ecl.peg");
			} catch (Exception e) {
				EclParserPlugin.logErr(e.getMessage(), e);
			}
			PEGParser tempParser = new PEGParser(new ParsingExpressionGrammar());
			Block block = tempParser.parse(grammarText);
			ParsingGrammar grammar = new ParsingGrammar(block, true);
			parser = new PEGParser(grammar);
		}
		return parser;
	}

	private Map<String, EClass> scriplets;

	public EclCompletionParser(Set<EClass> scriplets) {
		this.scriplets = new HashMap<String, EClass>();
		for (EClass eClass : scriplets) {
			String name = eClass.getName();
			this.scriplets.put(EclCommandNameConvention.toCommandName(name),
					eClass);
		}
	}

	public void reportCompletionProposals(String text, int offset,
			CompletionProposalReporter reporter) {
		reportCompletionProposals(text, offset, offset, reporter);
	}

	private void reportCompletionProposals(String text, int textOffset,
			int offset, CompletionProposalReporter reporter) {
		if (text.trim().length() == 0) {
			reportCommandNameProposals("", offset, reporter);
			return;
		}
		Block result = parse(text);
		Block target = findBlock(result, textOffset);
		if (target == null) {
			return;
		}
		int type = target.getType();
		String substring = type == Rules.Spacing.ordinal() ? "" : target
				.getText().substring(target.getBegin(), textOffset);
		String nameStart = substring.trim();
		if (type < 0 || type >= Rules.values().length) {
			return;
		}
		switch (Rules.values()[type]) {
		case CommandName:
			reportCommandNameProposals(nameStart, offset, reporter);
			return;
		case ParameterName:
			Block commandBlock = findCommandBlock(result, textOffset);
			if (commandBlock != null) {
				List<String> names = getParameters(commandBlock);
				reportParamNameProposals(getCommandName(commandBlock),
						nameStart, names, offset, reporter);
			}
			return;
		case ParameterDelim:
		case CommandSpacing:
		case Spacing:
			if (target.getBegin() > 0) {
				char prevChar = text.charAt(target.getBegin() - 1);
				switch (prevChar) {
				case ';':
				case '|':
				case '[':
					reportCommandNameProposals(nameStart, offset, reporter);
				}
			}
			if (substring.contains("\n"))
				break;
			commandBlock = findCommandBlock(result, target.getBegin());
			if (commandBlock != null) {
				List<String> names = getParameters(commandBlock);
				reportParamNameProposals(getCommandName(commandBlock),
						nameStart, names, offset, reporter);
				return;
			}
			// Than it's command name
			reportCommandNameProposals(nameStart, offset, reporter);
			return;
		case Pipe:
		case LBrack:
		case LCurly:
		case Colon:
		case EndOfLine:
			reportCommandNameProposals("", offset, reporter);
			return;
		case CurlyExpression:
			String subtext = target.getSubtext();
			subtext = subtext.substring(1, subtext.length() - 1).intern();
			textOffset = textOffset - target.getBegin() - 1;
			reportCompletionProposals(subtext, textOffset, offset, reporter);
			return;
		}
	}

	private void reportCommandNameProposals(String prefix, int offset,
			CompletionProposalReporter reporter) {
		int start = prefix.length();
		for (String name : scriplets.keySet()) {
			if (name.startsWith(prefix)) {
				reporter.reportCommandName(name.substring(start), offset, name);
			}
		}
	}

	private void reportParamNameProposals(String command, String text,
			List<String> exclude, int offset,
			CompletionProposalReporter reporter) {
		String prefix = text;
		String add = "-";
		if (prefix.startsWith("-")) {
			prefix = prefix.substring(1);
			add = "";
		}
		int start = prefix.length();
		EClass c = scriplets.get(command);
		if (c != null) {
			for (EStructuralFeature sf : c.getEAllStructuralFeatures()) {
				if (sf.getEAnnotation(CoreUtils.INTERNAL_ANN) != null)
					continue;
				String sfName = sf.getName();
				if (sfName.startsWith(prefix)) {
					if (!exclude.contains("-" + sfName)) {
						reporter.reportParameterName(
								add + sfName.substring(start), offset, sfName);

					}
				}
			}
		}
	}

	private Block parse(String text) {
		Block b = getParser().parse(text);
		TreeOptimizer.removeEmpty(b);
		TreeOptimizer.removeChildrenOfType(b, Rules.CommandName.ordinal());
		TreeOptimizer.removeChildrenOfType(b, Rules.ParameterName.ordinal());
		TreeOptimizer.removeChildrenOfType(b, Rules.CurlyExpression.ordinal());
		TreeOptimizer.removeChildrenOfType(b, Rules.Spacing.ordinal());
		return b;
	}

	private Block findBlock(Block block, int offset) {
		if (block.getBegin() <= offset && block.getEnd() >= offset) {
			int num = block.getNumChildren();
			if (num == 0)
				return block;
			for (int i = 0; i < num; i++) {
				Block child = block.getChild(i);
				Block res = findBlock(child, offset);
				if (res != null) {
					return res;
				}
			}
		}
		return null;
	}

	private Block findCommandBlock(Block block, int offset) {
		if (block.getBegin() <= offset && block.getEnd() >= offset) {
			int num = block.getNumChildren();
			for (int i = 0; i < num; i++) {
				Block child = block.getChild(i);
				Block res = findCommandBlock(child, offset);
				if (res != null) {
					return res;
				}
			}
			if (block.getType() == Rules.Command.ordinal()) {
				return block;
			}
		}
		return null;
	}

	private String getCommandName(Block commandBlock) {
		Block name = commandBlock.getChild(0);
		return name.getSubtext();
	}

	private List<String> getParameters(Block commandBlock) {
		List<String> names = new ArrayList<String>();
		doGetParameters(commandBlock, names);
		return names;
	}

	private void doGetParameters(Block block, List<String> list) {
		if (block.getType() == Rules.ParameterName.ordinal()) {
			list.add(block.getSubtext());
		}
		int num = block.getNumChildren();
		for (int i = 0; i < num; i++) {
			Block child = block.getChild(i);
			doGetParameters(child, list);
		}
	}
}
