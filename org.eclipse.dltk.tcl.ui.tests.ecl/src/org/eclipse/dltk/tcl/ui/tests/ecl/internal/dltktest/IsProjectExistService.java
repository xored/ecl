package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectExist;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class IsProjectExistService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		IsProjectExist ipe = (IsProjectExist) command;
		String name = ipe.getName();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(name);
		boolean result = project != null && project.exists();
		context.getOutput().write(result);
		return Status.OK_STATUS;
	}
}
