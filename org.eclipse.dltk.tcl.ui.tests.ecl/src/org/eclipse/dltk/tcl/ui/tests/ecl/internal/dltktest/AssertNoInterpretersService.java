package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertNoInterpreters;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class AssertNoInterpretersService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		AssertNoInterpreters ani = (AssertNoInterpreters) command;
		String projectName = ani.getProject();
		try {
			IInterpreterInstall interpreter = DLTKTestUtils
					.getInterpreter(projectName);
			if (interpreter == null)
				return Status.OK_STATUS;
			else
				return new Status(Status.ERROR, DLTKTestUtils.PLUGIN_ID,
						"Assertion failed");
		} catch (Exception e) {
			return new Status(Status.ERROR, DLTKTestUtils.PLUGIN_ID, e
					.getMessage());
		}

	}
}
