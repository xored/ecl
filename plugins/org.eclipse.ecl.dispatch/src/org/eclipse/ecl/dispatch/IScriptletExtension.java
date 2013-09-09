package org.eclipse.ecl.dispatch;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;

public interface IScriptletExtension extends ICommandService {

	boolean canHandle(Command c);

}
