package org.eclipse.ecl.internal.core;

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
				ps.getMessage(), ps.getException());
	}

	public ProcessStatus toEObject(Status status) {
		ProcessStatus ps = CoreFactory.eINSTANCE.createProcessStatus();
		ps.setCode(status.getCode());
		ps.setMessage(status.getMessage());
		ps.setPluginId(status.getPlugin());
		ps.setSeverity(status.getSeverity());
		ps.setException(status.getException());
		return ps;
	}

}
