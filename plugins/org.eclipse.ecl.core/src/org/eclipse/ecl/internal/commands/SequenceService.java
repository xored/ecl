/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Andrey Platov)
 *******************************************************************************/

package org.eclipse.ecl.internal.commands;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;

public class SequenceService implements ICommandService {

	public IStatus service(Command command, IProcess process) throws InterruptedException, CoreException {
		IStatus status = Status.OK_STATUS;
		Sequence seq = (Sequence) command;
		List<Object> content = CoreUtils.readPipeContent(process.getInput());
		List<Command> commands = seq.getCommands();
		for (int i = 0; i < commands.size(); ++i) {
			Command cmd = commands.get(i);
			IPipe pipe = process.getSession().createPipe();
			for (Object o : content)
				pipe.write(o);
			pipe.close(Status.OK_STATUS);
			IProcess child = process.getSession().execute(cmd, pipe, null);
			status = child.waitFor();
			
			if (!status.isOK()) {
				return status;
			}
		}
		return status;
	}
}
