package org.eclipse.ecl.platform.internal.ui.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.ui.commands.Alert;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class AlertService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if(!(command instanceof Alert)) {
			return Status.CANCEL_STATUS;
		}
		
		final String message = ((Alert) command).getMessage(); 
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			
			@Override
			public void run() {
				Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
				MessageBox mb = new MessageBox(shell);
				mb.setMessage(message);
				mb.open();
			}
		});
		
		return Status.OK_STATUS;
	}

}
