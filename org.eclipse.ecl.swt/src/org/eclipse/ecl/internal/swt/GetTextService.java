package org.eclipse.ecl.internal.swt;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;

public class GetTextService extends AbstractSWTService {

	public IStatus doService(Command command, IProcess context)
			throws Exception {
		Object bot = getBotFromInput(context);
		Object result = SWTServiceUtils.invoke(bot, "getText");
		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

}
