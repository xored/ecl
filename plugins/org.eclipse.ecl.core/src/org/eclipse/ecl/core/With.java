/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.With#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.With#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getWith()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Writes an <code>object</code> to input pipe and executes a given <code>do</code> command ' returns='Output of a <code>do</code> command' example='A | B\nA | C\n// is equivalent to:\nwith [A] {\n  B\n  C\n}'"
 * @generated
 */
public interface With extends Command {
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
	 * @see org.eclipse.ecl.core.CorePackage#getWith_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EObject getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.With#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(EObject value);

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
	 * @see org.eclipse.ecl.core.CorePackage#getWith_Do()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Command getDo();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.With#getDo <em>Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do</em>' containment reference.
	 * @see #getDo()
	 * @generated
	 */
	void setDo(Command value);

} // With
