/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.If#isCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.If#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.If#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getIf()
 * @model
 * @generated
 */
public interface If extends Command {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(boolean)
	 * @see org.eclipse.ecl.core.CorePackage#getIf_Condition()
	 * @model
	 * @generated
	 */
	boolean isCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.If#isCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #isCondition()
	 * @generated
	 */
	void setCondition(boolean value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Command)
	 * @see org.eclipse.ecl.core.CorePackage#getIf_Then()
	 * @model containment="true"
	 * @generated
	 */
	Command getThen();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.If#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Command value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Command)
	 * @see org.eclipse.ecl.core.CorePackage#getIf_Else()
	 * @model containment="true"
	 * @generated
	 */
	Command getElse();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.If#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Command value);

} // If
