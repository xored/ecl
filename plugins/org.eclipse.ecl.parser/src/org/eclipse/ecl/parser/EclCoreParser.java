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

import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.ExecutableParameter;
import org.eclipse.ecl.core.Parameter;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.core.util.ScriptletFactory;
import org.eclipse.ecl.gen.ast.AstExec;
import org.eclipse.ecl.gen.ast.AstLiteral;
import org.eclipse.ecl.internal.parser.EclLexer;
import org.eclipse.ecl.internal.parser.EclParser;
import org.eclipse.ecl.internal.parser.EclParserPlugin;
import org.eclipse.ecl.internal.parser.SyntaxErrorException;

public class EclCoreParser {

	public static Command newCommand(String content) throws CoreException {
		return newCommand(content, 1, 1);
	}

	public static Command newCommand(String content, String id) throws CoreException {
		Command cmd = newCommand(content);
		setResourceID_(cmd, id);
		return cmd;
	}
	
	public static Command newCommand(String content, String id, int line, int pos) throws CoreException {
		Command cmd = newCommand(content, line, pos);
		setResourceID_(cmd, id);
		return cmd;
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

	private static void setResourceID_(Command cmd, String id) {
		if(id == null) {
			return;
		}
		
		if(cmd instanceof AstExec){
			((AstExec) cmd).setResourceID(id);
			
			List<Parameter> parameters = ((AstExec) cmd).getParameters();
			for(Parameter param: parameters) {
				if(param instanceof AstLiteral){
					((AstLiteral) param).setResourceID(id);
				} else if( param instanceof ExecutableParameter){
					Command cmdParam = ((ExecutableParameter) param).getCommand();
					setResourceID_(cmdParam, id);
				}
			}
		} else if (cmd instanceof Sequence){
			List<Command> commands = ((Sequence) cmd).getCommands();
			for(Command command: commands){
				setResourceID_(command, id);
			}
		}
	}
	
	private static Command setResourceID(Command cmd, String id) {
		if(id == null) {
			return cmd;
		}
		
		if(cmd instanceof AstExec){
			((AstExec) cmd).setResourceID(id);
			
			List<Parameter> parameters = ((AstExec) cmd).getParameters();
			for(Parameter param: parameters) {
				if(param instanceof AstLiteral){
					((AstLiteral) param).setResourceID(id);
				} else if( param instanceof ExecutableParameter){
					Command cmdParam = ((ExecutableParameter) param).getCommand();
					return setResourceID(cmdParam, id);
				}
			}
		} else if (cmd instanceof Sequence){
			List<Command> commands = ((Sequence) cmd).getCommands();
			for(Command command: commands){
				command = setResourceID(command, id);
			}
		}
		
		return cmd;
	}
	
	private static CoreException emitErr(int line, int pos, int len)
			throws CoreException {
		ScriptErrorStatus status = new ScriptErrorStatus(IStatus.ERROR,
				EclParserPlugin.PLUGIN_ID, "Syntax error", line, pos, len);
		return new CoreException(status);
	}
}
