/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.data.commands;

import org.eclipse.ecl.core.Command;

import org.eclipse.ecl.data.objects.Table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclude Columns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.data.commands.ExcludeColumns#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.ecl.data.commands.ExcludeColumns#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.data.commands.CommandsPackage#getExcludeColumns()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Takes a table from input and returns the same table which has some columns excluded. ' returns='Copy of input table object without columns with names listed in <code>columns</code>'"
 * @generated
 */
public interface ExcludeColumns extends Command {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getExcludeColumns_Table()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='Table to exclude columns from'"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.data.commands.ExcludeColumns#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute list.
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getExcludeColumns_Columns()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='Column names to exclude from table. It is OK to pass column names which are not present in table'"
	 * @generated
	 */
	EList<String> getColumns();

} // ExcludeColumns
