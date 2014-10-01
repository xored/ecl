package org.eclipse.ecl.filesystem.internal;

import java.io.File;
import java.net.URI;

import org.eclipse.ecl.filesystem.EclFile;

public class JavaFileResolver implements EclFileResolver {

	@Override
	public EclFile resolve(URI uri) {
		if (uri.getScheme().equals("file"))
			return new JavaFile(new File(uri));
		return null;
	}
}
