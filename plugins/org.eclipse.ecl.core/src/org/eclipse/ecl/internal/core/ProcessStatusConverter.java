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
package org.eclipse.ecl.internal.core;

import java.lang.reflect.Constructor;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.EclException;
import org.eclipse.ecl.core.EclStackTraceEntry;
import org.eclipse.ecl.core.ProcessStatus;
import org.eclipse.ecl.runtime.IEMFConverter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

public class ProcessStatusConverter implements
		IEMFConverter<Status, ProcessStatus> {

	public Class<Status> getJavaClass() {
		return Status.class;
	}

	public EClass getEClass() {
		return CorePackage.eINSTANCE.getProcessStatus();
	}

	public Status fromEObject(ProcessStatus ps) {
		Throwable th = null;
		EclException exception = ps.getException();
		if (exception != null) {
			th = getThrowable(exception);
		}
		if (!ps.getChildren().isEmpty()) {
			ArrayList<IStatus> children = new ArrayList<IStatus>(ps.getChildren().size());
			for (ProcessStatus child: ps.getChildren()) {
				children.add(fromEObject(child));
			}
			return new MultiStatus(ps.getPluginId(), ps.getCode(), children.toArray(new IStatus[children.size()]),
					ps.getMessage(), th);
		} else {
			return new Status(ps.getSeverity(), ps.getPluginId(), ps.getCode(),
					ps.getMessage(), th);
		}
	}

	private Throwable getThrowable(EclException exception) {
		Throwable th = null;
		try {
			// Try to restore stored exception.
			th = exception.getThrowable();
		} catch (Throwable ee) {
			// Failed to restore exception, try to construct new one
			try {
				String className = exception.getClassName();
				Class<?> forName = Class.forName(className);
				if (forName != null) {
					Constructor<?> constructor = forName.getConstructor(
							String.class, Throwable.class);
					if (constructor != null) {
						Throwable newInstance = (Throwable) constructor
								.newInstance(exception.getMessage(), null);
						if (newInstance != null) {
							EList<EclStackTraceEntry> list = exception
									.getStackTrace();
							if (list.size() > 0) {
								newInstance.setStackTrace(constructStack(list));
								th = newInstance;
							}
						}
					}
				}
			} catch (Throwable eee) {
				Exception newex = new Exception(exception.getMessage(), null);
				EList<EclStackTraceEntry> list = exception.getStackTrace();
				if (list.size() > 0) {
					newex.setStackTrace(constructStack(list));
					th = newex;
				}
			}
		}
		if (th != null) {
			EList<EclStackTraceEntry> list = exception.getStackTrace();
			if (list.size() > 0) {
				th.setStackTrace(constructStack(list));
			}
		}
		if (exception.getCause() != null) {
			th.initCause(getThrowable(exception.getCause()));
		}
		return th;
	}

	private StackTraceElement[] constructStack(EList<EclStackTraceEntry> list) {
		StackTraceElement[] stack = new StackTraceElement[list.size()];
		for (int i = 0; i < list.size(); i++) {
			EclStackTraceEntry entry = list.get(i);
			stack[i] = new StackTraceElement(entry.getDeclaringClass(),
					entry.getMethodName(), entry.getFileName(),
					entry.getLineNumber());
		}
		return stack;
	}

	public ProcessStatus toEObject(Status status) throws CoreException {
		ProcessStatus rv = CoreFactory.eINSTANCE.createProcessStatus();
		toEObject((IStatus) status, rv);
		return rv;
	}

	public static void toEObject(IStatus status, ProcessStatus ps) throws CoreException {
		ps.setCode(status.getCode());
		ps.setMessage(status.getMessage());
		ps.setPluginId(status.getPlugin());
		ps.setSeverity(status.getSeverity());
		Throwable exception = status.getException();
		if (exception != null) {
			ps.setException(toException(exception));
		}
		if (status.isMultiStatus()) {
			for (IStatus child : status.getChildren()) {
				ps.getChildren().add((ProcessStatus) EMFConverterManager.INSTANCE
						.toEObject(child));
			}
		}
	}

	private static EclException toException(Throwable exception) {
		EclException ex = CoreFactory.eINSTANCE.createEclException();
		ex.setClassName(exception.getClass().getName());
		ex.setMessage(exception.getMessage());
		ex.setThrowable(exception);
		StackTraceElement[] elements = exception.getStackTrace();
		int index = 0;
		for (StackTraceElement ee : elements) {
			EclStackTraceEntry e = CoreFactory.eINSTANCE
					.createEclStackTraceEntry();
			e.setDeclaringClass(ee.getClassName());
			e.setFileName(ee.getFileName());
			e.setLineNumber(ee.getLineNumber());
			e.setMethodName(ee.getMethodName());
			e.setIndex(index++);
			e.setNativeMethod(ee.isNativeMethod());
			ex.getStackTrace().add(e);
		}
		Throwable cause = exception.getCause();
		if (cause != null) {
			ex.setCause(toException(cause));
		}
		return ex;
	}

}
