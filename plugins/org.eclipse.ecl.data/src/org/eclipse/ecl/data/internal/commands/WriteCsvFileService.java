package org.eclipse.ecl.data.internal.commands;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
	static final String INDENT_COLUMN = "_indent";

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof WriteCsvFile)) {
			return Status.CANCEL_STATUS;
		}
		WriteCsvFile wcf = (WriteCsvFile) command;
		File file = FileResolver.resolve(wcf.getUri());
		file.getParentFile().mkdirs();
		Table table = wcf.getTable();

		List<String> columns = new ArrayList<String>();
		boolean haveChildren = haveChildren(table);

		if (haveChildren) {
			columns.add(INDENT_COLUMN); // first column is going to be 'indent'
		}
		columns.addAll(table.getColumns());

		try {
			CSVWriter writer = new CSVWriter(new FileWriter(file));
			writer.writeNext(columns.toArray(new String[columns.size()]), false);
			for (Row row : table.getRows()) {
				writeRow(writer, row, 0, haveChildren);
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

	private void writeRow(CSVWriter writer, Row row, int indent,
			boolean haveChildren) {
		List<String> values = new ArrayList<String>();
		if (haveChildren) {
			values.add(Integer.toString(indent));
		}
		values.addAll(row.getValues());
		writer.writeNext(values.toArray(new String[values.size()]), false);
		for (Row child : row.getChildren()) {
			writeRow(writer, child, indent + 1, haveChildren);
		}
	}

	private static boolean haveChildren(Table table) {
		for (Row row : table.getRows()) {
			if (row.getChildren().size() > 0) {
				return true;
			}
		}
		return false;
	}
}
