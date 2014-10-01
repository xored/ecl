package org.eclipse.ecl.filesystem.internal;

import java.io.IOException;
import java.net.URI;

import org.eclipse.ecl.filesystem.EclFile;

public interface EclFileResolver {
	EclFile resolve(URI uri) throws IOException;
}
