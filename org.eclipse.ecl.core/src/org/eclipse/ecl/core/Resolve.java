/**
 * <copyright>
 * </copyright>
 *
 * $Id: Resolve.java,v 1.1 2010/08/02 09:24:00 andrey Exp $
 */
package org.eclipse.ecl.core;

import org.eclipse.ecl.core.model.Any;
import org.eclipse.ecl.core.model.Ref;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.Resolve#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.Resolve#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getResolve()
 * @model
 * @generated
 */
public interface Resolve extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(Ref)
	 * @see org.eclipse.ecl.core.CorePackage#getResolve_Ref()
	 * @model dataType="org.eclipse.ecl.core.Ref" required="true"
	 * @generated
	 */
	Ref getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.Resolve#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Ref value);

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
	 * @see org.eclipse.ecl.core.CorePackage#getResolve_Object()
	 * @model dataType="org.eclipse.ecl.core.Any"
	 * @generated
	 */
	Any getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.Resolve#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Any value);

} // Resolve
