package org.eclipse.ecl.platform.internal.commands;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class GetWorkspaceLocationService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		context.getOutput().write(
				ResourcesPlugin.getWorkspace().getRoot().getLocation()
						.toOSString());

		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

}
