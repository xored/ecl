/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.debug.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Debug Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.debug.model.DebugCmd#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.debug.model.ModelPackage#getDebugCmd()
 * @model
 * @generated
 */
public interface DebugCmd extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.ecl.debug.model.DebugType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.ecl.debug.model.DebugType
	 * @see #setType(DebugType)
	 * @see org.eclipse.ecl.debug.model.ModelPackage#getDebugCmd_Type()
	 * @model
	 * @generated
	 */
	DebugType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.debug.model.DebugCmd#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.ecl.debug.model.DebugType
	 * @see #getType()
	 * @generated
	 */
	void setType(DebugType value);

} // DebugCmd
