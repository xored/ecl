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
import org.eclipse.ecl.dispatch.IScriptletExtension;
import org.eclipse.ecl.operations.Each;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EachEntryService implements IScriptletExtension {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		Each cmd = (Each) command;
		EclMap map = (EclMap) cmd.getInput();
		Val val = cmd.getVal();
		Val key = cmd.getKey();

		boolean hasKey = cmd.getKey() != null;

		for (EclMapEntry entry : map.getEntries()) {
			Let let = CoreFactory.eINSTANCE.createLet();
			val.setValue(EcoreUtil.copy(entry.getValue()));
			let.getVals().add(val);
			if (hasKey) {
				key.setValue(entry.getKey());
				let.getVals().add(key);
			}

			IPipe out = context.getSession().createPipe();
			let.setBody(EcoreUtil.copy(cmd.getDo()));
			IStatus bodyStatus = context.getSession().execute(let, null, out).waitFor();
			if (!bodyStatus.isOK()) {
				return bodyStatus;
			}
			for (Object outObj : CoreUtils.readPipeContent(out)) {
				context.getOutput().write(outObj);
			}
		}
		return Status.OK_STATUS;
	}

	@Override
	public boolean canHandle(Command c) {
		return c instanceof Each && ((Each) c).getInput() instanceof EclMap;
	}

}
