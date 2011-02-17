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
		super(severity, pluginId, message);
		this.line = line;
		this.column = column;
		this.length = length;
		this.cause = null;
	}

	public ScriptErrorStatus(IStatus cause, int line, int column, int length) {
		super(cause.getSeverity(), CorePlugin.PLUGIN_ID, "Execution failed");
		this.line = line;
		this.column = column;
		this.length = length;
		this.cause = cause;
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
