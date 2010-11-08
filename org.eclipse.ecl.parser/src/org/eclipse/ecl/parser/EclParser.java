package org.eclipse.ecl.parser;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.internal.parser.EclParserPlugin;

import com.xored.peg.Block;
import com.xored.peg.PEGParser;
import com.xored.peg.ParsingExpressionGrammar;
import com.xored.peg.ParsingGrammar;

public final class EclParser {

	public static final EclParser instance = new EclParser();

	protected static ParsingGrammar grammar = null;

	protected PEGParser peg = null;

	protected EclParser() {
		peg = new PEGParser(getGrammar());
	}

	protected static ParsingGrammar getGrammar() {
		if (grammar == null) {
			String grammarText = null;
			try {
				grammarText = EclParserPlugin.readFile("grammar/Ecl.g");
			} catch (Exception e) {
				// Could not happen
			}
			PEGParser tempParser = new PEGParser(new ParsingExpressionGrammar());
			Block block = tempParser.parse(grammarText);
			grammar = new ParsingGrammar(block, true);
		}
		return grammar;
	}

	public Block parse(String content) {
		return parse(content);
	}

	public IStatus[] getProblems() {
		throw new RuntimeException("Not implemented yet.");
	}
}
