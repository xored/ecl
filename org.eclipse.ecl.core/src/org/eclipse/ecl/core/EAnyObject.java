/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAnyObject.java,v 1.1 2010/08/02 09:24:00 andrey Exp $
 */
package org.eclipse.ecl.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAny Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.EAnyObject#getEmfObject <em>Emf Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getEAnyObject()
 * @model
 * @generated
 */
public interface EAnyObject extends AnyObject {
	/**
	 * Returns the value of the '<em><b>Emf Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emf Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emf Object</em>' reference.
	 * @see #setEmfObject(EObject)
	 * @see org.eclipse.ecl.core.CorePackage#getEAnyObject_EmfObject()
	 * @model required="true"
	 * @generated
	 */
	EObject getEmfObject();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.EAnyObject#getEmfObject <em>Emf Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emf Object</em>' reference.
	 * @see #getEmfObject()
	 * @generated
	 */
	void setEmfObject(EObject value);

} // EAnyObject
