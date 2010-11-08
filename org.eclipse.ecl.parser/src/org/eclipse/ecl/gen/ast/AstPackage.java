/**
 * <copyright>
 * </copyright>
 *
 * $Id: AstPackage.java,v 1.2 2010/11/08 08:42:14 alena Exp $
 */
package org.eclipse.ecl.gen.ast;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.gen.ast.AstFactory
 * @model kind="package"
 * @generated
 */
public interface AstPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ecl/ast.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.ecl.ast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstPackage eINSTANCE = org.eclipse.ecl.gen.ast.impl.AstPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.gen.ast.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.gen.ast.impl.NodeImpl
	 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Ast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__AST = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__END = 2;

	/**
	 * The feature id for the '<em><b>Partition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARTITION = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '<em>Ecl Partition</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.parser.EclPartition
	 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getEclPartition()
	 * @generated
	 */
	int ECL_PARTITION = 1;


	/**
	 * The meta object id for the '<em>Ast</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.ast.Ast
	 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getAst()
	 * @generated
	 */
	int AST = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.gen.ast.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.ecl.gen.ast.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.gen.ast.Node#getAst <em>Ast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ast</em>'.
	 * @see org.eclipse.ecl.gen.ast.Node#getAst()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Ast();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.gen.ast.Node#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.eclipse.ecl.gen.ast.Node#getStart()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.gen.ast.Node#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.eclipse.ecl.gen.ast.Node#getEnd()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_End();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ecl.gen.ast.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.eclipse.ecl.gen.ast.Node#getChildren()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.gen.ast.Node#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition</em>'.
	 * @see org.eclipse.ecl.gen.ast.Node#getPartition()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Partition();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ecl.parser.EclPartition <em>Ecl Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ecl Partition</em>'.
	 * @see org.eclipse.ecl.parser.EclPartition
	 * @model instanceClass="org.eclipse.ecl.parser.EclPartition"
	 * @generated
	 */
	EDataType getEclPartition();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ecl.ast.Ast <em>Ast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ast</em>'.
	 * @see org.eclipse.ecl.ast.Ast
	 * @model instanceClass="org.eclipse.ecl.ast.Ast"
	 * @generated
	 */
	EDataType getAst();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AstFactory getAstFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.gen.ast.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.gen.ast.impl.NodeImpl
		 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Ast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__AST = eINSTANCE.getNode_Ast();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__START = eINSTANCE.getNode_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__END = eINSTANCE.getNode_End();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

		/**
		 * The meta object literal for the '<em><b>Partition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PARTITION = eINSTANCE.getNode_Partition();

		/**
		 * The meta object literal for the '<em>Ecl Partition</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.parser.EclPartition
		 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getEclPartition()
		 * @generated
		 */
		EDataType ECL_PARTITION = eINSTANCE.getEclPartition();

		/**
		 * The meta object literal for the '<em>Ast</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.ast.Ast
		 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getAst()
		 * @generated
		 */
		EDataType AST = eINSTANCE.getAst();

	}

} //AstPackage
