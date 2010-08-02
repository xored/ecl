package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertInterpreter;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class AssertInterpreterService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		AssertInterpreter ai = (AssertInterpreter) command;
		String projectName = ai.getProject();
		String name = ai.getName();
		try {
			IInterpreterInstall interpreter = DLTKTestUtils
					.getInterpreter(projectName);
			if (interpreter == null)
				return new Status(Status.ERROR, DLTKTestUtils.PLUGIN_ID,
						"Assertion failed: interpreter is not found");
			if (name.equals(interpreter.getName()))
				return Status.OK_STATUS;
			return new Status(Status.ERROR, DLTKTestUtils.PLUGIN_ID,
					"Assertion failed: extected \"" + name
							+ "\" interpreter but was \""
							+ interpreter.getName() + "\"");
		} catch (Exception e) {
			return new Status(Status.ERROR, DLTKTestUtils.PLUGIN_ID, e
					.getMessage() == null ? null : "Assertion failed: "
					+ e.getMessage());
		}
	}
}
