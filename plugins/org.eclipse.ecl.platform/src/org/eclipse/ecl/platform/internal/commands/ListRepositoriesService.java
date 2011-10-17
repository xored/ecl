package org.eclipse.ecl.platform.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.objects.Repository;
import org.eclipse.ecl.platform.util.EclPlatformUtil;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ListRepositoriesService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		for (Repository repo : EclPlatformUtil.listRepositories()) {
			context.getOutput().write(repo);
		}
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

}
