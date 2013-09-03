package org.eclipse.ecl.dispatch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ServiceDispatchingUtils {

	private static ScriptletExtensionManager extensionsManager = new ScriptletExtensionManager();

	public static IStatus handleWithExtensions(Command command, IProcess context)
			throws InterruptedException, CoreException {
		ICommandService svc = extensionsManager.getScriptletService(command);
		return (svc != null) ? svc.service(command, context) : null;
	}


}
