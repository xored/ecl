/**
 * <copyright>
 * </copyright>
 *
 * $Id: CorePackage.java,v 1.3 2010/10/31 12:47:44 alena Exp $
 */
package org.eclipse.ecl.core;

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
 * @see org.eclipse.ecl.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ecl/core.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.ecl.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.eclipse.ecl.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.CommandImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__HOST = 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__BINDINGS = 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.BindingImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.BlockImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__HOST = COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BINDINGS = COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__COMMANDS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.PipelineImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__HOST = BLOCK__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__BINDINGS = BLOCK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__COMMANDS = BLOCK__COMMANDS;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.SequenceImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__HOST = BLOCK__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__BINDINGS = BLOCK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__COMMANDS = BLOCK__COMMANDS;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.ParallelImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__HOST = BLOCK__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__BINDINGS = BLOCK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__COMMANDS = BLOCK__COMMANDS;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.WithImpl <em>With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.WithImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getWith()
	 * @generated
	 */
	int WITH = 6;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__HOST = COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__BINDINGS = COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__OBJECT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__DO = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.ExecImpl <em>Exec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.ExecImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getExec()
	 * @generated
	 */
	int EXEC = 7;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC__HOST = COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC__BINDINGS = COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC__NAMESPACE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC__NAME = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC__PARAMETERS = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Exec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.ParameterImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.ExecutableParameterImpl <em>Executable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.ExecutableParameterImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getExecutableParameter()
	 * @generated
	 */
	int EXECUTABLE_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_PARAMETER__COMMAND = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.LiteralParameterImpl <em>Literal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.LiteralParameterImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getLiteralParameter()
	 * @generated
	 */
	int LITERAL_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_PARAMETER__LITERAL = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_PARAMETER__FORMAT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.ForeachImpl <em>Foreach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.ForeachImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getForeach()
	 * @generated
	 */
	int FOREACH = 11;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH__HOST = COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH__BINDINGS = COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Do</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH__DO = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH__INPUT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Foreach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.DefineCommandImpl <em>Define Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.DefineCommandImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getDefineCommand()
	 * @generated
	 */
	int DEFINE_COMMAND = 12;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_COMMAND__HOST = COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_COMMAND__BINDINGS = COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_COMMAND__MESSAGE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_COMMAND__SCRIPT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Define Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.GetChildrenImpl <em>Get Children</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.GetChildrenImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getGetChildren()
	 * @generated
	 */
	int GET_CHILDREN = 13;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CHILDREN__HOST = COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CHILDREN__BINDINGS = COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CHILDREN__OBJECT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CHILDREN__CHILDREN = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get Children</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CHILDREN_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.AnyObjectImpl <em>Any Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.AnyObjectImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getAnyObject()
	 * @generated
	 */
	int ANY_OBJECT = 14;

	/**
	 * The number of structural features of the '<em>Any Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.EAnyObjectImpl <em>EAny Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.EAnyObjectImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEAnyObject()
	 * @generated
	 */
	int EANY_OBJECT = 15;

	/**
	 * The feature id for the '<em><b>Emf Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANY_OBJECT__EMF_OBJECT = ANY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAny Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANY_OBJECT_FEATURE_COUNT = ANY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.AnyModelObjectImpl <em>Any Model Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.AnyModelObjectImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getAnyModelObject()
	 * @generated
	 */
	int ANY_MODEL_OBJECT = 16;

	/**
	 * The feature id for the '<em><b>Java Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MODEL_OBJECT__JAVA_OBJECT = ANY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Any Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MODEL_OBJECT_FEATURE_COUNT = ANY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.ResolveImpl <em>Resolve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.ResolveImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getResolve()
	 * @generated
	 */
	int RESOLVE = 17;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE__REF = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Resolve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.ProcessStatusImpl <em>Process Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.ProcessStatusImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getProcessStatus()
	 * @generated
	 */
	int PROCESS_STATUS = 18;

	/**
	 * The feature id for the '<em><b>Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATUS__PLUGIN_ID = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATUS__CODE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATUS__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATUS__SEVERITY = 3;

	/**
	 * The feature id for the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATUS__PROCESS_ID = 4;

	/**
	 * The number of structural features of the '<em>Process Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATUS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.ScriptImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 19;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__HOST = COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__BINDINGS = COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__CONTENT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>EScript</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEScript()
	 * @generated
	 */
	int ESCRIPT = 20;

	/**
	 * The meta object id for the '<em>Any</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.model.Any
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getAny()
	 * @generated
	 */
	int ANY = 21;

	/**
	 * The meta object id for the '<em>Ref</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.model.Ref
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getRef()
	 * @generated
	 */
	int REF = 22;

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see org.eclipse.ecl.core.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.Command#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.eclipse.ecl.core.Command#getHost()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Host();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ecl.core.Command#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bindings</em>'.
	 * @see org.eclipse.ecl.core.Command#getBindings()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Bindings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see org.eclipse.ecl.core.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.core.Binding#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.ecl.core.Binding#getFeature()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Feature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.core.Binding#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see org.eclipse.ecl.core.Binding#getCommand()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Command();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.eclipse.ecl.core.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ecl.core.Block#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see org.eclipse.ecl.core.Block#getCommands()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Commands();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see org.eclipse.ecl.core.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.eclipse.ecl.core.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see org.eclipse.ecl.core.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.With <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>With</em>'.
	 * @see org.eclipse.ecl.core.With
	 * @generated
	 */
	EClass getWith();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.core.With#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.eclipse.ecl.core.With#getObject()
	 * @see #getWith()
	 * @generated
	 */
	EReference getWith_Object();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.core.With#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Do</em>'.
	 * @see org.eclipse.ecl.core.With#getDo()
	 * @see #getWith()
	 * @generated
	 */
	EReference getWith_Do();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Exec <em>Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec</em>'.
	 * @see org.eclipse.ecl.core.Exec
	 * @generated
	 */
	EClass getExec();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.Exec#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.eclipse.ecl.core.Exec#getNamespace()
	 * @see #getExec()
	 * @generated
	 */
	EAttribute getExec_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.Exec#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.ecl.core.Exec#getName()
	 * @see #getExec()
	 * @generated
	 */
	EAttribute getExec_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ecl.core.Exec#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.eclipse.ecl.core.Exec#getParameters()
	 * @see #getExec()
	 * @generated
	 */
	EReference getExec_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.ecl.core.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.ecl.core.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.ExecutableParameter <em>Executable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Parameter</em>'.
	 * @see org.eclipse.ecl.core.ExecutableParameter
	 * @generated
	 */
	EClass getExecutableParameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.core.ExecutableParameter#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see org.eclipse.ecl.core.ExecutableParameter#getCommand()
	 * @see #getExecutableParameter()
	 * @generated
	 */
	EReference getExecutableParameter_Command();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.LiteralParameter <em>Literal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Parameter</em>'.
	 * @see org.eclipse.ecl.core.LiteralParameter
	 * @generated
	 */
	EClass getLiteralParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.LiteralParameter#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see org.eclipse.ecl.core.LiteralParameter#getLiteral()
	 * @see #getLiteralParameter()
	 * @generated
	 */
	EAttribute getLiteralParameter_Literal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.LiteralParameter#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.eclipse.ecl.core.LiteralParameter#getFormat()
	 * @see #getLiteralParameter()
	 * @generated
	 */
	EAttribute getLiteralParameter_Format();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Foreach <em>Foreach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreach</em>'.
	 * @see org.eclipse.ecl.core.Foreach
	 * @generated
	 */
	EClass getForeach();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.core.Foreach#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Do</em>'.
	 * @see org.eclipse.ecl.core.Foreach#getDo()
	 * @see #getForeach()
	 * @generated
	 */
	EReference getForeach_Do();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ecl.core.Foreach#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see org.eclipse.ecl.core.Foreach#getInput()
	 * @see #getForeach()
	 * @generated
	 */
	EReference getForeach_Input();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.DefineCommand <em>Define Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define Command</em>'.
	 * @see org.eclipse.ecl.core.DefineCommand
	 * @generated
	 */
	EClass getDefineCommand();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.core.DefineCommand#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see org.eclipse.ecl.core.DefineCommand#getMessage()
	 * @see #getDefineCommand()
	 * @generated
	 */
	EReference getDefineCommand_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.DefineCommand#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.eclipse.ecl.core.DefineCommand#getScript()
	 * @see #getDefineCommand()
	 * @generated
	 */
	EAttribute getDefineCommand_Script();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.GetChildren <em>Get Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Children</em>'.
	 * @see org.eclipse.ecl.core.GetChildren
	 * @generated
	 */
	EClass getGetChildren();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.GetChildren#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.eclipse.ecl.core.GetChildren#getObject()
	 * @see #getGetChildren()
	 * @generated
	 */
	EAttribute getGetChildren_Object();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.ecl.core.GetChildren#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Children</em>'.
	 * @see org.eclipse.ecl.core.GetChildren#getChildren()
	 * @see #getGetChildren()
	 * @generated
	 */
	EAttribute getGetChildren_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.AnyObject <em>Any Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Object</em>'.
	 * @see org.eclipse.ecl.core.AnyObject
	 * @generated
	 */
	EClass getAnyObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.EAnyObject <em>EAny Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAny Object</em>'.
	 * @see org.eclipse.ecl.core.EAnyObject
	 * @generated
	 */
	EClass getEAnyObject();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.core.EAnyObject#getEmfObject <em>Emf Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emf Object</em>'.
	 * @see org.eclipse.ecl.core.EAnyObject#getEmfObject()
	 * @see #getEAnyObject()
	 * @generated
	 */
	EReference getEAnyObject_EmfObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.AnyModelObject <em>Any Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Model Object</em>'.
	 * @see org.eclipse.ecl.core.AnyModelObject
	 * @generated
	 */
	EClass getAnyModelObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.AnyModelObject#getJavaObject <em>Java Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Object</em>'.
	 * @see org.eclipse.ecl.core.AnyModelObject#getJavaObject()
	 * @see #getAnyModelObject()
	 * @generated
	 */
	EAttribute getAnyModelObject_JavaObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Resolve <em>Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve</em>'.
	 * @see org.eclipse.ecl.core.Resolve
	 * @generated
	 */
	EClass getResolve();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.Resolve#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.eclipse.ecl.core.Resolve#getRef()
	 * @see #getResolve()
	 * @generated
	 */
	EAttribute getResolve_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.Resolve#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.eclipse.ecl.core.Resolve#getObject()
	 * @see #getResolve()
	 * @generated
	 */
	EAttribute getResolve_Object();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.ProcessStatus <em>Process Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Status</em>'.
	 * @see org.eclipse.ecl.core.ProcessStatus
	 * @generated
	 */
	EClass getProcessStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.ProcessStatus#getPluginId <em>Plugin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Id</em>'.
	 * @see org.eclipse.ecl.core.ProcessStatus#getPluginId()
	 * @see #getProcessStatus()
	 * @generated
	 */
	EAttribute getProcessStatus_PluginId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.ProcessStatus#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.ecl.core.ProcessStatus#getCode()
	 * @see #getProcessStatus()
	 * @generated
	 */
	EAttribute getProcessStatus_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.ProcessStatus#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.ecl.core.ProcessStatus#getMessage()
	 * @see #getProcessStatus()
	 * @generated
	 */
	EAttribute getProcessStatus_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.ProcessStatus#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.ecl.core.ProcessStatus#getSeverity()
	 * @see #getProcessStatus()
	 * @generated
	 */
	EAttribute getProcessStatus_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.ProcessStatus#getProcessId <em>Process Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Id</em>'.
	 * @see org.eclipse.ecl.core.ProcessStatus#getProcessId()
	 * @see #getProcessStatus()
	 * @generated
	 */
	EAttribute getProcessStatus_ProcessId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see org.eclipse.ecl.core.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.Script#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.eclipse.ecl.core.Script#getContent()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Content();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EScript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EScript</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getEScript();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ecl.core.model.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Any</em>'.
	 * @see org.eclipse.ecl.core.model.Any
	 * @model instanceClass="org.eclipse.ecl.core.model.Any"
	 * @generated
	 */
	EDataType getAny();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ecl.core.model.Ref <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ref</em>'.
	 * @see org.eclipse.ecl.core.model.Ref
	 * @model instanceClass="org.eclipse.ecl.core.model.Ref"
	 * @generated
	 */
	EDataType getRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.CommandImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();
		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__HOST = eINSTANCE.getCommand_Host();
		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__BINDINGS = eINSTANCE.getCommand_Bindings();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.BindingImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();
		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__FEATURE = eINSTANCE.getBinding_Feature();
		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__COMMAND = eINSTANCE.getBinding_Command();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.BlockImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();
		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__COMMANDS = eINSTANCE.getBlock_Commands();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.PipelineImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.SequenceImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.ParallelImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.WithImpl <em>With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.WithImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getWith()
		 * @generated
		 */
		EClass WITH = eINSTANCE.getWith();
		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH__OBJECT = eINSTANCE.getWith_Object();
		/**
		 * The meta object literal for the '<em><b>Do</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH__DO = eINSTANCE.getWith_Do();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.ExecImpl <em>Exec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.ExecImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getExec()
		 * @generated
		 */
		EClass EXEC = eINSTANCE.getExec();
		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC__NAMESPACE = eINSTANCE.getExec_Namespace();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC__NAME = eINSTANCE.getExec_Name();
		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC__PARAMETERS = eINSTANCE.getExec_Parameters();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.ParameterImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.ExecutableParameterImpl <em>Executable Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.ExecutableParameterImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getExecutableParameter()
		 * @generated
		 */
		EClass EXECUTABLE_PARAMETER = eINSTANCE.getExecutableParameter();
		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_PARAMETER__COMMAND = eINSTANCE.getExecutableParameter_Command();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.LiteralParameterImpl <em>Literal Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.LiteralParameterImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getLiteralParameter()
		 * @generated
		 */
		EClass LITERAL_PARAMETER = eINSTANCE.getLiteralParameter();
		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_PARAMETER__LITERAL = eINSTANCE.getLiteralParameter_Literal();
		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_PARAMETER__FORMAT = eINSTANCE.getLiteralParameter_Format();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.ForeachImpl <em>Foreach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.ForeachImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getForeach()
		 * @generated
		 */
		EClass FOREACH = eINSTANCE.getForeach();
		/**
		 * The meta object literal for the '<em><b>Do</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREACH__DO = eINSTANCE.getForeach_Do();
		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREACH__INPUT = eINSTANCE.getForeach_Input();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.DefineCommandImpl <em>Define Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.DefineCommandImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getDefineCommand()
		 * @generated
		 */
		EClass DEFINE_COMMAND = eINSTANCE.getDefineCommand();
		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE_COMMAND__MESSAGE = eINSTANCE.getDefineCommand_Message();
		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINE_COMMAND__SCRIPT = eINSTANCE.getDefineCommand_Script();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.GetChildrenImpl <em>Get Children</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.GetChildrenImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getGetChildren()
		 * @generated
		 */
		EClass GET_CHILDREN = eINSTANCE.getGetChildren();
		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CHILDREN__OBJECT = eINSTANCE.getGetChildren_Object();
		/**
		 * The meta object literal for the '<em><b>Children</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CHILDREN__CHILDREN = eINSTANCE.getGetChildren_Children();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.AnyObjectImpl <em>Any Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.AnyObjectImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getAnyObject()
		 * @generated
		 */
		EClass ANY_OBJECT = eINSTANCE.getAnyObject();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.EAnyObjectImpl <em>EAny Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.EAnyObjectImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEAnyObject()
		 * @generated
		 */
		EClass EANY_OBJECT = eINSTANCE.getEAnyObject();
		/**
		 * The meta object literal for the '<em><b>Emf Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANY_OBJECT__EMF_OBJECT = eINSTANCE.getEAnyObject_EmfObject();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.AnyModelObjectImpl <em>Any Model Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.AnyModelObjectImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getAnyModelObject()
		 * @generated
		 */
		EClass ANY_MODEL_OBJECT = eINSTANCE.getAnyModelObject();
		/**
		 * The meta object literal for the '<em><b>Java Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_MODEL_OBJECT__JAVA_OBJECT = eINSTANCE.getAnyModelObject_JavaObject();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.ResolveImpl <em>Resolve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.ResolveImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getResolve()
		 * @generated
		 */
		EClass RESOLVE = eINSTANCE.getResolve();
		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE__REF = eINSTANCE.getResolve_Ref();
		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE__OBJECT = eINSTANCE.getResolve_Object();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.ProcessStatusImpl <em>Process Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.ProcessStatusImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getProcessStatus()
		 * @generated
		 */
		EClass PROCESS_STATUS = eINSTANCE.getProcessStatus();
		/**
		 * The meta object literal for the '<em><b>Plugin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STATUS__PLUGIN_ID = eINSTANCE.getProcessStatus_PluginId();
		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STATUS__CODE = eINSTANCE.getProcessStatus_Code();
		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STATUS__MESSAGE = eINSTANCE.getProcessStatus_Message();
		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STATUS__SEVERITY = eINSTANCE.getProcessStatus_Severity();
		/**
		 * The meta object literal for the '<em><b>Process Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STATUS__PROCESS_ID = eINSTANCE.getProcessStatus_ProcessId();
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.ScriptImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();
		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__CONTENT = eINSTANCE.getScript_Content();
		/**
		 * The meta object literal for the '<em>EScript</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEScript()
		 * @generated
		 */
		EDataType ESCRIPT = eINSTANCE.getEScript();
		/**
		 * The meta object literal for the '<em>Any</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.model.Any
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getAny()
		 * @generated
		 */
		EDataType ANY = eINSTANCE.getAny();
		/**
		 * The meta object literal for the '<em>Ref</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.model.Ref
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getRef()
		 * @generated
		 */
		EDataType REF = eINSTANCE.getRef();

	}

} //CorePackage
