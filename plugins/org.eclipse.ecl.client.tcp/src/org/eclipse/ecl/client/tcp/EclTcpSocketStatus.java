package org.eclipse.ecl.client.tcp;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class EclTcpSocketStatus extends Status {

	public EclTcpSocketStatus(int severity, String pluginId, int code,
			String message, Throwable exception) {
		super(severity, pluginId, code, message, exception);
	}

	public EclTcpSocketStatus(IStatus status) {
		this(status.getSeverity(), status.getPlugin(), status.getCode(), status
				.getMessage(), status.getException());
	}

}
