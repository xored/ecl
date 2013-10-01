package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.Let;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.operations.Loop;
import org.eclipse.ecl.operations.internal.OperationsPlugin;
import org.eclipse.ecl.operations.internal.commands.RecurService.RecurStatus;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class LoopService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		ISession session = context.getSession();
		Loop loop = (Loop) command;
		Val[] vals = loop.getVals().toArray(new Val[loop.getVals().size()]);
		Command body = loop.getBody();

		Let let = CoreFactory.eINSTANCE.createLet();
		let.setBody(body);
		for (Val val : vals) {
			let.getVals().add(val);
		}

		while (true) {
			IPipe out = session.createPipe();
			IStatus status = session.execute(let, null, out).waitFor();
			RecurStatus recurStatus = findRecurStatus(status);
			if (recurStatus == null) {
				// use out pipe
				for (Object o : CoreUtils.readPipeContent(out)) {
					context.getOutput().write(o);
				}
				return status;
			}
			if (recurStatus.vals.length != vals.length) {
				throw new CoreException(OperationsPlugin.createErr(
						"Illegal arity in recur call, expected: %d, invoked: %d", vals.length,
						recurStatus.vals.length));
			}
			for (int i = 0; i < recurStatus.vals.length; i++) {
				vals[i].setValue(recurStatus.vals[i]);
			}
		}
	}

	private static RecurStatus findRecurStatus(IStatus status) {
		return (status instanceof RecurStatus) ? (RecurStatus) status : null;
	}

}
