package org.eclipse.ecl.parser;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.parser.CommandBuilder;
import org.eclipse.ecl.internal.parser.EclParserErrorCollector;
import org.eclipse.ecl.internal.parser.ParserPlugin;

import com.xored.peg.Block;
import com.xored.peg.PEGParser;
import com.xored.peg.ParsingExpressionGrammar;
import com.xored.peg.ParsingGrammar;

public final class EclCoreParser {

	private static PEGParser parser = null;

	static PEGParser getParser() {
		if (parser == null) {
			String grammarText = null;
			try {
				grammarText = ParserPlugin.readFile("grammar/Ecl.g");
			} catch (Exception e) {
				// Could not happen
			}
			PEGParser tempParser = new PEGParser(new ParsingExpressionGrammar());
			Block block = tempParser.parse(grammarText);
			ParsingGrammar grammar = new ParsingGrammar(block, true);
			parser = new PEGParser(grammar);
		}
		return parser;
	}

	static String getNameByType(int type) {
		return getParser().getGrammar().getNameByType(type);
	}

	public static Block parse(String text) {
		Block b = getParser().parse(text);
		return b;
	}

	public static IEclParserErrorReporter makeErrorReporter() {
		return new EclParserErrorCollector();
	}

	public static Command newCommand(String content) {
		Block block = parse(content);
		return CommandBuilder.build(block, false);
	}

	public static Command newCommand(String content,
			IEclParserErrorReporter reporter) {
		return newCommand(content);
	}
}
