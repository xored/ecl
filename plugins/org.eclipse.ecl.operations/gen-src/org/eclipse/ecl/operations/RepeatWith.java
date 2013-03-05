/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.operations.RepeatWith#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.RepeatWith#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getRepeatWith()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Takes list of commands from input pipe and single command as argument and executes them in following order: \n<pre>\ncommand-from-input-1 | command-from-arg\ncommand-from-input-2 | command-from-arg\n...\n</pre>' returns='Aggregated output of command from argument' example='// executes commands:\r\n// echo 1 | gt 2\r\n// echo 2 | gt 2\r\n// echo 3 | gt 2\r\n// output: false, false, true\r\nemit { echo 1}, { echo 2}, { echo 3} | repeat-with { gt 2 } '"
 * @generated
 */
public interface RepeatWith extends Command {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see org.eclipse.ecl.operations.OperationsPackage#getRepeatWith_Commands()
	 * @model
	 * @generated
	 */
	EList<EObject> getCommands();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getRepeatWith_Command()
	 * @model
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.RepeatWith#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

} // RepeatWith
