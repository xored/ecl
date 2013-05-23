/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.EclBoolean;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.operations.And#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getAnd()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Computes the result of logical And operation for passed arguments.' returns='<code>true</code> or <code>false</code>.'"
 * @generated
 */
public interface And extends Command {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' reference list.
	 * @see org.eclipse.ecl.operations.OperationsPackage#getAnd_Args()
	 * @model lower="2"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Arguments to compute on.'"
	 * @generated
	 */
	EList<EObject> getArgs();

} // And
