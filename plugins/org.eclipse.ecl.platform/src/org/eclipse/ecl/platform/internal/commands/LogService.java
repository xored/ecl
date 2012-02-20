package org.eclipse.ecl.platform.internal.commands;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.commands.Log;
import org.eclipse.ecl.platform.internal.PlatformPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class LogService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if(!(command instanceof Log)) {
			return Status.CANCEL_STATUS;
		}
		Log log = (Log) command;
		String message = log.getMessage();
		String pluginId = log.getPlugin();
		int severity = getSeverity(log.getSeverity());
	
		PlatformPlugin.getDefault().getLog().log(new Status(severity, pluginId, message, null));
		return Status.OK_STATUS;
	}
	
	public static final Map<String, Integer> severities = new HashMap<String, Integer>();
	static {
		severities.put("info", IStatus.INFO);
		severities.put("warning", IStatus.WARNING);
		severities.put("warn", IStatus.WARNING);
		severities.put("error", IStatus.ERROR);
		severities.put("err", IStatus.ERROR);
		severities.put("ok", IStatus.ERROR);
		severities.put("cancel", IStatus.ERROR);
	}
	private int getSeverity(String severityText) {
		if(severityText == null) {
			severityText = "";
		}
		Integer result = severities.get(severityText.toLowerCase());
		return result == null ? IStatus.INFO : result;
	}

}
