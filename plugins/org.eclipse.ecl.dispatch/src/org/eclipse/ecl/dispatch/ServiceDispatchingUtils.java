package org.eclipse.ecl.dispatch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.dispatch.ScriptletExtensionManager;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ServiceDispatchingUtils {
	public static IStatus handleWithExtensions(Command command, IProcess context)
			throws InterruptedException, CoreException {
		ICommandService svc = ScriptletExtensionManager.INSTANCE.getScriptletExtension(command);
		return (svc != null) ? svc.service(command, context) : null;
	}

}
