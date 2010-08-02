/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParserTestModelFactory.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage
 * @generated
 */
public interface ParserTestModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParserTestModelFactory eINSTANCE = org.eclipse.ecl.parser.test.model.impl.ParserTestModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Empty</em>'.
	 * @generated
	 */
	TestEmpty createTestEmpty();

	/**
	 * Returns a new object of class '<em>Test Command Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Command Param</em>'.
	 * @generated
	 */
	TestCommandParam createTestCommandParam();

	/**
	 * Returns a new object of class '<em>Test Unknown Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Unknown Param</em>'.
	 * @generated
	 */
	TestUnknownParam createTestUnknownParam();

	/**
	 * Returns a new object of class '<em>Test Int Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Int Param</em>'.
	 * @generated
	 */
	TestIntParam createTestIntParam();

	/**
	 * Returns a new object of class '<em>Test Bool Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Bool Param</em>'.
	 * @generated
	 */
	TestBoolParam createTestBoolParam();

	/**
	 * Returns a new object of class '<em>Test Optional Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Optional Params</em>'.
	 * @generated
	 */
	TestOptionalParams createTestOptionalParams();

	/**
	 * Returns a new object of class '<em>Test Param Collision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Param Collision</em>'.
	 * @generated
	 */
	TestParamCollision createTestParamCollision();

	/**
	 * Returns a new object of class '<em>Test Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Multiplicity</em>'.
	 * @generated
	 */
	TestMultiplicity createTestMultiplicity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParserTestModelPackage getParserTestModelPackage();

} //ParserTestModelFactory
