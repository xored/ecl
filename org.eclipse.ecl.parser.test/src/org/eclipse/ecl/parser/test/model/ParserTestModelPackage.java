/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParserTestModelPackage.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model;

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
 * @see org.eclipse.ecl.parser.test.model.ParserTestModelFactory
 * @model kind="package"
 * @generated
 */
public interface ParserTestModelPackage extends EPackage {
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
	String eNS_URI = "http://www.eclipse.org/ecl/parser/tests/model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.ecl.parser.tests.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParserTestModelPackage eINSTANCE = org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.parser.test.model.impl.TestEmptyImpl <em>Test Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.parser.test.model.impl.TestEmptyImpl
	 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestEmpty()
	 * @generated
	 */
	int TEST_EMPTY = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EMPTY__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EMPTY__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Test Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EMPTY_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.parser.test.model.impl.TestCommandParamImpl <em>Test Command Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.parser.test.model.impl.TestCommandParamImpl
	 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestCommandParam()
	 * @generated
	 */
	int TEST_COMMAND_PARAM = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_COMMAND_PARAM__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_COMMAND_PARAM__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_COMMAND_PARAM__ARG = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Command Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_COMMAND_PARAM_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.parser.test.model.impl.TestUnknownParamImpl <em>Test Unknown Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.parser.test.model.impl.TestUnknownParamImpl
	 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestUnknownParam()
	 * @generated
	 */
	int TEST_UNKNOWN_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_UNKNOWN_PARAM__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_UNKNOWN_PARAM__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_UNKNOWN_PARAM__ARG = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Unknown Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_UNKNOWN_PARAM_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.parser.test.model.impl.TestIntParamImpl <em>Test Int Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.parser.test.model.impl.TestIntParamImpl
	 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestIntParam()
	 * @generated
	 */
	int TEST_INT_PARAM = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INT_PARAM__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INT_PARAM__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INT_PARAM__ARG = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Int Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INT_PARAM_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.parser.test.model.impl.TestBoolParamImpl <em>Test Bool Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.parser.test.model.impl.TestBoolParamImpl
	 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestBoolParam()
	 * @generated
	 */
	int TEST_BOOL_PARAM = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_BOOL_PARAM__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_BOOL_PARAM__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_BOOL_PARAM__ARG = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Bool Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_BOOL_PARAM_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.parser.test.model.impl.TestOptionalParamsImpl <em>Test Optional Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.parser.test.model.impl.TestOptionalParamsImpl
	 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestOptionalParams()
	 * @generated
	 */
	int TEST_OPTIONAL_PARAMS = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPTIONAL_PARAMS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPTIONAL_PARAMS__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>A1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPTIONAL_PARAMS__A1 = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>A2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPTIONAL_PARAMS__A2 = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Optional Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPTIONAL_PARAMS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.parser.test.model.impl.TestParamCollisionImpl <em>Test Param Collision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.parser.test.model.impl.TestParamCollisionImpl
	 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestParamCollision()
	 * @generated
	 */
	int TEST_PARAM_COLLISION = 6;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PARAM_COLLISION__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PARAM_COLLISION__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>A1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PARAM_COLLISION__A1 = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>A2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PARAM_COLLISION__A2 = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Param Collision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PARAM_COLLISION_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.parser.test.model.impl.TestMultiplicityImpl <em>Test Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.parser.test.model.impl.TestMultiplicityImpl
	 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestMultiplicity()
	 * @generated
	 */
	int TEST_MULTIPLICITY = 7;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MULTIPLICITY__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MULTIPLICITY__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>A1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MULTIPLICITY__A1 = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MULTIPLICITY_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.parser.test.model.TestEmpty <em>Test Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Empty</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestEmpty
	 * @generated
	 */
	EClass getTestEmpty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.parser.test.model.TestCommandParam <em>Test Command Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Command Param</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestCommandParam
	 * @generated
	 */
	EClass getTestCommandParam();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.parser.test.model.TestCommandParam#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arg</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestCommandParam#getArg()
	 * @see #getTestCommandParam()
	 * @generated
	 */
	EReference getTestCommandParam_Arg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.parser.test.model.TestUnknownParam <em>Test Unknown Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Unknown Param</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestUnknownParam
	 * @generated
	 */
	EClass getTestUnknownParam();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.parser.test.model.TestUnknownParam#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arg</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestUnknownParam#getArg()
	 * @see #getTestUnknownParam()
	 * @generated
	 */
	EReference getTestUnknownParam_Arg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.parser.test.model.TestIntParam <em>Test Int Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Int Param</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestIntParam
	 * @generated
	 */
	EClass getTestIntParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.parser.test.model.TestIntParam#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestIntParam#getArg()
	 * @see #getTestIntParam()
	 * @generated
	 */
	EAttribute getTestIntParam_Arg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.parser.test.model.TestBoolParam <em>Test Bool Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Bool Param</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestBoolParam
	 * @generated
	 */
	EClass getTestBoolParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.parser.test.model.TestBoolParam#isArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestBoolParam#isArg()
	 * @see #getTestBoolParam()
	 * @generated
	 */
	EAttribute getTestBoolParam_Arg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.parser.test.model.TestOptionalParams <em>Test Optional Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Optional Params</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestOptionalParams
	 * @generated
	 */
	EClass getTestOptionalParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.parser.test.model.TestOptionalParams#getA1 <em>A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A1</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestOptionalParams#getA1()
	 * @see #getTestOptionalParams()
	 * @generated
	 */
	EAttribute getTestOptionalParams_A1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.parser.test.model.TestOptionalParams#getA2 <em>A2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A2</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestOptionalParams#getA2()
	 * @see #getTestOptionalParams()
	 * @generated
	 */
	EAttribute getTestOptionalParams_A2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.parser.test.model.TestParamCollision <em>Test Param Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Param Collision</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestParamCollision
	 * @generated
	 */
	EClass getTestParamCollision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.parser.test.model.TestParamCollision#getA1 <em>A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A1</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestParamCollision#getA1()
	 * @see #getTestParamCollision()
	 * @generated
	 */
	EAttribute getTestParamCollision_A1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.parser.test.model.TestParamCollision#getA2 <em>A2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A2</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestParamCollision#getA2()
	 * @see #getTestParamCollision()
	 * @generated
	 */
	EAttribute getTestParamCollision_A2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.parser.test.model.TestMultiplicity <em>Test Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Multiplicity</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestMultiplicity
	 * @generated
	 */
	EClass getTestMultiplicity();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.ecl.parser.test.model.TestMultiplicity#getA1 <em>A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>A1</em>'.
	 * @see org.eclipse.ecl.parser.test.model.TestMultiplicity#getA1()
	 * @see #getTestMultiplicity()
	 * @generated
	 */
	EAttribute getTestMultiplicity_A1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParserTestModelFactory getParserTestModelFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ecl.parser.test.model.impl.TestEmptyImpl <em>Test Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.parser.test.model.impl.TestEmptyImpl
		 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestEmpty()
		 * @generated
		 */
		EClass TEST_EMPTY = eINSTANCE.getTestEmpty();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.parser.test.model.impl.TestCommandParamImpl <em>Test Command Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.parser.test.model.impl.TestCommandParamImpl
		 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestCommandParam()
		 * @generated
		 */
		EClass TEST_COMMAND_PARAM = eINSTANCE.getTestCommandParam();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_COMMAND_PARAM__ARG = eINSTANCE.getTestCommandParam_Arg();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.parser.test.model.impl.TestUnknownParamImpl <em>Test Unknown Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.parser.test.model.impl.TestUnknownParamImpl
		 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestUnknownParam()
		 * @generated
		 */
		EClass TEST_UNKNOWN_PARAM = eINSTANCE.getTestUnknownParam();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_UNKNOWN_PARAM__ARG = eINSTANCE.getTestUnknownParam_Arg();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.parser.test.model.impl.TestIntParamImpl <em>Test Int Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.parser.test.model.impl.TestIntParamImpl
		 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestIntParam()
		 * @generated
		 */
		EClass TEST_INT_PARAM = eINSTANCE.getTestIntParam();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_INT_PARAM__ARG = eINSTANCE.getTestIntParam_Arg();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.parser.test.model.impl.TestBoolParamImpl <em>Test Bool Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.parser.test.model.impl.TestBoolParamImpl
		 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestBoolParam()
		 * @generated
		 */
		EClass TEST_BOOL_PARAM = eINSTANCE.getTestBoolParam();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_BOOL_PARAM__ARG = eINSTANCE.getTestBoolParam_Arg();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.parser.test.model.impl.TestOptionalParamsImpl <em>Test Optional Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.parser.test.model.impl.TestOptionalParamsImpl
		 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestOptionalParams()
		 * @generated
		 */
		EClass TEST_OPTIONAL_PARAMS = eINSTANCE.getTestOptionalParams();

		/**
		 * The meta object literal for the '<em><b>A1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_OPTIONAL_PARAMS__A1 = eINSTANCE.getTestOptionalParams_A1();

		/**
		 * The meta object literal for the '<em><b>A2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_OPTIONAL_PARAMS__A2 = eINSTANCE.getTestOptionalParams_A2();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.parser.test.model.impl.TestParamCollisionImpl <em>Test Param Collision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.parser.test.model.impl.TestParamCollisionImpl
		 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestParamCollision()
		 * @generated
		 */
		EClass TEST_PARAM_COLLISION = eINSTANCE.getTestParamCollision();

		/**
		 * The meta object literal for the '<em><b>A1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_PARAM_COLLISION__A1 = eINSTANCE.getTestParamCollision_A1();

		/**
		 * The meta object literal for the '<em><b>A2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_PARAM_COLLISION__A2 = eINSTANCE.getTestParamCollision_A2();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.parser.test.model.impl.TestMultiplicityImpl <em>Test Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.parser.test.model.impl.TestMultiplicityImpl
		 * @see org.eclipse.ecl.parser.test.model.impl.ParserTestModelPackageImpl#getTestMultiplicity()
		 * @generated
		 */
		EClass TEST_MULTIPLICITY = eINSTANCE.getTestMultiplicity();

		/**
		 * The meta object literal for the '<em><b>A1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_MULTIPLICITY__A1 = eINSTANCE.getTestMultiplicity_A1();

	}

} //ParserTestModelPackage
