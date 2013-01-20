package org.eclipse.ecl.platform.internal.commands;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.commands.AddRepository;
import org.eclipse.ecl.platform.util.EclPlatformUtil;
import org.eclipse.ecl.runtime.IProcess;

public class AddRepositoryService extends RepositoryService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		AddRepository addSite = (AddRepository) command;
		
		URI uri = getUri(addSite.getUri());
		String name = addSite.getName();
		
		EclPlatformUtil.addRepository(uri, name);
		
		return Status.OK_STATUS;
	}

}
