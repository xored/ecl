/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.operations.Concat#getStrs <em>Strs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getConcat()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Concatenates strings passed as arguments' returns='Concatenated string value' example='concat \"Mess\" \"age\" | equals \"Message\" | assert-true'"
 * @generated
 */
public interface Concat extends Command {
	/**
	 * Returns the value of the '<em><b>Strs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strs</em>' attribute list.
	 * @see org.eclipse.ecl.operations.OperationsPackage#getConcat_Strs()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStrs();

} // Concat
