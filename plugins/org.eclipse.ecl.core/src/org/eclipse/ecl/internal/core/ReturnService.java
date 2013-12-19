package org.eclipse.ecl.internal.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CommandStack;
import org.eclipse.ecl.core.ProcInstance;
import org.eclipse.ecl.core.Return;
import org.eclipse.ecl.runtime.ExecutionFlowStatus;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class ReturnService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		if (!isInProc(context.getSession())) {
			throw new CoreException(CorePlugin.err("Invalid context for return command"));
		}

		return new ReturnStatus(((Return) command).getResult());
	}

	private static boolean isInProc(ISession session) {
		if (!(session instanceof CommandSession)) {
			return false;
		}
		CommandSession cmd = (CommandSession) session;
		CommandStack stack = cmd.getStack();
		while (stack != null) {
			if (stack.getCommand() instanceof ProcInstance) {
				return true;
			}
			stack = stack.getParent();
		}
		return false;

	}

	public static class ReturnStatus extends ExecutionFlowStatus {

		public ReturnStatus(Object value) {
			super(value);
		}

		public Object getValue() {
			return value;
		}
	}

}
