/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParserTestModelPackageImpl.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model.impl;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.ecl.parser.test.model.ParserTestModelFactory;
import org.eclipse.ecl.parser.test.model.ParserTestModelPackage;
import org.eclipse.ecl.parser.test.model.TestBoolParam;
import org.eclipse.ecl.parser.test.model.TestCommandParam;
import org.eclipse.ecl.parser.test.model.TestEmpty;
import org.eclipse.ecl.parser.test.model.TestIntParam;
import org.eclipse.ecl.parser.test.model.TestMultiplicity;
import org.eclipse.ecl.parser.test.model.TestOptionalParams;
import org.eclipse.ecl.parser.test.model.TestParamCollision;
import org.eclipse.ecl.parser.test.model.TestUnknownParam;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParserTestModelPackageImpl extends EPackageImpl implements ParserTestModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEmptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCommandParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testUnknownParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testIntParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testBoolParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testOptionalParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testParamCollisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testMultiplicityEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParserTestModelPackageImpl() {
		super(eNS_URI, ParserTestModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ParserTestModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParserTestModelPackage init() {
		if (isInited) return (ParserTestModelPackage)EPackage.Registry.INSTANCE.getEPackage(ParserTestModelPackage.eNS_URI);

		// Obtain or create and register package
		ParserTestModelPackageImpl theParserTestModelPackage = (ParserTestModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ParserTestModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ParserTestModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theParserTestModelPackage.createPackageContents();

		// Initialize created meta-data
		theParserTestModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParserTestModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParserTestModelPackage.eNS_URI, theParserTestModelPackage);
		return theParserTestModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestEmpty() {
		return testEmptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCommandParam() {
		return testCommandParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCommandParam_Arg() {
		return (EReference)testCommandParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestUnknownParam() {
		return testUnknownParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestUnknownParam_Arg() {
		return (EReference)testUnknownParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestIntParam() {
		return testIntParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestIntParam_Arg() {
		return (EAttribute)testIntParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestBoolParam() {
		return testBoolParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestBoolParam_Arg() {
		return (EAttribute)testBoolParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestOptionalParams() {
		return testOptionalParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestOptionalParams_A1() {
		return (EAttribute)testOptionalParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestOptionalParams_A2() {
		return (EAttribute)testOptionalParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestParamCollision() {
		return testParamCollisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestParamCollision_A1() {
		return (EAttribute)testParamCollisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestParamCollision_A2() {
		return (EAttribute)testParamCollisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestMultiplicity() {
		return testMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestMultiplicity_A1() {
		return (EAttribute)testMultiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParserTestModelFactory getParserTestModelFactory() {
		return (ParserTestModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		testEmptyEClass = createEClass(TEST_EMPTY);

		testCommandParamEClass = createEClass(TEST_COMMAND_PARAM);
		createEReference(testCommandParamEClass, TEST_COMMAND_PARAM__ARG);

		testUnknownParamEClass = createEClass(TEST_UNKNOWN_PARAM);
		createEReference(testUnknownParamEClass, TEST_UNKNOWN_PARAM__ARG);

		testIntParamEClass = createEClass(TEST_INT_PARAM);
		createEAttribute(testIntParamEClass, TEST_INT_PARAM__ARG);

		testBoolParamEClass = createEClass(TEST_BOOL_PARAM);
		createEAttribute(testBoolParamEClass, TEST_BOOL_PARAM__ARG);

		testOptionalParamsEClass = createEClass(TEST_OPTIONAL_PARAMS);
		createEAttribute(testOptionalParamsEClass, TEST_OPTIONAL_PARAMS__A1);
		createEAttribute(testOptionalParamsEClass, TEST_OPTIONAL_PARAMS__A2);

		testParamCollisionEClass = createEClass(TEST_PARAM_COLLISION);
		createEAttribute(testParamCollisionEClass, TEST_PARAM_COLLISION__A1);
		createEAttribute(testParamCollisionEClass, TEST_PARAM_COLLISION__A2);

		testMultiplicityEClass = createEClass(TEST_MULTIPLICITY);
		createEAttribute(testMultiplicityEClass, TEST_MULTIPLICITY__A1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testEmptyEClass.getESuperTypes().add(theCorePackage.getCommand());
		testCommandParamEClass.getESuperTypes().add(theCorePackage.getCommand());
		testUnknownParamEClass.getESuperTypes().add(theCorePackage.getCommand());
		testIntParamEClass.getESuperTypes().add(theCorePackage.getCommand());
		testBoolParamEClass.getESuperTypes().add(theCorePackage.getCommand());
		testOptionalParamsEClass.getESuperTypes().add(theCorePackage.getCommand());
		testParamCollisionEClass.getESuperTypes().add(theCorePackage.getCommand());
		testMultiplicityEClass.getESuperTypes().add(theCorePackage.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(testEmptyEClass, TestEmpty.class, "TestEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testCommandParamEClass, TestCommandParam.class, "TestCommandParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestCommandParam_Arg(), theCorePackage.getCommand(), null, "arg", null, 0, 1, TestCommandParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testUnknownParamEClass, TestUnknownParam.class, "TestUnknownParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestUnknownParam_Arg(), theEcorePackage.getEObject(), null, "arg", null, 0, 1, TestUnknownParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testIntParamEClass, TestIntParam.class, "TestIntParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestIntParam_Arg(), theEcorePackage.getEInt(), "arg", null, 0, 1, TestIntParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testBoolParamEClass, TestBoolParam.class, "TestBoolParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestBoolParam_Arg(), theEcorePackage.getEBoolean(), "arg", null, 0, 1, TestBoolParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testOptionalParamsEClass, TestOptionalParams.class, "TestOptionalParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestOptionalParams_A1(), theEcorePackage.getEString(), "a1", null, 1, 1, TestOptionalParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestOptionalParams_A2(), theEcorePackage.getEString(), "a2", null, 0, 1, TestOptionalParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testParamCollisionEClass, TestParamCollision.class, "TestParamCollision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestParamCollision_A1(), theEcorePackage.getEString(), "a1", null, 0, 1, TestParamCollision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestParamCollision_A2(), theEcorePackage.getEString(), "a2", null, 1, 1, TestParamCollision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testMultiplicityEClass, TestMultiplicity.class, "TestMultiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestMultiplicity_A1(), theEcorePackage.getEString(), "a1", null, 0, 3, TestMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// input
		createInputAnnotations();
	}

	/**
	 * Initializes the annotations for <b>input</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createInputAnnotations() {
		String source = "input";		
		addAnnotation
		  (getTestCommandParam_Arg(), 
		   source, 
		   new String[] {
		   });
	}

} //ParserTestModelPackageImpl
