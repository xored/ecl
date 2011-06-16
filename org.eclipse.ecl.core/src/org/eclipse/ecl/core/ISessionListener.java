package org.eclipse.ecl.core;

import org.eclipse.core.runtime.IStatus;

/**
 * Status monitor for ECL commands
 */
public interface ISessionListener {
	void beginCommand(Command command);

	void endCommand(Command command, IStatus status);
}
