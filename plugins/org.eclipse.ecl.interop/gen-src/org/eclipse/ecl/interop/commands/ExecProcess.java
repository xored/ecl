/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.interop.commands;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.interop.commands.ExecProcess#getCommand <em>Command</em>}</li>
 *   <li>{@link org.eclipse.ecl.interop.commands.ExecProcess#getArgs <em>Args</em>}</li>
 *   <li>{@link org.eclipse.ecl.interop.commands.ExecProcess#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.eclipse.ecl.interop.commands.ExecProcess#isIgnoreExitCode <em>Ignore Exit Code</em>}</li>
 *   <li>{@link org.eclipse.ecl.interop.commands.ExecProcess#isIgnoreStderr <em>Ignore Stderr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getExecProcess()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Executes shell command.' returns='Captured output from stdout.'"
 * @generated
 */
public interface ExecProcess extends Command {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getExecProcess_Command()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Shell command to execute.'"
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.interop.commands.ExecProcess#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getExecProcess_Args()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='Arguments for the command.'"
	 * @generated
	 */
	EList<String> getArgs();

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getExecProcess_Timeout()
	 * @model default="60"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Timeout period in seconds. Use zero timeout (<code>-timeout 0</code>) for infinite timeout.'"
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.interop.commands.ExecProcess#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Ignore Exit Code</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Exit Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Exit Code</em>' attribute.
	 * @see #setIgnoreExitCode(boolean)
	 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getExecProcess_IgnoreExitCode()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/ecl/docs description='If set to true, command fails with error message if non-zero exit code returned.'"
	 * @generated
	 */
	boolean isIgnoreExitCode();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.interop.commands.ExecProcess#isIgnoreExitCode <em>Ignore Exit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Exit Code</em>' attribute.
	 * @see #isIgnoreExitCode()
	 * @generated
	 */
	void setIgnoreExitCode(boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore Stderr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Stderr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Stderr</em>' attribute.
	 * @see #setIgnoreStderr(boolean)
	 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getExecProcess_IgnoreStderr()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/ecl/docs description='If set to true, command fails with error message if stderr is not empty.'"
	 * @generated
	 */
	boolean isIgnoreStderr();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.interop.commands.ExecProcess#isIgnoreStderr <em>Ignore Stderr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Stderr</em>' attribute.
	 * @see #isIgnoreStderr()
	 * @generated
	 */
	void setIgnoreStderr(boolean value);

} // ExecProcess
