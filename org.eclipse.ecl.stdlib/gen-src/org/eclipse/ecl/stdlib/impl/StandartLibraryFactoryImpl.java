/**
 * <copyright>
 * </copyright>
 *
 * $Id: StandartLibraryFactoryImpl.java,v 1.1 2010/08/02 09:24:20 andrey Exp $
 */
package org.eclipse.ecl.stdlib.impl;

import org.eclipse.ecl.stdlib.*;

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
public class StandartLibraryFactoryImpl extends EFactoryImpl implements StandartLibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandartLibraryFactory init() {
		try {
			StandartLibraryFactory theStandartLibraryFactory = (StandartLibraryFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ecl/stdlib.ecore"); 
			if (theStandartLibraryFactory != null) {
				return theStandartLibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StandartLibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandartLibraryFactoryImpl() {
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
			case StandartLibraryPackage.LENGTH: return createLength();
			case StandartLibraryPackage.CONCAT: return createConcat();
			case StandartLibraryPackage.PROPERTY: return createProperty();
			case StandartLibraryPackage.ASSERT_EQUALS: return createAssertEquals();
			case StandartLibraryPackage.ASSERT_NOT_EQUALS: return createAssertNotEquals();
			case StandartLibraryPackage.ASSERT_TRUE: return createAssertTrue();
			case StandartLibraryPackage.ASSERT_FALSE: return createAssertFalse();
			case StandartLibraryPackage.ASSERT_NULL: return createAssertNull();
			case StandartLibraryPackage.ASSERT_NOT_NULL: return createAssertNotNull();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concat createConcat() {
		ConcatImpl concat = new ConcatImpl();
		return concat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertEquals createAssertEquals() {
		AssertEqualsImpl assertEquals = new AssertEqualsImpl();
		return assertEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertNotEquals createAssertNotEquals() {
		AssertNotEqualsImpl assertNotEquals = new AssertNotEqualsImpl();
		return assertNotEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertTrue createAssertTrue() {
		AssertTrueImpl assertTrue = new AssertTrueImpl();
		return assertTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertFalse createAssertFalse() {
		AssertFalseImpl assertFalse = new AssertFalseImpl();
		return assertFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertNull createAssertNull() {
		AssertNullImpl assertNull = new AssertNullImpl();
		return assertNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertNotNull createAssertNotNull() {
		AssertNotNullImpl assertNotNull = new AssertNotNullImpl();
		return assertNotNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandartLibraryPackage getStandartLibraryPackage() {
		return (StandartLibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StandartLibraryPackage getPackage() {
		return StandartLibraryPackage.eINSTANCE;
	}

} //StandartLibraryFactoryImpl
