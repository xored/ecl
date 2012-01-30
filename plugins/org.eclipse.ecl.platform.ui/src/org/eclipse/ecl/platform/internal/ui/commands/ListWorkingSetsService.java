package org.eclipse.ecl.platform.internal.ui.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;

public class ListWorkingSetsService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		for(IWorkingSet ws : PlatformUI.getWorkbench().getWorkingSetManager().getAllWorkingSets()) {
			context.getOutput().write(ws.getLabel());
		}
		return Status.OK_STATUS;
	}

}
