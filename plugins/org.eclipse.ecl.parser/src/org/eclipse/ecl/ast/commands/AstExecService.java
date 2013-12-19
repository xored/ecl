/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.ast.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.gen.ast.AstExec;
import org.eclipse.ecl.internal.commands.ExecService;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.ProcErrorStatus;
import org.eclipse.ecl.parser.ScriptErrorStatus;
import org.eclipse.ecl.runtime.ExecutionFlowStatus;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

@SuppressWarnings("restriction")
public class AstExecService implements ICommandService {
	public IStatus service(Command command, IProcess process)
			throws InterruptedException, CoreException {
		AstExec exec = (AstExec) command;
		IStatus s = new ExecService().service(exec, process);

		if (!s.isOK() && !(s instanceof ScriptErrorStatus) && !(s instanceof ExecutionFlowStatus)) {
			IStatus cause = s instanceof ProcErrorStatus ? ((ProcErrorStatus) s).getStatus() : s;

			return new ScriptErrorStatus(IStatus.ERROR, CorePlugin.PLUGIN_ID, exec.getName(), exec.getResourceID(),
					exec.getLine(), exec.getColumn(), exec.getLength(), cause);
		}

		return s;
	}
}
