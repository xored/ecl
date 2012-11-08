/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.interop.commands;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Process Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.interop.commands.ExecProcessResult#getExitCode <em>Exit Code</em>}</li>
 *   <li>{@link org.eclipse.ecl.interop.commands.ExecProcessResult#getStdout <em>Stdout</em>}</li>
 *   <li>{@link org.eclipse.ecl.interop.commands.ExecProcessResult#getStderr <em>Stderr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getExecProcessResult()
 * @model
 * @generated
 */
public interface ExecProcessResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Exit Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Code</em>' attribute.
	 * @see #setExitCode(int)
	 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getExecProcessResult_ExitCode()
	 * @model
	 * @generated
	 */
	int getExitCode();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.interop.commands.ExecProcessResult#getExitCode <em>Exit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Code</em>' attribute.
	 * @see #getExitCode()
	 * @generated
	 */
	void setExitCode(int value);

	/**
	 * Returns the value of the '<em><b>Stdout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stdout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stdout</em>' attribute.
	 * @see #setStdout(String)
	 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getExecProcessResult_Stdout()
	 * @model
	 * @generated
	 */
	String getStdout();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.interop.commands.ExecProcessResult#getStdout <em>Stdout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stdout</em>' attribute.
	 * @see #getStdout()
	 * @generated
	 */
	void setStdout(String value);

	/**
	 * Returns the value of the '<em><b>Stderr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stderr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stderr</em>' attribute.
	 * @see #setStderr(String)
	 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getExecProcessResult_Stderr()
	 * @model
	 * @generated
	 */
	String getStderr();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.interop.commands.ExecProcessResult#getStderr <em>Stderr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stderr</em>' attribute.
	 * @see #getStderr()
	 * @generated
	 */
	void setStderr(String value);

} // ExecProcessResult
