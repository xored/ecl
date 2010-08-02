/**
 * <copyright>
 * </copyright>
 *
 * $Id: DefineCommand.java,v 1.1 2010/08/02 09:24:00 andrey Exp $
 */
package org.eclipse.ecl.core;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.DefineCommand#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.DefineCommand#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getDefineCommand()
 * @model
 * @generated
 */
public interface DefineCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(EClass)
	 * @see org.eclipse.ecl.core.CorePackage#getDefineCommand_Message()
	 * @model required="true"
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.DefineCommand#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(EClass value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see org.eclipse.ecl.core.CorePackage#getDefineCommand_Script()
	 * @model dataType="org.eclipse.ecl.core.EScript"
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.DefineCommand#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

} // DefineCommand
