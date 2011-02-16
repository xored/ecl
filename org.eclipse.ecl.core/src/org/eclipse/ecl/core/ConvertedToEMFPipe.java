/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConvertedToEMFPipe.java,v 1.1 2011/02/16 06:55:52 alena Exp $
 */
package org.eclipse.ecl.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Converted To EMF Pipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.ConvertedToEMFPipe#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getConvertedToEMFPipe()
 * @model
 * @generated
 */
public interface ConvertedToEMFPipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(EObject)
	 * @see org.eclipse.ecl.core.CorePackage#getConvertedToEMFPipe_Object()
	 * @model containment="true"
	 * @generated
	 */
	EObject getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.ConvertedToEMFPipe#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(EObject value);

} // ConvertedToEMFPipe
