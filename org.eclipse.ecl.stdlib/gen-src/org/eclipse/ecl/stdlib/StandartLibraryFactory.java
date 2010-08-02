/**
 * <copyright>
 * </copyright>
 *
 * $Id: StandartLibraryFactory.java,v 1.1 2010/08/02 09:24:20 andrey Exp $
 */
package org.eclipse.ecl.stdlib;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.stdlib.StandartLibraryPackage
 * @generated
 */
public interface StandartLibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StandartLibraryFactory eINSTANCE = org.eclipse.ecl.stdlib.impl.StandartLibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length</em>'.
	 * @generated
	 */
	Length createLength();

	/**
	 * Returns a new object of class '<em>Concat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concat</em>'.
	 * @generated
	 */
	Concat createConcat();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Assert Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Equals</em>'.
	 * @generated
	 */
	AssertEquals createAssertEquals();

	/**
	 * Returns a new object of class '<em>Assert Not Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Not Equals</em>'.
	 * @generated
	 */
	AssertNotEquals createAssertNotEquals();

	/**
	 * Returns a new object of class '<em>Assert True</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert True</em>'.
	 * @generated
	 */
	AssertTrue createAssertTrue();

	/**
	 * Returns a new object of class '<em>Assert False</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert False</em>'.
	 * @generated
	 */
	AssertFalse createAssertFalse();

	/**
	 * Returns a new object of class '<em>Assert Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Null</em>'.
	 * @generated
	 */
	AssertNull createAssertNull();

	/**
	 * Returns a new object of class '<em>Assert Not Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Not Null</em>'.
	 * @generated
	 */
	AssertNotNull createAssertNotNull();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StandartLibraryPackage getStandartLibraryPackage();

} //StandartLibraryFactory
