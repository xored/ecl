package org.eclipse.ecl.core.tests.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.tests.model.EmitEMFData;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class EmitEMFDataService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		int paramInt = ((EmitEMFData) command).getParamInt();
		context.getOutput().write(paramInt);
		return Status.OK_STATUS;
	}

}
