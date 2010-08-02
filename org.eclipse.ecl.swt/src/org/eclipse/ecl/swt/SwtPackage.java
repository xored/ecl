/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwtPackage.java,v 1.1 2010/08/02 09:24:17 andrey Exp $
 */
package org.eclipse.ecl.swt;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.swt.SwtFactory
 * @model kind="package"
 * @generated
 */
public interface SwtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "swt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ecl/swt.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.ecl.swt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SwtPackage eINSTANCE = org.eclipse.ecl.swt.impl.SwtPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.FindControlsImpl <em>Find Controls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.FindControlsImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getFindControls()
	 * @generated
	 */
	int FIND_CONTROLS = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_CONTROLS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_CONTROLS__TYPE = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_CONTROLS__TEXT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_CONTROLS__LABEL = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_CONTROLS__INDEX = CorePackage.COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Find Controls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_CONTROLS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetTextImpl <em>Get Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetTextImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetText()
	 * @generated
	 */
	int GET_TEXT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.SetTextImpl <em>Set Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.SetTextImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getSetText()
	 * @generated
	 */
	int SET_TEXT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.SelectImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.ClickImpl <em>Click</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.ClickImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getClick()
	 * @generated
	 */
	int CLICK = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.WaitShellClosesImpl <em>Wait Shell Closes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.WaitShellClosesImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getWaitShellCloses()
	 * @generated
	 */
	int WAIT_SHELL_CLOSES = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.WaitShellIsActiveImpl <em>Wait Shell Is Active</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.WaitShellIsActiveImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getWaitShellIsActive()
	 * @generated
	 */
	int WAIT_SHELL_IS_ACTIVE = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetTreeItemImpl <em>Get Tree Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetTreeItemImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetTreeItem()
	 * @generated
	 */
	int GET_TREE_ITEM = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.ContextMenuImpl <em>Context Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.ContextMenuImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getContextMenu()
	 * @generated
	 */
	int CONTEXT_MENU = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetBotImpl <em>Get Bot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetBotImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetBot()
	 * @generated
	 */
	int GET_BOT = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.TypeTextImpl <em>Type Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.TypeTextImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getTypeText()
	 * @generated
	 */
	int TYPE_TEXT = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.WaitTableHasRowsImpl <em>Wait Table Has Rows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.WaitTableHasRowsImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getWaitTableHasRows()
	 * @generated
	 */
	int WAIT_TABLE_HAS_ROWS = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.CheckImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetTableItemImpl <em>Get Table Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetTableItemImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetTableItem()
	 * @generated
	 */
	int GET_TABLE_ITEM = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.WaitEnabledImpl <em>Wait Enabled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.WaitEnabledImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getWaitEnabled()
	 * @generated
	 */
	int WAIT_ENABLED = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetMenuImpl <em>Get Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetMenuImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetMenu()
	 * @generated
	 */
	int GET_MENU = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MENU__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MENU__PATH = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MENU_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetButtonImpl <em>Get Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetButtonImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetButton()
	 * @generated
	 */
	int GET_BUTTON = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetTreeImpl <em>Get Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetTreeImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetTree()
	 * @generated
	 */
	int GET_TREE = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetEditboxImpl <em>Get Editbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetEditboxImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetEditbox()
	 * @generated
	 */
	int GET_EDITBOX = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetViewImpl <em>Get View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetViewImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetView()
	 * @generated
	 */
	int GET_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_VIEW__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_VIEW__TITLE = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_VIEW_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetEditorImpl <em>Get Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetEditorImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetEditor()
	 * @generated
	 */
	int GET_EDITOR = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EDITOR__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EDITOR__TITLE = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EDITOR_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TEXT__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The number of structural features of the '<em>Get Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TEXT_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TEXT__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TEXT__TEXT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TEXT_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__ITEM = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The number of structural features of the '<em>Click</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_SHELL_CLOSES__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_SHELL_CLOSES__TEXT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_SHELL_CLOSES__TIMEOUT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wait Shell Closes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_SHELL_CLOSES_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_SHELL_IS_ACTIVE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_SHELL_IS_ACTIVE__TEXT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_SHELL_IS_ACTIVE__TIMEOUT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wait Shell Is Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_SHELL_IS_ACTIVE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TREE_ITEM__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TREE_ITEM__TEXT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Tree Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TREE_ITEM_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__TEXT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BOT__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The number of structural features of the '<em>Get Bot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BOT_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TEXT__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TEXT__TEXT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TEXT_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TABLE_HAS_ROWS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TABLE_HAS_ROWS__ROWS = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TABLE_HAS_ROWS__TIMEOUT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wait Table Has Rows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TABLE_HAS_ROWS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TABLE_ITEM__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TABLE_ITEM__ITEM = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Table Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TABLE_ITEM_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_ENABLED__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_ENABLED__TIMEOUT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait Enabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_ENABLED_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BUTTON__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BUTTON__TEXT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BUTTON_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TREE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The number of structural features of the '<em>Get Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TREE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EDITBOX__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EDITBOX__LABEL = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Editbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EDITBOX_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetCheckboxImpl <em>Get Checkbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetCheckboxImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetCheckbox()
	 * @generated
	 */
	int GET_CHECKBOX = 21;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CHECKBOX__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CHECKBOX__TEXT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CHECKBOX_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.swt.impl.GetItemImpl <em>Get Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.swt.impl.GetItemImpl
	 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetItem()
	 * @generated
	 */
	int GET_ITEM = 22;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ITEM__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ITEM__ITEM = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ITEM_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.FindControls <em>Find Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find Controls</em>'.
	 * @see org.eclipse.ecl.swt.FindControls
	 * @generated
	 */
	EClass getFindControls();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.FindControls#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.ecl.swt.FindControls#getType()
	 * @see #getFindControls()
	 * @generated
	 */
	EAttribute getFindControls_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.FindControls#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.swt.FindControls#getText()
	 * @see #getFindControls()
	 * @generated
	 */
	EAttribute getFindControls_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.FindControls#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.ecl.swt.FindControls#getLabel()
	 * @see #getFindControls()
	 * @generated
	 */
	EAttribute getFindControls_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.FindControls#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.ecl.swt.FindControls#getIndex()
	 * @see #getFindControls()
	 * @generated
	 */
	EAttribute getFindControls_Index();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetText <em>Get Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Text</em>'.
	 * @see org.eclipse.ecl.swt.GetText
	 * @generated
	 */
	EClass getGetText();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.SetText <em>Set Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Text</em>'.
	 * @see org.eclipse.ecl.swt.SetText
	 * @generated
	 */
	EClass getSetText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.SetText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.swt.SetText#getText()
	 * @see #getSetText()
	 * @generated
	 */
	EAttribute getSetText_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see org.eclipse.ecl.swt.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.Select#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item</em>'.
	 * @see org.eclipse.ecl.swt.Select#getItem()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Item();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.Click <em>Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Click</em>'.
	 * @see org.eclipse.ecl.swt.Click
	 * @generated
	 */
	EClass getClick();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.WaitShellCloses <em>Wait Shell Closes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait Shell Closes</em>'.
	 * @see org.eclipse.ecl.swt.WaitShellCloses
	 * @generated
	 */
	EClass getWaitShellCloses();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.WaitShellCloses#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.swt.WaitShellCloses#getText()
	 * @see #getWaitShellCloses()
	 * @generated
	 */
	EAttribute getWaitShellCloses_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.WaitShellCloses#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.eclipse.ecl.swt.WaitShellCloses#getTimeout()
	 * @see #getWaitShellCloses()
	 * @generated
	 */
	EAttribute getWaitShellCloses_Timeout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.WaitShellIsActive <em>Wait Shell Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait Shell Is Active</em>'.
	 * @see org.eclipse.ecl.swt.WaitShellIsActive
	 * @generated
	 */
	EClass getWaitShellIsActive();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.WaitShellIsActive#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.swt.WaitShellIsActive#getText()
	 * @see #getWaitShellIsActive()
	 * @generated
	 */
	EAttribute getWaitShellIsActive_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.WaitShellIsActive#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.eclipse.ecl.swt.WaitShellIsActive#getTimeout()
	 * @see #getWaitShellIsActive()
	 * @generated
	 */
	EAttribute getWaitShellIsActive_Timeout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetTreeItem <em>Get Tree Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Tree Item</em>'.
	 * @see org.eclipse.ecl.swt.GetTreeItem
	 * @generated
	 */
	EClass getGetTreeItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.GetTreeItem#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.swt.GetTreeItem#getText()
	 * @see #getGetTreeItem()
	 * @generated
	 */
	EAttribute getGetTreeItem_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.ContextMenu <em>Context Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Menu</em>'.
	 * @see org.eclipse.ecl.swt.ContextMenu
	 * @generated
	 */
	EClass getContextMenu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.ContextMenu#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.swt.ContextMenu#getText()
	 * @see #getContextMenu()
	 * @generated
	 */
	EAttribute getContextMenu_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetBot <em>Get Bot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Bot</em>'.
	 * @see org.eclipse.ecl.swt.GetBot
	 * @generated
	 */
	EClass getGetBot();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.TypeText <em>Type Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Text</em>'.
	 * @see org.eclipse.ecl.swt.TypeText
	 * @generated
	 */
	EClass getTypeText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.TypeText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.swt.TypeText#getText()
	 * @see #getTypeText()
	 * @generated
	 */
	EAttribute getTypeText_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.WaitTableHasRows <em>Wait Table Has Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait Table Has Rows</em>'.
	 * @see org.eclipse.ecl.swt.WaitTableHasRows
	 * @generated
	 */
	EClass getWaitTableHasRows();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.WaitTableHasRows#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see org.eclipse.ecl.swt.WaitTableHasRows#getRows()
	 * @see #getWaitTableHasRows()
	 * @generated
	 */
	EAttribute getWaitTableHasRows_Rows();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.WaitTableHasRows#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.eclipse.ecl.swt.WaitTableHasRows#getTimeout()
	 * @see #getWaitTableHasRows()
	 * @generated
	 */
	EAttribute getWaitTableHasRows_Timeout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see org.eclipse.ecl.swt.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetTableItem <em>Get Table Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Table Item</em>'.
	 * @see org.eclipse.ecl.swt.GetTableItem
	 * @generated
	 */
	EClass getGetTableItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.GetTableItem#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item</em>'.
	 * @see org.eclipse.ecl.swt.GetTableItem#getItem()
	 * @see #getGetTableItem()
	 * @generated
	 */
	EAttribute getGetTableItem_Item();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.WaitEnabled <em>Wait Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait Enabled</em>'.
	 * @see org.eclipse.ecl.swt.WaitEnabled
	 * @generated
	 */
	EClass getWaitEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.WaitEnabled#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.eclipse.ecl.swt.WaitEnabled#getTimeout()
	 * @see #getWaitEnabled()
	 * @generated
	 */
	EAttribute getWaitEnabled_Timeout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetMenu <em>Get Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Menu</em>'.
	 * @see org.eclipse.ecl.swt.GetMenu
	 * @generated
	 */
	EClass getGetMenu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.GetMenu#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.ecl.swt.GetMenu#getPath()
	 * @see #getGetMenu()
	 * @generated
	 */
	EAttribute getGetMenu_Path();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetButton <em>Get Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Button</em>'.
	 * @see org.eclipse.ecl.swt.GetButton
	 * @generated
	 */
	EClass getGetButton();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.GetButton#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.swt.GetButton#getText()
	 * @see #getGetButton()
	 * @generated
	 */
	EAttribute getGetButton_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetTree <em>Get Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Tree</em>'.
	 * @see org.eclipse.ecl.swt.GetTree
	 * @generated
	 */
	EClass getGetTree();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetEditbox <em>Get Editbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Editbox</em>'.
	 * @see org.eclipse.ecl.swt.GetEditbox
	 * @generated
	 */
	EClass getGetEditbox();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.GetEditbox#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.ecl.swt.GetEditbox#getLabel()
	 * @see #getGetEditbox()
	 * @generated
	 */
	EAttribute getGetEditbox_Label();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetView <em>Get View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get View</em>'.
	 * @see org.eclipse.ecl.swt.GetView
	 * @generated
	 */
	EClass getGetView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.GetView#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.ecl.swt.GetView#getTitle()
	 * @see #getGetView()
	 * @generated
	 */
	EAttribute getGetView_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetEditor <em>Get Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Editor</em>'.
	 * @see org.eclipse.ecl.swt.GetEditor
	 * @generated
	 */
	EClass getGetEditor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.GetEditor#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.ecl.swt.GetEditor#getTitle()
	 * @see #getGetEditor()
	 * @generated
	 */
	EAttribute getGetEditor_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetCheckbox <em>Get Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Checkbox</em>'.
	 * @see org.eclipse.ecl.swt.GetCheckbox
	 * @generated
	 */
	EClass getGetCheckbox();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.GetCheckbox#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.swt.GetCheckbox#getText()
	 * @see #getGetCheckbox()
	 * @generated
	 */
	EAttribute getGetCheckbox_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.swt.GetItem <em>Get Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Item</em>'.
	 * @see org.eclipse.ecl.swt.GetItem
	 * @generated
	 */
	EClass getGetItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.swt.GetItem#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item</em>'.
	 * @see org.eclipse.ecl.swt.GetItem#getItem()
	 * @see #getGetItem()
	 * @generated
	 */
	EAttribute getGetItem_Item();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SwtFactory getSwtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.FindControlsImpl <em>Find Controls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.FindControlsImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getFindControls()
		 * @generated
		 */
		EClass FIND_CONTROLS = eINSTANCE.getFindControls();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND_CONTROLS__TYPE = eINSTANCE.getFindControls_Type();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND_CONTROLS__TEXT = eINSTANCE.getFindControls_Text();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND_CONTROLS__LABEL = eINSTANCE.getFindControls_Label();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND_CONTROLS__INDEX = eINSTANCE.getFindControls_Index();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetTextImpl <em>Get Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetTextImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetText()
		 * @generated
		 */
		EClass GET_TEXT = eINSTANCE.getGetText();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.SetTextImpl <em>Set Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.SetTextImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getSetText()
		 * @generated
		 */
		EClass SET_TEXT = eINSTANCE.getSetText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TEXT__TEXT = eINSTANCE.getSetText_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.SelectImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__ITEM = eINSTANCE.getSelect_Item();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.ClickImpl <em>Click</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.ClickImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getClick()
		 * @generated
		 */
		EClass CLICK = eINSTANCE.getClick();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.WaitShellClosesImpl <em>Wait Shell Closes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.WaitShellClosesImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getWaitShellCloses()
		 * @generated
		 */
		EClass WAIT_SHELL_CLOSES = eINSTANCE.getWaitShellCloses();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_SHELL_CLOSES__TEXT = eINSTANCE.getWaitShellCloses_Text();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_SHELL_CLOSES__TIMEOUT = eINSTANCE.getWaitShellCloses_Timeout();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.WaitShellIsActiveImpl <em>Wait Shell Is Active</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.WaitShellIsActiveImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getWaitShellIsActive()
		 * @generated
		 */
		EClass WAIT_SHELL_IS_ACTIVE = eINSTANCE.getWaitShellIsActive();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_SHELL_IS_ACTIVE__TEXT = eINSTANCE.getWaitShellIsActive_Text();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_SHELL_IS_ACTIVE__TIMEOUT = eINSTANCE.getWaitShellIsActive_Timeout();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetTreeItemImpl <em>Get Tree Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetTreeItemImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetTreeItem()
		 * @generated
		 */
		EClass GET_TREE_ITEM = eINSTANCE.getGetTreeItem();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TREE_ITEM__TEXT = eINSTANCE.getGetTreeItem_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.ContextMenuImpl <em>Context Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.ContextMenuImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getContextMenu()
		 * @generated
		 */
		EClass CONTEXT_MENU = eINSTANCE.getContextMenu();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MENU__TEXT = eINSTANCE.getContextMenu_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetBotImpl <em>Get Bot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetBotImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetBot()
		 * @generated
		 */
		EClass GET_BOT = eINSTANCE.getGetBot();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.TypeTextImpl <em>Type Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.TypeTextImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getTypeText()
		 * @generated
		 */
		EClass TYPE_TEXT = eINSTANCE.getTypeText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TEXT__TEXT = eINSTANCE.getTypeText_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.WaitTableHasRowsImpl <em>Wait Table Has Rows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.WaitTableHasRowsImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getWaitTableHasRows()
		 * @generated
		 */
		EClass WAIT_TABLE_HAS_ROWS = eINSTANCE.getWaitTableHasRows();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_TABLE_HAS_ROWS__ROWS = eINSTANCE.getWaitTableHasRows_Rows();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_TABLE_HAS_ROWS__TIMEOUT = eINSTANCE.getWaitTableHasRows_Timeout();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.CheckImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetTableItemImpl <em>Get Table Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetTableItemImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetTableItem()
		 * @generated
		 */
		EClass GET_TABLE_ITEM = eINSTANCE.getGetTableItem();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TABLE_ITEM__ITEM = eINSTANCE.getGetTableItem_Item();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.WaitEnabledImpl <em>Wait Enabled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.WaitEnabledImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getWaitEnabled()
		 * @generated
		 */
		EClass WAIT_ENABLED = eINSTANCE.getWaitEnabled();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_ENABLED__TIMEOUT = eINSTANCE.getWaitEnabled_Timeout();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetMenuImpl <em>Get Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetMenuImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetMenu()
		 * @generated
		 */
		EClass GET_MENU = eINSTANCE.getGetMenu();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_MENU__PATH = eINSTANCE.getGetMenu_Path();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetButtonImpl <em>Get Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetButtonImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetButton()
		 * @generated
		 */
		EClass GET_BUTTON = eINSTANCE.getGetButton();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_BUTTON__TEXT = eINSTANCE.getGetButton_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetTreeImpl <em>Get Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetTreeImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetTree()
		 * @generated
		 */
		EClass GET_TREE = eINSTANCE.getGetTree();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetEditboxImpl <em>Get Editbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetEditboxImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetEditbox()
		 * @generated
		 */
		EClass GET_EDITBOX = eINSTANCE.getGetEditbox();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_EDITBOX__LABEL = eINSTANCE.getGetEditbox_Label();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetViewImpl <em>Get View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetViewImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetView()
		 * @generated
		 */
		EClass GET_VIEW = eINSTANCE.getGetView();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_VIEW__TITLE = eINSTANCE.getGetView_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetEditorImpl <em>Get Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetEditorImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetEditor()
		 * @generated
		 */
		EClass GET_EDITOR = eINSTANCE.getGetEditor();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_EDITOR__TITLE = eINSTANCE.getGetEditor_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetCheckboxImpl <em>Get Checkbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetCheckboxImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetCheckbox()
		 * @generated
		 */
		EClass GET_CHECKBOX = eINSTANCE.getGetCheckbox();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CHECKBOX__TEXT = eINSTANCE.getGetCheckbox_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.swt.impl.GetItemImpl <em>Get Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.swt.impl.GetItemImpl
		 * @see org.eclipse.ecl.swt.impl.SwtPackageImpl#getGetItem()
		 * @generated
		 */
		EClass GET_ITEM = eINSTANCE.getGetItem();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_ITEM__ITEM = eINSTANCE.getGetItem_Item();

	}

} //SwtPackage
