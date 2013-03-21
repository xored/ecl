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
package org.eclipse.ecl.example.view.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.example.view.View;
import org.eclipse.ecl.example.view.ViewFactory;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.IViewDescriptor;

public class ShowViewsService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final List<View> views = new ArrayList<View>();
		workbench.getDisplay().syncExec(new Runnable() {
			public void run() {
				for (IViewDescriptor descriptor : workbench.getViewRegistry()
						.getViews()) {
					View view = ViewFactory.eINSTANCE.createView();
					view.setId(descriptor.getId());
					view.setLabel(descriptor.getLabel());
					view.setDescription(descriptor.getLabel());
					views.add(view);
				}
			}
		});
		IPipe output = context.getOutput();
		for (View view : views) {
			output.write(view);
		}
		return Status.OK_STATUS;
	}

}
