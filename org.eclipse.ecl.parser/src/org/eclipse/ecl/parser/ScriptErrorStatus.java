package org.eclipse.ecl.parser;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.internal.core.CorePlugin;

public class ScriptErrorStatus extends Status {
	final private int line;
	final private int column;
	final private int length;
	final private IStatus cause;

	public ScriptErrorStatus(int severity, String pluginId, String message,
			int line, int column, int length) {
		this(severity, pluginId, message, line, column, length, null);
	}

	public ScriptErrorStatus(int severity, String pluginId, String message,
			int line, int column, int length, IStatus cause) {
		super(severity, pluginId, message);
		this.line = line;
		this.column = column;
		this.length = length;
		this.cause = cause;
	}

	public ScriptErrorStatus(IStatus cause, int line, int column, int length) {
		this(cause.getSeverity(), CorePlugin.PLUGIN_ID, String.format(
				"Execution failed. Cause: '%s'", cause.getMessage()), line,
				column, length, cause);
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

	public IStatus getCause() {
		return cause;
	}

}
