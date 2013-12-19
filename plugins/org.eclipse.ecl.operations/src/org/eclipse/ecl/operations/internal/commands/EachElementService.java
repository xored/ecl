package org.eclipse.ecl.operations.internal.commands;

import static org.eclipse.ecl.runtime.BoxedValues.box;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.EclList;
import org.eclipse.ecl.core.Let;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.dispatch.IScriptletExtension;
import org.eclipse.ecl.operations.Each;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EachElementService implements IScriptletExtension {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		Each cmd = (Each) command;
		EclList list = (EclList) cmd.getInput();
		Val val = cmd.getVal();
		Val index = cmd.getKey();

		boolean hasIndex = cmd.getKey() != null;

		int length = list.getElements().size();
		for (int i = 0; i < length; i++) {
			Let let = CoreFactory.eINSTANCE.createLet();
			val.setValue(EcoreUtil.copy(list.getElements().get(i)));
			let.getVals().add(val);
			if (hasIndex) {
				index.setValue(box(i));
				let.getVals().add(index);
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
		return c instanceof Each && ((Each) c).getInput() instanceof EclList;
	}

}
