/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Val;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.operations.Repeat#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.Repeat#getTimes <em>Times</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.Repeat#getCommand <em>Command</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.Repeat#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getRepeat()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Execute specified command multiple times.' returns='Aggregated command output'"
 * @generated
 */
public interface Repeat extends Command {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Val)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getRepeat_Index()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Optional value declaration to hold a current index'"
	 * @generated
	 */
	Val getIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.Repeat#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Val value);

	/**
	 * Returns the value of the '<em><b>Times</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times</em>' attribute.
	 * @see #setTimes(int)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getRepeat_Times()
	 * @model default="1"
	 * @generated
	 */
	int getTimes();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.Repeat#getTimes <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Times</em>' attribute.
	 * @see #getTimes()
	 * @generated
	 */
	void setTimes(int value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getRepeat_Command()
	 * @model
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.Repeat#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(int)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getRepeat_Delay()
	 * @model default="0"
	 * @generated
	 */
	int getDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.Repeat#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(int value);

} // Repeat
