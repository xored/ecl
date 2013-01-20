package org.eclipse.ecl.platform.internal.ui.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.ui.objects.ObjectsFactory;
import org.eclipse.ecl.platform.ui.objects.WorkingSet;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;

public class ListWorkingSetsService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		for(IWorkingSet ws : PlatformUI.getWorkbench().getWorkingSetManager().getAllWorkingSets()) {
			if(ws.isAggregateWorkingSet()) {
				continue;
			}
			WorkingSet obj = ObjectsFactory.eINSTANCE.createWorkingSet();
			obj.setName(ws.getName());
			obj.setType(ws.getId());
			context.getOutput().write(obj);
		}
		return Status.OK_STATUS;
	}

}
