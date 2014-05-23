/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.ui.commands;

import org.eclipse.ecl.core.Command;

import org.eclipse.ecl.platform.ui.objects.WorkingSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Working Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.platform.ui.commands.DeleteWorkingSet#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.platform.ui.commands.CommandsPackage#getDeleteWorkingSet()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Deletes working set' returns='Nothing' example='list-working-sets | foreach {delete-working-set}'"
 * @generated
 */
public interface DeleteWorkingSet extends Command {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(WorkingSet)
	 * @see org.eclipse.ecl.platform.ui.commands.CommandsPackage#getDeleteWorkingSet_Input()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='Working set object'"
	 * @generated
	 */
	WorkingSet getInput();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.platform.ui.commands.DeleteWorkingSet#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(WorkingSet value);

} // DeleteWorkingSet
