package org.eclipse.ecl.internal.swt;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.TypeText;

public class TypeTextService extends AbstractSWTService {

	public IStatus doService(Command command, IProcess context)
			throws Exception {
		TypeText tt = (TypeText) command;
		Object bot = getBotFromInput(context);
		SWTServiceUtils.invoke(bot, "setText", tt.getText());
		context.getOutput().write(input);
		return Status.OK_STATUS;
	}

}
