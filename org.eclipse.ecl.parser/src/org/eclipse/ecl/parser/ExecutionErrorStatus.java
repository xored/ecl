package org.eclipse.ecl.parser;

import java.text.MessageFormat;

public class ExecutionErrorStatus extends LocatedErrorStatus {

	public ExecutionErrorStatus(String message, int line, int column, int length) {
		super(message, line, column, length);
	}

	public ExecutionErrorStatus(String message, int line, int column) {
		super(message, line, column);
	}

	@Override
	public String getMessage() {
		String message = super.getMessage();
		if (message != null && message.length() > 0)
			return MessageFormat.format(
					"Execution failed on line {0}, pos {1}: {2}", getLine(),
					getColumn(), message);
		else
			return MessageFormat.format(
					"Execution failed on line {0}, pos {1}", getLine(),
					getColumn());
	}
}
