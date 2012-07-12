package org.eclipse.ecl.platform.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.platform.objects.LaunchConfiguration; 
import org.eclipse.ecl.platform.objects.ObjectsFactory;

public class ListLaunchConfigurationsService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		for (ILaunchConfiguration c : DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations()) {
			LaunchConfiguration conf = ObjectsFactory.eINSTANCE.createLaunchConfiguration();
			
			conf.setName(c.getName());
			
			context.getOutput().write(conf);
		}
		
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}
	
}
