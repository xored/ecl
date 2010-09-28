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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.xored.espace.core.ESpace;

public class Session implements ISession {

	private final ESpace space;

	public Session(ESpace space) {
		this.space = space;
	}

	public IProcess execute(final Command scriptlet, IPipe in, IPipe out)
			throws CoreException {
		final ICommandService svc = CorePlugin.getScriptletManager()
				.getScriptletService(scriptlet);
		final IPipe input = in == null ? createPipe().close(Status.OK_STATUS)
				: in;
		final IPipe output = out == null ? createPipe() : out;
		final Process process = new Process(this, input, output);
		new Thread(new Runnable() {
			public void run() {
				IStatus s = null;
				try {
					setupInputFeature(scriptlet, input);
					resolveBindings(scriptlet);
					checkParams(scriptlet);
					s = svc.service(scriptlet, process);
				} catch (CoreException e) {
					s = e.getStatus();
				} catch (InterruptedException ie) {
					s = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID, ie
							.getMessage(), ie);
				} catch (Throwable t) {
					s = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID, t
							.getMessage(), t);
				} finally {
					try {
						process.setStatus(s);
					} catch (CoreException ioe) {
						s = ioe.getStatus();
						try {
							process.setStatus(s);
						} catch (CoreException e) {
							// do nothing, just log
							CorePlugin.log(e.getStatus());
						}
					}
				}
			}
		}).start();
		return process;
	}

	private void setupInputFeature(Command scriptlet, IPipe input)
			throws CoreException {
		EStructuralFeature inputFeature = null;
		for (EStructuralFeature feature : CoreUtils.getFeatures(scriptlet
				.eClass())) {
			if (feature.getEAnnotation("input") != null) {
				if (inputFeature == null) {
					inputFeature = feature;
				} else {
					IStatus status = new Status(IStatus.ERROR,
							CorePlugin.PLUGIN_ID,
							"Command has more than one input param");
					throw new CoreException(status);
				}
			}
		}
		if (inputFeature != null) {
			featureSafeSet(scriptlet, inputFeature, getPipeContent(input));
		}
	}

	private void resolveBindings(Command scriptlet) throws CoreException,
			InterruptedException {
		for (Binding binding : scriptlet.getBindings()) {
			EStructuralFeature feature = binding.getFeature();
			Command command = binding.getCommand();
			IPipe out = createPipe();
			execute(command, null, out);
			featureSafeSet(scriptlet, feature, getPipeContent(out));
		}
	}

	private void checkParams(Command scriptlet) throws CoreException {
		for (EStructuralFeature feature : scriptlet.eClass()
				.getEStructuralFeatures()) {
			checkBounds(feature, scriptlet.eGet(feature));
		}
	}

	private static List<?> getPipeContent(IPipe pipe) throws CoreException {
		List<Object> pipeContent = new ArrayList<Object>();
		Object o = null;
		while (true) {
			o = pipe.take(Long.MAX_VALUE); // wait forever to take content
			if (o instanceof IStatus)
				break;
			pipeContent.add(o);
		}
		// Now pipe is empty for sure
		IStatus status = (IStatus) o;
		if (status.getSeverity() != IStatus.OK) {
			throw new CoreException(status);
		}
		return pipeContent;
	}

	private static void featureSafeSet(EObject object,
			EStructuralFeature feature, List<?> value) throws CoreException {
		checkBounds(feature, value);
		if (value.size() > 0) {
			if (feature.getUpperBound() == 1)
				object.eSet(feature, value.get(0));
			else
				object.eSet(feature, value);
		}
	}

	private static void checkBounds(EStructuralFeature feature, Object value)
			throws CoreException {
		int actual = 0;
		if (value instanceof List<?>) {
			actual = ((List<?>) value).size();
		} else if (value != null) {
			actual = 1;
		}
		int lower = feature.getLowerBound();
		int upper = feature.getUpperBound();
		if (upper != -1 && actual > upper) {
			throw new CoreException(CorePlugin.err(MessageFormat.format(
					"Parameter {2} is already assigned", actual, upper, feature
							.getName())));
		}
		if (actual < lower) {
			throw new CoreException(CorePlugin.err(MessageFormat.format(
					"Parameter {2} is not assigned", actual, lower, feature
							.getName())));
		}
	}

	public IPipe createPipe() {
		return new Pipe();
	}

	public IProcess execute(Command command) throws CoreException {
		return execute(command, null, null);
	}

	public void reconnect() throws CoreException {
	}

	public void close() throws CoreException {
	}

}
