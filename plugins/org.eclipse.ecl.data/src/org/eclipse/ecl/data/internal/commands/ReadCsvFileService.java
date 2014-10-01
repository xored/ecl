package org.eclipse.ecl.data.internal.commands;

import static org.eclipse.ecl.data.internal.EclDataPlugin.createErr;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.data.commands.ReadCsvFile;
import org.eclipse.ecl.data.objects.ObjectsFactory;
import org.eclipse.ecl.data.objects.Row;
import org.eclipse.ecl.data.objects.Table;
import org.eclipse.ecl.filesystem.EclFile;
import org.eclipse.ecl.filesystem.FileResolver;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCsvFileService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof ReadCsvFile)) {
			return Status.CANCEL_STATUS;
		}

		ReadCsvFile readFile = (ReadCsvFile) command;
		EclFile file = FileResolver.resolve(readFile.getUri());
		CSVReader reader;
		try {
			reader = new CSVReader(new InputStreamReader(file.read()));
		} catch (IOException e) {
			return createErr("Cannot read file %s", file.toURI(), e);
		}

		Table result = ObjectsFactory.eINSTANCE.createTable();
		try {
			String[] headers = reader.readNext();
			if (headers.length == 0) {
				return createErr("File %s does not contain any rows",
						file.toURI());
			}

			boolean haveIndent = headers[0]
					.equals(WriteCsvFileService.INDENT_COLUMN);
			for (int i = haveIndent ? 1 : 0; i < headers.length; i++) {
				result.getColumns().add(headers[i]);
			}

			LinkedList<Row> stack = new LinkedList<Row>();
			String[] line = null;
			int lineNum = 0;

			while ((line = reader.readNext()) != null) {
				lineNum++;
				if (line.length != headers.length) {
					return createErr(
							"Value count in line %d differs from column counti in file %s ",
							lineNum, file.toURI());
				}

				int indent = haveIndent ? Integer.parseInt(line[0]) : 0;
				while (indent < stack.size()) {
					stack.pop(); // throwing rows until falling on required
									// level
				}

				Row row = ObjectsFactory.eINSTANCE.createRow();
				for (int i = haveIndent ? 1 : 0; i < line.length; i++) {
					row.getValues().add(line[i]);
				}

				if (indent != stack.size() && (indent - stack.size()) > 1) {
					return createErr(
							"Error on line %d - indent level too high, can't determine parent row in file %s",
							lineNum, file.toURI());
				}

				if (stack.size() > 0) {
					stack.peek().getChildren().add(row);
				} else {
					result.getRows().add(row);
				}

				stack.push(row);
			}
		} catch (IOException e) {
			return createErr(e, "Error reading file %s", file.toURI());
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// nothing to do
			}
		}

		context.getOutput().write(result);
		return Status.OK_STATUS;
	}
}
