package org.eclipse.ecl.data.internal.commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.data.commands.WriteLines;
import org.eclipse.ecl.data.internal.EclDataPlugin;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class WriteLinesService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof WriteLines)) {
			return Status.CANCEL_STATUS;
		}

		WriteLines cmd = (WriteLines) command;
		File out = FileResolver.resolve(cmd.getUri());
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream(out, cmd.isAppend()));
			for (Object obj : CoreUtils.readPipeContent(context.getInput())) {
				ps.println(obj);
			}
			ps.close();
			FileResolver.refresh(out);
		} catch (FileNotFoundException e) {
			throw new CoreException(EclDataPlugin.createErr(e,
					"Cannot write to %s", out.getAbsolutePath()));
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
		return Status.OK_STATUS;
	}

}
