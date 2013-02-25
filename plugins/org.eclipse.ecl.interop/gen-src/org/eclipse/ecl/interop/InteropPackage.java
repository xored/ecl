/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.interop;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.ecl.interop.InteropFactory
 * @model kind="package"
 * @generated
 */
public interface InteropPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ecl/interop.ecore";

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
	InteropPackage eINSTANCE = org.eclipse.ecl.interop.impl.InteropPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.interop.impl.InvokeImpl <em>Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.interop.impl.InvokeImpl
	 * @see org.eclipse.ecl.interop.impl.InteropPackageImpl#getInvoke()
	 * @generated
	 */
	int INVOKE = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__OBJECT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__NAME = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__ARGS = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.interop.impl.ExecProcessImpl <em>Exec Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.interop.impl.ExecProcessImpl
	 * @see org.eclipse.ecl.interop.impl.InteropPackageImpl#getExecProcess()
	 * @generated
	 */
	int EXEC_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS__COMMAND = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS__ARGS = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS__TIMEOUT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignore Exit Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS__IGNORE_EXIT_CODE = CorePackage.COMMAND_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ignore Stderr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS__IGNORE_STDERR = CorePackage.COMMAND_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stdin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS__STDIN = CorePackage.COMMAND_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Exec Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.interop.impl.ExecProcessResultImpl <em>Exec Process Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.interop.impl.ExecProcessResultImpl
	 * @see org.eclipse.ecl.interop.impl.InteropPackageImpl#getExecProcessResult()
	 * @generated
	 */
	int EXEC_PROCESS_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Exit Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS_RESULT__EXIT_CODE = 0;

	/**
	 * The feature id for the '<em><b>Stdout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS_RESULT__STDOUT = 1;

	/**
	 * The feature id for the '<em><b>Stderr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS_RESULT__STDERR = 2;

	/**
	 * The number of structural features of the '<em>Exec Process Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_PROCESS_RESULT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.interop.impl.GetImpl <em>Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.interop.impl.GetImpl
	 * @see org.eclipse.ecl.interop.impl.InteropPackageImpl#getGet()
	 * @generated
	 */
	int GET = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__OBJECT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__PROPERTY_NAME = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.interop.Invoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke</em>'.
	 * @see org.eclipse.ecl.interop.Invoke
	 * @generated
	 */
	EClass getInvoke();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.Invoke#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.eclipse.ecl.interop.Invoke#getObject()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.Invoke#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.ecl.interop.Invoke#getName()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.ecl.interop.Invoke#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see org.eclipse.ecl.interop.Invoke#getArgs()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Args();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.interop.ExecProcess <em>Exec Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec Process</em>'.
	 * @see org.eclipse.ecl.interop.ExecProcess
	 * @generated
	 */
	EClass getExecProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.ExecProcess#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see org.eclipse.ecl.interop.ExecProcess#getCommand()
	 * @see #getExecProcess()
	 * @generated
	 */
	EAttribute getExecProcess_Command();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.ecl.interop.ExecProcess#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see org.eclipse.ecl.interop.ExecProcess#getArgs()
	 * @see #getExecProcess()
	 * @generated
	 */
	EAttribute getExecProcess_Args();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.ExecProcess#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.eclipse.ecl.interop.ExecProcess#getTimeout()
	 * @see #getExecProcess()
	 * @generated
	 */
	EAttribute getExecProcess_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.ExecProcess#isIgnoreExitCode <em>Ignore Exit Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Exit Code</em>'.
	 * @see org.eclipse.ecl.interop.ExecProcess#isIgnoreExitCode()
	 * @see #getExecProcess()
	 * @generated
	 */
	EAttribute getExecProcess_IgnoreExitCode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.ExecProcess#isIgnoreStderr <em>Ignore Stderr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Stderr</em>'.
	 * @see org.eclipse.ecl.interop.ExecProcess#isIgnoreStderr()
	 * @see #getExecProcess()
	 * @generated
	 */
	EAttribute getExecProcess_IgnoreStderr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.ExecProcess#getStdin <em>Stdin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stdin</em>'.
	 * @see org.eclipse.ecl.interop.ExecProcess#getStdin()
	 * @see #getExecProcess()
	 * @generated
	 */
	EAttribute getExecProcess_Stdin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.interop.ExecProcessResult <em>Exec Process Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec Process Result</em>'.
	 * @see org.eclipse.ecl.interop.ExecProcessResult
	 * @generated
	 */
	EClass getExecProcessResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.ExecProcessResult#getExitCode <em>Exit Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Code</em>'.
	 * @see org.eclipse.ecl.interop.ExecProcessResult#getExitCode()
	 * @see #getExecProcessResult()
	 * @generated
	 */
	EAttribute getExecProcessResult_ExitCode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.ExecProcessResult#getStdout <em>Stdout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stdout</em>'.
	 * @see org.eclipse.ecl.interop.ExecProcessResult#getStdout()
	 * @see #getExecProcessResult()
	 * @generated
	 */
	EAttribute getExecProcessResult_Stdout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.ExecProcessResult#getStderr <em>Stderr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stderr</em>'.
	 * @see org.eclipse.ecl.interop.ExecProcessResult#getStderr()
	 * @see #getExecProcessResult()
	 * @generated
	 */
	EAttribute getExecProcessResult_Stderr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.interop.Get <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get</em>'.
	 * @see org.eclipse.ecl.interop.Get
	 * @generated
	 */
	EClass getGet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.Get#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.eclipse.ecl.interop.Get#getObject()
	 * @see #getGet()
	 * @generated
	 */
	EAttribute getGet_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.interop.Get#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.eclipse.ecl.interop.Get#getPropertyName()
	 * @see #getGet()
	 * @generated
	 */
	EAttribute getGet_PropertyName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteropFactory getInteropFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ecl.interop.impl.InvokeImpl <em>Invoke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.interop.impl.InvokeImpl
		 * @see org.eclipse.ecl.interop.impl.InteropPackageImpl#getInvoke()
		 * @generated
		 */
		EClass INVOKE = eINSTANCE.getInvoke();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__OBJECT = eINSTANCE.getInvoke_Object();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__NAME = eINSTANCE.getInvoke_Name();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__ARGS = eINSTANCE.getInvoke_Args();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.interop.impl.ExecProcessImpl <em>Exec Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.interop.impl.ExecProcessImpl
		 * @see org.eclipse.ecl.interop.impl.InteropPackageImpl#getExecProcess()
		 * @generated
		 */
		EClass EXEC_PROCESS = eINSTANCE.getExecProcess();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_PROCESS__COMMAND = eINSTANCE.getExecProcess_Command();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_PROCESS__ARGS = eINSTANCE.getExecProcess_Args();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_PROCESS__TIMEOUT = eINSTANCE.getExecProcess_Timeout();

		/**
		 * The meta object literal for the '<em><b>Ignore Exit Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_PROCESS__IGNORE_EXIT_CODE = eINSTANCE.getExecProcess_IgnoreExitCode();

		/**
		 * The meta object literal for the '<em><b>Ignore Stderr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_PROCESS__IGNORE_STDERR = eINSTANCE.getExecProcess_IgnoreStderr();

		/**
		 * The meta object literal for the '<em><b>Stdin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_PROCESS__STDIN = eINSTANCE.getExecProcess_Stdin();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.interop.impl.ExecProcessResultImpl <em>Exec Process Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.interop.impl.ExecProcessResultImpl
		 * @see org.eclipse.ecl.interop.impl.InteropPackageImpl#getExecProcessResult()
		 * @generated
		 */
		EClass EXEC_PROCESS_RESULT = eINSTANCE.getExecProcessResult();

		/**
		 * The meta object literal for the '<em><b>Exit Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_PROCESS_RESULT__EXIT_CODE = eINSTANCE.getExecProcessResult_ExitCode();

		/**
		 * The meta object literal for the '<em><b>Stdout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_PROCESS_RESULT__STDOUT = eINSTANCE.getExecProcessResult_Stdout();

		/**
		 * The meta object literal for the '<em><b>Stderr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_PROCESS_RESULT__STDERR = eINSTANCE.getExecProcessResult_Stderr();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.interop.impl.GetImpl <em>Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.interop.impl.GetImpl
		 * @see org.eclipse.ecl.interop.impl.InteropPackageImpl#getGet()
		 * @generated
		 */
		EClass GET = eINSTANCE.getGet();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET__OBJECT = eINSTANCE.getGet_Object();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET__PROPERTY_NAME = eINSTANCE.getGet_PropertyName();

	}

} //InteropPackage
