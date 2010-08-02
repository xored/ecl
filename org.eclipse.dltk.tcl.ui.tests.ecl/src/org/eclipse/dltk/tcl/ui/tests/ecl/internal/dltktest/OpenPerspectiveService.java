package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import net.sf.swtbot.eclipse.finder.SWTEclipseBot;
import net.sf.swtbot.wait.Conditions;
import net.sf.swtbot.widgets.SWTBotShell;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.OpenPerspective;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class OpenPerspectiveService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		OpenPerspective op = (OpenPerspective) command;
		String name = op.getName();
		final String id = DLTKTestUtils.getPerspectiveId(name);
		if (id == null)
			return new Status(Status.ERROR, DLTKTestUtils.PLUGIN_ID,
					"Perspective \"" + name + "\" is not found");
		final Status[] throwable = new Status[1];
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				try {
					IWorkbenchWindow[] ww = PlatformUI.getWorkbench()
							.getWorkbenchWindows();
					PlatformUI.getWorkbench().showPerspective(id, ww[0]);
					PlatformUI.getWorkbench().getProgressService();
					SWTBotShell shell = new SWTBotShell(ww[0].getShell());
					SWTEclipseBot bot = new SWTEclipseBot();
					bot.waitUntil(Conditions.shellIsActive(shell.getText()));
				} catch (Throwable th) {
					throwable[0] = new Status(IStatus.ERROR,
							DLTKTestUtils.PLUGIN_ID, th.getMessage());
				}
			}
		});
		if (throwable[0] != null)
			return throwable[0];
		return Status.OK_STATUS;
	}
}
