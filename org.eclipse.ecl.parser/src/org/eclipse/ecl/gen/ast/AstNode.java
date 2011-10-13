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
 * $Id: AstNode.java,v 1.3 2011/02/17 09:31:02 alena Exp $
 */
package org.eclipse.ecl.gen.ast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.gen.ast.AstNode#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.AstNode#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.AstNode#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.gen.ast.AstPackage#getAstNode()
 * @model
 * @generated
 */
public interface AstNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(int)
	 * @see org.eclipse.ecl.gen.ast.AstPackage#getAstNode_Column()
	 * @model derived="true"
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.gen.ast.AstNode#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see org.eclipse.ecl.gen.ast.AstPackage#getAstNode_Line()
	 * @model derived="true"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.gen.ast.AstNode#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.eclipse.ecl.gen.ast.AstPackage#getAstNode_Length()
	 * @model derived="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.gen.ast.AstNode#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // AstNode
