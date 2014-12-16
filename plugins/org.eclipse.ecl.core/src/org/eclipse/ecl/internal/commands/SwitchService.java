/*******************************************************************************
 * Copyright (c) 2009, 2014 Xored Software Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Xored Software Inc - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.ecl.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ecl.core.Case;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Switch;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class SwitchService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		if (!(command instanceof Switch))
			return Status.CANCEL_STATUS;
		Switch switchCmd = (Switch) command;
		Command targetCmd = null;
		ISession session = context.getSession();

		for (Case caseCmd : switchCmd.getItems()) {
			if (EcoreUtil.equals(caseCmd.getCondition(), switchCmd.getInput())) {
				// Found matching case block.
				targetCmd = caseCmd.getThen();
				break;
			}
		}

		// Didn't find matching case, set it to the default block.
		if (targetCmd == null) {
			targetCmd = switchCmd.getDefault();
		}

		if (targetCmd != null) {
			return session.execute(targetCmd, context.getInput(), context.getOutput()).waitFor();
		}

		return Status.OK_STATUS;
	}

}
