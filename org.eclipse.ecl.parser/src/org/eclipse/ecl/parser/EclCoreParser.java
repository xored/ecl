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
		return newCommand(content, 1, 1);
	}

	public static Command newCommand(String content, int line, int pos)
			throws CoreException {
		if (content == null || content.trim().length() == 0)
			return ScriptletFactory.makeSeq();
		ANTLRStringStream input = new ANTLRStringStream(content);
		input.setLine(line);
		input.setCharPositionInLine(pos - 1);
		EclLexer lexer = new EclLexer(input);
		CommonTokenStream stream = new CommonTokenStream(lexer);
		EclParser parser = new EclParser(stream);
		try {
			return parser.commands();
		} catch (RecognitionException e) {
			throw emitErr(e.line, e.charPositionInLine, 1);
		} catch (SyntaxErrorException e) {
			throw emitErr(e.line, e.col, 1);
		} catch (Throwable t) {
			EclParserPlugin.logErr(t.getMessage(), t);
			throw new CoreException(new Status(IStatus.ERROR,
					EclParserPlugin.PLUGIN_ID, "Parse error"));
		}
	}

	private static CoreException emitErr(int line, int pos, int len)
			throws CoreException {
		ScriptErrorStatus status = new ScriptErrorStatus(IStatus.ERROR,
				EclParserPlugin.PLUGIN_ID, "Syntax error", line, pos, len);
		return new CoreException(status);
	}
}
