package org.eclipse.ecl.data.internal.commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.data.commands.ReadLines;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ReadLinesService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof ReadLines)) {
			return Status.CANCEL_STATUS;
		}

		File in = FileResolver.resolve(((ReadLines) command).getUri());
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(in));
			String line = "";
			while ((line = br.readLine()) != null) {
				context.getOutput().write(line);
			}
		} catch (IOException e) {

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
