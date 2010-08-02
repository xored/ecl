/**
 * <copyright>
 * </copyright>
 *
 * $Id: With.java,v 1.1 2010/08/02 09:24:00 andrey Exp $
 */
package org.eclipse.ecl.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.With#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.With#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getWith()
 * @model
 * @generated
 */
public interface With extends Command {

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(Command)
	 * @see org.eclipse.ecl.core.CorePackage#getWith_Object()
	 * @model required="true"
	 * @generated
	 */
	Command getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.With#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Command value);

	/**
	 * Returns the value of the '<em><b>Do</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' reference.
	 * @see #setDo(Command)
	 * @see org.eclipse.ecl.core.CorePackage#getWith_Do()
	 * @model required="true"
	 * @generated
	 */
	Command getDo();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.With#getDo <em>Do</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do</em>' reference.
	 * @see #getDo()
	 * @generated
	 */
	void setDo(Command value);
} // With
