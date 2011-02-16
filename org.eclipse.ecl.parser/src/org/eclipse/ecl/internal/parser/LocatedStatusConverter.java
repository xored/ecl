package org.eclipse.ecl.internal.parser;

import org.eclipse.ecl.gen.ast.AstFactory;
import org.eclipse.ecl.gen.ast.AstPackage;
import org.eclipse.ecl.gen.ast.LocatedProcessStatus;
import org.eclipse.ecl.parser.LocatedStatus;
import org.eclipse.ecl.runtime.IEMFConverter;
import org.eclipse.emf.ecore.EClass;

public class LocatedStatusConverter implements
		IEMFConverter<LocatedStatus, LocatedProcessStatus> {

	public Class<LocatedStatus> getJavaClass() {
		return LocatedStatus.class;
	}

	public EClass getEClass() {
		return AstPackage.eINSTANCE.getLocatedProcessStatus();
	}

	public LocatedStatus fromEObject(LocatedProcessStatus lps) {
		return new LocatedStatus(lps.getSeverity(), lps.getPluginId(),
				lps.getMessage(), lps.getLine(), lps.getColumn(),
				lps.getLength());
	}

	public LocatedProcessStatus toEObject(LocatedStatus status) {
		LocatedProcessStatus lps = AstFactory.eINSTANCE
				.createLocatedProcessStatus();
		lps.setLine(status.getLine());
		lps.setColumn(status.getColumn());
		lps.setLength(status.getLength());

		lps.setCode(status.getCode());
		lps.setMessage(status.getMessage());
		lps.setPluginId(status.getPlugin());
		lps.setSeverity(status.getSeverity());
		return lps;
	}

}
