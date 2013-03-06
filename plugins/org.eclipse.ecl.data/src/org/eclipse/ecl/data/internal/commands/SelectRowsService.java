package org.eclipse.ecl.data.internal.commands;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.data.commands.RowMatchMode;
import org.eclipse.ecl.data.commands.SelectRows;
import org.eclipse.ecl.data.internal.EclDataPlugin;
import org.eclipse.ecl.data.objects.ObjectsFactory;
import org.eclipse.ecl.data.objects.Row;
import org.eclipse.ecl.data.objects.Table;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class SelectRowsService extends TableRowMatcher implements
		ICommandService {
	public IStatus service(Command command, IProcess context)
			throws CoreException {
		if (!(command instanceof SelectRows)) {
			return Status.CANCEL_STATUS;
		}

		SelectRows ec = (SelectRows) command;
		Table source = ec.getTable();
		List<String> srcColumns = source.getColumns();
		String filterColumn = ec.getColumn();
		if (filterColumn == null) {
			return EclDataPlugin
					.createErr(
							"Failed to filter table. column argument is not specified.",
							new Object[] {});
		}
		int columnIndex = srcColumns.indexOf(filterColumn);
		RowMatchMode match = ec.getMatch();

		String value = ec.getValue();
		if (value == null) {
			return EclDataPlugin.createErr(
					"Failed to filter table. Pattern value is not specified.",
					new Object[] {});
		}
		IMatcher matcher = createMatcher(match, value);
		Table result = ObjectsFactory.eINSTANCE.createTable();

		result.getColumns().addAll(source.getColumns());
		if (columnIndex == -1) {
			context.getOutput().write(result);
			return Status.OK_STATUS;
		}
		for (Row row : source.getRows()) {
			String columnValue = row.getValues().get(columnIndex);
			if (matcher.match(columnValue)) {
				result.getRows().add(EcoreUtil.copy(row));
			}
		}
		context.getOutput().write(result);
		return Status.OK_STATUS;
	}
}
