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
package org.eclipse.ecl.filesystem.internal;

import java.io.IOException;
import java.net.URI;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.ecl.filesystem.EclFile;

public class ResourceFileResolver implements EclFileResolver {
	{
		// Creation should fail if resource plug-in is not available
		ResourcesPlugin.getWorkspace().getRoot();
	}

	@Override
	public EclFile resolve(URI uri) throws IOException {
		IPath path = toPath(uri);
		if (uri.getScheme().equals("workspace")) {
			return new ResourceFile(path);
		}
		return null;
	}

	private static IPath toPath(URI uri) {
		final String path = uri.getPath().substring(1); // removes leading slash
		if (path == null) {
			throw new NullPointerException("Bad URI: " + uri);
		}
		return Path.fromPortableString(path);
	}
}

