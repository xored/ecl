/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.interop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.interop.InteropPackage
 * @generated
 */
public interface InteropFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteropFactory eINSTANCE = org.eclipse.ecl.interop.impl.InteropFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Invoke</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoke</em>'.
	 * @generated
	 */
	Invoke createInvoke();

	/**
	 * Returns a new object of class '<em>Exec Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exec Process</em>'.
	 * @generated
	 */
	ExecProcess createExecProcess();

	/**
	 * Returns a new object of class '<em>Exec Process Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exec Process Result</em>'.
	 * @generated
	 */
	ExecProcessResult createExecProcessResult();

	/**
	 * Returns a new object of class '<em>Get</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get</em>'.
	 * @generated
	 */
	Get createGet();

	/**
	 * Returns a new object of class '<em>Get Memory Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Memory Usage</em>'.
	 * @generated
	 */
	GetMemoryUsage createGetMemoryUsage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteropPackage getInteropPackage();

} //InteropFactory
