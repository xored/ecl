package org.eclipse.ecl.platform.internal.commands;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.commands.FindInWorkspace;
import org.eclipse.ecl.platform.util.EclPlatformUtil;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class FindInWorkspaceService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		FindInWorkspace cmd = (FindInWorkspace) command;
		String path = cmd.getPath();		
		boolean findAll = cmd.isAll();
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();		
		IContainer[] rootResources = root.findContainersForLocationURI(root.getLocationURI());										
		List<String> paths = EclPlatformUtil.getWorkspaceResources(rootResources[0], path, findAll);		
		for (String resultPath : paths) {
			context.getOutput().write(resultPath);
		}
		return Status.OK_STATUS;
	}

}
