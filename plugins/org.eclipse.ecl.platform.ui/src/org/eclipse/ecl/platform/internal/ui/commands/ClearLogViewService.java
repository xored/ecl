package org.eclipse.ecl.platform.internal.ui.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.ui.PlatformUIPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class ClearLogViewService implements ICommandService {
	private static final String LOG_ID = "org.eclipse.pde.runtime.LogView";

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		final Exception[] exceptions = new Exception[1];
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

			public void run() {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage();
					IViewPart view = page.findView(LOG_ID);
					boolean viewOpened = view != null;
					if (viewOpened) {
						page.hideView(view);
					}
					Platform.getLogFileLocation().toFile().delete();
					if (viewOpened) {
						page.showView(LOG_ID);
					}
				} catch (PartInitException e) {
					exceptions[0] = e;
				}
			}
		});
		if (exceptions[0] != null) {
			return new Status(IStatus.ERROR, PlatformUIPlugin.PLUGIN_ID,
					"Error clearing log view", exceptions[0]);
		}
		return Status.OK_STATUS;
	}

}
