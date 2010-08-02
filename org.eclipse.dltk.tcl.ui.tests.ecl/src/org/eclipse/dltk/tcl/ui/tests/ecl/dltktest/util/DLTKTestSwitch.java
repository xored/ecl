/**
 * <copyright>
 * </copyright>
 *
 * $Id: DLTKTestSwitch.java,v 1.1 2010/08/02 09:24:11 andrey Exp $
 */
package org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.util;

import java.util.List;

import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.*;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage
 * @generated
 */
public class DLTKTestSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DLTKTestPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLTKTestSwitch() {
		if (modelPackage == null) {
			modelPackage = DLTKTestPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DLTKTestPackage.ADD_INTERPRETER: {
				AddInterpreter addInterpreter = (AddInterpreter)theEObject;
				T result = caseAddInterpreter(addInterpreter);
				if (result == null) result = caseCommand(addInterpreter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.REMOVE_INTERPRETER: {
				RemoveInterpreter removeInterpreter = (RemoveInterpreter)theEObject;
				T result = caseRemoveInterpreter(removeInterpreter);
				if (result == null) result = caseCommand(removeInterpreter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.REMOVE_ALL_INTERPRETERS: {
				RemoveAllInterpreters removeAllInterpreters = (RemoveAllInterpreters)theEObject;
				T result = caseRemoveAllInterpreters(removeAllInterpreters);
				if (result == null) result = caseCommand(removeAllInterpreters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.OPEN_PERSPECTIVE: {
				OpenPerspective openPerspective = (OpenPerspective)theEObject;
				T result = caseOpenPerspective(openPerspective);
				if (result == null) result = caseCommand(openPerspective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.CREATE_PROJECT: {
				CreateProject createProject = (CreateProject)theEObject;
				T result = caseCreateProject(createProject);
				if (result == null) result = caseCommand(createProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.DELETE_PROJECT: {
				DeleteProject deleteProject = (DeleteProject)theEObject;
				T result = caseDeleteProject(deleteProject);
				if (result == null) result = caseCommand(deleteProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.CLOSE_PROJECT: {
				CloseProject closeProject = (CloseProject)theEObject;
				T result = caseCloseProject(closeProject);
				if (result == null) result = caseCommand(closeProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.ASSERT_PERSPECTIVE: {
				AssertPerspective assertPerspective = (AssertPerspective)theEObject;
				T result = caseAssertPerspective(assertPerspective);
				if (result == null) result = caseCommand(assertPerspective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.ASSERT_INTERPRETER: {
				AssertInterpreter assertInterpreter = (AssertInterpreter)theEObject;
				T result = caseAssertInterpreter(assertInterpreter);
				if (result == null) result = caseCommand(assertInterpreter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.ASSERT_NO_INTERPRETERS: {
				AssertNoInterpreters assertNoInterpreters = (AssertNoInterpreters)theEObject;
				T result = caseAssertNoInterpreters(assertNoInterpreters);
				if (result == null) result = caseCommand(assertNoInterpreters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.IS_PROJECT_EXIST: {
				IsProjectExist isProjectExist = (IsProjectExist)theEObject;
				T result = caseIsProjectExist(isProjectExist);
				if (result == null) result = caseCommand(isProjectExist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.IS_PROJECT_OPEN: {
				IsProjectOpen isProjectOpen = (IsProjectOpen)theEObject;
				T result = caseIsProjectOpen(isProjectOpen);
				if (result == null) result = caseCommand(isProjectOpen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.GET_PLUGIN_PATH: {
				GetPluginPath getPluginPath = (GetPluginPath)theEObject;
				T result = caseGetPluginPath(getPluginPath);
				if (result == null) result = caseCommand(getPluginPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DLTKTestPackage.WAIT_FOR_JOB: {
				WaitForJob waitForJob = (WaitForJob)theEObject;
				T result = caseWaitForJob(waitForJob);
				if (result == null) result = caseCommand(waitForJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Interpreter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddInterpreter(AddInterpreter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Interpreter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveInterpreter(RemoveInterpreter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove All Interpreters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove All Interpreters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveAllInterpreters(RemoveAllInterpreters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Perspective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenPerspective(OpenPerspective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateProject(CreateProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteProject(DeleteProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseProject(CloseProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Perspective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertPerspective(AssertPerspective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Interpreter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertInterpreter(AssertInterpreter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert No Interpreters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert No Interpreters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertNoInterpreters(AssertNoInterpreters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Project Exist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Project Exist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsProjectExist(IsProjectExist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Project Open</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Project Open</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsProjectOpen(IsProjectOpen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Plugin Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Plugin Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPluginPath(GetPluginPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait For Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait For Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitForJob(WaitForJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DLTKTestSwitch
