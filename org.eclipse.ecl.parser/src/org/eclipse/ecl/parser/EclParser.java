package org.eclipse.ecl.parser;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.parser.AstBuilder;
import org.eclipse.ecl.internal.parser.EclParserPlugin;

import com.xored.peg.Block;
import com.xored.peg.PEGParser;
import com.xored.peg.ParsingExpressionGrammar;
import com.xored.peg.ParsingGrammar;

public final class EclParser {

	protected static ParsingGrammar grammar = null;

	protected PEGParser peg = null;
	protected final String content;

	public EclParser(String content) {
		this.content = content;
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

	public Block parse() {
		return peg.parse(content);
	}

	public IStatus[] getProblems() {
		throw new RuntimeException("Not implemented yet.");
	}

	public Command compile() {
		Block block = parse();
		if (block == Block.NO_PARSE)
			return null;
		return new AstBuilder().build(block);
	}
}
