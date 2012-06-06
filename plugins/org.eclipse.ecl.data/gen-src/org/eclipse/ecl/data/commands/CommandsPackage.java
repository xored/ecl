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
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link org.eclipse.ecl.data.commands.impl.ExcludeColumnsImpl <em>Exclude Columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.data.commands.impl.ExcludeColumnsImpl
	 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getExcludeColumns()
	 * @generated
	 */
	int EXCLUDE_COLUMNS = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_COLUMNS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_COLUMNS__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_COLUMNS__TABLE = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_COLUMNS__COLUMNS = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exclude Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_COLUMNS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.data.commands.impl.SelectColumnsImpl <em>Select Columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.data.commands.impl.SelectColumnsImpl
	 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getSelectColumns()
	 * @generated
	 */
	int SELECT_COLUMNS = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMNS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMNS__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMNS__TABLE = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMNS__COLUMNS = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Select Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMNS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.data.commands.impl.AssertTablesMatchImpl <em>Assert Tables Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.data.commands.impl.AssertTablesMatchImpl
	 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getAssertTablesMatch()
	 * @generated
	 */
	int ASSERT_TABLES_MATCH = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TABLES_MATCH__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TABLES_MATCH__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TABLES_MATCH__LEFT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TABLES_MATCH__RIGHT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ignore Column Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TABLES_MATCH__IGNORE_COLUMN_ORDER = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignore Missing Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TABLES_MATCH__IGNORE_MISSING_COLUMNS = CorePackage.COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assert Tables Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TABLES_MATCH_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.data.commands.IgnoreColumnsMode <em>Ignore Columns Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.data.commands.IgnoreColumnsMode
	 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getIgnoreColumnsMode()
	 * @generated
	 */
	int IGNORE_COLUMNS_MODE = 5;


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
	 * Returns the meta object for class '{@link org.eclipse.ecl.data.commands.ExcludeColumns <em>Exclude Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Columns</em>'.
	 * @see org.eclipse.ecl.data.commands.ExcludeColumns
	 * @generated
	 */
	EClass getExcludeColumns();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.data.commands.ExcludeColumns#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see org.eclipse.ecl.data.commands.ExcludeColumns#getTable()
	 * @see #getExcludeColumns()
	 * @generated
	 */
	EReference getExcludeColumns_Table();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.ecl.data.commands.ExcludeColumns#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Columns</em>'.
	 * @see org.eclipse.ecl.data.commands.ExcludeColumns#getColumns()
	 * @see #getExcludeColumns()
	 * @generated
	 */
	EAttribute getExcludeColumns_Columns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.data.commands.SelectColumns <em>Select Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Columns</em>'.
	 * @see org.eclipse.ecl.data.commands.SelectColumns
	 * @generated
	 */
	EClass getSelectColumns();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.data.commands.SelectColumns#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see org.eclipse.ecl.data.commands.SelectColumns#getTable()
	 * @see #getSelectColumns()
	 * @generated
	 */
	EReference getSelectColumns_Table();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.ecl.data.commands.SelectColumns#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Columns</em>'.
	 * @see org.eclipse.ecl.data.commands.SelectColumns#getColumns()
	 * @see #getSelectColumns()
	 * @generated
	 */
	EAttribute getSelectColumns_Columns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.data.commands.AssertTablesMatch <em>Assert Tables Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Tables Match</em>'.
	 * @see org.eclipse.ecl.data.commands.AssertTablesMatch
	 * @generated
	 */
	EClass getAssertTablesMatch();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.data.commands.AssertTablesMatch#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.eclipse.ecl.data.commands.AssertTablesMatch#getLeft()
	 * @see #getAssertTablesMatch()
	 * @generated
	 */
	EReference getAssertTablesMatch_Left();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ecl.data.commands.AssertTablesMatch#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.eclipse.ecl.data.commands.AssertTablesMatch#getRight()
	 * @see #getAssertTablesMatch()
	 * @generated
	 */
	EReference getAssertTablesMatch_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.data.commands.AssertTablesMatch#isIgnoreColumnOrder <em>Ignore Column Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Column Order</em>'.
	 * @see org.eclipse.ecl.data.commands.AssertTablesMatch#isIgnoreColumnOrder()
	 * @see #getAssertTablesMatch()
	 * @generated
	 */
	EAttribute getAssertTablesMatch_IgnoreColumnOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.data.commands.AssertTablesMatch#getIgnoreMissingColumns <em>Ignore Missing Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Missing Columns</em>'.
	 * @see org.eclipse.ecl.data.commands.AssertTablesMatch#getIgnoreMissingColumns()
	 * @see #getAssertTablesMatch()
	 * @generated
	 */
	EAttribute getAssertTablesMatch_IgnoreMissingColumns();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.ecl.data.commands.IgnoreColumnsMode <em>Ignore Columns Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ignore Columns Mode</em>'.
	 * @see org.eclipse.ecl.data.commands.IgnoreColumnsMode
	 * @generated
	 */
	EEnum getIgnoreColumnsMode();

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

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.data.commands.impl.ExcludeColumnsImpl <em>Exclude Columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.data.commands.impl.ExcludeColumnsImpl
		 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getExcludeColumns()
		 * @generated
		 */
		EClass EXCLUDE_COLUMNS = eINSTANCE.getExcludeColumns();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE_COLUMNS__TABLE = eINSTANCE.getExcludeColumns_Table();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUDE_COLUMNS__COLUMNS = eINSTANCE.getExcludeColumns_Columns();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.data.commands.impl.SelectColumnsImpl <em>Select Columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.data.commands.impl.SelectColumnsImpl
		 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getSelectColumns()
		 * @generated
		 */
		EClass SELECT_COLUMNS = eINSTANCE.getSelectColumns();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_COLUMNS__TABLE = eINSTANCE.getSelectColumns_Table();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_COLUMNS__COLUMNS = eINSTANCE.getSelectColumns_Columns();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.data.commands.impl.AssertTablesMatchImpl <em>Assert Tables Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.data.commands.impl.AssertTablesMatchImpl
		 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getAssertTablesMatch()
		 * @generated
		 */
		EClass ASSERT_TABLES_MATCH = eINSTANCE.getAssertTablesMatch();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_TABLES_MATCH__LEFT = eINSTANCE.getAssertTablesMatch_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_TABLES_MATCH__RIGHT = eINSTANCE.getAssertTablesMatch_Right();

		/**
		 * The meta object literal for the '<em><b>Ignore Column Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TABLES_MATCH__IGNORE_COLUMN_ORDER = eINSTANCE.getAssertTablesMatch_IgnoreColumnOrder();

		/**
		 * The meta object literal for the '<em><b>Ignore Missing Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TABLES_MATCH__IGNORE_MISSING_COLUMNS = eINSTANCE.getAssertTablesMatch_IgnoreMissingColumns();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.data.commands.IgnoreColumnsMode <em>Ignore Columns Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.data.commands.IgnoreColumnsMode
		 * @see org.eclipse.ecl.data.commands.impl.CommandsPackageImpl#getIgnoreColumnsMode()
		 * @generated
		 */
		EEnum IGNORE_COLUMNS_MODE = eINSTANCE.getIgnoreColumnsMode();

	}

} //CommandsPackage
