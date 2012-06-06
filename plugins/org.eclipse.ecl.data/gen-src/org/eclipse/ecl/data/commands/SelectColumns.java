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
 * A representation of the model object '<em><b>Select Columns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.data.commands.SelectColumns#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.ecl.data.commands.SelectColumns#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.data.commands.CommandsPackage#getSelectColumns()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Takes a table from input and returns the table containing only columns passed into <code>columns</code> argument.' returns='Copy of input table object with only columns with names listed in <code>columns</code>'"
 * @generated
 */
public interface SelectColumns extends Command {
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
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getSelectColumns_Table()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='Table to take columns from'"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.data.commands.SelectColumns#getTable <em>Table</em>}' reference.
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
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getSelectColumns_Columns()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='Column names to take from table. If given column name is not present in input table, command fails'"
	 * @generated
	 */
	EList<String> getColumns();

} // SelectColumns
