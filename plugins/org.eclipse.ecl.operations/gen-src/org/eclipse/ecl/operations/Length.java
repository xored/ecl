/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.operations.Length#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getLength()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Returns count of objects got from input pipe' returns='Object count' example='emit 1 2 3 | length | equals 3 | verify-true\n\n// verifies that Project item has 10 children\nget-view \"Q7 Explorer\" | get-tree | get-item Project | get-items | length | equals 10 | verify-true'"
 * @generated
 */
public interface Length extends Command {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.eclipse.ecl.operations.OperationsPackage#getLength_Input()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='List of objects to get the length for'"
	 * @generated
	 */
	EList<EObject> getInput();

} // Length
