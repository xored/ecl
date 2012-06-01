package org.eclipse.ecl.data.internal.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.data.commands.ExcludeColumns;
import org.eclipse.ecl.data.objects.ObjectsFactory;
import org.eclipse.ecl.data.objects.Row;
import org.eclipse.ecl.data.objects.Table;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ExcludeColumnsService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof ExcludeColumns)) {
			return Status.CANCEL_STATUS;
		}

		ExcludeColumns ec = (ExcludeColumns) command;
		Table source = ec.getTable();
		List<String> srcColumns = source.getColumns();
		List<String> excludeColumns = ec.getColumns();
		List<Integer> indices = new ArrayList<Integer>();
		List<String> destColumns = new ArrayList<String>();

		for (int i = 0; i < srcColumns.size(); i++) {
			String srcColumn = srcColumns.get(i);
			if (!excludeColumns.contains(srcColumn)) {
				indices.add(i);
				destColumns.add(srcColumn);
			}
		}

		Table result = ObjectsFactory.eINSTANCE.createTable();
		result.getColumns().addAll(destColumns);

		for (Row row : source.getRows()) {
			result.getRows().add(
					SelectColumnsService.extractSubrow(row, indices));
		}
		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

}
