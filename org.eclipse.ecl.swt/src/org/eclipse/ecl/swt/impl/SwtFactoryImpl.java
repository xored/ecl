/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwtFactoryImpl.java,v 1.1 2010/08/02 09:24:13 andrey Exp $
 */
package org.eclipse.ecl.swt.impl;

import org.eclipse.ecl.swt.*;

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
public class SwtFactoryImpl extends EFactoryImpl implements SwtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SwtFactory init() {
		try {
			SwtFactory theSwtFactory = (SwtFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ecl/swt.ecore"); 
			if (theSwtFactory != null) {
				return theSwtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SwtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwtFactoryImpl() {
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
			case SwtPackage.FIND_CONTROLS: return createFindControls();
			case SwtPackage.GET_MENU: return createGetMenu();
			case SwtPackage.GET_VIEW: return createGetView();
			case SwtPackage.GET_EDITOR: return createGetEditor();
			case SwtPackage.GET_TEXT: return createGetText();
			case SwtPackage.SET_TEXT: return createSetText();
			case SwtPackage.SELECT: return createSelect();
			case SwtPackage.CLICK: return createClick();
			case SwtPackage.WAIT_SHELL_CLOSES: return createWaitShellCloses();
			case SwtPackage.WAIT_SHELL_IS_ACTIVE: return createWaitShellIsActive();
			case SwtPackage.GET_TREE_ITEM: return createGetTreeItem();
			case SwtPackage.CONTEXT_MENU: return createContextMenu();
			case SwtPackage.GET_BOT: return createGetBot();
			case SwtPackage.TYPE_TEXT: return createTypeText();
			case SwtPackage.WAIT_TABLE_HAS_ROWS: return createWaitTableHasRows();
			case SwtPackage.CHECK: return createCheck();
			case SwtPackage.GET_TABLE_ITEM: return createGetTableItem();
			case SwtPackage.WAIT_ENABLED: return createWaitEnabled();
			case SwtPackage.GET_BUTTON: return createGetButton();
			case SwtPackage.GET_TREE: return createGetTree();
			case SwtPackage.GET_EDITBOX: return createGetEditbox();
			case SwtPackage.GET_CHECKBOX: return createGetCheckbox();
			case SwtPackage.GET_ITEM: return createGetItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindControls createFindControls() {
		FindControlsImpl findControls = new FindControlsImpl();
		return findControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetText createGetText() {
		GetTextImpl getText = new GetTextImpl();
		return getText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetText createSetText() {
		SetTextImpl setText = new SetTextImpl();
		return setText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Click createClick() {
		ClickImpl click = new ClickImpl();
		return click;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitShellCloses createWaitShellCloses() {
		WaitShellClosesImpl waitShellCloses = new WaitShellClosesImpl();
		return waitShellCloses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitShellIsActive createWaitShellIsActive() {
		WaitShellIsActiveImpl waitShellIsActive = new WaitShellIsActiveImpl();
		return waitShellIsActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTreeItem createGetTreeItem() {
		GetTreeItemImpl getTreeItem = new GetTreeItemImpl();
		return getTreeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMenu createContextMenu() {
		ContextMenuImpl contextMenu = new ContextMenuImpl();
		return contextMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetBot createGetBot() {
		GetBotImpl getBot = new GetBotImpl();
		return getBot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeText createTypeText() {
		TypeTextImpl typeText = new TypeTextImpl();
		return typeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitTableHasRows createWaitTableHasRows() {
		WaitTableHasRowsImpl waitTableHasRows = new WaitTableHasRowsImpl();
		return waitTableHasRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Check createCheck() {
		CheckImpl check = new CheckImpl();
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTableItem createGetTableItem() {
		GetTableItemImpl getTableItem = new GetTableItemImpl();
		return getTableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitEnabled createWaitEnabled() {
		WaitEnabledImpl waitEnabled = new WaitEnabledImpl();
		return waitEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetMenu createGetMenu() {
		GetMenuImpl getMenu = new GetMenuImpl();
		return getMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetButton createGetButton() {
		GetButtonImpl getButton = new GetButtonImpl();
		return getButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTree createGetTree() {
		GetTreeImpl getTree = new GetTreeImpl();
		return getTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetEditbox createGetEditbox() {
		GetEditboxImpl getEditbox = new GetEditboxImpl();
		return getEditbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetView createGetView() {
		GetViewImpl getView = new GetViewImpl();
		return getView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetEditor createGetEditor() {
		GetEditorImpl getEditor = new GetEditorImpl();
		return getEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetCheckbox createGetCheckbox() {
		GetCheckboxImpl getCheckbox = new GetCheckboxImpl();
		return getCheckbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetItem createGetItem() {
		GetItemImpl getItem = new GetItemImpl();
		return getItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwtPackage getSwtPackage() {
		return (SwtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SwtPackage getPackage() {
		return SwtPackage.eINSTANCE;
	}

} //SwtFactoryImpl
