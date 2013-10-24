/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.EclList;
import org.eclipse.ecl.core.Val;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.operations.Each#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.Each#getVal <em>Val</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.Each#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.Each#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getEach()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Iterates over <a href=\"#list\">list</a> or <a href=\"#map\">map</a>. Accepts one or two variable declarations, when only one variable given, it will be hold list elements or map values. A second variable, if provided, used for map keys or list element indices.' example='// Iterate over elements.\nlist 1 2 3 | each [val element] {\n    log [format \"%d\" $element]\n}\n\n// Iterate over elements with indices\nlist 1 2 3 | each [val element] [val index] {\n    log [format \"list[%d] = %d\" $index $element]\n}\n\n// Iterate over map values\nmap [entry \"one\" 1] [entry \"two\" 2] | each [val value] { log [str $value] }\n\n// Iterate over map values with keys\nmap [entry \"one\" 1] [entry \"two\" 2] | each [val v] [val k] { log [concat $k \" = \" [str $v]] }'"
 * @generated
 */
public interface Each extends Command {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(EObject)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getEach_Input()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Map or List'"
	 * @generated
	 */
	EObject getInput();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.Each#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(EObject value);

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
	 * @see org.eclipse.ecl.operations.OperationsPackage#getEach_Val()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Val getVal();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.Each#getVal <em>Val</em>}' containment reference.
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
	 * @see org.eclipse.ecl.operations.OperationsPackage#getEach_Key()
	 * @model containment="true"
	 * @generated
	 */
	Val getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.Each#getKey <em>Key</em>}' containment reference.
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
	 * @see org.eclipse.ecl.operations.OperationsPackage#getEach_Do()
	 * @model containment="true"
	 * @generated
	 */
	Command getDo();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.Each#getDo <em>Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do</em>' containment reference.
	 * @see #getDo()
	 * @generated
	 */
	void setDo(Command value);

} // Each
