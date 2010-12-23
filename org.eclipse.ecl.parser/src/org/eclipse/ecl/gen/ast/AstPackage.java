/**
 * <copyright>
 * </copyright>
 *
 * $Id: AstPackage.java,v 1.4 2010/12/23 08:12:00 alena Exp $
 */
package org.eclipse.ecl.gen.ast;

import org.eclipse.ecl.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The meta object id for the '{@link org.eclipse.ecl.gen.ast.impl.AstNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.gen.ast.impl.AstNodeImpl
	 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getAstNode()
	 * @generated
	 */
	int AST_NODE = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE__LINE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE__LENGTH = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.gen.ast.impl.AstExecImpl <em>Exec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.gen.ast.impl.AstExecImpl
	 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getAstExec()
	 * @generated
	 */
	int AST_EXEC = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_EXEC__HOST = CorePackage.EXEC__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_EXEC__BINDINGS = CorePackage.EXEC__BINDINGS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_EXEC__NAMESPACE = CorePackage.EXEC__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_EXEC__NAME = CorePackage.EXEC__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_EXEC__PARAMETERS = CorePackage.EXEC__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_EXEC__COLUMN = CorePackage.EXEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_EXEC__LINE = CorePackage.EXEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_EXEC__LENGTH = CorePackage.EXEC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Exec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_EXEC_FEATURE_COUNT = CorePackage.EXEC_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.gen.ast.impl.AstLiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.gen.ast.impl.AstLiteralImpl
	 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getAstLiteral()
	 * @generated
	 */
	int AST_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_LITERAL__NAME = CorePackage.LITERAL_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_LITERAL__LITERAL = CorePackage.LITERAL_PARAMETER__LITERAL;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_LITERAL__FORMAT = CorePackage.LITERAL_PARAMETER__FORMAT;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_LITERAL__COLUMN = CorePackage.LITERAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_LITERAL__LINE = CorePackage.LITERAL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_LITERAL__LENGTH = CorePackage.LITERAL_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_LITERAL_FEATURE_COUNT = CorePackage.LITERAL_PARAMETER_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.gen.ast.impl.LocatedProcessStatusImpl <em>Located Process Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.gen.ast.impl.LocatedProcessStatusImpl
	 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getLocatedProcessStatus()
	 * @generated
	 */
	int LOCATED_PROCESS_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_PROCESS_STATUS__PLUGIN_ID = CorePackage.PROCESS_STATUS__PLUGIN_ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_PROCESS_STATUS__CODE = CorePackage.PROCESS_STATUS__CODE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_PROCESS_STATUS__MESSAGE = CorePackage.PROCESS_STATUS__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_PROCESS_STATUS__SEVERITY = CorePackage.PROCESS_STATUS__SEVERITY;

	/**
	 * The feature id for the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_PROCESS_STATUS__PROCESS_ID = CorePackage.PROCESS_STATUS__PROCESS_ID;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_PROCESS_STATUS__COLUMN = CorePackage.PROCESS_STATUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_PROCESS_STATUS__LINE = CorePackage.PROCESS_STATUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_PROCESS_STATUS__LENGTH = CorePackage.PROCESS_STATUS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Located Process Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_PROCESS_STATUS_FEATURE_COUNT = CorePackage.PROCESS_STATUS_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.gen.ast.AstNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.ecl.gen.ast.AstNode
	 * @generated
	 */
	EClass getAstNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.gen.ast.AstNode#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclipse.ecl.gen.ast.AstNode#getColumn()
	 * @see #getAstNode()
	 * @generated
	 */
	EAttribute getAstNode_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.gen.ast.AstNode#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.eclipse.ecl.gen.ast.AstNode#getLine()
	 * @see #getAstNode()
	 * @generated
	 */
	EAttribute getAstNode_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.gen.ast.AstNode#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.ecl.gen.ast.AstNode#getLength()
	 * @see #getAstNode()
	 * @generated
	 */
	EAttribute getAstNode_Length();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.gen.ast.AstExec <em>Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec</em>'.
	 * @see org.eclipse.ecl.gen.ast.AstExec
	 * @generated
	 */
	EClass getAstExec();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.gen.ast.AstLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclipse.ecl.gen.ast.AstLiteral
	 * @generated
	 */
	EClass getAstLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.gen.ast.LocatedProcessStatus <em>Located Process Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Process Status</em>'.
	 * @see org.eclipse.ecl.gen.ast.LocatedProcessStatus
	 * @generated
	 */
	EClass getLocatedProcessStatus();

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
		 * The meta object literal for the '{@link org.eclipse.ecl.gen.ast.impl.AstNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.gen.ast.impl.AstNodeImpl
		 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getAstNode()
		 * @generated
		 */
		EClass AST_NODE = eINSTANCE.getAstNode();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AST_NODE__COLUMN = eINSTANCE.getAstNode_Column();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AST_NODE__LINE = eINSTANCE.getAstNode_Line();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AST_NODE__LENGTH = eINSTANCE.getAstNode_Length();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.gen.ast.impl.AstExecImpl <em>Exec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.gen.ast.impl.AstExecImpl
		 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getAstExec()
		 * @generated
		 */
		EClass AST_EXEC = eINSTANCE.getAstExec();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.gen.ast.impl.AstLiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.gen.ast.impl.AstLiteralImpl
		 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getAstLiteral()
		 * @generated
		 */
		EClass AST_LITERAL = eINSTANCE.getAstLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.gen.ast.impl.LocatedProcessStatusImpl <em>Located Process Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.gen.ast.impl.LocatedProcessStatusImpl
		 * @see org.eclipse.ecl.gen.ast.impl.AstPackageImpl#getLocatedProcessStatus()
		 * @generated
		 */
		EClass LOCATED_PROCESS_STATUS = eINSTANCE.getLocatedProcessStatus();

	}

} //AstPackage
