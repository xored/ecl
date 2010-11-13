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
import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;
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
					CorePlugin.err(e.getMessage(), e);
				} catch (InterruptedException ie) {
					s = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
							ie.getMessage(), ie);
					CorePlugin.err(ie.getMessage(), ie);
				} catch (Throwable t) {
					s = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
							t.getMessage(), t);
					CorePlugin.err(t.getMessage(), t);
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
			if (feature.getEAnnotation("http://www.eclipse.org/ecl/input") != null) {
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
			CoreUtils.featureSafeSet(scriptlet, inputFeature,
					CoreUtils.readPipeContent(input));
		}
	}

	private void resolveBindings(Command scriptlet) throws CoreException,
			InterruptedException {
		for (Binding binding : scriptlet.getBindings()) {
			EStructuralFeature feature = binding.getFeature();
			Command command = binding.getCommand();
			IPipe out = createPipe();
			execute(command, null, out);
			CoreUtils.featureSafeSet(scriptlet, feature,
					CoreUtils.readPipeContent(out));
		}
	}

	private void checkParams(Command scriptlet) throws CoreException {
		for (EStructuralFeature feature : scriptlet.eClass()
				.getEStructuralFeatures()) {
			CoreUtils.checkBounds(feature, scriptlet.eGet(feature));
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
