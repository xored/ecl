package org.eclipse.ecl.data.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.data.commands.AsTableData;
import org.eclipse.ecl.data.internal.EclDataPlugin;
import org.eclipse.ecl.data.objects.ObjectsFactory;
import org.eclipse.ecl.data.objects.Row;
import org.eclipse.ecl.data.objects.Table;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class AsTableDataService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		AsTableData asTableData = (AsTableData) command;

		Table table = ObjectsFactory.eINSTANCE.createTable();
		EList<EObject> input = asTableData.getInput();

		if (input.size() > 0) {
			EClass class_ = input.get(0).eClass();
			addColumns(table, class_);

			for (EObject o : input)
				if (o.eClass() == class_)
					addRow(table, o);
				else
					return error("Unable to convert to table data, input objects class inconsistency detected.");
		}

		context.getOutput().write(table);
		return Status.OK_STATUS;
	}

	private static void addRow(Table table, EObject o) {
		Row row = ObjectsFactory.eINSTANCE.createRow();
		for (EAttribute attr : o.eClass().getEAllAttributes())
			row.getValues().add(o.eGet(attr).toString());
		table.getRows().add(row);
	}

	private static void addColumns(Table table, EClass class_) {
		for (EAttribute attr : class_.getEAllAttributes())
			table.getColumns().add(attr.getName());
	}

	private static Status error(String message) {
		return new Status(Status.ERROR, EclDataPlugin.PLUGIN_ID, message);
	}
}
