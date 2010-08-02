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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;

public class PipelineService implements ICommandService {

	public IStatus service(Command command, IProcess process)
			throws InterruptedException, CoreException {
		Pipeline seq = (Pipeline) command;
		IPipe in = process.getInput();
		IPipe out = null;
		IProcess child = null;
		IStatus status = null;
		int size = seq.getCommands().size();
		for (int i = 0; i < size; i++) {
			if (i == size - 1)
				out = process.getOutput();
			else
				out = process.getSession().createPipe();
			child = process.getSession().execute(seq.getCommands().get(i), in,
					out);
			status = child.waitFor();
			in = out;
		}
		return status;
	}

}
