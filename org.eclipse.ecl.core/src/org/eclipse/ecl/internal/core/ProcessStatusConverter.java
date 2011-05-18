package org.eclipse.ecl.internal.core;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.ProcessStatus;
import org.eclipse.ecl.runtime.IEMFConverter;
import org.eclipse.emf.ecore.EClass;

public class ProcessStatusConverter implements
		IEMFConverter<Status, ProcessStatus> {

	public Class<Status> getJavaClass() {
		return Status.class;
	}

	public EClass getEClass() {
		return CorePackage.eINSTANCE.getProcessStatus();
	}

	public Status fromEObject(ProcessStatus ps) {
		return new Status(ps.getSeverity(), ps.getPluginId(), ps.getCode(),
				ps.getMessage(), null);
	}

	public ProcessStatus toEObject(Status status) {
		ProcessStatus ps = CoreFactory.eINSTANCE.createProcessStatus();
		ps.setCode(status.getCode());
		String msg = status.getMessage();
		StringBuilder builder = new StringBuilder();
		if (msg != null && msg.length() > 0) {
			builder.append(msg);
		}
		if (status.getException() != null) {
			if (builder.length() > 0) {
				builder.append("\n");
			}
			StringWriter out = new StringWriter();
			status.getException().printStackTrace(new PrintWriter(out));
			String stackTrace = out.toString();
			builder.append(stackTrace);
		}
		ps.setMessage(builder.toString());
		ps.setPluginId(status.getPlugin());
		ps.setSeverity(status.getSeverity());
		return ps;
	}

}
