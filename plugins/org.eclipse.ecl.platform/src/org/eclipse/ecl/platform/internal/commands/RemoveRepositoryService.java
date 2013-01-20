package org.eclipse.ecl.platform.internal.commands;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.commands.RemoveRepository;
import org.eclipse.ecl.platform.util.EclPlatformUtil;
import org.eclipse.ecl.runtime.IProcess;

public class RemoveRepositoryService extends RepositoryService {

	
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		RemoveRepository removeSite = (RemoveRepository) command;
		URI uri = getUri(removeSite.getUri()); 
		EclPlatformUtil.removeRepository(uri);
		return Status.OK_STATUS;
	}

}
