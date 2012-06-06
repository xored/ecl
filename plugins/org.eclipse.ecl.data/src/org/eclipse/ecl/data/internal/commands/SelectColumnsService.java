package org.eclipse.ecl.data.internal.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.data.commands.SelectColumns;
import org.eclipse.ecl.data.internal.EclDataPlugin;
import org.eclipse.ecl.data.objects.ObjectsFactory;
import org.eclipse.ecl.data.objects.Row;
import org.eclipse.ecl.data.objects.Table;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class SelectColumnsService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws CoreException {
		if (!(command instanceof SelectColumns)) {
			return Status.CANCEL_STATUS;
		}

		SelectColumns ec = (SelectColumns) command;
		Table source = ec.getTable();
		List<String> srcColumns = source.getColumns();
		List<String> destColumns = ec.getColumns();
		List<Integer> indices = new ArrayList<Integer>();

		for (int i = 0; i < destColumns.size(); i++) {
			String destColumn = destColumns.get(i);
			int index = srcColumns.indexOf(destColumn);
			if (index == -1) {
				return EclDataPlugin
						.createErr("Source table does not contain column '%s'",
								destColumn);
			}
			indices.add(index);
		}

		Table result = ObjectsFactory.eINSTANCE.createTable();
		result.getColumns().addAll(destColumns);
		for (Row row : source.getRows()) {
			result.getRows().add(extractSubrow(row, indices));
		}
		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

	static Row extractSubrow(Row src, List<Integer> indices) {
		Row result = ObjectsFactory.eINSTANCE.createRow();
		for (int index : indices) {
			result.getValues().add(src.getValues().get(index));
		}
		for (Row child : src.getChildren()) {
			result.getChildren().add(extractSubrow(child, indices));
		}
		return result;
	}
}
