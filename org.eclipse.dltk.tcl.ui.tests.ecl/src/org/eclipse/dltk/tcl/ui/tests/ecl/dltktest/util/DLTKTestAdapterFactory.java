/**
 * <copyright>
 * </copyright>
 *
 * $Id: DLTKTestAdapterFactory.java,v 1.1 2010/08/02 09:24:11 andrey Exp $
 */
package org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.util;

import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.*;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage
 * @generated
 */
public class DLTKTestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DLTKTestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLTKTestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DLTKTestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DLTKTestSwitch<Adapter> modelSwitch =
		new DLTKTestSwitch<Adapter>() {
			@Override
			public Adapter caseAddInterpreter(AddInterpreter object) {
				return createAddInterpreterAdapter();
			}
			@Override
			public Adapter caseRemoveInterpreter(RemoveInterpreter object) {
				return createRemoveInterpreterAdapter();
			}
			@Override
			public Adapter caseRemoveAllInterpreters(RemoveAllInterpreters object) {
				return createRemoveAllInterpretersAdapter();
			}
			@Override
			public Adapter caseOpenPerspective(OpenPerspective object) {
				return createOpenPerspectiveAdapter();
			}
			@Override
			public Adapter caseCreateProject(CreateProject object) {
				return createCreateProjectAdapter();
			}
			@Override
			public Adapter caseDeleteProject(DeleteProject object) {
				return createDeleteProjectAdapter();
			}
			@Override
			public Adapter caseCloseProject(CloseProject object) {
				return createCloseProjectAdapter();
			}
			@Override
			public Adapter caseAssertPerspective(AssertPerspective object) {
				return createAssertPerspectiveAdapter();
			}
			@Override
			public Adapter caseAssertInterpreter(AssertInterpreter object) {
				return createAssertInterpreterAdapter();
			}
			@Override
			public Adapter caseAssertNoInterpreters(AssertNoInterpreters object) {
				return createAssertNoInterpretersAdapter();
			}
			@Override
			public Adapter caseIsProjectExist(IsProjectExist object) {
				return createIsProjectExistAdapter();
			}
			@Override
			public Adapter caseIsProjectOpen(IsProjectOpen object) {
				return createIsProjectOpenAdapter();
			}
			@Override
			public Adapter caseGetPluginPath(GetPluginPath object) {
				return createGetPluginPathAdapter();
			}
			@Override
			public Adapter caseWaitForJob(WaitForJob object) {
				return createWaitForJobAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter <em>Add Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter
	 * @generated
	 */
	public Adapter createAddInterpreterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveInterpreter <em>Remove Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveInterpreter
	 * @generated
	 */
	public Adapter createRemoveInterpreterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveAllInterpreters <em>Remove All Interpreters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveAllInterpreters
	 * @generated
	 */
	public Adapter createRemoveAllInterpretersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.OpenPerspective <em>Open Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.OpenPerspective
	 * @generated
	 */
	public Adapter createOpenPerspectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CreateProject <em>Create Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CreateProject
	 * @generated
	 */
	public Adapter createCreateProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DeleteProject <em>Delete Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DeleteProject
	 * @generated
	 */
	public Adapter createDeleteProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CloseProject <em>Close Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CloseProject
	 * @generated
	 */
	public Adapter createCloseProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertPerspective <em>Assert Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertPerspective
	 * @generated
	 */
	public Adapter createAssertPerspectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertInterpreter <em>Assert Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertInterpreter
	 * @generated
	 */
	public Adapter createAssertInterpreterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertNoInterpreters <em>Assert No Interpreters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertNoInterpreters
	 * @generated
	 */
	public Adapter createAssertNoInterpretersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectExist <em>Is Project Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectExist
	 * @generated
	 */
	public Adapter createIsProjectExistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectOpen <em>Is Project Open</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectOpen
	 * @generated
	 */
	public Adapter createIsProjectOpenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.GetPluginPath <em>Get Plugin Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.GetPluginPath
	 * @generated
	 */
	public Adapter createGetPluginPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob <em>Wait For Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob
	 * @generated
	 */
	public Adapter createWaitForJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DLTKTestAdapterFactory
