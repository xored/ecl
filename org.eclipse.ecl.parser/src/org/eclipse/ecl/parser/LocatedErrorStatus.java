package org.eclipse.ecl.parser;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.internal.parser.EclParserPlugin;

public class LocatedErrorStatus extends Status {
	final private int line;
	final private int column;
	final private int length;

	public LocatedErrorStatus(String message, int line, int column) {
		this(message, line, column, -1);
	}

	public LocatedErrorStatus(String message, int line, int column, int length) {
		super(IStatus.ERROR, EclParserPlugin.PLUGIN_ID, message);
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
}
