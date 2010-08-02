/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParserTestModelFactoryImpl.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model.impl;

import org.eclipse.ecl.parser.test.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParserTestModelFactoryImpl extends EFactoryImpl implements ParserTestModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParserTestModelFactory init() {
		try {
			ParserTestModelFactory theParserTestModelFactory = (ParserTestModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ecl/parser/tests/model.ecore"); 
			if (theParserTestModelFactory != null) {
				return theParserTestModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParserTestModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParserTestModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ParserTestModelPackage.TEST_EMPTY: return createTestEmpty();
			case ParserTestModelPackage.TEST_COMMAND_PARAM: return createTestCommandParam();
			case ParserTestModelPackage.TEST_UNKNOWN_PARAM: return createTestUnknownParam();
			case ParserTestModelPackage.TEST_INT_PARAM: return createTestIntParam();
			case ParserTestModelPackage.TEST_BOOL_PARAM: return createTestBoolParam();
			case ParserTestModelPackage.TEST_OPTIONAL_PARAMS: return createTestOptionalParams();
			case ParserTestModelPackage.TEST_PARAM_COLLISION: return createTestParamCollision();
			case ParserTestModelPackage.TEST_MULTIPLICITY: return createTestMultiplicity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestEmpty createTestEmpty() {
		TestEmptyImpl testEmpty = new TestEmptyImpl();
		return testEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCommandParam createTestCommandParam() {
		TestCommandParamImpl testCommandParam = new TestCommandParamImpl();
		return testCommandParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestUnknownParam createTestUnknownParam() {
		TestUnknownParamImpl testUnknownParam = new TestUnknownParamImpl();
		return testUnknownParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIntParam createTestIntParam() {
		TestIntParamImpl testIntParam = new TestIntParamImpl();
		return testIntParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestBoolParam createTestBoolParam() {
		TestBoolParamImpl testBoolParam = new TestBoolParamImpl();
		return testBoolParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestOptionalParams createTestOptionalParams() {
		TestOptionalParamsImpl testOptionalParams = new TestOptionalParamsImpl();
		return testOptionalParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestParamCollision createTestParamCollision() {
		TestParamCollisionImpl testParamCollision = new TestParamCollisionImpl();
		return testParamCollision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestMultiplicity createTestMultiplicity() {
		TestMultiplicityImpl testMultiplicity = new TestMultiplicityImpl();
		return testMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParserTestModelPackage getParserTestModelPackage() {
		return (ParserTestModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParserTestModelPackage getPackage() {
		return ParserTestModelPackage.eINSTANCE;
	}

} //ParserTestModelFactoryImpl
