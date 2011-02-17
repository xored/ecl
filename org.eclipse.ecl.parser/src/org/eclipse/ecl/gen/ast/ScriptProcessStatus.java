/**
 * <copyright>
 * </copyright>
 *
 * $Id: ScriptProcessStatus.java,v 1.1 2011/02/17 09:31:02 alena Exp $
 */
package org.eclipse.ecl.gen.ast;

import org.eclipse.ecl.core.ProcessStatus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Process Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.gen.ast.ScriptProcessStatus#getCause <em>Cause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.gen.ast.AstPackage#getScriptProcessStatus()
 * @model
 * @generated
 */
public interface ScriptProcessStatus extends ProcessStatus, AstNode {

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' containment reference.
	 * @see #setCause(ProcessStatus)
	 * @see org.eclipse.ecl.gen.ast.AstPackage#getScriptProcessStatus_Cause()
	 * @model containment="true"
	 * @generated
	 */
	ProcessStatus getCause();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.gen.ast.ScriptProcessStatus#getCause <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' containment reference.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(ProcessStatus value);
} // ScriptProcessStatus
