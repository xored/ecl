/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.interop;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.interop.Invoke#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.ecl.interop.Invoke#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.ecl.interop.Invoke#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.interop.InteropPackage#getInvoke()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Invokes method on Java object.' returns='Value returned by method.'"
 * @generated
 */
public interface Invoke extends Command {
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
	 * @see org.eclipse.ecl.interop.InteropPackage#getInvoke_Object()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Object to call the method on.'"
	 * @generated
	 */
	Object getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.interop.Invoke#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Object value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.ecl.interop.InteropPackage#getInvoke_Name()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Name of the method to call. As a useful addtion, there are three pseudo-methods for arrays: <code>get <i>index</i></code>, <code>set <i>index value</i></code> and <code>length</code>.'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.interop.Invoke#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see org.eclipse.ecl.interop.InteropPackage#getInvoke_Args()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Variable number of arguments to the method.'"
	 * @generated
	 */
	EList<Object> getArgs();

} // Invoke
