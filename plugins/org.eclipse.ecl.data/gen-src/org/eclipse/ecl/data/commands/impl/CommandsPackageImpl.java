/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.data.commands.impl;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.ecl.data.commands.CommandsFactory;
import org.eclipse.ecl.data.commands.CommandsPackage;
import org.eclipse.ecl.data.commands.ExcludeColumns;
import org.eclipse.ecl.data.commands.ReadCsvFile;
import org.eclipse.ecl.data.commands.SelectColumns;
import org.eclipse.ecl.data.commands.WriteCsvFile;

import org.eclipse.ecl.data.objects.ObjectsPackage;

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
public class CommandsPackageImpl extends EPackageImpl implements CommandsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readCsvFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeCsvFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeColumnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectColumnsEClass = null;

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
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommandsPackageImpl() {
		super(eNS_URI, CommandsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommandsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommandsPackage init() {
		if (isInited) return (CommandsPackage)EPackage.Registry.INSTANCE.getEPackage(CommandsPackage.eNS_URI);

		// Obtain or create and register package
		CommandsPackageImpl theCommandsPackage = (CommandsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommandsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommandsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		ObjectsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommandsPackage.createPackageContents();

		// Initialize created meta-data
		theCommandsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommandsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommandsPackage.eNS_URI, theCommandsPackage);
		return theCommandsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadCsvFile() {
		return readCsvFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadCsvFile_Uri() {
		return (EAttribute)readCsvFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteCsvFile() {
		return writeCsvFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteCsvFile_Table() {
		return (EReference)writeCsvFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriteCsvFile_Uri() {
		return (EAttribute)writeCsvFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeColumns() {
		return excludeColumnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcludeColumns_Table() {
		return (EReference)excludeColumnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcludeColumns_Columns() {
		return (EAttribute)excludeColumnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectColumns() {
		return selectColumnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectColumns_Table() {
		return (EReference)selectColumnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectColumns_Columns() {
		return (EAttribute)selectColumnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsFactory getCommandsFactory() {
		return (CommandsFactory)getEFactoryInstance();
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
		readCsvFileEClass = createEClass(READ_CSV_FILE);
		createEAttribute(readCsvFileEClass, READ_CSV_FILE__URI);

		writeCsvFileEClass = createEClass(WRITE_CSV_FILE);
		createEReference(writeCsvFileEClass, WRITE_CSV_FILE__TABLE);
		createEAttribute(writeCsvFileEClass, WRITE_CSV_FILE__URI);

		excludeColumnsEClass = createEClass(EXCLUDE_COLUMNS);
		createEReference(excludeColumnsEClass, EXCLUDE_COLUMNS__TABLE);
		createEAttribute(excludeColumnsEClass, EXCLUDE_COLUMNS__COLUMNS);

		selectColumnsEClass = createEClass(SELECT_COLUMNS);
		createEReference(selectColumnsEClass, SELECT_COLUMNS__TABLE);
		createEAttribute(selectColumnsEClass, SELECT_COLUMNS__COLUMNS);
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
		ObjectsPackage theObjectsPackage = (ObjectsPackage)EPackage.Registry.INSTANCE.getEPackage(ObjectsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		readCsvFileEClass.getESuperTypes().add(theCorePackage.getCommand());
		writeCsvFileEClass.getESuperTypes().add(theCorePackage.getCommand());
		excludeColumnsEClass.getESuperTypes().add(theCorePackage.getCommand());
		selectColumnsEClass.getESuperTypes().add(theCorePackage.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(readCsvFileEClass, ReadCsvFile.class, "ReadCsvFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadCsvFile_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ReadCsvFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeCsvFileEClass, WriteCsvFile.class, "WriteCsvFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteCsvFile_Table(), theObjectsPackage.getTable(), null, "table", null, 0, 1, WriteCsvFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWriteCsvFile_Uri(), theEcorePackage.getEString(), "uri", null, 0, 1, WriteCsvFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludeColumnsEClass, ExcludeColumns.class, "ExcludeColumns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExcludeColumns_Table(), theObjectsPackage.getTable(), null, "table", null, 0, 1, ExcludeColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcludeColumns_Columns(), theEcorePackage.getEString(), "columns", null, 0, -1, ExcludeColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectColumnsEClass, SelectColumns.class, "SelectColumns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectColumns_Table(), theObjectsPackage.getTable(), null, "table", null, 0, 1, SelectColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectColumns_Columns(), theEcorePackage.getEString(), "columns", null, 0, -1, SelectColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/ecl/docs
		createDocsAnnotations();
		// http://www.eclipse.org/ecl/input
		createInputAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ecl/docs</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocsAnnotations() {
		String source = "http://www.eclipse.org/ecl/docs";		
		addAnnotation
		  (readCsvFileEClass, 
		   source, 
		   new String[] {
			 "description", "Parses given csv file. Fails if file is not found or format is invalid",
			 "returns", "<code>Table</code> EMF Object. "
		   });		
		addAnnotation
		  (getReadCsvFile_Uri(), 
		   source, 
		   new String[] {
			 "description", "URI to a file to read. Currently supported schemes are workspace:/ for files in workspace and file:/ for files on local file system"
		   });		
		addAnnotation
		  (writeCsvFileEClass, 
		   source, 
		   new String[] {
			 "description", "Writes given table into csv file. Fails if file is not accessible",
			 "returns", "The value of <code>table</code> argument."
		   });			
		addAnnotation
		  (getWriteCsvFile_Table(), 
		   source, 
		   new String[] {
			 "description", "Table to write"
		   });		
		addAnnotation
		  (getWriteCsvFile_Uri(), 
		   source, 
		   new String[] {
			 "description", "URI to write CSV data to. Currently supported schemes are workspace:/ for files in workspace and file:/ for files on local file system"
		   });		
		addAnnotation
		  (excludeColumnsEClass, 
		   source, 
		   new String[] {
			 "description", "Takes a table from input and returns the same table which has some columns excluded. ",
			 "returns", "Copy of input table object without columns with names listed in <code>columns</code>"
		   });			
		addAnnotation
		  (getExcludeColumns_Table(), 
		   source, 
		   new String[] {
			 "description", "Table to exclude columns from"
		   });		
		addAnnotation
		  (getExcludeColumns_Columns(), 
		   source, 
		   new String[] {
			 "description", "Column names to exclude from table. It is OK to pass column names which are not present in table"
		   });		
		addAnnotation
		  (selectColumnsEClass, 
		   source, 
		   new String[] {
			 "description", "Takes a table from input and returns the table containing only columns passed into <code>columns</code> argument.",
			 "returns", "Copy of input table object with only columns with names listed in <code>columns</code>"
		   });			
		addAnnotation
		  (getSelectColumns_Table(), 
		   source, 
		   new String[] {
			 "description", "Table to take columns from"
		   });		
		addAnnotation
		  (getSelectColumns_Columns(), 
		   source, 
		   new String[] {
			 "description", "Column names to take from table. If given column name is not present in input table, command fails"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ecl/input</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createInputAnnotations() {
		String source = "http://www.eclipse.org/ecl/input";					
		addAnnotation
		  (getWriteCsvFile_Table(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getExcludeColumns_Table(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getSelectColumns_Table(), 
		   source, 
		   new String[] {
		   });		
	}

} //CommandsPackageImpl
