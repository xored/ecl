package org.eclipse.ecl.operations.internal.commands;

import static org.eclipse.ecl.operations.internal.OperationsPlugin.createErr;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.Split;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;

public class SplitService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		if (!(command instanceof Split)) {
			return Status.CANCEL_STATUS;
		}

		Split split = (Split) command;
		String input = split.getStr();
		String sep = split.getSep();
		PipeWriter writer = new PipeWriter(context.getOutput(), split.isTrimResults(), split.isOmitEmptyStrings());

		int sepLength = sep.length();
		if (sepLength == 0) {
			throw new CoreException(createErr("Empty separator is not allowed"));
		}
		int searchStart = 0;
		while (true) {
			int sepStart = input.indexOf(sep, searchStart);
			if (sepStart == -1) {
				writer.write(input.substring(searchStart));
				break;
			}

			writer.write(input.substring(searchStart, sepStart));
			searchStart = sepStart + sepLength;
		}
		return Status.OK_STATUS;
	}

	private static class PipeWriter {
		private boolean trim;
		private boolean omit;
		private IPipe out;

		public PipeWriter(IPipe out, boolean trim, boolean omit) {
			this.out = out;
			this.trim = trim;
			this.omit = omit;
		}

		public void write(String result) throws CoreException {
			if (result.length() == 0 && omit) {
				return;
			}

			if (trim) {
				result = result.trim();
			}

			out.write(result);
		}
	}
}
