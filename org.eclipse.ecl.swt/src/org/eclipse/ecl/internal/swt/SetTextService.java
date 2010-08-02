package org.eclipse.ecl.internal.swt;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.SetText;

public class SetTextService extends AbstractSWTService {

	public IStatus doService(Command command, IProcess context)
			throws Exception {
		SetText st = (SetText) command;
		Object bot = getBotFromInput(context);
		SWTServiceUtils.invoke(bot, "setText", st.getText());
		context.getOutput().write(input);
		return Status.OK_STATUS;
	}

}
