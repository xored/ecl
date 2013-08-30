/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.debug.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skip All Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.debug.model.SkipAllEvent#isSkip <em>Skip</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.debug.model.ModelPackage#getSkipAllEvent()
 * @model
 * @generated
 */
public interface SkipAllEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Skip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip</em>' attribute.
	 * @see #setSkip(boolean)
	 * @see org.eclipse.ecl.debug.model.ModelPackage#getSkipAllEvent_Skip()
	 * @model
	 * @generated
	 */
	boolean isSkip();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.debug.model.SkipAllEvent#isSkip <em>Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip</em>' attribute.
	 * @see #isSkip()
	 * @generated
	 */
	void setSkip(boolean value);

} // SkipAllEvent
