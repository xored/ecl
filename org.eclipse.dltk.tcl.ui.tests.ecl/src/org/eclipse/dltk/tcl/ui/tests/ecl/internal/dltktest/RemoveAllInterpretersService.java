package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.debug.ui.interpreters.InterpretersUpdater;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.IInterpreterInstallType;
import org.eclipse.dltk.launching.ScriptRuntime;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveAllInterpreters;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.swt.widgets.Display;

public class RemoveAllInterpretersService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		RemoveAllInterpreters rai = (RemoveAllInterpreters) command;
		String language = rai.getLanguage();
		String nature = null;
		if (rai.eIsSet(DLTKTestPackage.eINSTANCE
				.getRemoveAllInterpreters_Language())) {
			nature = DLTKTestUtils.getNatureId(language);
		}
		IInterpreterInstallType[] types = ScriptRuntime
				.getInterpreterInstallTypes();
		for (final IInterpreterInstallType type : types) {
			if (nature == null || nature.equals(type.getNatureId())) {
				IInterpreterInstall[] installs = type.getInterpreterInstalls();
				for (IInterpreterInstall install : installs) {
					type.disposeInterpreterInstall(install.getId());
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							InterpretersUpdater updater = new InterpretersUpdater();
							updater.updateInterpreterSettings(type
									.getNatureId(), new IInterpreterInstall[0],
									null);
						}
					});
				}
			}
		}
		return Status.OK_STATUS;
	}
}
