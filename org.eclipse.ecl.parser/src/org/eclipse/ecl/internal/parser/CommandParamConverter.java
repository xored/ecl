package org.eclipse.ecl.internal.parser;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.LiteralParameter;
import org.eclipse.ecl.gen.ast.AstLiteral;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.runtime.IParamConverter;

public class CommandParamConverter implements IParamConverter<Command> {

	public Command convert(LiteralParameter parameter) throws CoreException {
		if (parameter instanceof AstLiteral) {
			AstLiteral astLiteral = (AstLiteral) parameter;
			return EclCoreParser.newCommand(parameter.getLiteral(),
					astLiteral.getLine(), astLiteral.getColumn());
		} else
			return EclCoreParser.newCommand(parameter.getLiteral());
	}

	public Class<Command> forType() {
		return Command.class;
	}

}
