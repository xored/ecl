package org.eclipse.ecl.console.operations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.runtime.FQName;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EClass;

public class ListCommandsService implements ICommandService {

	@Override
	public IStatus service(final Command command, final IProcess context) throws InterruptedException, CoreException {
		for (final EClass clazz : findEclCommands()) {
			context.getOutput().write(clazz);
		}
		return Status.OK_STATUS;
	}
	
	public static List<EClass> findEclCommands() throws CoreException {
		final List<EClass> result = new ArrayList<EClass>();
		
		for (final FQName name : CorePlugin.getScriptletManager().getAllCommandNames()) {
			result.add(CorePlugin.getScriptletManager().findCommand(name.ns, name.name));
		}
		
		return result;
	}

}
