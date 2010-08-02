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

package org.eclipse.ecl.internal.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.emf.ecore.EObject;

import com.xored.espace.core.ESpace;

class SpacePipeline implements IPipe {

	private final ESpace space;
	private boolean active = true;

	SpacePipeline(ESpace space) {
		this.space = space;
	}

	public Object take(long timeout) throws CoreException {
		if (space == null)
			// Couldn't happen
			throw new CoreException(CorePlugin.err("Pipe was not initialized"
					+ " for some reason"));
		try {
			if (!active) {
				return space.take(null, 0);
			}
			return space.take(null, timeout);
		} catch (InterruptedException e) {
			throw new CoreException(CorePlugin.err(e.getMessage(), e));
		}
	}

	public IPipe write(Object object) throws CoreException {
		if (space == null) {
			IStatus s = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"writing to closed pipe");
			throw new CoreException(s);
		}
		if (object instanceof EObject) {
			try {
				space.write((EObject) object);
			} catch (InterruptedException e) {
				throw new CoreException(CorePlugin.err(e.getMessage(), e));
			}
		} else {
			IStatus status = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"ESpace allows only EObject to be written");
			throw new CoreException(status);
		}
		return this;
	}

	public IPipe close(IStatus status) throws CoreException {
		active = false;
		write(status);
		return this;
	}

}
