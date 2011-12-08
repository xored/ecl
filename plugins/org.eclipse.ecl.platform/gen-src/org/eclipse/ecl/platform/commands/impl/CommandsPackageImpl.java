/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.commands.impl;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.ecl.platform.commands.AddRepository;
import org.eclipse.ecl.platform.commands.CommandsFactory;
import org.eclipse.ecl.platform.commands.CommandsPackage;
import org.eclipse.ecl.platform.commands.GetLog;
import org.eclipse.ecl.platform.commands.ListFeatures;
import org.eclipse.ecl.platform.commands.ListInstallUnits;
import org.eclipse.ecl.platform.commands.ListPlugins;
import org.eclipse.ecl.platform.commands.ListRepositories;
import org.eclipse.ecl.platform.commands.Log;
import org.eclipse.ecl.platform.commands.Print;
import org.eclipse.ecl.platform.commands.RemoveRepository;
import org.eclipse.ecl.platform.commands.SortBy;
import org.eclipse.ecl.platform.commands.UpdateAll;
import org.eclipse.ecl.platform.commands.UpdateFeature;

import org.eclipse.ecl.platform.objects.ObjectsPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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
	private EClass listPluginsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listRepositoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateAllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listInstallUnitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEClass = null;

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
	 * @see org.eclipse.ecl.platform.commands.CommandsPackage#eNS_URI
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
	public EClass getListPlugins() {
		return listPluginsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListFeatures() {
		return listFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListRepositories() {
		return listRepositoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddRepository() {
		return addRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddRepository_Uri() {
		return (EAttribute)addRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddRepository_Name() {
		return (EAttribute)addRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveRepository() {
		return removeRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveRepository_Uri() {
		return (EAttribute)removeRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateFeature() {
		return updateFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateFeature_Id() {
		return (EAttribute)updateFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAll() {
		return updateAllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrint() {
		return printEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortBy() {
		return sortByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortBy_Field() {
		return (EAttribute)sortByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListInstallUnits() {
		return listInstallUnitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetLog() {
		return getLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetLog_Limit() {
		return (EAttribute)getLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetLog_SkipInfo() {
		return (EAttribute)getLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLog() {
		return logEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLog_Severity() {
		return (EAttribute)logEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLog_Message() {
		return (EAttribute)logEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLog_Plugin() {
		return (EAttribute)logEClass.getEStructuralFeatures().get(2);
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
		listPluginsEClass = createEClass(LIST_PLUGINS);

		listFeaturesEClass = createEClass(LIST_FEATURES);

		listRepositoriesEClass = createEClass(LIST_REPOSITORIES);

		addRepositoryEClass = createEClass(ADD_REPOSITORY);
		createEAttribute(addRepositoryEClass, ADD_REPOSITORY__URI);
		createEAttribute(addRepositoryEClass, ADD_REPOSITORY__NAME);

		removeRepositoryEClass = createEClass(REMOVE_REPOSITORY);
		createEAttribute(removeRepositoryEClass, REMOVE_REPOSITORY__URI);

		updateFeatureEClass = createEClass(UPDATE_FEATURE);
		createEAttribute(updateFeatureEClass, UPDATE_FEATURE__ID);

		updateAllEClass = createEClass(UPDATE_ALL);

		printEClass = createEClass(PRINT);

		sortByEClass = createEClass(SORT_BY);
		createEAttribute(sortByEClass, SORT_BY__FIELD);

		listInstallUnitsEClass = createEClass(LIST_INSTALL_UNITS);

		getLogEClass = createEClass(GET_LOG);
		createEAttribute(getLogEClass, GET_LOG__LIMIT);
		createEAttribute(getLogEClass, GET_LOG__SKIP_INFO);

		logEClass = createEClass(LOG);
		createEAttribute(logEClass, LOG__SEVERITY);
		createEAttribute(logEClass, LOG__MESSAGE);
		createEAttribute(logEClass, LOG__PLUGIN);
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
		listPluginsEClass.getESuperTypes().add(theCorePackage.getCommand());
		listFeaturesEClass.getESuperTypes().add(theCorePackage.getCommand());
		listRepositoriesEClass.getESuperTypes().add(theCorePackage.getCommand());
		addRepositoryEClass.getESuperTypes().add(theCorePackage.getCommand());
		removeRepositoryEClass.getESuperTypes().add(theCorePackage.getCommand());
		updateFeatureEClass.getESuperTypes().add(theCorePackage.getCommand());
		updateAllEClass.getESuperTypes().add(theCorePackage.getCommand());
		printEClass.getESuperTypes().add(theCorePackage.getCommand());
		sortByEClass.getESuperTypes().add(theCorePackage.getCommand());
		listInstallUnitsEClass.getESuperTypes().add(theCorePackage.getCommand());
		getLogEClass.getESuperTypes().add(theCorePackage.getCommand());
		logEClass.getESuperTypes().add(theCorePackage.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(listPluginsEClass, ListPlugins.class, "ListPlugins", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listFeaturesEClass, ListFeatures.class, "ListFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listRepositoriesEClass, ListRepositories.class, "ListRepositories", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addRepositoryEClass, AddRepository.class, "AddRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddRepository_Uri(), theEcorePackage.getEString(), "uri", null, 0, 1, AddRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddRepository_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AddRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeRepositoryEClass, RemoveRepository.class, "RemoveRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveRepository_Uri(), theEcorePackage.getEString(), "uri", null, 0, 1, RemoveRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateFeatureEClass, UpdateFeature.class, "UpdateFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateFeature_Id(), theEcorePackage.getEString(), "id", null, 0, 1, UpdateFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateAllEClass, UpdateAll.class, "UpdateAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(printEClass, Print.class, "Print", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortByEClass, SortBy.class, "SortBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSortBy_Field(), theEcorePackage.getEString(), "field", null, 0, 1, SortBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listInstallUnitsEClass, ListInstallUnits.class, "ListInstallUnits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getLogEClass, GetLog.class, "GetLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetLog_Limit(), theEcorePackage.getEInt(), "limit", "100", 0, 1, GetLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetLog_SkipInfo(), theEcorePackage.getEBoolean(), "skipInfo", "false", 0, 1, GetLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logEClass, Log.class, "Log", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLog_Severity(), theEcorePackage.getEString(), "severity", "info", 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLog_Message(), theEcorePackage.getEString(), "message", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLog_Plugin(), theEcorePackage.getEString(), "plugin", "org.eclipse.ecl.platform", 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/ecl/input
		createInputAnnotations();
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
		  (getLog_Message(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CorePackage.eNS_URI).appendFragment("//Foreach/input/%http:%2F%2Fwww.eclipse.org%2Fecl%2Finput%")
		   });
	}

} //CommandsPackageImpl
