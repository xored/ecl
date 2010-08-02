package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.core.environment.EnvironmentManager;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.debug.ui.interpreters.InterpretersUpdater;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.IInterpreterInstallType;
import org.eclipse.dltk.launching.ScriptRuntime;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.swt.widgets.Display;

public class AddInterpreterService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		AddInterpreter ai = (AddInterpreter) command;
		String language = ai.getLanguage();
		String name = ai.getName();
		String path = ai.getPath();
		try {
			final String nature = DLTKTestUtils.getNatureId(language);
			if (nature == null)
				return new Status(IStatus.ERROR, DLTKTestUtils.PLUGIN_ID,
						"Language \"" + language + "\" not found");
			IInterpreterInstallType[] types = ScriptRuntime
					.getInterpreterInstallTypes();
			for (IInterpreterInstallType type : types) {
				if (type.getNatureId().equals(nature)) {
					IFileHandle file = EnvironmentManager.getLocalEnvironment()
							.getFile(new Path(path));
					if (!file.exists()) {
						return new Status(IStatus.ERROR,
								DLTKTestUtils.PLUGIN_ID, "File \"" + path
										+ "\" not found");
					}
					IInterpreterInstall install = type
							.findInterpreterInstall(name);
					if (install == null) {
						install = type.createInterpreterInstall(name);
					}
					install.setName(name);
					install.setInstallLocation(file);
					install.setLibraryLocations(null);
					install.setEnvironmentVariables(null);
					ScriptRuntime.setDefaultInterpreterInstall(install, null,
							false);
					// update interpreters
					final IInterpreterInstall[] def = new IInterpreterInstall[] { install };
					final IInterpreterInstall[] allInstall = type
							.getInterpreterInstalls();
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							InterpretersUpdater updater = new InterpretersUpdater();
							updater.updateInterpreterSettings(nature,
									allInstall, def);
						}
					});
					return Status.OK_STATUS;
				}
			}
			return new Status(IStatus.ERROR, DLTKTestUtils.PLUGIN_ID,
					"Cannot add interpreter for \"" + language + "\"");
		} catch (Exception e) {
			return new Status(IStatus.ERROR, DLTKTestUtils.PLUGIN_ID, e
					.getMessage());
		}
	}
}
