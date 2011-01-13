package org.eclipse.ecl.parser;

import org.eclipse.core.runtime.Status;

public class LocatedErrorStatus extends Status {
	final private int line;
	final private int column;
	final private int length;

	public LocatedErrorStatus(int severity, String pluginId, String message,
			int line, int column, int length) {
		super(severity, pluginId,
				message == null || message.length() == 0 ? "Execution failed"
						: message);
		this.line = line;
		this.column = column;
		this.length = length;
	}

	public int getLine() {
		return line;
	}

	public int getColumn() {
		return column;
	}

	public int getLength() {
		return length;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
