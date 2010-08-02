package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectOpen;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class IsProjectOpenService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		IsProjectOpen ipo = (IsProjectOpen) command;
		String name = ipo.getName();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(name);
		if (project == null) {
			return new Status(IStatus.ERROR, DLTKTestUtils.PLUGIN_ID,
					"Project is not found");
		}
		context.getOutput().write(project.isOpen());
		return Status.OK_STATUS;
	}
}
