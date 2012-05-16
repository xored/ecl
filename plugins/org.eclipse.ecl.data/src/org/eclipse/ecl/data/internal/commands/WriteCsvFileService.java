package org.eclipse.ecl.data.internal.commands;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.data.commands.WriteCsvFile;
import org.eclipse.ecl.data.internal.EclDataPlugin;
import org.eclipse.ecl.data.objects.Row;
import org.eclipse.ecl.data.objects.Table;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

import au.com.bytecode.opencsv.CSVWriter;

public class WriteCsvFileService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof WriteCsvFile)) {
			return Status.CANCEL_STATUS;
		}
		WriteCsvFile wcf = (WriteCsvFile) command;
		File file = FileResolver.resolve(wcf.getUri());
		file.getParentFile().mkdirs();
		Table table = wcf.getTable();
		try {
			CSVWriter writer = new CSVWriter(new FileWriter(file));
			for (Row row : table.getRows()) {
				writer.writeNext(row.getValues().toArray(
						new String[row.getValues().size()]));
			}
			writer.close();
			FileResolver.refresh(file);
		} catch (IOException e) {
			return EclDataPlugin.createErr(e, "Error writing file %s",
					file.getAbsolutePath());
		}

		context.getOutput().write(table);
		return Status.OK_STATUS;
	}

}
