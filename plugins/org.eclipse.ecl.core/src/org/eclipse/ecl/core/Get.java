/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.Get#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.Get#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.Get#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getGet()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Depending on input object, either returns a value by key from <a href=\"#map\">map</a>, or element by index from <a href=\"#list\">list</a>, or member of EMF object by name.' example='//types 1 into  log\nemit \"1\" \"2\" \"3\" | to-list | get 0 | str | log\n//types Febuary into log\nmap [entry 1 January][entry 2 Febuary] | get 2 | log'"
 * @generated
 */
public interface Get extends Command {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(EObject)
	 * @see org.eclipse.ecl.core.CorePackage#getGet_Input()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Object to get a value from'"
	 * @generated
	 */
	EObject getInput();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.Get#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(EObject value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(EObject)
	 * @see org.eclipse.ecl.core.CorePackage#getGet_Key()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Depending on an input object either a key in a map, or index in a list, or name of a feature/attribute of EMF object'"
	 * @generated
	 */
	EObject getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.Get#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(EObject value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(EObject)
	 * @see org.eclipse.ecl.core.CorePackage#getGet_Default()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Value to return if input object does not contain value by requested key'"
	 * @generated
	 */
	EObject getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.Get#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(EObject value);

} // Get
