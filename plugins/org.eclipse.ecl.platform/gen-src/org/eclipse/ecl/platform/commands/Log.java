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
 * A representation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.platform.commands.Log#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.ecl.platform.commands.Log#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.ecl.platform.commands.Log#getPlugin <em>Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getLog()
 * @model
 * @generated
 */
public interface Log extends Command {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The default value is <code>"info"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getLog_Severity()
	 * @model default="info"
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.platform.commands.Log#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getLog_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.platform.commands.Log#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Plugin</b></em>' attribute.
	 * The default value is <code>"org.eclipse.ecl.platform"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin</em>' attribute.
	 * @see #setPlugin(String)
	 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getLog_Plugin()
	 * @model default="org.eclipse.ecl.platform"
	 * @generated
	 */
	String getPlugin();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.platform.commands.Log#getPlugin <em>Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin</em>' attribute.
	 * @see #getPlugin()
	 * @generated
	 */
	void setPlugin(String value);

} // Log
