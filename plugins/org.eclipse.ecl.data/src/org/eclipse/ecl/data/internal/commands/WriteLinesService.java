package org.eclipse.ecl.data.internal.commands;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.data.commands.WriteLines;
import org.eclipse.ecl.data.internal.EclDataPlugin;
import org.eclipse.ecl.filesystem.EclFile;
import org.eclipse.ecl.filesystem.FileResolver;
import org.eclipse.ecl.filesystem.Util;
import org.eclipse.ecl.runtime.BoxedValues;
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
		EclFile out = FileResolver.resolve(cmd.getUri());
		PrintStream ps = null;
		try {
			Writer fileWriter = Util.getWriter(out, cmd.isAppend());
			BufferedWriter writer = new BufferedWriter(fileWriter);
			for (Object obj : CoreUtils.readPipeContent(context.getInput())) {
				writer.write("" + BoxedValues.unbox(obj));
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			throw new CoreException(EclDataPlugin.createErr(e,
					"Cannot write to %s", out.toURI()));
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
		return Status.OK_STATUS;
	}

}
