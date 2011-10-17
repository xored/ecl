package org.eclipse.ecl.platform.internal.commands;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.platform.internal.PlatformPlugin;
import org.eclipse.ecl.runtime.ICommandService;

/**
 * Base class for repository-related commands
 * @author ivaninozemtsev
 *
 */
public abstract class RepositoryService implements ICommandService {
	protected URI getUri(String uriStr) throws CoreException {
		URI repoUri = null;
		try {
			repoUri = new URI(uriStr);
		} catch (URISyntaxException e) {
			throw new CoreException(PlatformPlugin.err("Invalid repo URI", e));
		}
		return repoUri;
	}
}
