package org.eclipse.ecl.parser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.util.ScriptletFactory;
import org.eclipse.ecl.internal.parser.EclLexer;
import org.eclipse.ecl.internal.parser.EclParser;
import org.eclipse.ecl.internal.parser.EclParserPlugin;
import org.eclipse.ecl.internal.parser.SyntaxErrorException;

public class EclCoreParser {

	public static Command newCommand(String content) throws CoreException {
		if (content == null || content.trim().length() == 0)
			return ScriptletFactory.makeSeq();
		EclLexer lexer = new EclLexer(new ANTLRStringStream(content));
		CommonTokenStream stream = new CommonTokenStream(lexer);
		EclParser parser = new EclParser(stream);
		try {
			return parser.commands();
		} catch (RecognitionException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					EclParserPlugin.PLUGIN_ID, "Syntax error on line " + e.line
					+ ", col " + e.charPositionInLine));
		} catch (SyntaxErrorException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					EclParserPlugin.PLUGIN_ID, e.toString()));
		} catch (Throwable t) {
			EclParserPlugin.logErr(
					"Unknown error are happend during parsing of ecl code", t);
			throw new CoreException(new Status(IStatus.ERROR,
					EclParserPlugin.PLUGIN_ID, "Syntax error"));
		}
	}
}
