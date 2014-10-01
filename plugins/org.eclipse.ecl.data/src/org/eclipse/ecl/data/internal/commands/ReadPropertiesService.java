package org.eclipse.ecl.data.internal.commands;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.EclMap;
import org.eclipse.ecl.core.EclMapEntry;
import org.eclipse.ecl.data.commands.ReadProperties;
import org.eclipse.ecl.data.internal.EclDataPlugin;
import org.eclipse.ecl.filesystem.EclFile;
import org.eclipse.ecl.filesystem.FileResolver;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ReadPropertiesService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		ReadProperties rp = (ReadProperties) command;
		EclFile file = FileResolver.resolve(rp.getUri());
		Properties p = new Properties();
		Reader reader = null;
		try {
			reader = new InputStreamReader(file.read(), "UTF-8");
			p.load(reader);
		} catch (Exception e) {
			throw new CoreException(EclDataPlugin.createErr(e, "Error reading file %s", file.toURI()));
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
				}
			}
		}

		EclMap result = CoreFactory.eINSTANCE.createEclMap();
		for (Entry<Object, Object> entry : p.entrySet()) {
			EclMapEntry mapEntry = CoreFactory.eINSTANCE.createEclMapEntry();
			mapEntry.setKey(BoxedValues.box(entry.getKey()));
			mapEntry.setValue(BoxedValues.box(entry.getValue()));
			result.getEntries().add(mapEntry);
		}
		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

}
