package org.eclipse.ecl.console.internal.ui;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.console.ui.EclConsoleUiPlugin;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;

public class EclConsoleFactory implements IConsoleFactory {

	public EclConsoleFactory() {
		// TODO Auto-generated constructor stub
	}

	public void openConsole() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IWorkbenchPage page = window.getActivePage();
			if (page != null) {
				try {
					page.showView(IConsoleConstants.ID_CONSOLE_VIEW);
					try {
						IConsole c = new EclConsole();
						registerAndOpenConsole(c);
					} catch (IOException e) {
						ErrorDialog.openError(window.getShell(), "Error",
								"Error occurs while opening ECL console",
								new Status(IStatus.WARNING,
										EclConsoleUiPlugin.PLUGIN_ID, e
												.getMessage(), e));
					}
				} catch (PartInitException e) {
					ConsolePlugin.log(e);
				}
			}
		}
	}

	protected void registerAndOpenConsole(IConsole console) {
		IConsoleManager manager = ConsolePlugin.getDefault()
				.getConsoleManager();
		manager.addConsoles(new IConsole[] { console });
		manager.showConsoleView(console);
	}

}
