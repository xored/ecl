/**
 * <copyright>
 * </copyright>
 *
 * $Id: GetChildren.java,v 1.1 2010/08/02 09:24:00 andrey Exp $
 */
package org.eclipse.ecl.core;

import org.eclipse.ecl.core.model.Any;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Children</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.GetChildren#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.GetChildren#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getGetChildren()
 * @model
 * @generated
 */
public interface GetChildren extends Command {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(Any)
	 * @see org.eclipse.ecl.core.CorePackage#getGetChildren_Object()
	 * @model dataType="org.eclipse.ecl.core.Any"
	 * @generated
	 */
	Any getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.GetChildren#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Any value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.ecl.core.model.Any}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' attribute list.
	 * @see org.eclipse.ecl.core.CorePackage#getGetChildren_Children()
	 * @model dataType="org.eclipse.ecl.core.Any"
	 * @generated
	 */
	EList<Any> getChildren();

} // GetChildren
