package org.eclipse.ecl.eclsh;

import java.io.OutputStream;

public interface IEclShell {
	void execute(String command);

	void connect(OutputStream stream);

	void disconnect();
}
