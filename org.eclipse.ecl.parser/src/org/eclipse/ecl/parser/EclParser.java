package org.eclipse.ecl.parser;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.parser.AstBuilder;
import org.eclipse.ecl.internal.parser.EclParserPlugin;

import com.xored.peg.Block;
import com.xored.peg.PEGParser;
import com.xored.peg.PackratParser;
import com.xored.peg.ParsingExpressionGrammar;
import com.xored.peg.ParsingGrammar;

public final class EclParser {

	protected static ParsingGrammar grammar = null;

	protected PackratParser peg = null;
	protected final String content;

	public EclParser(String content) {
		this.content = content;
		peg = new PackratParser(getGrammar());
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

	public Block parse() throws CoreException {
		Block parse = peg.parse(content);
		if (parse == Block.NO_PARSE)
			throw new CoreException(new Status(IStatus.ERROR,
					EclParserPlugin.PLUGIN_ID, "Parse Error"));
		return parse;
	}

	public IStatus[] getProblems() {
		throw new RuntimeException("Not implemented yet.");
	}

	public Command compile() throws CoreException {
		return new AstBuilder().build(parse());
	}
}
