/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnyObject.java,v 1.1 2010/08/02 09:24:00 andrey Exp $
 */
package org.eclipse.ecl.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Object</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ecl.core.CorePackage#getAnyObject()
 * @model
 * @generated
 */
public interface AnyObject extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Object getObject();
} // AnyObject
