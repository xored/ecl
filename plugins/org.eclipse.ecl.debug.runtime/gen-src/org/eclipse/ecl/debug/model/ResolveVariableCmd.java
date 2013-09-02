/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.debug.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolve Variable Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.debug.model.ResolveVariableCmd#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.debug.model.ModelPackage#getResolveVariableCmd()
 * @model
 * @generated
 */
public interface ResolveVariableCmd extends DebugCmd {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.ecl.debug.model.ModelPackage#getResolveVariableCmd_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.debug.model.ResolveVariableCmd#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);
} // ResolveVariableCmd
