package org.eclipse.ecl.data.internal.commands;

import static org.eclipse.ecl.data.internal.EclDataPlugin.createErr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.data.commands.ReadCsvFile;
import org.eclipse.ecl.data.objects.ObjectsFactory;
import org.eclipse.ecl.data.objects.Row;
import org.eclipse.ecl.data.objects.Table;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCsvFileService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof ReadCsvFile)) {
			return Status.CANCEL_STATUS;
		}

		ReadCsvFile readFile = (ReadCsvFile) command;
		File file = FileResolver.resolve(readFile.getUri());
		CSVReader reader;
		try {
			reader = new CSVReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			return createErr("Cannot read file %s", file.getAbsolutePath());
		}

		Table result = ObjectsFactory.eINSTANCE.createTable();
		for (String[] vals : reader) {
			Row row = ObjectsFactory.eINSTANCE.createRow();
			row.getValues().addAll(Arrays.asList(vals));
			result.getRows().add(row);
		}
		try {
			reader.close();
		} catch (IOException e) {
			// Don't care
		}

		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

}
