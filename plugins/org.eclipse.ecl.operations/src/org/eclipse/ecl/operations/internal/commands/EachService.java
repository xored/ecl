package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.dispatch.ServiceDispatchingUtils;
import org.eclipse.ecl.operations.Each;
import org.eclipse.ecl.operations.internal.OperationsPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class EachService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		IStatus result = ServiceDispatchingUtils.handleWithExtensions(command, context);
		if (result == null) {
			return OperationsPlugin.createErr("Don't know how to iterate over %s", ((Each) command).getInput().eClass()
					.getName());
		}

		return result;
	}

}
