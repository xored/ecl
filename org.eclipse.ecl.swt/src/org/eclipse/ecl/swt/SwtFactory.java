/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwtFactory.java,v 1.1 2010/08/02 09:24:17 andrey Exp $
 */
package org.eclipse.ecl.swt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.swt.SwtPackage
 * @generated
 */
public interface SwtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SwtFactory eINSTANCE = org.eclipse.ecl.swt.impl.SwtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Find Controls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find Controls</em>'.
	 * @generated
	 */
	FindControls createFindControls();

	/**
	 * Returns a new object of class '<em>Get Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Text</em>'.
	 * @generated
	 */
	GetText createGetText();

	/**
	 * Returns a new object of class '<em>Set Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Text</em>'.
	 * @generated
	 */
	SetText createSetText();

	/**
	 * Returns a new object of class '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select</em>'.
	 * @generated
	 */
	Select createSelect();

	/**
	 * Returns a new object of class '<em>Click</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Click</em>'.
	 * @generated
	 */
	Click createClick();

	/**
	 * Returns a new object of class '<em>Wait Shell Closes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait Shell Closes</em>'.
	 * @generated
	 */
	WaitShellCloses createWaitShellCloses();

	/**
	 * Returns a new object of class '<em>Wait Shell Is Active</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait Shell Is Active</em>'.
	 * @generated
	 */
	WaitShellIsActive createWaitShellIsActive();

	/**
	 * Returns a new object of class '<em>Get Tree Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Tree Item</em>'.
	 * @generated
	 */
	GetTreeItem createGetTreeItem();

	/**
	 * Returns a new object of class '<em>Context Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Menu</em>'.
	 * @generated
	 */
	ContextMenu createContextMenu();

	/**
	 * Returns a new object of class '<em>Get Bot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Bot</em>'.
	 * @generated
	 */
	GetBot createGetBot();

	/**
	 * Returns a new object of class '<em>Type Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Text</em>'.
	 * @generated
	 */
	TypeText createTypeText();

	/**
	 * Returns a new object of class '<em>Wait Table Has Rows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait Table Has Rows</em>'.
	 * @generated
	 */
	WaitTableHasRows createWaitTableHasRows();

	/**
	 * Returns a new object of class '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check</em>'.
	 * @generated
	 */
	Check createCheck();

	/**
	 * Returns a new object of class '<em>Get Table Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Table Item</em>'.
	 * @generated
	 */
	GetTableItem createGetTableItem();

	/**
	 * Returns a new object of class '<em>Wait Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait Enabled</em>'.
	 * @generated
	 */
	WaitEnabled createWaitEnabled();

	/**
	 * Returns a new object of class '<em>Get Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Menu</em>'.
	 * @generated
	 */
	GetMenu createGetMenu();

	/**
	 * Returns a new object of class '<em>Get Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Button</em>'.
	 * @generated
	 */
	GetButton createGetButton();

	/**
	 * Returns a new object of class '<em>Get Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Tree</em>'.
	 * @generated
	 */
	GetTree createGetTree();

	/**
	 * Returns a new object of class '<em>Get Editbox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Editbox</em>'.
	 * @generated
	 */
	GetEditbox createGetEditbox();

	/**
	 * Returns a new object of class '<em>Get View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get View</em>'.
	 * @generated
	 */
	GetView createGetView();

	/**
	 * Returns a new object of class '<em>Get Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Editor</em>'.
	 * @generated
	 */
	GetEditor createGetEditor();

	/**
	 * Returns a new object of class '<em>Get Checkbox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Checkbox</em>'.
	 * @generated
	 */
	GetCheckbox createGetCheckbox();

	/**
	 * Returns a new object of class '<em>Get Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Item</em>'.
	 * @generated
	 */
	GetItem createGetItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SwtPackage getSwtPackage();

} //SwtFactory
