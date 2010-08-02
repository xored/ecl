package org.eclipse.ecl.internal.swt;

import net.sf.swtbot.wait.Conditions;
import net.sf.swtbot.widgets.TimeoutException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.WaitShellIsActive;

public class WaitShellIsActiveService extends AbstractSWTService {

	public IStatus doService(Command command, IProcess context)
			throws InterruptedException, CoreException {
		WaitShellIsActive wsia = (WaitShellIsActive) command;
		try {
			bot.waitUntil(Conditions.shellIsActive(wsia.getText()), wsia
					.getTimeout());
		} catch (TimeoutException e) {
			return new Status(Status.ERROR, PLUGIN_ID, "Time is out", e);
		}
		return Status.OK_STATUS;
	}

}
