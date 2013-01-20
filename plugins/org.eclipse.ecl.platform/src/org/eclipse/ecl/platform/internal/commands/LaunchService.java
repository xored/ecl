package org.eclipse.ecl.platform.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.commands.Launch;
import org.eclipse.ecl.platform.internal.PlatformPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class LaunchService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Launch cmd = (Launch) command;
		
		String mode = cmd.getMode();
		String name = cmd.getName();
		
		ILaunchConfiguration[] confs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations();
		for (ILaunchConfiguration conf : confs) {
			if (conf.getName().equals(name)) {
				conf.launch(mode, null);
				return Status.OK_STATUS;
			}
		}
		
		return new Status(Status.ERROR, PlatformPlugin.PLUGIN_ID, "Configuration not found.");
	}

}
