package org.eclipse.ecl.runtime;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public interface IEMFConverter<JC extends Object, EC extends EObject> {

	JC fromEObject(EC eObject) throws CoreException;

	EC toEObject(JC object) throws CoreException;

	Class<JC> getJavaClass();

	EClass getEClass();
}
