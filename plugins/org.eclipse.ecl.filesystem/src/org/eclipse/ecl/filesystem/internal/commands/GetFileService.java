package org.eclipse.ecl.filesystem.internal.commands;


import static org.eclipse.ecl.filesystem.EclFilesystemPlugin.createError;

import java.net.URISyntaxException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.URIUtil;
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
			throw new CoreException(createError("No uri argument for get-file command."));
		File rv = FilesystemFactory.eINSTANCE.createFile();
		try {
			URIUtil.fromString(command.getUri());
		} catch (URISyntaxException e) {
			throw new CoreException(createError("Failed to parse file URI: "+ command.getUri()));
		}
		rv.setUri(command.getUri());
		return rv;
	}
}
