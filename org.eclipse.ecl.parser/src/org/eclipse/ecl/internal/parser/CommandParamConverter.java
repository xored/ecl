package org.eclipse.ecl.internal.parser;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.runtime.IParamConverter;

public class CommandParamConverter implements IParamConverter<Command> {

	public Command convert(String original) throws CoreException {
		return EclCoreParser.newCommand(original);
	}

	public Class<Command> forType() {
		return Command.class;
	}

}
