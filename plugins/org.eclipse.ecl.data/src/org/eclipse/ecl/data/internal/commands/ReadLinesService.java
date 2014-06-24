package org.eclipse.ecl.data.internal.commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.data.commands.ReadLines;
import org.eclipse.ecl.data.internal.EclDataPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ReadLinesService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof ReadLines)) {
			return Status.CANCEL_STATUS;
		}

		BufferedReader br = null;
		try {
			URI uri = new URI(((ReadLines) command).getUri());
			File file = FileResolver.resolve(uri);

			if (file != null) {
				uri = file.toURI();
			}
			br = new BufferedReader(new InputStreamReader(uri.toURL()
					.openStream()));
			String line = "";
			while ((line = br.readLine()) != null) {
				context.getOutput().write(line);
			}
		} catch (Exception e) {
			return new Status(IStatus.ERROR, EclDataPlugin.PLUGIN_ID, e.getMessage(), e);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
				}
			}
		}

		return Status.OK_STATUS;
	}

}
