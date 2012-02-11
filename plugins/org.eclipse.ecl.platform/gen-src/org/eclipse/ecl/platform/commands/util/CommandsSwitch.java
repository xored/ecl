/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.commands.util;

import java.util.List;

import org.eclipse.ecl.core.Command;

import org.eclipse.ecl.platform.commands.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * @see org.eclipse.ecl.platform.commands.CommandsPackage
 * @generated
 */
public class CommandsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommandsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsSwitch() {
		if (modelPackage == null) {
			modelPackage = CommandsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CommandsPackage.LIST_PLUGINS: {
				ListPlugins listPlugins = (ListPlugins)theEObject;
				T result = caseListPlugins(listPlugins);
				if (result == null) result = caseCommand(listPlugins);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.LIST_FEATURES: {
				ListFeatures listFeatures = (ListFeatures)theEObject;
				T result = caseListFeatures(listFeatures);
				if (result == null) result = caseCommand(listFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.LIST_REPOSITORIES: {
				ListRepositories listRepositories = (ListRepositories)theEObject;
				T result = caseListRepositories(listRepositories);
				if (result == null) result = caseCommand(listRepositories);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.ADD_REPOSITORY: {
				AddRepository addRepository = (AddRepository)theEObject;
				T result = caseAddRepository(addRepository);
				if (result == null) result = caseCommand(addRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.REMOVE_REPOSITORY: {
				RemoveRepository removeRepository = (RemoveRepository)theEObject;
				T result = caseRemoveRepository(removeRepository);
				if (result == null) result = caseCommand(removeRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.UPDATE_FEATURE: {
				UpdateFeature updateFeature = (UpdateFeature)theEObject;
				T result = caseUpdateFeature(updateFeature);
				if (result == null) result = caseCommand(updateFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.UPDATE_ALL: {
				UpdateAll updateAll = (UpdateAll)theEObject;
				T result = caseUpdateAll(updateAll);
				if (result == null) result = caseCommand(updateAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.PRINT: {
				Print print = (Print)theEObject;
				T result = casePrint(print);
				if (result == null) result = caseCommand(print);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.SORT_BY: {
				SortBy sortBy = (SortBy)theEObject;
				T result = caseSortBy(sortBy);
				if (result == null) result = caseCommand(sortBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.LIST_INSTALL_UNITS: {
				ListInstallUnits listInstallUnits = (ListInstallUnits)theEObject;
				T result = caseListInstallUnits(listInstallUnits);
				if (result == null) result = caseCommand(listInstallUnits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.GET_LOG: {
				GetLog getLog = (GetLog)theEObject;
				T result = caseGetLog(getLog);
				if (result == null) result = caseCommand(getLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.LOG: {
				Log log = (Log)theEObject;
				T result = caseLog(log);
				if (result == null) result = caseCommand(log);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.ECHO: {
				Echo echo = (Echo)theEObject;
				T result = caseEcho(echo);
				if (result == null) result = caseCommand(echo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Plugins</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Plugins</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListPlugins(ListPlugins object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListFeatures(ListFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Repositories</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Repositories</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListRepositories(ListRepositories object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddRepository(AddRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveRepository(RemoveRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateFeature(UpdateFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateAll(UpdateAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrint(Print object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortBy(SortBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Install Units</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Install Units</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListInstallUnits(ListInstallUnits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetLog(GetLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLog(Log object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Echo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Echo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcho(Echo object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CommandsSwitch
