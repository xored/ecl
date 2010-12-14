package org.eclipse.ecl.internal.commands;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.EclCompiler;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class ExecService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Exec exec = (Exec) command;
		ISession session = context.getSession();
		List<Object> input = CoreUtils.readPipeContent(context.getInput());
		Command target = EclCompiler.compile(exec, !input.isEmpty());
		IPipe pipe = context.getSession().createPipe();
		for (Object o : input)
			pipe.write(o);
		pipe.close(Status.OK_STATUS);
		IProcess child = session.execute(target, pipe, context.getOutput());
		return child.waitFor();
	}
}
