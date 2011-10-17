/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.commands;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.platform.commands.GetLog#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.eclipse.ecl.platform.commands.GetLog#isSkipInfo <em>Skip Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getGetLog()
 * @model
 * @generated
 */
public interface GetLog extends Command {
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

	/**
	 * Returns the value of the '<em><b>Skip Info</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Info</em>' attribute.
	 * @see #setSkipInfo(boolean)
	 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getGetLog_SkipInfo()
	 * @model default="false"
	 * @generated
	 */
	boolean isSkipInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.platform.commands.GetLog#isSkipInfo <em>Skip Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Info</em>' attribute.
	 * @see #isSkipInfo()
	 * @generated
	 */
	void setSkipInfo(boolean value);

} // GetLog
