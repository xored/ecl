package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertPerspective;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class AssertPerspectiveService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		AssertPerspective ap = (AssertPerspective) command;
		String name = ap.getName();
		IWorkbenchWindow[] ww = PlatformUI.getWorkbench().getWorkbenchWindows();
		IWorkbenchPage activePage = ww[ww.length - 1].getActivePage();
		String activePerspectiveName = activePage.getPerspective().getLabel();
		if (name.equals(activePerspectiveName)) {
			return Status.OK_STATUS;
		} else {
			return new Status(IStatus.ERROR, DLTKTestUtils.PLUGIN_ID,
					"Expected \"" + name + "\" perspective but was \""
							+ activePerspectiveName + "\"");
		}
	}
}
