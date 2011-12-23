/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Yuri Strot)
 *******************************************************************************/
package org.eclipse.ecl.debug.core;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.ecl.internal.debug.core.EclBreakpoint;
import org.eclipse.ecl.internal.debug.core.EclDebugTarget;
import org.eclipse.ecl.internal.debug.core.Plugin;

public class EclDebug {

	public static final String MODEL = Plugin.ID;

	public static final String MARKER = Plugin.ID + ".breakpoint.marker";

	public static LineBreakpoint createBreakpoint(IResource resource,
			int lineNumber) throws CoreException {
		return new EclBreakpoint(resource, lineNumber);
	}

	public static IDebugTarget createDebugTarget(IProcess process, int port)
			throws CoreException {
		return new EclDebugTarget(process, port);
	}

}
