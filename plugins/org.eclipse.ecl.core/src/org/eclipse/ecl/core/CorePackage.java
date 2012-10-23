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
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BINDINGS = COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__BINDINGS = BLOCK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__BINDINGS = BLOCK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__BINDINGS = BLOCK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__BINDINGS = COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__OBJECT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH__BINDINGS = COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Do</b></em>' containment reference.
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
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.ProcessStatusImpl <em>Process Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.ProcessStatusImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getProcessStatus()
	 * @generated
	 */
	int PROCESS_STATUS = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.ScriptImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 12;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__HOST = COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATUS__EXCEPTION = 4;

	/**
	 * The number of structural features of the '<em>Process Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STATUS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.ConvertedToEMFPipeImpl <em>Converted To EMF Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.ConvertedToEMFPipeImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getConvertedToEMFPipe()
	 * @generated
	 */
	int CONVERTED_TO_EMF_PIPE = 14;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTED_TO_EMF_PIPE__OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Converted To EMF Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTED_TO_EMF_PIPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.SerializedImpl <em>Serialized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.SerializedImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getSerialized()
	 * @generated
	 */
	int SERIALIZED = 15;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZED__BYTES = 0;

	/**
	 * The number of structural features of the '<em>Serialized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.NullableImpl <em>Nullable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.NullableImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getNullable()
	 * @generated
	 */
	int NULLABLE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULLABLE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULLABLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Nullable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULLABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.IfImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getIf()
	 * @generated
	 */
	int IF = 17;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__HOST = COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BINDINGS = COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.BoxedValueImpl <em>Boxed Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.BoxedValueImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getBoxedValue()
	 * @generated
	 */
	int BOXED_VALUE = 18;

	/**
	 * The number of structural features of the '<em>Boxed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOXED_VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.EclByteImpl <em>Ecl Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.EclByteImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclByte()
	 * @generated
	 */
	int ECL_BYTE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BYTE__VALUE = BOXED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecl Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BYTE_FEATURE_COUNT = BOXED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.EclShortImpl <em>Ecl Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.EclShortImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclShort()
	 * @generated
	 */
	int ECL_SHORT = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_SHORT__VALUE = BOXED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecl Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_SHORT_FEATURE_COUNT = BOXED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.EclStringImpl <em>Ecl String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.EclStringImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclString()
	 * @generated
	 */
	int ECL_STRING = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.EclBooleanImpl <em>Ecl Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.EclBooleanImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclBoolean()
	 * @generated
	 */
	int ECL_BOOLEAN = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.EclCharImpl <em>Ecl Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.EclCharImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclChar()
	 * @generated
	 */
	int ECL_CHAR = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.EclIntegerImpl <em>Ecl Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.EclIntegerImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclInteger()
	 * @generated
	 */
	int ECL_INTEGER = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_INTEGER__VALUE = BOXED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecl Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_INTEGER_FEATURE_COUNT = BOXED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.EclFloatImpl <em>Ecl Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.EclFloatImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclFloat()
	 * @generated
	 */
	int ECL_FLOAT = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.EclLongImpl <em>Ecl Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.EclLongImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclLong()
	 * @generated
	 */
	int ECL_LONG = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_LONG__VALUE = BOXED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecl Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_LONG_FEATURE_COUNT = BOXED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.impl.EclDoubleImpl <em>Ecl Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.impl.EclDoubleImpl
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclDouble()
	 * @generated
	 */
	int ECL_DOUBLE = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOUBLE__VALUE = BOXED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecl Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_DOUBLE_FEATURE_COUNT = BOXED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_FLOAT__VALUE = BOXED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecl Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_FLOAT_FEATURE_COUNT = BOXED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BOOLEAN__VALUE = BOXED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecl Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_BOOLEAN_FEATURE_COUNT = BOXED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_CHAR__VALUE = BOXED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecl Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_CHAR_FEATURE_COUNT = BOXED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_STRING__VALUE = BOXED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecl String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECL_STRING_FEATURE_COUNT = BOXED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Throwable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getThrowable()
	 * @generated
	 */
	int THROWABLE = 28;

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ecl.core.Command#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
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
	 * Returns the meta object for the containment reference '{@link org.eclipse.ecl.core.Binding#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ecl.core.Block#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
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
	 * Returns the meta object for the containment reference '{@link org.eclipse.ecl.core.With#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.eclipse.ecl.core.With#getObject()
	 * @see #getWith()
	 * @generated
	 */
	EReference getWith_Object();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.ecl.core.With#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do</em>'.
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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ecl.core.Exec#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
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
	 * Returns the meta object for the containment reference '{@link org.eclipse.ecl.core.ExecutableParameter#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
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
	 * Returns the meta object for the containment reference '{@link org.eclipse.ecl.core.Foreach#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do</em>'.
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
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.ProcessStatus#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see org.eclipse.ecl.core.ProcessStatus#getException()
	 * @see #getProcessStatus()
	 * @generated
	 */
	EAttribute getProcessStatus_Exception();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.ConvertedToEMFPipe <em>Converted To EMF Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Converted To EMF Pipe</em>'.
	 * @see org.eclipse.ecl.core.ConvertedToEMFPipe
	 * @generated
	 */
	EClass getConvertedToEMFPipe();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.ecl.core.ConvertedToEMFPipe#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.eclipse.ecl.core.ConvertedToEMFPipe#getObject()
	 * @see #getConvertedToEMFPipe()
	 * @generated
	 */
	EReference getConvertedToEMFPipe_Object();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Serialized <em>Serialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serialized</em>'.
	 * @see org.eclipse.ecl.core.Serialized
	 * @generated
	 */
	EClass getSerialized();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.Serialized#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see org.eclipse.ecl.core.Serialized#getBytes()
	 * @see #getSerialized()
	 * @generated
	 */
	EAttribute getSerialized_Bytes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.Nullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nullable</em>'.
	 * @see org.eclipse.ecl.core.Nullable
	 * @generated
	 */
	EClass getNullable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.ecl.core.Nullable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.ecl.core.Nullable#getValue()
	 * @see #getNullable()
	 * @generated
	 */
	EReference getNullable_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.Nullable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.ecl.core.Nullable#getType()
	 * @see #getNullable()
	 * @generated
	 */
	EAttribute getNullable_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see org.eclipse.ecl.core.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.core.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see org.eclipse.ecl.core.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.ecl.core.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.eclipse.ecl.core.If#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.ecl.core.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.eclipse.ecl.core.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.EclString <em>Ecl String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecl String</em>'.
	 * @see org.eclipse.ecl.core.EclString
	 * @generated
	 */
	EClass getEclString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.EclString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.ecl.core.EclString#getValue()
	 * @see #getEclString()
	 * @generated
	 */
	EAttribute getEclString_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.EclBoolean <em>Ecl Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecl Boolean</em>'.
	 * @see org.eclipse.ecl.core.EclBoolean
	 * @generated
	 */
	EClass getEclBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.EclBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.ecl.core.EclBoolean#isValue()
	 * @see #getEclBoolean()
	 * @generated
	 */
	EAttribute getEclBoolean_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.EclChar <em>Ecl Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecl Char</em>'.
	 * @see org.eclipse.ecl.core.EclChar
	 * @generated
	 */
	EClass getEclChar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.EclChar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.ecl.core.EclChar#getValue()
	 * @see #getEclChar()
	 * @generated
	 */
	EAttribute getEclChar_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.EclInteger <em>Ecl Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecl Integer</em>'.
	 * @see org.eclipse.ecl.core.EclInteger
	 * @generated
	 */
	EClass getEclInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.EclInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.ecl.core.EclInteger#getValue()
	 * @see #getEclInteger()
	 * @generated
	 */
	EAttribute getEclInteger_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.EclFloat <em>Ecl Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecl Float</em>'.
	 * @see org.eclipse.ecl.core.EclFloat
	 * @generated
	 */
	EClass getEclFloat();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.EclFloat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.ecl.core.EclFloat#getValue()
	 * @see #getEclFloat()
	 * @generated
	 */
	EAttribute getEclFloat_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.EclLong <em>Ecl Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecl Long</em>'.
	 * @see org.eclipse.ecl.core.EclLong
	 * @generated
	 */
	EClass getEclLong();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.EclLong#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.ecl.core.EclLong#getValue()
	 * @see #getEclLong()
	 * @generated
	 */
	EAttribute getEclLong_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.EclDouble <em>Ecl Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecl Double</em>'.
	 * @see org.eclipse.ecl.core.EclDouble
	 * @generated
	 */
	EClass getEclDouble();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.EclDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.ecl.core.EclDouble#getValue()
	 * @see #getEclDouble()
	 * @generated
	 */
	EAttribute getEclDouble_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.BoxedValue <em>Boxed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boxed Value</em>'.
	 * @see org.eclipse.ecl.core.BoxedValue
	 * @generated
	 */
	EClass getBoxedValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.EclByte <em>Ecl Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecl Byte</em>'.
	 * @see org.eclipse.ecl.core.EclByte
	 * @generated
	 */
	EClass getEclByte();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.EclByte#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.ecl.core.EclByte#getValue()
	 * @see #getEclByte()
	 * @generated
	 */
	EAttribute getEclByte_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.EclShort <em>Ecl Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecl Short</em>'.
	 * @see org.eclipse.ecl.core.EclShort
	 * @generated
	 */
	EClass getEclShort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.EclShort#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.ecl.core.EclShort#getValue()
	 * @see #getEclShort()
	 * @generated
	 */
	EAttribute getEclShort_Value();

	/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EDataType getThrowable();

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
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH__OBJECT = eINSTANCE.getWith_Object();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Do</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STATUS__EXCEPTION = eINSTANCE.getProcessStatus_Exception();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.ConvertedToEMFPipeImpl <em>Converted To EMF Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.ConvertedToEMFPipeImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getConvertedToEMFPipe()
		 * @generated
		 */
		EClass CONVERTED_TO_EMF_PIPE = eINSTANCE.getConvertedToEMFPipe();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERTED_TO_EMF_PIPE__OBJECT = eINSTANCE.getConvertedToEMFPipe_Object();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.SerializedImpl <em>Serialized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.SerializedImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getSerialized()
		 * @generated
		 */
		EClass SERIALIZED = eINSTANCE.getSerialized();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIALIZED__BYTES = eINSTANCE.getSerialized_Bytes();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.NullableImpl <em>Nullable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.NullableImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getNullable()
		 * @generated
		 */
		EClass NULLABLE = eINSTANCE.getNullable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NULLABLE__VALUE = eINSTANCE.getNullable_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULLABLE__TYPE = eINSTANCE.getNullable_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.IfImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN = eINSTANCE.getIf_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.EclStringImpl <em>Ecl String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.EclStringImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclString()
		 * @generated
		 */
		EClass ECL_STRING = eINSTANCE.getEclString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_STRING__VALUE = eINSTANCE.getEclString_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.EclBooleanImpl <em>Ecl Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.EclBooleanImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclBoolean()
		 * @generated
		 */
		EClass ECL_BOOLEAN = eINSTANCE.getEclBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_BOOLEAN__VALUE = eINSTANCE.getEclBoolean_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.EclCharImpl <em>Ecl Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.EclCharImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclChar()
		 * @generated
		 */
		EClass ECL_CHAR = eINSTANCE.getEclChar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_CHAR__VALUE = eINSTANCE.getEclChar_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.EclIntegerImpl <em>Ecl Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.EclIntegerImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclInteger()
		 * @generated
		 */
		EClass ECL_INTEGER = eINSTANCE.getEclInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_INTEGER__VALUE = eINSTANCE.getEclInteger_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.EclFloatImpl <em>Ecl Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.EclFloatImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclFloat()
		 * @generated
		 */
		EClass ECL_FLOAT = eINSTANCE.getEclFloat();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_FLOAT__VALUE = eINSTANCE.getEclFloat_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.EclLongImpl <em>Ecl Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.EclLongImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclLong()
		 * @generated
		 */
		EClass ECL_LONG = eINSTANCE.getEclLong();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_LONG__VALUE = eINSTANCE.getEclLong_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.EclDoubleImpl <em>Ecl Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.EclDoubleImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclDouble()
		 * @generated
		 */
		EClass ECL_DOUBLE = eINSTANCE.getEclDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_DOUBLE__VALUE = eINSTANCE.getEclDouble_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.BoxedValueImpl <em>Boxed Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.BoxedValueImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getBoxedValue()
		 * @generated
		 */
		EClass BOXED_VALUE = eINSTANCE.getBoxedValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.EclByteImpl <em>Ecl Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.EclByteImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclByte()
		 * @generated
		 */
		EClass ECL_BYTE = eINSTANCE.getEclByte();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_BYTE__VALUE = eINSTANCE.getEclByte_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.impl.EclShortImpl <em>Ecl Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.impl.EclShortImpl
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getEclShort()
		 * @generated
		 */
		EClass ECL_SHORT = eINSTANCE.getEclShort();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECL_SHORT__VALUE = eINSTANCE.getEclShort_Value();

		/**
		 * The meta object literal for the '<em>Throwable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see org.eclipse.ecl.core.impl.CorePackageImpl#getThrowable()
		 * @generated
		 */
		EDataType THROWABLE = eINSTANCE.getThrowable();

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

	}

} //CorePackage
