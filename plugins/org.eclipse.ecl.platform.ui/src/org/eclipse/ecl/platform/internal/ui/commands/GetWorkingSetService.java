package org.eclipse.ecl.platform.internal.ui.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.ui.commands.GetWorkingSet;
import org.eclipse.ecl.platform.ui.objects.ObjectsFactory;
import org.eclipse.ecl.platform.ui.objects.WorkingSet;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;

public class GetWorkingSetService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof GetWorkingSet)) {
			return Status.CANCEL_STATUS;
		}

		IWorkingSet ws = PlatformUI.getWorkbench().getWorkingSetManager()
				.getWorkingSet(((GetWorkingSet) command).getName());
		if(ws == null) {
			return Status.OK_STATUS;
		}
		WorkingSet result = ObjectsFactory.eINSTANCE.createWorkingSet();
		result.setName(ws.getName());
		result.setType(ws.getId());
		context.getOutput().write(result);
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

}
