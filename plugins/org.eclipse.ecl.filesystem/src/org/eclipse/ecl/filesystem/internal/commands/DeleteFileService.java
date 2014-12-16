/*******************************************************************************
 * Copyright (c) 2009, 2014 Xored Software Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Xored Software Inc - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.ecl.filesystem.internal.commands;

import static org.eclipse.ecl.filesystem.EclFilesystemPlugin.createError;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.filesystem.DeleteFile;
import org.eclipse.ecl.filesystem.FileResolver;
import org.eclipse.ecl.filesystem.EclFile;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class DeleteFileService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		DeleteFile deleteFile = (DeleteFile) command;
		String uriString = deleteFile.getUri();

		if (uriString == null || uriString.length() == 0)
			return createError("No uri argument for delete-file command.");

		try {
			URI uri = new URI(uriString);
			EclFile file = FileResolver.resolve(uri);
			file.delete();
			// if (file != null) {
			// uri = file.toURI();
			// }
			//
			// IFileStore input = EFS.getStore(uri);
			// if (!input.fetchInfo().exists()) {
			// return createError("\"%s\" not found.", uriString);
			// }
			//
			// input.delete(EFS.NONE, null);

			return Status.OK_STATUS;
		} catch (Exception e) {
			return createError(e.getMessage(), e);
		}
	}

}
