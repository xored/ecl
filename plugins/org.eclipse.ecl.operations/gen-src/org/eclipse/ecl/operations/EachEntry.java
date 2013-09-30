/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.EclMap;
import org.eclipse.ecl.core.Val;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Each Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.operations.EachEntry#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.EachEntry#getVal <em>Val</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.EachEntry#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.EachEntry#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getEachEntry()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Iterates over a map. ' example='// Iterate over keys and values.\n// Writes \'one = 1\' and \'two = 2\' into eclipse log\nmap [entry one 1] [entry two 2] | each-entry [val key] [val value] {\n    log [format \"%s = %d\" $key $value]\n}\n\n// Iterate over values only\nmap [entry one 1] [entry two 2] | each-entry [val value] { log [format \"%d\" $value] }'"
 * @generated
 */
public interface EachEntry extends Command {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(EclMap)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getEachEntry_Input()
	 * @model required="true"
	 * @generated
	 */
	EclMap getInput();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.EachEntry#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(EclMap value);

	/**
	 * Returns the value of the '<em><b>Val</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' containment reference.
	 * @see #setVal(Val)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getEachEntry_Val()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Val getVal();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.EachEntry#getVal <em>Val</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' containment reference.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(Val value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(Val)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getEachEntry_Key()
	 * @model containment="true"
	 * @generated
	 */
	Val getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.EachEntry#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Val value);

	/**
	 * Returns the value of the '<em><b>Do</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' containment reference.
	 * @see #setDo(Command)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getEachEntry_Do()
	 * @model containment="true"
	 * @generated
	 */
	Command getDo();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.EachEntry#getDo <em>Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do</em>' containment reference.
	 * @see #getDo()
	 * @generated
	 */
	void setDo(Command value);

} // EachEntry
