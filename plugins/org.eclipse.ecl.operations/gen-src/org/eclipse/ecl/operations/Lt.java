/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.operations.Lt#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.Lt#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getLt()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Compares arguments one are less then another' returns='<code>true</code> when left is less then right, <code>false</code> otherwise.'"
 * @generated
 */
public interface Lt extends Command {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(EObject)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getLt_Left()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='Left argument'"
	 * @generated
	 */
	EObject getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.Lt#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(EObject value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(EObject)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getLt_Right()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='Right argument'"
	 * @generated
	 */
	EObject getRight();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.Lt#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(EObject value);

} // Lt
