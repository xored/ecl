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
/**
 * <copyright>
 * </copyright>
 *
 * $Id: Doc.java,v 1.1 2010/09/01 05:55:59 alena Exp $
 */
package org.eclipse.ecl.model.editing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.model.editing.Doc#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.model.editing.EditingPackage#getDoc()
 * @model
 * @generated
 */
public interface Doc extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.ecl.model.editing.EditingPackage#getDoc_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.model.editing.Doc#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Doc
