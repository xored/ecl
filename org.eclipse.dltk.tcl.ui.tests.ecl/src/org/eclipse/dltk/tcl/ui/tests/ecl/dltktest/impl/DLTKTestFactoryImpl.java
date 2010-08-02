/**
 * <copyright>
 * </copyright>
 *
 * $Id: DLTKTestFactoryImpl.java,v 1.1 2010/08/02 09:24:10 andrey Exp $
 */
package org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl;

import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.*;

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
public class DLTKTestFactoryImpl extends EFactoryImpl implements DLTKTestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DLTKTestFactory init() {
		try {
			DLTKTestFactory theDLTKTestFactory = (DLTKTestFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ecl/dltktest.ecore"); 
			if (theDLTKTestFactory != null) {
				return theDLTKTestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DLTKTestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLTKTestFactoryImpl() {
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
			case DLTKTestPackage.ADD_INTERPRETER: return createAddInterpreter();
			case DLTKTestPackage.REMOVE_INTERPRETER: return createRemoveInterpreter();
			case DLTKTestPackage.REMOVE_ALL_INTERPRETERS: return createRemoveAllInterpreters();
			case DLTKTestPackage.OPEN_PERSPECTIVE: return createOpenPerspective();
			case DLTKTestPackage.CREATE_PROJECT: return createCreateProject();
			case DLTKTestPackage.DELETE_PROJECT: return createDeleteProject();
			case DLTKTestPackage.CLOSE_PROJECT: return createCloseProject();
			case DLTKTestPackage.ASSERT_PERSPECTIVE: return createAssertPerspective();
			case DLTKTestPackage.ASSERT_INTERPRETER: return createAssertInterpreter();
			case DLTKTestPackage.ASSERT_NO_INTERPRETERS: return createAssertNoInterpreters();
			case DLTKTestPackage.IS_PROJECT_EXIST: return createIsProjectExist();
			case DLTKTestPackage.IS_PROJECT_OPEN: return createIsProjectOpen();
			case DLTKTestPackage.GET_PLUGIN_PATH: return createGetPluginPath();
			case DLTKTestPackage.WAIT_FOR_JOB: return createWaitForJob();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddInterpreter createAddInterpreter() {
		AddInterpreterImpl addInterpreter = new AddInterpreterImpl();
		return addInterpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveInterpreter createRemoveInterpreter() {
		RemoveInterpreterImpl removeInterpreter = new RemoveInterpreterImpl();
		return removeInterpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAllInterpreters createRemoveAllInterpreters() {
		RemoveAllInterpretersImpl removeAllInterpreters = new RemoveAllInterpretersImpl();
		return removeAllInterpreters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenPerspective createOpenPerspective() {
		OpenPerspectiveImpl openPerspective = new OpenPerspectiveImpl();
		return openPerspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateProject createCreateProject() {
		CreateProjectImpl createProject = new CreateProjectImpl();
		return createProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteProject createDeleteProject() {
		DeleteProjectImpl deleteProject = new DeleteProjectImpl();
		return deleteProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseProject createCloseProject() {
		CloseProjectImpl closeProject = new CloseProjectImpl();
		return closeProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertPerspective createAssertPerspective() {
		AssertPerspectiveImpl assertPerspective = new AssertPerspectiveImpl();
		return assertPerspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertInterpreter createAssertInterpreter() {
		AssertInterpreterImpl assertInterpreter = new AssertInterpreterImpl();
		return assertInterpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertNoInterpreters createAssertNoInterpreters() {
		AssertNoInterpretersImpl assertNoInterpreters = new AssertNoInterpretersImpl();
		return assertNoInterpreters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsProjectExist createIsProjectExist() {
		IsProjectExistImpl isProjectExist = new IsProjectExistImpl();
		return isProjectExist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsProjectOpen createIsProjectOpen() {
		IsProjectOpenImpl isProjectOpen = new IsProjectOpenImpl();
		return isProjectOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetPluginPath createGetPluginPath() {
		GetPluginPathImpl getPluginPath = new GetPluginPathImpl();
		return getPluginPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitForJob createWaitForJob() {
		WaitForJobImpl waitForJob = new WaitForJobImpl();
		return waitForJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLTKTestPackage getDLTKTestPackage() {
		return (DLTKTestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DLTKTestPackage getPackage() {
		return DLTKTestPackage.eINSTANCE;
	}

} //DLTKTestFactoryImpl
