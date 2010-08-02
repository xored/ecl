/**
 * <copyright>
 * </copyright>
 *
 * $Id: StandartLibraryPackage.java,v 1.1 2010/08/02 09:24:20 andrey Exp $
 */
package org.eclipse.ecl.stdlib;

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
 * @see org.eclipse.ecl.stdlib.StandartLibraryFactory
 * @model kind="package"
 * @generated
 */
public interface StandartLibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stdlib";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ecl/stdlib.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.ecl.stdlib";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StandartLibraryPackage eINSTANCE = org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.stdlib.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.stdlib.impl.LengthImpl
	 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.stdlib.impl.ConcatImpl <em>Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.stdlib.impl.ConcatImpl
	 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getConcat()
	 * @generated
	 */
	int CONCAT = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__STRING = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.stdlib.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.stdlib.impl.PropertyImpl
	 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INDEX = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.stdlib.impl.AssertEqualsImpl <em>Assert Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.stdlib.impl.AssertEqualsImpl
	 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertEquals()
	 * @generated
	 */
	int ASSERT_EQUALS = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EQUALS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EQUALS__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Expected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EQUALS__EXPECTED = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assert Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EQUALS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.stdlib.impl.AssertNotEqualsImpl <em>Assert Not Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.stdlib.impl.AssertNotEqualsImpl
	 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertNotEquals()
	 * @generated
	 */
	int ASSERT_NOT_EQUALS = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NOT_EQUALS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NOT_EQUALS__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Expected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NOT_EQUALS__EXPECTED = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assert Not Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NOT_EQUALS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.stdlib.impl.AssertTrueImpl <em>Assert True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.stdlib.impl.AssertTrueImpl
	 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertTrue()
	 * @generated
	 */
	int ASSERT_TRUE = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TRUE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TRUE__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Assert True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TRUE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.stdlib.impl.AssertFalseImpl <em>Assert False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.stdlib.impl.AssertFalseImpl
	 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertFalse()
	 * @generated
	 */
	int ASSERT_FALSE = 6;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_FALSE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_FALSE__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Assert False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_FALSE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.stdlib.impl.AssertNullImpl <em>Assert Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.stdlib.impl.AssertNullImpl
	 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertNull()
	 * @generated
	 */
	int ASSERT_NULL = 7;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NULL__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NULL__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Assert Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NULL_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.stdlib.impl.AssertNotNullImpl <em>Assert Not Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.stdlib.impl.AssertNotNullImpl
	 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertNotNull()
	 * @generated
	 */
	int ASSERT_NOT_NULL = 8;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NOT_NULL__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NOT_NULL__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Assert Not Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NOT_NULL_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.stdlib.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see org.eclipse.ecl.stdlib.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.stdlib.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concat</em>'.
	 * @see org.eclipse.ecl.stdlib.Concat
	 * @generated
	 */
	EClass getConcat();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.stdlib.Concat#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see org.eclipse.ecl.stdlib.Concat#getString()
	 * @see #getConcat()
	 * @generated
	 */
	EAttribute getConcat_String();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.stdlib.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.ecl.stdlib.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.stdlib.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.ecl.stdlib.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.stdlib.Property#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.ecl.stdlib.Property#getIndex()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Index();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.stdlib.AssertEquals <em>Assert Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Equals</em>'.
	 * @see org.eclipse.ecl.stdlib.AssertEquals
	 * @generated
	 */
	EClass getAssertEquals();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.stdlib.AssertEquals#getExpected <em>Expected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected</em>'.
	 * @see org.eclipse.ecl.stdlib.AssertEquals#getExpected()
	 * @see #getAssertEquals()
	 * @generated
	 */
	EAttribute getAssertEquals_Expected();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.stdlib.AssertNotEquals <em>Assert Not Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Not Equals</em>'.
	 * @see org.eclipse.ecl.stdlib.AssertNotEquals
	 * @generated
	 */
	EClass getAssertNotEquals();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.stdlib.AssertNotEquals#getExpected <em>Expected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected</em>'.
	 * @see org.eclipse.ecl.stdlib.AssertNotEquals#getExpected()
	 * @see #getAssertNotEquals()
	 * @generated
	 */
	EAttribute getAssertNotEquals_Expected();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.stdlib.AssertTrue <em>Assert True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert True</em>'.
	 * @see org.eclipse.ecl.stdlib.AssertTrue
	 * @generated
	 */
	EClass getAssertTrue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.stdlib.AssertFalse <em>Assert False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert False</em>'.
	 * @see org.eclipse.ecl.stdlib.AssertFalse
	 * @generated
	 */
	EClass getAssertFalse();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.stdlib.AssertNull <em>Assert Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Null</em>'.
	 * @see org.eclipse.ecl.stdlib.AssertNull
	 * @generated
	 */
	EClass getAssertNull();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.stdlib.AssertNotNull <em>Assert Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Not Null</em>'.
	 * @see org.eclipse.ecl.stdlib.AssertNotNull
	 * @generated
	 */
	EClass getAssertNotNull();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StandartLibraryFactory getStandartLibraryFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ecl.stdlib.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.stdlib.impl.LengthImpl
		 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.stdlib.impl.ConcatImpl <em>Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.stdlib.impl.ConcatImpl
		 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getConcat()
		 * @generated
		 */
		EClass CONCAT = eINSTANCE.getConcat();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCAT__STRING = eINSTANCE.getConcat_String();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.stdlib.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.stdlib.impl.PropertyImpl
		 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__INDEX = eINSTANCE.getProperty_Index();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.stdlib.impl.AssertEqualsImpl <em>Assert Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.stdlib.impl.AssertEqualsImpl
		 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertEquals()
		 * @generated
		 */
		EClass ASSERT_EQUALS = eINSTANCE.getAssertEquals();

		/**
		 * The meta object literal for the '<em><b>Expected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_EQUALS__EXPECTED = eINSTANCE.getAssertEquals_Expected();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.stdlib.impl.AssertNotEqualsImpl <em>Assert Not Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.stdlib.impl.AssertNotEqualsImpl
		 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertNotEquals()
		 * @generated
		 */
		EClass ASSERT_NOT_EQUALS = eINSTANCE.getAssertNotEquals();

		/**
		 * The meta object literal for the '<em><b>Expected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_NOT_EQUALS__EXPECTED = eINSTANCE.getAssertNotEquals_Expected();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.stdlib.impl.AssertTrueImpl <em>Assert True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.stdlib.impl.AssertTrueImpl
		 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertTrue()
		 * @generated
		 */
		EClass ASSERT_TRUE = eINSTANCE.getAssertTrue();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.stdlib.impl.AssertFalseImpl <em>Assert False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.stdlib.impl.AssertFalseImpl
		 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertFalse()
		 * @generated
		 */
		EClass ASSERT_FALSE = eINSTANCE.getAssertFalse();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.stdlib.impl.AssertNullImpl <em>Assert Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.stdlib.impl.AssertNullImpl
		 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertNull()
		 * @generated
		 */
		EClass ASSERT_NULL = eINSTANCE.getAssertNull();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.stdlib.impl.AssertNotNullImpl <em>Assert Not Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.stdlib.impl.AssertNotNullImpl
		 * @see org.eclipse.ecl.stdlib.impl.StandartLibraryPackageImpl#getAssertNotNull()
		 * @generated
		 */
		EClass ASSERT_NOT_NULL = eINSTANCE.getAssertNotNull();

	}

} //StandartLibraryPackage
