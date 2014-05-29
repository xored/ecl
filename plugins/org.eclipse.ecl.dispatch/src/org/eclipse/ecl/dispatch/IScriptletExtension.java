package org.eclipse.ecl.dispatch;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;

public interface IScriptletExtension extends ICommandService {

	/** Tests the command for compatibility with this extension
	 * Only one extension should be compatible with any given command
	 * @return true if this extension can (and is designed to) handle a command
	 */
	boolean canHandle(Command command);

}
