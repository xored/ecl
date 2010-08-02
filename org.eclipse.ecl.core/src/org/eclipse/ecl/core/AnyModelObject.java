/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnyModelObject.java,v 1.1 2010/08/02 09:24:01 andrey Exp $
 */
package org.eclipse.ecl.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Model Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.AnyModelObject#getJavaObject <em>Java Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getAnyModelObject()
 * @model
 * @generated
 */
public interface AnyModelObject extends AnyObject {
	/**
	 * Returns the value of the '<em><b>Java Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Object</em>' attribute.
	 * @see #setJavaObject(Object)
	 * @see org.eclipse.ecl.core.CorePackage#getAnyModelObject_JavaObject()
	 * @model required="true"
	 * @generated
	 */
	Object getJavaObject();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.AnyModelObject#getJavaObject <em>Java Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Object</em>' attribute.
	 * @see #getJavaObject()
	 * @generated
	 */
	void setJavaObject(Object value);

} // AnyModelObject
