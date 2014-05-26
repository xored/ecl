package org.eclipse.ecl.filesystem.internal.commands;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.filesystem.EclFilesystemPlugin;
import org.eclipse.ecl.filesystem.File;
import org.eclipse.ecl.filesystem.FilesystemFactory;
import org.eclipse.ecl.filesystem.GetFile;
import org.eclipse.ecl.runtime.SingleCommandService;


public class GetFileService extends SingleCommandService<GetFile> {

	public GetFileService() {
		super(GetFile.class);
	}

	@Override
	protected Object serviceTyped(GetFile command)
			throws InterruptedException, CoreException {
		if ( command.getUri() == null)
			throw new CoreException(new Status(IStatus.ERROR, EclFilesystemPlugin.PLUGIN_ID, "No uri argument for get-file command."));
		File rv = FilesystemFactory.eINSTANCE.createFile();
		rv.setUri(command.getUri());
		return rv;
	}
}
