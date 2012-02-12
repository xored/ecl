package org.eclipse.ecl.platform.internal.ui.commands;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.ui.commands.CreateWorkingSet;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.IWorkingSetManager;
import org.eclipse.ui.PlatformUI;

public class CreateWorkingSetService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof CreateWorkingSet)) {
			return Status.CANCEL_STATUS;
		}
		CreateWorkingSet cws = (CreateWorkingSet) command;
		IWorkingSetManager wsm = PlatformUI.getWorkbench()
				.getWorkingSetManager();
		IWorkingSet ws = wsm.createWorkingSet(cws.getName(), new IAdaptable[0]);

		String type = cws.getType();
		if (SHORT_NAMES.containsKey(type)) {
			type = SHORT_NAMES.get(type);
		}
		ws.setId(type);
		wsm.addWorkingSet(ws);
		return Status.OK_STATUS;
	}

	private static final Map<String, String> SHORT_NAMES = new HashMap<String, String>();
	static {
		SHORT_NAMES.put("java", "org.eclipse.jdt.ui.JavaWorkingSetPage");
	}

}
