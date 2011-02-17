package org.eclipse.ecl.internal.parser;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.ProcessStatus;
import org.eclipse.ecl.gen.ast.AstFactory;
import org.eclipse.ecl.gen.ast.AstPackage;
import org.eclipse.ecl.gen.ast.ScriptProcessStatus;
import org.eclipse.ecl.internal.core.EMFConverterManager;
import org.eclipse.ecl.parser.ScriptErrorStatus;
import org.eclipse.ecl.runtime.IEMFConverter;
import org.eclipse.emf.ecore.EClass;

public class ScriptStatusConverter implements
		IEMFConverter<ScriptErrorStatus, ScriptProcessStatus> {

	public Class<ScriptErrorStatus> getJavaClass() {
		return ScriptErrorStatus.class;
	}

	public EClass getEClass() {
		return AstPackage.eINSTANCE.getScriptProcessStatus();
	}

	public ScriptErrorStatus fromEObject(ScriptProcessStatus ps)
			throws CoreException {
		if (ps.getCause() != null) {
			IStatus cause = (IStatus) EMFConverterManager.INSTANCE
					.fromEObject(ps.getCause());
			return new ScriptErrorStatus(cause, ps.getLine(), ps.getColumn(),
					ps.getLength());
		}
		return new ScriptErrorStatus(ps.getSeverity(), ps.getPluginId(),
				ps.getPluginId(), ps.getLine(), ps.getColumn(), ps.getLength());
	}

	public ScriptProcessStatus toEObject(ScriptErrorStatus status)
			throws CoreException {
		ScriptProcessStatus ps = AstFactory.eINSTANCE
				.createScriptProcessStatus();
		ps.setLine(status.getLine());
		ps.setColumn(status.getColumn());
		ps.setLength(status.getLength());

		if (status.getCause() != null) {
			ProcessStatus cause = (ProcessStatus) EMFConverterManager.INSTANCE
					.toEObject(status.getCause());
			ps.setCause(cause);
		}

		ps.setCode(status.getCode());
		ps.setMessage(status.getMessage());
		ps.setPluginId(status.getPlugin());
		ps.setSeverity(status.getSeverity());
		return ps;
	}

}
