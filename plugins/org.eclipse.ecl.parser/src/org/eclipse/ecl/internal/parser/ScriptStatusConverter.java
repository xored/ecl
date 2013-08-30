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
package org.eclipse.ecl.internal.parser;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.ProcessStatus;
import org.eclipse.ecl.gen.ast.AstFactory;
import org.eclipse.ecl.gen.ast.AstPackage;
import org.eclipse.ecl.gen.ast.ScriptProcessStatus;
import org.eclipse.ecl.internal.core.EMFConverterManager;
import org.eclipse.ecl.parser.ScriptErrorStatus;
import org.eclipse.ecl.runtime.IEMFConverter;
import org.eclipse.emf.ecore.EClass;

public class ScriptStatusConverter implements
		IEMFConverter<ScriptErrorStatus, ScriptProcessStatus> {

	public Class<ScriptErrorStatus> getJavaClass() {
		return ScriptErrorStatus.class;
	}

	public EClass getEClass() {
		return AstPackage.eINSTANCE.getScriptProcessStatus();
	}

	public ScriptErrorStatus fromEObject(ScriptProcessStatus ps)
			throws CoreException {
		if (ps.getCause() != null) {
			IStatus cause = (IStatus) EMFConverterManager.INSTANCE
					.fromEObject(ps.getCause());
			return new ScriptErrorStatus(ps.getSeverity(), ps.getPluginId(),
					ps.getMessage(), ps.getResourceID(), ps.getLine(), ps.getColumn(),
					ps.getLength(), cause);
		}
		return new ScriptErrorStatus(ps.getSeverity(), ps.getPluginId(),
				ps.getMessage(), ps.getResourceID(), ps.getLine(), ps.getColumn(), ps.getLength(), null);
	}

	public ScriptProcessStatus toEObject(ScriptErrorStatus status)
			throws CoreException {
		ScriptProcessStatus ps = AstFactory.eINSTANCE
				.createScriptProcessStatus();
		ps.setResourceID(status.getResource());
		ps.setLine(status.getLine());
		ps.setColumn(status.getColumn());
		ps.setLength(status.getLength());

		if (status.getCause() != null) {
			ProcessStatus cause = (ProcessStatus) EMFConverterManager.INSTANCE
					.toEObject(status.getCause());
			ps.setCause(cause);
		}

		ps.setCode(status.getCode());
		ps.setMessage(status.getMessage());
		ps.setPluginId(status.getPlugin());
		ps.setSeverity(status.getSeverity());
		return ps;
	}

}
