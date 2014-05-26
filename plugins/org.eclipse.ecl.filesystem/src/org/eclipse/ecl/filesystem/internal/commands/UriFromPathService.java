package org.eclipse.ecl.filesystem.internal.commands;

import java.io.File;
import java.net.MalformedURLException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.filesystem.EclFilesystemPlugin;
import org.eclipse.ecl.filesystem.UriFromPath;
import org.eclipse.ecl.runtime.SingleCommandService;

public class UriFromPathService extends SingleCommandService<UriFromPath> {

	public UriFromPathService() {
		super(UriFromPath.class);
	}

	@Override
	protected Object serviceTyped(UriFromPath command)
			throws InterruptedException, CoreException {
		String path = command.getPath();
		if (path == null)
			throw new CoreException(new Status(IStatus.ERROR, EclFilesystemPlugin.PLUGIN_ID, "No path argument for uri-from-path."));
		try {
			return new File(path).toURI().toURL().toExternalForm();
		} catch (MalformedURLException e) {
			throw new CoreException(new Status(IStatus.ERROR, EclFilesystemPlugin.PLUGIN_ID, "Failed to parse filystem path " + path, e));
		}
	}
}
