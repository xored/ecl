/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.data.commands;

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
 * @see org.eclipse.ecl.data.commands.CommandsFactory
 * @model kind="package"
 * @generated
 */
public interface CommandsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commands";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ecl/data/commands.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataCommands";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandsPackage eINSTANCE = org.eclipse.ecl.data.commands.impl.CommandsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.data.commands.impl.ReadCsvFileImpl <em>Read Csv File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.data.commands.impl.ReadCsvFileImpl
	 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getReadCsvFile()
	 * @generated
	 */
	int READ_CSV_FILE = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_CSV_FILE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_CSV_FILE__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_CSV_FILE__URI = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Csv File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_CSV_FILE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.data.commands.impl.WriteCsvFileImpl <em>Write Csv File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.data.commands.impl.WriteCsvFileImpl
	 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getWriteCsvFile()
	 * @generated
	 */
	int WRITE_CSV_FILE = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_CSV_FILE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_CSV_FILE__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_CSV_FILE__TABLE = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_CSV_FILE__URI = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Write Csv File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_CSV_FILE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.data.commands.ReadCsvFile <em>Read Csv File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Csv File</em>'.
	 * @see org.eclipse.ecl.data.commands.ReadCsvFile
	 * @generated
	 */
	EClass getReadCsvFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.data.commands.ReadCsvFile#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.ecl.data.commands.ReadCsvFile#getUri()
	 * @see #getReadCsvFile()
	 * @generated
	 */
	EAttribute getReadCsvFile_Uri();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.data.commands.WriteCsvFile <em>Write Csv File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Csv File</em>'.
	 * @see org.eclipse.ecl.data.commands.WriteCsvFile
	 * @generated
	 */
	EClass getWriteCsvFile();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.data.commands.WriteCsvFile#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see org.eclipse.ecl.data.commands.WriteCsvFile#getTable()
	 * @see #getWriteCsvFile()
	 * @generated
	 */
	EReference getWriteCsvFile_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.data.commands.WriteCsvFile#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.ecl.data.commands.WriteCsvFile#getUri()
	 * @see #getWriteCsvFile()
	 * @generated
	 */
	EAttribute getWriteCsvFile_Uri();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommandsFactory getCommandsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ecl.data.commands.impl.ReadCsvFileImpl <em>Read Csv File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.data.commands.impl.ReadCsvFileImpl
		 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getReadCsvFile()
		 * @generated
		 */
		EClass READ_CSV_FILE = eINSTANCE.getReadCsvFile();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_CSV_FILE__URI = eINSTANCE.getReadCsvFile_Uri();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.data.commands.impl.WriteCsvFileImpl <em>Write Csv File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.data.commands.impl.WriteCsvFileImpl
		 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getWriteCsvFile()
		 * @generated
		 */
		EClass WRITE_CSV_FILE = eINSTANCE.getWriteCsvFile();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_CSV_FILE__TABLE = eINSTANCE.getWriteCsvFile_Table();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITE_CSV_FILE__URI = eINSTANCE.getWriteCsvFile_Uri();

	}

} //CommandsPackage
