package org.eclipse.ecl.internal.commands;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.IWatchSource;
import org.eclipse.ecl.core.Watch;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class WatchService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Watch watch = (Watch) command;
		if (watch.getSource() == null || watch.getSource().length() == 0)
			return error("Watch source name is not provided.");

		IWatchSource source = getSource(watch.getSource());
		if (source == null)
			return error("Watch source is not found.");

		Object snapshotA = source.makeSnapshot();
		context.getSession().execute(watch.getWhile()).waitFor();
		Object snapshotB = source.makeSnapshot();

		for (Object o : source.difference(snapshotA, snapshotB))
			context.getOutput().write(o);

		return Status.OK_STATUS;
	}

	private static Map<String, IWatchSource> sources = null;

	private static Map<String, IWatchSource> getSources() throws CoreException {
		if (sources == null) {
			sources = new HashMap<String, IWatchSource>();

			IExtensionPoint point = Platform.getExtensionRegistry()
					.getExtensionPoint("org.eclipse.ecl.core.watchSource");
			if (point != null)
				for (IExtension e : point.getExtensions())
					for (IConfigurationElement c : e.getConfigurationElements())
						sources.put(c.getAttribute("name"), (IWatchSource) c
								.createExecutableExtension("class"));
		}

		return sources;
	}

	private static IWatchSource getSource(String name) throws CoreException {
		return getSources().get(name);
	}

	private static Status error(String message) {
		return new Status(Status.ERROR, CorePlugin.PLUGIN_ID, message);
	}
}
