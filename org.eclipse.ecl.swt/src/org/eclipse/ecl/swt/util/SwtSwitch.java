/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwtSwitch.java,v 1.1 2010/08/02 09:24:18 andrey Exp $
 */
package org.eclipse.ecl.swt.util;

import java.util.List;

import org.eclipse.ecl.core.Command;

import org.eclipse.ecl.swt.*;

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
 * @see org.eclipse.ecl.swt.SwtPackage
 * @generated
 */
public class SwtSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SwtPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwtSwitch() {
		if (modelPackage == null) {
			modelPackage = SwtPackage.eINSTANCE;
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
			case SwtPackage.FIND_CONTROLS: {
				FindControls findControls = (FindControls)theEObject;
				T result = caseFindControls(findControls);
				if (result == null) result = caseCommand(findControls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_MENU: {
				GetMenu getMenu = (GetMenu)theEObject;
				T result = caseGetMenu(getMenu);
				if (result == null) result = caseCommand(getMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_VIEW: {
				GetView getView = (GetView)theEObject;
				T result = caseGetView(getView);
				if (result == null) result = caseCommand(getView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_EDITOR: {
				GetEditor getEditor = (GetEditor)theEObject;
				T result = caseGetEditor(getEditor);
				if (result == null) result = caseCommand(getEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_TEXT: {
				GetText getText = (GetText)theEObject;
				T result = caseGetText(getText);
				if (result == null) result = caseCommand(getText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.SET_TEXT: {
				SetText setText = (SetText)theEObject;
				T result = caseSetText(setText);
				if (result == null) result = caseCommand(setText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.SELECT: {
				Select select = (Select)theEObject;
				T result = caseSelect(select);
				if (result == null) result = caseCommand(select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.CLICK: {
				Click click = (Click)theEObject;
				T result = caseClick(click);
				if (result == null) result = caseCommand(click);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.WAIT_SHELL_CLOSES: {
				WaitShellCloses waitShellCloses = (WaitShellCloses)theEObject;
				T result = caseWaitShellCloses(waitShellCloses);
				if (result == null) result = caseCommand(waitShellCloses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.WAIT_SHELL_IS_ACTIVE: {
				WaitShellIsActive waitShellIsActive = (WaitShellIsActive)theEObject;
				T result = caseWaitShellIsActive(waitShellIsActive);
				if (result == null) result = caseCommand(waitShellIsActive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_TREE_ITEM: {
				GetTreeItem getTreeItem = (GetTreeItem)theEObject;
				T result = caseGetTreeItem(getTreeItem);
				if (result == null) result = caseCommand(getTreeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.CONTEXT_MENU: {
				ContextMenu contextMenu = (ContextMenu)theEObject;
				T result = caseContextMenu(contextMenu);
				if (result == null) result = caseCommand(contextMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_BOT: {
				GetBot getBot = (GetBot)theEObject;
				T result = caseGetBot(getBot);
				if (result == null) result = caseCommand(getBot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.TYPE_TEXT: {
				TypeText typeText = (TypeText)theEObject;
				T result = caseTypeText(typeText);
				if (result == null) result = caseCommand(typeText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.WAIT_TABLE_HAS_ROWS: {
				WaitTableHasRows waitTableHasRows = (WaitTableHasRows)theEObject;
				T result = caseWaitTableHasRows(waitTableHasRows);
				if (result == null) result = caseCommand(waitTableHasRows);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.CHECK: {
				Check check = (Check)theEObject;
				T result = caseCheck(check);
				if (result == null) result = caseCommand(check);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_TABLE_ITEM: {
				GetTableItem getTableItem = (GetTableItem)theEObject;
				T result = caseGetTableItem(getTableItem);
				if (result == null) result = caseCommand(getTableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.WAIT_ENABLED: {
				WaitEnabled waitEnabled = (WaitEnabled)theEObject;
				T result = caseWaitEnabled(waitEnabled);
				if (result == null) result = caseCommand(waitEnabled);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_BUTTON: {
				GetButton getButton = (GetButton)theEObject;
				T result = caseGetButton(getButton);
				if (result == null) result = caseCommand(getButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_TREE: {
				GetTree getTree = (GetTree)theEObject;
				T result = caseGetTree(getTree);
				if (result == null) result = caseCommand(getTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_EDITBOX: {
				GetEditbox getEditbox = (GetEditbox)theEObject;
				T result = caseGetEditbox(getEditbox);
				if (result == null) result = caseCommand(getEditbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_CHECKBOX: {
				GetCheckbox getCheckbox = (GetCheckbox)theEObject;
				T result = caseGetCheckbox(getCheckbox);
				if (result == null) result = caseCommand(getCheckbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwtPackage.GET_ITEM: {
				GetItem getItem = (GetItem)theEObject;
				T result = caseGetItem(getItem);
				if (result == null) result = caseCommand(getItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find Controls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find Controls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindControls(FindControls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetText(GetText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetText(SetText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelect(Select object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Click</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Click</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClick(Click object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait Shell Closes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait Shell Closes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitShellCloses(WaitShellCloses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait Shell Is Active</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait Shell Is Active</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitShellIsActive(WaitShellIsActive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Tree Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Tree Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTreeItem(GetTreeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextMenu(ContextMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Bot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Bot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetBot(GetBot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeText(TypeText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait Table Has Rows</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait Table Has Rows</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitTableHasRows(WaitTableHasRows object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheck(Check object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Table Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Table Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTableItem(GetTableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait Enabled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitEnabled(WaitEnabled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetMenu(GetMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetButton(GetButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTree(GetTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Editbox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Editbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetEditbox(GetEditbox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetView(GetView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetEditor(GetEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Checkbox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Checkbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCheckbox(GetCheckbox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetItem(GetItem object) {
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

} //SwtSwitch
