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
package org.eclipse.ecl.parser;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.runtime.EclCompiler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public enum EclValidator {

	Instanse;

	public IStatus validate(String content) {
		try {
			Command raw = EclCoreParser.newCommand(content);
			if (raw instanceof Exec) {
				validate((Exec) raw);
			}
		} catch (CoreException e) {
			return e.getStatus();
		}
		return Status.OK_STATUS;
	}	

	private IStatus validate(Exec exec) throws CoreException {
		Command command = EclCompiler.compile(exec);
		EList<EObject> eContents = command.eContents();
		for (EObject e : eContents) {
			if (e instanceof Exec) {
				validate((Exec) e);
			}
		}
		return Status.OK_STATUS;
	}
}
