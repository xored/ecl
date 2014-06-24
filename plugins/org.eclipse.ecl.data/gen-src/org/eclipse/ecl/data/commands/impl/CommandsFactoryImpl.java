/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.data.commands.impl;

import org.eclipse.ecl.data.commands.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CommandsFactoryImpl extends EFactoryImpl implements CommandsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandsFactory init() {
		try {
			CommandsFactory theCommandsFactory = (CommandsFactory)EPackage.Registry.INSTANCE.getEFactory(CommandsPackage.eNS_URI);
			if (theCommandsFactory != null) {
				return theCommandsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommandsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsFactoryImpl() {
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
			case CommandsPackage.READ_CSV_FILE: return createReadCsvFile();
			case CommandsPackage.PRINT: return createPrint();
			case CommandsPackage.WRITE_CSV_FILE: return createWriteCsvFile();
			case CommandsPackage.EXCLUDE_COLUMNS: return createExcludeColumns();
			case CommandsPackage.SELECT_COLUMNS: return createSelectColumns();
			case CommandsPackage.ASSERT_TABLES_MATCH: return createAssertTablesMatch();
			case CommandsPackage.WRITE_LINES: return createWriteLines();
			case CommandsPackage.READ_LINES: return createReadLines();
			case CommandsPackage.SELECT_ROWS: return createSelectRows();
			case CommandsPackage.EXCLUDE_ROWS: return createExcludeRows();
			case CommandsPackage.AS_TABLE_DATA: return createAsTableData();
			case CommandsPackage.READ_PROPERTIES: return createReadProperties();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CommandsPackage.IGNORE_COLUMNS_MODE:
				return createIgnoreColumnsModeFromString(eDataType, initialValue);
			case CommandsPackage.ROW_MATCH_MODE:
				return createRowMatchModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CommandsPackage.IGNORE_COLUMNS_MODE:
				return convertIgnoreColumnsModeToString(eDataType, instanceValue);
			case CommandsPackage.ROW_MATCH_MODE:
				return convertRowMatchModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadCsvFile createReadCsvFile() {
		ReadCsvFileImpl readCsvFile = new ReadCsvFileImpl();
		return readCsvFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Print createPrint() {
		PrintImpl print = new PrintImpl();
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteCsvFile createWriteCsvFile() {
		WriteCsvFileImpl writeCsvFile = new WriteCsvFileImpl();
		return writeCsvFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeColumns createExcludeColumns() {
		ExcludeColumnsImpl excludeColumns = new ExcludeColumnsImpl();
		return excludeColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectColumns createSelectColumns() {
		SelectColumnsImpl selectColumns = new SelectColumnsImpl();
		return selectColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertTablesMatch createAssertTablesMatch() {
		AssertTablesMatchImpl assertTablesMatch = new AssertTablesMatchImpl();
		return assertTablesMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteLines createWriteLines() {
		WriteLinesImpl writeLines = new WriteLinesImpl();
		return writeLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLines createReadLines() {
		ReadLinesImpl readLines = new ReadLinesImpl();
		return readLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectRows createSelectRows() {
		SelectRowsImpl selectRows = new SelectRowsImpl();
		return selectRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeRows createExcludeRows() {
		ExcludeRowsImpl excludeRows = new ExcludeRowsImpl();
		return excludeRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsTableData createAsTableData() {
		AsTableDataImpl asTableData = new AsTableDataImpl();
		return asTableData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadProperties createReadProperties() {
		ReadPropertiesImpl readProperties = new ReadPropertiesImpl();
		return readProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreColumnsMode createIgnoreColumnsModeFromString(EDataType eDataType, String initialValue) {
		IgnoreColumnsMode result = IgnoreColumnsMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIgnoreColumnsModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowMatchMode createRowMatchModeFromString(EDataType eDataType, String initialValue) {
		RowMatchMode result = RowMatchMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowMatchModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsPackage getCommandsPackage() {
		return (CommandsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommandsPackage getPackage() {
		return CommandsPackage.eINSTANCE;
	}

} //CommandsFactoryImpl
