package org.eclipse.ecl.data.tests;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.data.commands.CommandsFactory;
import org.eclipse.ecl.data.commands.ReadCsvFile;
import org.eclipse.ecl.data.internal.commands.ReadCsvFileService;
import org.junit.Test;

public class ReadCsvFileTests {
	@Test
	public void testSimple() throws InterruptedException, CoreException {
		ReadCsvFile cmd = CommandsFactory.eINSTANCE.createReadCsvFile();
		cmd.setUri("workspace:foo/bar");
		ReadCsvFileService service = new ReadCsvFileService();
		service.service(cmd, null);
	}
}
