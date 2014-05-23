/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.commands;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.platform.commands.GetLog#getLevels <em>Levels</em>}</li>
 *   <li>{@link org.eclipse.ecl.platform.commands.GetLog#getLimit <em>Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getGetLog()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Returns log entries sorted by timestamp descending.' returns='Log entries' example='get-log -levels error | as-table-data | write-csv-file \"workspace:/Project/file2.csv\"'"
 * @generated
 */
public interface GetLog extends Command {
	/**
	 * Returns the value of the '<em><b>Levels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Levels</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' attribute list.
	 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getGetLog_Levels()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Log entry severities to show. Any of <code>error</code>, <code>warning</code>, <code>info</code>, <code>OK</code>, <code>Cancel</code> in any letter case.'"
	 * @generated
	 */
	EList<String> getLevels();

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(int)
	 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getGetLog_Limit()
	 * @model default="100"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Number of log entries to get. Default value is 100.'"
	 * @generated
	 */
	int getLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.platform.commands.GetLog#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(int value);

} // GetLog
