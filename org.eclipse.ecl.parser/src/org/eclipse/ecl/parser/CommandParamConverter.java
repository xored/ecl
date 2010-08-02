package org.eclipse.ecl.parser;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.EclCompiler;
import org.eclipse.ecl.runtime.IParamConverter;

public class CommandParamConverter implements IParamConverter<Command> {

	public Command convert(String original) throws CoreException {
		Command command = EclCoreParser.newCommand(original);
		return EclCompiler.compile(command);
	}

	public Class<Command> forType() {
		return Command.class;
	}

}
