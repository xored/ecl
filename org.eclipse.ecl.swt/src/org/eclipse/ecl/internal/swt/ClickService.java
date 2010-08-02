package org.eclipse.ecl.internal.swt;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;

public class ClickService extends AbstractSWTService {

	public IStatus doService(Command command, IProcess context)
			throws Exception {
		Object bot = getBotFromInput(context);
		SWTServiceUtils.invoke(bot, "click");
		context.getOutput().write(input);
		return Status.OK_STATUS;
	}

}
