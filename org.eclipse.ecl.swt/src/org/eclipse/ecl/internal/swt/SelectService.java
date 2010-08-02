package org.eclipse.ecl.internal.swt;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.Select;

public class SelectService extends AbstractSWTService {

	public IStatus doService(Command command, IProcess context)
			throws Exception {
		Select select = (Select) command;
		Object bot = getBotFromInput(context);
		Object item = select.getItem();
		try {
			SWTServiceUtils.invoke(bot, "select", item);
		} catch (Exception e) {
			try {
				SWTServiceUtils.invoke(bot, "setSelection", item);
			} catch (Exception e2) {
				throw e;
			}
		}
		context.getOutput().write(input);
		return Status.OK_STATUS;
	}

}
