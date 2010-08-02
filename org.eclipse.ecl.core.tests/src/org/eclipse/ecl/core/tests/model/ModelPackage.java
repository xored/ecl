/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelPackage.java,v 1.1 2010/08/02 09:24:08 andrey Exp $
 */
package org.eclipse.ecl.core.tests.model;

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
 * @see org.eclipse.ecl.core.tests.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ecl/tests/model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.ecl.core.tests.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.tests.model.impl.TestCommandImpl <em>Test Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.tests.model.impl.TestCommandImpl
	 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getTestCommand()
	 * @generated
	 */
	int TEST_COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_COMMAND__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_COMMAND__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Hello</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_COMMAND__HELLO = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_COMMAND_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.tests.model.impl.SlowCommandImpl <em>Slow Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.tests.model.impl.SlowCommandImpl
	 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getSlowCommand()
	 * @generated
	 */
	int SLOW_COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOW_COMMAND__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOW_COMMAND__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Slow Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOW_COMMAND_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.tests.model.impl.IncrementCommandImpl <em>Increment Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.tests.model.impl.IncrementCommandImpl
	 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getIncrementCommand()
	 * @generated
	 */
	int INCREMENT_COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_COMMAND__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_COMMAND__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_COMMAND__VAL = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Increment Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_COMMAND_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.tests.model.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.tests.model.impl.DataImpl
	 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getData()
	 * @generated
	 */
	int DATA = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.tests.model.impl.EmitDataImpl <em>Emit Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.tests.model.impl.EmitDataImpl
	 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getEmitData()
	 * @generated
	 */
	int EMIT_DATA = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_DATA__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_DATA__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Param Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_DATA__PARAM_INT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emit Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_DATA_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.tests.model.impl.RandomImpl <em>Random</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.tests.model.impl.RandomImpl
	 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getRandom()
	 * @generated
	 */
	int RANDOM = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Random</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.tests.model.impl.IsPipeEmptyImpl <em>Is Pipe Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.tests.model.impl.IsPipeEmptyImpl
	 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getIsPipeEmpty()
	 * @generated
	 */
	int IS_PIPE_EMPTY = 6;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PIPE_EMPTY__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PIPE_EMPTY__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Is Pipe Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PIPE_EMPTY_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.tests.model.impl.EmitEMFDataImpl <em>Emit EMF Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.tests.model.impl.EmitEMFDataImpl
	 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getEmitEMFData()
	 * @generated
	 */
	int EMIT_EMF_DATA = 7;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EMF_DATA__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EMF_DATA__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Param Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EMF_DATA__PARAM_INT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emit EMF Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EMF_DATA_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.core.tests.model.impl.FailImpl <em>Fail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.core.tests.model.impl.FailImpl
	 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getFail()
	 * @generated
	 */
	int FAIL = 8;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Fail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.tests.model.TestCommand <em>Test Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Command</em>'.
	 * @see org.eclipse.ecl.core.tests.model.TestCommand
	 * @generated
	 */
	EClass getTestCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.tests.model.TestCommand#getHello <em>Hello</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hello</em>'.
	 * @see org.eclipse.ecl.core.tests.model.TestCommand#getHello()
	 * @see #getTestCommand()
	 * @generated
	 */
	EAttribute getTestCommand_Hello();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.tests.model.SlowCommand <em>Slow Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slow Command</em>'.
	 * @see org.eclipse.ecl.core.tests.model.SlowCommand
	 * @generated
	 */
	EClass getSlowCommand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.tests.model.IncrementCommand <em>Increment Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment Command</em>'.
	 * @see org.eclipse.ecl.core.tests.model.IncrementCommand
	 * @generated
	 */
	EClass getIncrementCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.tests.model.IncrementCommand#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see org.eclipse.ecl.core.tests.model.IncrementCommand#getVal()
	 * @see #getIncrementCommand()
	 * @generated
	 */
	EAttribute getIncrementCommand_Val();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.tests.model.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.eclipse.ecl.core.tests.model.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.tests.model.Data#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.ecl.core.tests.model.Data#getValue()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.tests.model.EmitData <em>Emit Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emit Data</em>'.
	 * @see org.eclipse.ecl.core.tests.model.EmitData
	 * @generated
	 */
	EClass getEmitData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.tests.model.EmitData#getParamInt <em>Param Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Int</em>'.
	 * @see org.eclipse.ecl.core.tests.model.EmitData#getParamInt()
	 * @see #getEmitData()
	 * @generated
	 */
	EAttribute getEmitData_ParamInt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.tests.model.Random <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random</em>'.
	 * @see org.eclipse.ecl.core.tests.model.Random
	 * @generated
	 */
	EClass getRandom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.tests.model.Random#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.eclipse.ecl.core.tests.model.Random#getCount()
	 * @see #getRandom()
	 * @generated
	 */
	EAttribute getRandom_Count();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.tests.model.IsPipeEmpty <em>Is Pipe Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Pipe Empty</em>'.
	 * @see org.eclipse.ecl.core.tests.model.IsPipeEmpty
	 * @generated
	 */
	EClass getIsPipeEmpty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.tests.model.EmitEMFData <em>Emit EMF Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emit EMF Data</em>'.
	 * @see org.eclipse.ecl.core.tests.model.EmitEMFData
	 * @generated
	 */
	EClass getEmitEMFData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.core.tests.model.EmitEMFData#getParamInt <em>Param Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Int</em>'.
	 * @see org.eclipse.ecl.core.tests.model.EmitEMFData#getParamInt()
	 * @see #getEmitEMFData()
	 * @generated
	 */
	EAttribute getEmitEMFData_ParamInt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.core.tests.model.Fail <em>Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fail</em>'.
	 * @see org.eclipse.ecl.core.tests.model.Fail
	 * @generated
	 */
	EClass getFail();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ecl.core.tests.model.impl.TestCommandImpl <em>Test Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.tests.model.impl.TestCommandImpl
		 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getTestCommand()
		 * @generated
		 */
		EClass TEST_COMMAND = eINSTANCE.getTestCommand();

		/**
		 * The meta object literal for the '<em><b>Hello</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_COMMAND__HELLO = eINSTANCE.getTestCommand_Hello();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.tests.model.impl.SlowCommandImpl <em>Slow Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.tests.model.impl.SlowCommandImpl
		 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getSlowCommand()
		 * @generated
		 */
		EClass SLOW_COMMAND = eINSTANCE.getSlowCommand();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.tests.model.impl.IncrementCommandImpl <em>Increment Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.tests.model.impl.IncrementCommandImpl
		 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getIncrementCommand()
		 * @generated
		 */
		EClass INCREMENT_COMMAND = eINSTANCE.getIncrementCommand();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENT_COMMAND__VAL = eINSTANCE.getIncrementCommand_Val();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.tests.model.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.tests.model.impl.DataImpl
		 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__VALUE = eINSTANCE.getData_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.tests.model.impl.EmitDataImpl <em>Emit Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.tests.model.impl.EmitDataImpl
		 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getEmitData()
		 * @generated
		 */
		EClass EMIT_DATA = eINSTANCE.getEmitData();

		/**
		 * The meta object literal for the '<em><b>Param Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMIT_DATA__PARAM_INT = eINSTANCE.getEmitData_ParamInt();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.tests.model.impl.RandomImpl <em>Random</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.tests.model.impl.RandomImpl
		 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getRandom()
		 * @generated
		 */
		EClass RANDOM = eINSTANCE.getRandom();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM__COUNT = eINSTANCE.getRandom_Count();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.tests.model.impl.IsPipeEmptyImpl <em>Is Pipe Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.tests.model.impl.IsPipeEmptyImpl
		 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getIsPipeEmpty()
		 * @generated
		 */
		EClass IS_PIPE_EMPTY = eINSTANCE.getIsPipeEmpty();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.tests.model.impl.EmitEMFDataImpl <em>Emit EMF Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.tests.model.impl.EmitEMFDataImpl
		 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getEmitEMFData()
		 * @generated
		 */
		EClass EMIT_EMF_DATA = eINSTANCE.getEmitEMFData();

		/**
		 * The meta object literal for the '<em><b>Param Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMIT_EMF_DATA__PARAM_INT = eINSTANCE.getEmitEMFData_ParamInt();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.core.tests.model.impl.FailImpl <em>Fail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.core.tests.model.impl.FailImpl
		 * @see org.eclipse.ecl.core.tests.model.impl.ModelPackageImpl#getFail()
		 * @generated
		 */
		EClass FAIL = eINSTANCE.getFail();

	}

} //ModelPackage
