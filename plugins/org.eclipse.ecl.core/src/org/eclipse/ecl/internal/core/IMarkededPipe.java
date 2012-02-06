package org.eclipse.ecl.internal.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.runtime.IPipe;

public interface IMarkededPipe extends IPipe {
	void writeCloseMarker() throws CoreException;
	void closeNoWait();
}
