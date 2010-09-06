package org.eclipse.ecl.parser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.ParserPlugin;
import org.eclipse.ecl.internal.parser.EclLexer;
import org.eclipse.ecl.internal.parser.EclParser;

public class EclCoreParser {
	public static Command newCommand(String content) {
		return newCommand(content, null);
	}

	public static Command newCommand(String content,
			EclParserErrorCollector reporter) {
		EclLexer lexer = new EclLexer(new ANTLRStringStream(content));
		lexer.setErrorReporter(reporter);
		CommonTokenStream stream = new CommonTokenStream(lexer);
		EclParser parser = new EclParser(stream);
		parser.setErrorReporter(reporter);
		try {
			return parser.commands();
		} catch (RecognitionException e) {
			ParserPlugin.logErr(e.getMessage(), e);
			return null;
		} catch (Throwable t) {
			ParserPlugin.logErr(t.getMessage(), t);
			reporter.reportError("UnknownError",
					"Unknown error are happend during parsing of ecl code");
			return null;
		}
	}
}
