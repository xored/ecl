/**
 * <copyright>
 * </copyright>
 *
 * $Id: Node.java,v 1.2 2010/11/08 08:42:14 alena Exp $
 */
package org.eclipse.ecl.gen.ast;

import org.eclipse.ecl.ast.Ast;
import org.eclipse.ecl.parser.EclPartition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.gen.ast.Node#getAst <em>Ast</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.Node#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.Node#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.Node#getPartition <em>Partition</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.Node#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.gen.ast.AstPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Ast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ast</em>' attribute.
	 * @see #setAst(Ast)
	 * @see org.eclipse.ecl.gen.ast.AstPackage#getNode_Ast()
	 * @model dataType="org.eclipse.ecl.gen.ast.Ast"
	 * @generated
	 */
	Ast getAst();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.gen.ast.Node#getAst <em>Ast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ast</em>' attribute.
	 * @see #getAst()
	 * @generated
	 */
	void setAst(Ast value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see org.eclipse.ecl.gen.ast.AstPackage#getNode_Start()
	 * @model
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.gen.ast.Node#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(int)
	 * @see org.eclipse.ecl.gen.ast.AstPackage#getNode_End()
	 * @model
	 * @generated
	 */
	int getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.gen.ast.Node#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(int value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ecl.gen.ast.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.eclipse.ecl.gen.ast.AstPackage#getNode_Children()
	 * @model changeable="false"
	 * @generated
	 */
	EList<Node> getChildren();

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition</em>' attribute.
	 * @see #setPartition(EclPartition)
	 * @see org.eclipse.ecl.gen.ast.AstPackage#getNode_Partition()
	 * @model dataType="org.eclipse.ecl.gen.ast.EclPartition"
	 * @generated
	 */
	EclPartition getPartition();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.gen.ast.Node#getPartition <em>Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition</em>' attribute.
	 * @see #getPartition()
	 * @generated
	 */
	void setPartition(EclPartition value);

} // Node
