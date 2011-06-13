package org.eclipse.ecl.core;


/**
 * Status monitor for ECL commands
 */
public interface ISessionListener {
	void beginCommand(Command command);
	void endCommand(Command command);
}
