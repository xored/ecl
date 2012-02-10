package org.eclipse.ecl.platform.internal.ui.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.ui.commands.DeleteWorkingSet;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ui.IWorkingSetManager;
import org.eclipse.ui.PlatformUI;

public class DeleteWorkingSetService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if(!(command instanceof DeleteWorkingSet)) {
			return Status.CANCEL_STATUS;
		}
		DeleteWorkingSet dws = (DeleteWorkingSet) command;
		IWorkingSetManager m = PlatformUI.getWorkbench().getWorkingSetManager();
		m.removeWorkingSet(m.getWorkingSet(dws.getName()));
		return Status.OK_STATUS;
	}

}
