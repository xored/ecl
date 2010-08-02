/**
 * <copyright>
 * </copyright>
 *
 * $Id: DLTKTestPackageImpl.java,v 1.1 2010/08/02 09:24:10 andrey Exp $
 */
package org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl;

import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertInterpreter;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertNoInterpreters;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertPerspective;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CloseProject;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CopyFile;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertProjectExist;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CreateProject;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestFactory;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DeleteProject;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.GetPluginPath;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectExist;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectOpen;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.GetInterpreter;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.OpenPerspective;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveAllInterpreters;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveInterpreter;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.UiAddInterpreter;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.UiOpenPerspective;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.UiRemoveAllInterpreters;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.UiRemoveInterpreter;

import org.eclipse.ecl.core.CorePackage;

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
public class DLTKTestPackageImpl extends EPackageImpl implements DLTKTestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeAllInterpretersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openPerspectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertPerspectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertNoInterpretersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isProjectExistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isProjectOpenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPluginPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitForJobEClass = null;

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
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DLTKTestPackageImpl() {
		super(eNS_URI, DLTKTestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DLTKTestPackage init() {
		if (isInited) return (DLTKTestPackage)EPackage.Registry.INSTANCE.getEPackage(DLTKTestPackage.eNS_URI);

		// Obtain or create and register package
		DLTKTestPackageImpl theDLTKTestPackage = (DLTKTestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DLTKTestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DLTKTestPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDLTKTestPackage.createPackageContents();

		// Initialize created meta-data
		theDLTKTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDLTKTestPackage.freeze();

		return theDLTKTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddInterpreter() {
		return addInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddInterpreter_Language() {
		return (EAttribute)addInterpreterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddInterpreter_Name() {
		return (EAttribute)addInterpreterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddInterpreter_Path() {
		return (EAttribute)addInterpreterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveInterpreter() {
		return removeInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveInterpreter_Name() {
		return (EAttribute)removeInterpreterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveAllInterpreters() {
		return removeAllInterpretersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveAllInterpreters_Language() {
		return (EAttribute)removeAllInterpretersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenPerspective() {
		return openPerspectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenPerspective_Name() {
		return (EAttribute)openPerspectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateProject() {
		return createProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateProject_Name() {
		return (EAttribute)createProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateProject_Source() {
		return (EAttribute)createProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteProject() {
		return deleteProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteProject_Name() {
		return (EAttribute)deleteProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseProject() {
		return closeProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloseProject_Name() {
		return (EAttribute)closeProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertPerspective() {
		return assertPerspectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertPerspective_Name() {
		return (EAttribute)assertPerspectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertInterpreter() {
		return assertInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertInterpreter_Project() {
		return (EAttribute)assertInterpreterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertInterpreter_Name() {
		return (EAttribute)assertInterpreterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertNoInterpreters() {
		return assertNoInterpretersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertNoInterpreters_Project() {
		return (EAttribute)assertNoInterpretersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsProjectExist() {
		return isProjectExistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsProjectExist_Name() {
		return (EAttribute)isProjectExistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsProjectOpen() {
		return isProjectOpenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsProjectOpen_Name() {
		return (EAttribute)isProjectOpenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetPluginPath() {
		return getPluginPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetPluginPath_Plugin() {
		return (EAttribute)getPluginPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaitForJob() {
		return waitForJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitForJob_Family() {
		return (EAttribute)waitForJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitForJob_Timeout() {
		return (EAttribute)waitForJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLTKTestFactory getDLTKTestFactory() {
		return (DLTKTestFactory)getEFactoryInstance();
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
		addInterpreterEClass = createEClass(ADD_INTERPRETER);
		createEAttribute(addInterpreterEClass, ADD_INTERPRETER__LANGUAGE);
		createEAttribute(addInterpreterEClass, ADD_INTERPRETER__NAME);
		createEAttribute(addInterpreterEClass, ADD_INTERPRETER__PATH);

		removeInterpreterEClass = createEClass(REMOVE_INTERPRETER);
		createEAttribute(removeInterpreterEClass, REMOVE_INTERPRETER__NAME);

		removeAllInterpretersEClass = createEClass(REMOVE_ALL_INTERPRETERS);
		createEAttribute(removeAllInterpretersEClass, REMOVE_ALL_INTERPRETERS__LANGUAGE);

		openPerspectiveEClass = createEClass(OPEN_PERSPECTIVE);
		createEAttribute(openPerspectiveEClass, OPEN_PERSPECTIVE__NAME);

		createProjectEClass = createEClass(CREATE_PROJECT);
		createEAttribute(createProjectEClass, CREATE_PROJECT__NAME);
		createEAttribute(createProjectEClass, CREATE_PROJECT__SOURCE);

		deleteProjectEClass = createEClass(DELETE_PROJECT);
		createEAttribute(deleteProjectEClass, DELETE_PROJECT__NAME);

		closeProjectEClass = createEClass(CLOSE_PROJECT);
		createEAttribute(closeProjectEClass, CLOSE_PROJECT__NAME);

		assertPerspectiveEClass = createEClass(ASSERT_PERSPECTIVE);
		createEAttribute(assertPerspectiveEClass, ASSERT_PERSPECTIVE__NAME);

		assertInterpreterEClass = createEClass(ASSERT_INTERPRETER);
		createEAttribute(assertInterpreterEClass, ASSERT_INTERPRETER__PROJECT);
		createEAttribute(assertInterpreterEClass, ASSERT_INTERPRETER__NAME);

		assertNoInterpretersEClass = createEClass(ASSERT_NO_INTERPRETERS);
		createEAttribute(assertNoInterpretersEClass, ASSERT_NO_INTERPRETERS__PROJECT);

		isProjectExistEClass = createEClass(IS_PROJECT_EXIST);
		createEAttribute(isProjectExistEClass, IS_PROJECT_EXIST__NAME);

		isProjectOpenEClass = createEClass(IS_PROJECT_OPEN);
		createEAttribute(isProjectOpenEClass, IS_PROJECT_OPEN__NAME);

		getPluginPathEClass = createEClass(GET_PLUGIN_PATH);
		createEAttribute(getPluginPathEClass, GET_PLUGIN_PATH__PLUGIN);

		waitForJobEClass = createEClass(WAIT_FOR_JOB);
		createEAttribute(waitForJobEClass, WAIT_FOR_JOB__FAMILY);
		createEAttribute(waitForJobEClass, WAIT_FOR_JOB__TIMEOUT);
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
		addInterpreterEClass.getESuperTypes().add(theCorePackage.getCommand());
		removeInterpreterEClass.getESuperTypes().add(theCorePackage.getCommand());
		removeAllInterpretersEClass.getESuperTypes().add(theCorePackage.getCommand());
		openPerspectiveEClass.getESuperTypes().add(theCorePackage.getCommand());
		createProjectEClass.getESuperTypes().add(theCorePackage.getCommand());
		deleteProjectEClass.getESuperTypes().add(theCorePackage.getCommand());
		closeProjectEClass.getESuperTypes().add(theCorePackage.getCommand());
		assertPerspectiveEClass.getESuperTypes().add(theCorePackage.getCommand());
		assertInterpreterEClass.getESuperTypes().add(theCorePackage.getCommand());
		assertNoInterpretersEClass.getESuperTypes().add(theCorePackage.getCommand());
		isProjectExistEClass.getESuperTypes().add(theCorePackage.getCommand());
		isProjectOpenEClass.getESuperTypes().add(theCorePackage.getCommand());
		getPluginPathEClass.getESuperTypes().add(theCorePackage.getCommand());
		waitForJobEClass.getESuperTypes().add(theCorePackage.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(addInterpreterEClass, AddInterpreter.class, "AddInterpreter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddInterpreter_Language(), theEcorePackage.getEString(), "language", null, 1, 1, AddInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddInterpreter_Name(), theEcorePackage.getEString(), "name", null, 1, 1, AddInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddInterpreter_Path(), theEcorePackage.getEString(), "path", null, 1, 1, AddInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeInterpreterEClass, RemoveInterpreter.class, "RemoveInterpreter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveInterpreter_Name(), theEcorePackage.getEString(), "name", null, 1, 1, RemoveInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeAllInterpretersEClass, RemoveAllInterpreters.class, "RemoveAllInterpreters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveAllInterpreters_Language(), theEcorePackage.getEString(), "language", null, 0, 1, RemoveAllInterpreters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openPerspectiveEClass, OpenPerspective.class, "OpenPerspective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenPerspective_Name(), theEcorePackage.getEString(), "name", null, 1, 1, OpenPerspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createProjectEClass, CreateProject.class, "CreateProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateProject_Name(), theEcorePackage.getEString(), "name", null, 1, 1, CreateProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateProject_Source(), theEcorePackage.getEString(), "source", null, 0, 1, CreateProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteProjectEClass, DeleteProject.class, "DeleteProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteProject_Name(), theEcorePackage.getEString(), "name", null, 1, 1, DeleteProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(closeProjectEClass, CloseProject.class, "CloseProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloseProject_Name(), theEcorePackage.getEString(), "name", null, 1, 1, CloseProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertPerspectiveEClass, AssertPerspective.class, "AssertPerspective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertPerspective_Name(), theEcorePackage.getEString(), "name", null, 1, 1, AssertPerspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertInterpreterEClass, AssertInterpreter.class, "AssertInterpreter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertInterpreter_Project(), theEcorePackage.getEString(), "project", null, 1, 1, AssertInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertInterpreter_Name(), theEcorePackage.getEString(), "name", null, 1, 1, AssertInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertNoInterpretersEClass, AssertNoInterpreters.class, "AssertNoInterpreters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertNoInterpreters_Project(), theEcorePackage.getEString(), "project", null, 1, 1, AssertNoInterpreters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isProjectExistEClass, IsProjectExist.class, "IsProjectExist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsProjectExist_Name(), theEcorePackage.getEString(), "name", null, 1, 1, IsProjectExist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isProjectOpenEClass, IsProjectOpen.class, "IsProjectOpen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsProjectOpen_Name(), theEcorePackage.getEString(), "name", null, 1, 1, IsProjectOpen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPluginPathEClass, GetPluginPath.class, "GetPluginPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetPluginPath_Plugin(), theEcorePackage.getEString(), "plugin", null, 1, 1, GetPluginPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitForJobEClass, WaitForJob.class, "WaitForJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWaitForJob_Family(), theEcorePackage.getEString(), "family", null, 1, 1, WaitForJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaitForJob_Timeout(), ecorePackage.getEInt(), "timeout", "-1", 0, 1, WaitForJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DLTKTestPackageImpl
