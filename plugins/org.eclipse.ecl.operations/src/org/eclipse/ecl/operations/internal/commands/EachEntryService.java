package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.EclMap;
import org.eclipse.ecl.core.EclMapEntry;
import org.eclipse.ecl.core.Let;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.operations.EachEntry;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EachEntryService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		EachEntry cmd = (EachEntry) command;
		EclMap map = cmd.getInput();
		Val val = cmd.getVal();
		Val key = cmd.getKey();

		boolean hasKey = cmd.getKey() != null;

		for (EclMapEntry entry : map.getEntries()) {
			Let let = CoreFactory.eINSTANCE.createLet();
			val.setValue(entry.getValue());
			let.getVals().add(val);
			if (hasKey) {
				key.setValue(entry.getKey());
				let.getVals().add(key);
			}

			IPipe out = context.getSession().createPipe();
			let.setBody(EcoreUtil.copy(cmd.getDo()));
			context.getSession().execute(let, null, out);

			for (Object outObj : CoreUtils.readPipeContent(out)) {
				context.getOutput().write(outObj);
			}
		}
		return Status.OK_STATUS;
	}

}
