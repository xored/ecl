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
package org.eclipse.ecl.internal.debug.core;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.IBreakpointManagerListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.ecl.debug.core.Debugger;
import org.eclipse.ecl.debug.core.DebuggerCallback;
import org.eclipse.ecl.debug.core.DebuggerTransport;
import org.eclipse.ecl.debug.core.EclDebug;
import org.eclipse.ecl.debug.runtime.StackFrame;
import org.eclipse.ecl.debug.runtime.events.BreakpointAddEvent;
import org.eclipse.ecl.debug.runtime.events.BreakpointHitEvent;
import org.eclipse.ecl.debug.runtime.events.BreakpointRemoveEvent;
import org.eclipse.ecl.debug.runtime.events.Event;
import org.eclipse.ecl.debug.runtime.events.EventType;
import org.eclipse.ecl.debug.runtime.events.SkipAllEvent;
import org.eclipse.ecl.debug.runtime.events.StackEvent;
import org.eclipse.ecl.debug.runtime.events.StepEndEvent;
import org.eclipse.ecl.debug.runtime.events.SuspendEvent;

public class EclDebugTarget extends EclDebugElement implements IDebugTarget,
		IBreakpointManagerListener, Debugger, DebuggerCallback {

	private final IProcess process;
	private final EclDebugThread thread;
	private final IThread[] threads;

	private volatile DebuggerTransport transport;
	private volatile IStackFrame[] frames = new IStackFrame[0];
	private volatile boolean suspended = true;
	private volatile boolean stepping = false;
	private volatile AtomicBoolean initialized = new AtomicBoolean();

	public EclDebugTarget(IProcess process) throws CoreException {
		this.process = process;
		thread = new EclDebugThread(this);
		threads = new IThread[] { thread };
	}

	@Override
	public void setTransport(DebuggerTransport transport) {
		if (this.transport != null) {
			this.transport.setCallback(null);
		}
		this.transport = transport;
		transport.setCallback(this);
	}

	@Override
	public ILaunch getLaunch() {
		return process.getLaunch();
	}

	@Override
	public IProcess getProcess() {
		return process;
	}

	@Override
	public boolean hasThreads() throws DebugException {
		return true;
	}

	@Override
	public IThread[] getThreads() throws DebugException {
		return threads;
	}

	public IStackFrame[] getFrames() {
		return frames;
	}

	@Override
	public IDebugTarget getDebugTarget() {
		return this;
	}

	@Override
	public String getName() throws DebugException {
		return getLaunch().getLaunchConfiguration().getName();
	}

	@Override
	public boolean canTerminate() {
		return getProcess().canTerminate();
	}

	@Override
	public boolean isTerminated() {
		return getProcess().isTerminated();
	}

	@Override
	public void terminate() throws DebugException {
		if (process.canTerminate()) {
			getBreakpointManager().removeBreakpointListener(this);
			getBreakpointManager().removeBreakpointManagerListener(this);
			frames = new IStackFrame[0];
			process.terminate();
			fireTerminateEvent();
		}
	}

	@Override
	public boolean canResume() {
		return !isTerminated() && isSuspended();
	}

	@Override
	public boolean canSuspend() {
		return !isTerminated() && !isSuspended();
	}

	@Override
	public boolean isSuspended() {
		return suspended;
	}

	public boolean isStepping() {
		return stepping;
	}

	@Override
	public void suspend() {
		request(new Event(EventType.SUSPEND));
	}

	@Override
	public void resume() {
		request(new Event(EventType.RESUME));
	}

	public void step() {
		// TODO actually we need to add real response from server for step
		// started
		stepStarted();
		request(new Event(EventType.STEP));
	}

	@Override
	public void breakpointAdded(IBreakpoint breakpoint) {
		try {
			if (supportsBreakpoint(breakpoint) && breakpoint.isEnabled()) {
				int line = ((ILineBreakpoint) breakpoint).getLineNumber();
				String path = breakpoint.getMarker().getResource()
						.getFullPath().toString();
				request(new BreakpointAddEvent(path, line));
			}
		} catch (CoreException e) {
			Plugin.log(e);
		}
	}

	@Override
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
		if (supportsBreakpoint(breakpoint)) {
			try {
				int line = ((ILineBreakpoint) breakpoint).getLineNumber();
				String path = breakpoint.getMarker().getResource()
						.getFullPath().toString();
				request(new BreakpointRemoveEvent(path, line));
			} catch (CoreException e) {
				Plugin.log(e);
			}
		}
	}

	@Override
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
		if (supportsBreakpoint(breakpoint)) {
			try {
				if (breakpoint.isEnabled()) {
					breakpointAdded(breakpoint);
				} else {
					breakpointRemoved(breakpoint, null);
				}
			} catch (CoreException e) {
				Plugin.log(e);
			}
		}
	}

	@Override
	public void breakpointManagerEnablementChanged(boolean enabled) {
		request(new SkipAllEvent(!enabled));
	}

	@Override
	public boolean canDisconnect() {
		return false;
	}

	@Override
	public void disconnect() throws DebugException {
	}

	@Override
	public boolean isDisconnected() {
		return false;
	}

	@Override
	public boolean supportsStorageRetrieval() {
		return false;
	}

	@Override
	public IMemoryBlock getMemoryBlock(long startAddress, long length)
			throws DebugException {
		return null;
	}

	@Override
	public boolean supportsBreakpoint(IBreakpoint breakpoint) {
		if (breakpoint.getModelIdentifier().equals(EclDebug.MODEL)) {
			try {
				IMarker marker = breakpoint.getMarker();
				if (marker != null) {
					IResource[] resources = getLaunch()
							.getLaunchConfiguration().getMappedResources();
					if (resources != null) {
						for (IResource resource : resources) {
							if (marker.getResource().equals(resource)) {
								return true;
							}
						}
					}
				}
			} catch (CoreException e) {
				Plugin.log(e);
			}
		}
		return false;
	}

	private IBreakpointManager getBreakpointManager() {
		return DebugPlugin.getDefault().getBreakpointManager();
	}

	private void request(Event event) {
		transport.request(event);
	}

	@Override
	public void handleResponse(Event event) {
		thread.setBreakpoints(null);
		switch (event.getType()) {
		case STARTED:
			started();
			break;
		case SUSPENDED:
			suspended((SuspendEvent) event);
			break;
		case STEP_ENDED:
			stepEnded((StepEndEvent) event);
			break;
		case BREAKPOINT_HIT:
			breakpointHit((BreakpointHitEvent) event);
			break;
		case RESUMED:
			resumed();
			break;
		}
	}

	private void started() {
		if (initialized.compareAndSet(false, true)) {
			getBreakpointManager().addBreakpointManagerListener(this);
			getBreakpointManager().addBreakpointListener(this);
			fireCreationEvent();
		}
		installDeferredBreakpoints();
		if (!getBreakpointManager().isEnabled()) {
			request(new SkipAllEvent(true));
		}
		if (isStepping()) {
			request(new Event(EventType.STEP));
		} else {
			resume();
		}
	}

	private void suspended(SuspendEvent event) {
		suspended(event, DebugEvent.CLIENT_REQUEST);
	}

	private void resumed() {
		suspended = false;
		frames = new IStackFrame[0];
		thread.fireResumeEvent(DebugEvent.CLIENT_REQUEST);
	}

	private void stepStarted() {
		stepping = true;
		thread.fireResumeEvent(DebugEvent.STEP_OVER);
	}

	private void stepEnded(StepEndEvent event) {
		suspended(event, DebugEvent.STEP_END);
	}

	private void breakpointHit(BreakpointHitEvent event) {
		StackFrame data = event.getFrames()[0];
		IBreakpoint breakpoint = getBreakpoint(data);
		if (breakpoint != null && supportsBreakpoint(breakpoint)) {
			thread.setBreakpoints(new IBreakpoint[] { breakpoint });
		}
		suspended(event, DebugEvent.BREAKPOINT);
	}

	private IBreakpoint getBreakpoint(StackFrame frame) {
		IBreakpoint[] breakpoints = DebugPlugin.getDefault()
				.getBreakpointManager().getBreakpoints(EclDebug.MODEL);
		for (int i = 0; i < breakpoints.length; i++) {
			IBreakpoint breakpoint = breakpoints[i];
			if (breakpoint instanceof ILineBreakpoint) {
				ILineBreakpoint lb = (ILineBreakpoint) breakpoint;
				try {
					IPath bp = breakpoint.getMarker().getResource()
							.getFullPath();
					IPath sp = new Path(frame.getFile());
					if (lb.getLineNumber() == frame.getLine() && sp.equals(bp)) {
						return breakpoint;
					}
				} catch (CoreException e) {
					Plugin.log(e);
				}
			}
		}
		return null;
	}

	private void installDeferredBreakpoints() {
		IBreakpoint[] breakpoints = DebugPlugin.getDefault()
				.getBreakpointManager().getBreakpoints(EclDebug.MODEL);
		for (int i = 0; i < breakpoints.length; i++) {
			breakpointAdded(breakpoints[i]);
		}
	}

	private void suspended(StackEvent event, int details) {
		suspended = true;
		stepping = false;
		updateStack(event);
		thread.fireSuspendEvent(details);
	}

	private void updateStack(StackEvent event) {
		StackFrame[] eventFrames = event.getFrames();
		IStackFrame[] newFrames = new IStackFrame[eventFrames.length];
		for (int i = 0; i < eventFrames.length; i++) {
			newFrames[i] = new EclStackFrame(thread, eventFrames[i]);
		}
		frames = newFrames;
	}

}
