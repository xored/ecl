/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.data.commands;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As Table Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.data.commands.AsTableData#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.data.commands.CommandsPackage#getAsTableData()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Converts its input to table data format, exactly the same as <code>get-table-data</code> returns.' returns='Table data.'"
 * @generated
 */
public interface AsTableData extends Command {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getAsTableData_Input()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='Object(s) to convert from.'"
	 * @generated
	 */
	EList<EObject> getInput();

} // AsTableData
