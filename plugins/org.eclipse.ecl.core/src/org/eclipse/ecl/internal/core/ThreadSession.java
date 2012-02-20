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

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.ISession;

public class ThreadSession extends AbstractRootSession implements ISession {
	private static ExecutorService cachedPool;
	static {
		cachedPool = Executors.newCachedThreadPool();
	}

	public static abstract class EclJob extends Job {

		private EclJob(Command scriptlet) {
			super("ECL session execute: "
					+ CoreUtils.getScriptletNameByClass(scriptlet.eClass()));
		}
	}

	protected void doExecute(final Command scriptlet,
			final ICommandService svc, final List<Object> inputContent,
			final Process process) {
		cachedPool.execute(new Runnable() {
			@Override
			public void run() {
				internalDoExecute(scriptlet, svc, inputContent, process);
			}
		});
	}
}
