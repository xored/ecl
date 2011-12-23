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
