/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Watch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.Watch#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.Watch#getWhile <em>While</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getWatch()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Watches the state while executing commands.' returns='State difference before and after execution.' example='// assert no new errors while clicking on the button\r\nwatch errorLog {\r\n\tget-button OK | click\r\n} | assert-empty'"
 * @generated
 */
public interface Watch extends Command {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.eclipse.ecl.core.CorePackage#getWatch_Source()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Data source to watch, for example, <code>errorLog</code>.'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.Watch#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>While</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While</em>' reference.
	 * @see #setWhile(Command)
	 * @see org.eclipse.ecl.core.CorePackage#getWatch_While()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='What to execute while watching.'"
	 * @generated
	 */
	Command getWhile();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.Watch#getWhile <em>While</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While</em>' reference.
	 * @see #getWhile()
	 * @generated
	 */
	void setWhile(Command value);

} // Watch
