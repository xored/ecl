package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.GetPluginPath;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class GetPluginPathService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		GetPluginPath gpp = (GetPluginPath) command;
		String plugin = gpp.getPlugin();
		URL platformURL = Platform.getBundle(plugin).getEntry("/");
		if (platformURL == null)
			return new Status(IStatus.ERROR, DLTKTestUtils.PLUGIN_ID,
					"Plugin is not found");
		String result;
		try {
			result = FileLocator.toFileURL(platformURL).getFile();
		} catch (IOException e) {
			return new Status(IStatus.ERROR, DLTKTestUtils.PLUGIN_ID, e
					.getMessage(), e);
		}
		context.getOutput().write(result);
		return Status.OK_STATUS;
	}
}
