/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.data.commands;

import org.eclipse.ecl.core.Command;

import org.eclipse.ecl.data.objects.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Tables Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.data.commands.AssertTablesMatch#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.ecl.data.commands.AssertTablesMatch#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclipse.ecl.data.commands.AssertTablesMatch#isIgnoreColumnOrder <em>Ignore Column Order</em>}</li>
 *   <li>{@link org.eclipse.ecl.data.commands.AssertTablesMatch#getIgnoreMissingColumns <em>Ignore Missing Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.data.commands.CommandsPackage#getAssertTablesMatch()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Compares contents of two tables. If contents are not the same, fails with a descriptive message' example='assert-tables-match [get-editor \"context\" | get-section Parameters | get-table | get-table-data ]\n                    [get-editor \"context2\" | get-section Parameters | get-table | get-table-data]'"
 * @generated
 */
public interface AssertTablesMatch extends Command {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Table)
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getAssertTablesMatch_Left()
	 * @model
	 * @generated
	 */
	Table getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.data.commands.AssertTablesMatch#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Table value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Table)
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getAssertTablesMatch_Right()
	 * @model
	 * @generated
	 */
	Table getRight();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.data.commands.AssertTablesMatch#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Table value);

	/**
	 * Returns the value of the '<em><b>Ignore Column Order</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Column Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Column Order</em>' attribute.
	 * @see #setIgnoreColumnOrder(boolean)
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getAssertTablesMatch_IgnoreColumnOrder()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/ecl/docs description='When true, column order is not taken into account'"
	 * @generated
	 */
	boolean isIgnoreColumnOrder();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.data.commands.AssertTablesMatch#isIgnoreColumnOrder <em>Ignore Column Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Column Order</em>' attribute.
	 * @see #isIgnoreColumnOrder()
	 * @generated
	 */
	void setIgnoreColumnOrder(boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore Missing Columns</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.ecl.data.commands.IgnoreColumnsMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Missing Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Missing Columns</em>' attribute.
	 * @see org.eclipse.ecl.data.commands.IgnoreColumnsMode
	 * @see #setIgnoreMissingColumns(IgnoreColumnsMode)
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getAssertTablesMatch_IgnoreMissingColumns()
	 * @model default="NONE"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Describes the comparison behaviour in case when one of tables contains a column which is not present in other table:\n<ul>\n<li><b>NONE</b> &ndash; all columns must be present in both tables</li>\n<li><b>LEFT</b> &ndash; columns from right table which are not present in left, are ignored</li>\n<li><b>RIGHT</b> &ndash; columns from left table which are not present in right, are ignored</li>\n<li><b>BOTH</b> &ndash; comparison performed only on columns present in both tables</li>\n<p>Another way to interpret this argument is that it is an answer on question &quot;Which column can have less columns?&quot;</p>\n<p>The primary reasoning for this argument is to provide smooth migration when presentation is changed \u2013 consider this scenario: we have a CSV file with table data, and we have UI table. If we add or remove extra columns in the UI, we can keep existing sample data file and just correct the <code>ignoreMissingColumns</code> argument</p>\n'"
	 * @generated
	 */
	IgnoreColumnsMode getIgnoreMissingColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.data.commands.AssertTablesMatch#getIgnoreMissingColumns <em>Ignore Missing Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Missing Columns</em>' attribute.
	 * @see org.eclipse.ecl.data.commands.IgnoreColumnsMode
	 * @see #getIgnoreMissingColumns()
	 * @generated
	 */
	void setIgnoreMissingColumns(IgnoreColumnsMode value);

} // AssertTablesMatch
