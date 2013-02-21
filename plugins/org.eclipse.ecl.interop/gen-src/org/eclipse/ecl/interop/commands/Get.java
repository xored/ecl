/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.interop.commands;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.interop.commands.Get#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.ecl.interop.commands.Get#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getGet()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Gets the property value of an object.' returns='Property value.'"
 * @generated
 */
public interface Get extends Command {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(Object)
	 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getGet_Object()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Object to the get property value from.'"
	 * @generated
	 */
	Object getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.interop.commands.Get#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Object value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.eclipse.ecl.interop.commands.CommandsPackage#getGet_PropertyName()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Name of the property to get the value for.'"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.interop.commands.Get#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

} // Get
