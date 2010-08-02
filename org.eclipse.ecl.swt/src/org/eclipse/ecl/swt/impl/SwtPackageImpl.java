/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwtPackageImpl.java,v 1.1 2010/08/02 09:24:14 andrey Exp $
 */
package org.eclipse.ecl.swt.impl;

import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.swt.Check;
import org.eclipse.ecl.swt.Click;
import org.eclipse.ecl.swt.ContextMenu;
import org.eclipse.ecl.swt.FindControls;
import org.eclipse.ecl.swt.GetBot;
import org.eclipse.ecl.swt.GetButton;
import org.eclipse.ecl.swt.GetCheckbox;
import org.eclipse.ecl.swt.GetEditbox;
import org.eclipse.ecl.swt.GetEditor;
import org.eclipse.ecl.swt.GetItem;
import org.eclipse.ecl.swt.GetMenu;
import org.eclipse.ecl.swt.GetTableItem;
import org.eclipse.ecl.swt.GetText;
import org.eclipse.ecl.swt.GetTree;
import org.eclipse.ecl.swt.GetTreeItem;
import org.eclipse.ecl.swt.GetView;
import org.eclipse.ecl.swt.Select;
import org.eclipse.ecl.swt.SetText;
import org.eclipse.ecl.swt.SwtFactory;
import org.eclipse.ecl.swt.SwtPackage;
import org.eclipse.ecl.swt.TypeText;
import org.eclipse.ecl.swt.WaitEnabled;
import org.eclipse.ecl.swt.WaitShellCloses;
import org.eclipse.ecl.swt.WaitShellIsActive;
import org.eclipse.ecl.swt.WaitTableHasRows;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class SwtPackageImpl extends EPackageImpl implements SwtPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findControlsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTextEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTextEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clickEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitShellClosesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitShellIsActiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTreeItemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextMenuEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getBotEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeTextEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitTableHasRowsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTableItemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitEnabledEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getMenuEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getButtonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTreeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getEditboxEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getViewEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getEditorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getCheckboxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getItemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.ecl.swt.SwtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SwtPackageImpl() {
		super(eNS_URI, SwtFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SwtPackage init() {
		if (isInited) return (SwtPackage)EPackage.Registry.INSTANCE.getEPackage(SwtPackage.eNS_URI);

		// Obtain or create and register package
		SwtPackageImpl theSwtPackage = (SwtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SwtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SwtPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSwtPackage.createPackageContents();

		// Initialize created meta-data
		theSwtPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSwtPackage.freeze();

		return theSwtPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindControls() {
		return findControlsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFindControls_Type() {
		return (EAttribute)findControlsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFindControls_Text() {
		return (EAttribute)findControlsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFindControls_Label() {
		return (EAttribute)findControlsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFindControls_Index() {
		return (EAttribute)findControlsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetText() {
		return getTextEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetText() {
		return setTextEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetText_Text() {
		return (EAttribute)setTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelect() {
		return selectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelect_Item() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClick() {
		return clickEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaitShellCloses() {
		return waitShellClosesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitShellCloses_Text() {
		return (EAttribute)waitShellClosesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitShellCloses_Timeout() {
		return (EAttribute)waitShellClosesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaitShellIsActive() {
		return waitShellIsActiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitShellIsActive_Text() {
		return (EAttribute)waitShellIsActiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitShellIsActive_Timeout() {
		return (EAttribute)waitShellIsActiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetTreeItem() {
		return getTreeItemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTreeItem_Text() {
		return (EAttribute)getTreeItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextMenu() {
		return contextMenuEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextMenu_Text() {
		return (EAttribute)contextMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetBot() {
		return getBotEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeText() {
		return typeTextEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeText_Text() {
		return (EAttribute)typeTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaitTableHasRows() {
		return waitTableHasRowsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitTableHasRows_Rows() {
		return (EAttribute)waitTableHasRowsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitTableHasRows_Timeout() {
		return (EAttribute)waitTableHasRowsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheck() {
		return checkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetTableItem() {
		return getTableItemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTableItem_Item() {
		return (EAttribute)getTableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaitEnabled() {
		return waitEnabledEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitEnabled_Timeout() {
		return (EAttribute)waitEnabledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetMenu() {
		return getMenuEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetMenu_Path() {
		return (EAttribute)getMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetButton() {
		return getButtonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetButton_Text() {
		return (EAttribute)getButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetTree() {
		return getTreeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetEditbox() {
		return getEditboxEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetEditbox_Label() {
		return (EAttribute)getEditboxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetView() {
		return getViewEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetView_Title() {
		return (EAttribute)getViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetEditor() {
		return getEditorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetEditor_Title() {
		return (EAttribute)getEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetCheckbox() {
		return getCheckboxEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetCheckbox_Text() {
		return (EAttribute)getCheckboxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetItem() {
		return getItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetItem_Item() {
		return (EAttribute)getItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SwtFactory getSwtFactory() {
		return (SwtFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		findControlsEClass = createEClass(FIND_CONTROLS);
		createEAttribute(findControlsEClass, FIND_CONTROLS__TYPE);
		createEAttribute(findControlsEClass, FIND_CONTROLS__TEXT);
		createEAttribute(findControlsEClass, FIND_CONTROLS__LABEL);
		createEAttribute(findControlsEClass, FIND_CONTROLS__INDEX);

		getMenuEClass = createEClass(GET_MENU);
		createEAttribute(getMenuEClass, GET_MENU__PATH);

		getViewEClass = createEClass(GET_VIEW);
		createEAttribute(getViewEClass, GET_VIEW__TITLE);

		getEditorEClass = createEClass(GET_EDITOR);
		createEAttribute(getEditorEClass, GET_EDITOR__TITLE);

		getTextEClass = createEClass(GET_TEXT);

		setTextEClass = createEClass(SET_TEXT);
		createEAttribute(setTextEClass, SET_TEXT__TEXT);

		selectEClass = createEClass(SELECT);
		createEAttribute(selectEClass, SELECT__ITEM);

		clickEClass = createEClass(CLICK);

		waitShellClosesEClass = createEClass(WAIT_SHELL_CLOSES);
		createEAttribute(waitShellClosesEClass, WAIT_SHELL_CLOSES__TEXT);
		createEAttribute(waitShellClosesEClass, WAIT_SHELL_CLOSES__TIMEOUT);

		waitShellIsActiveEClass = createEClass(WAIT_SHELL_IS_ACTIVE);
		createEAttribute(waitShellIsActiveEClass, WAIT_SHELL_IS_ACTIVE__TEXT);
		createEAttribute(waitShellIsActiveEClass, WAIT_SHELL_IS_ACTIVE__TIMEOUT);

		getTreeItemEClass = createEClass(GET_TREE_ITEM);
		createEAttribute(getTreeItemEClass, GET_TREE_ITEM__TEXT);

		contextMenuEClass = createEClass(CONTEXT_MENU);
		createEAttribute(contextMenuEClass, CONTEXT_MENU__TEXT);

		getBotEClass = createEClass(GET_BOT);

		typeTextEClass = createEClass(TYPE_TEXT);
		createEAttribute(typeTextEClass, TYPE_TEXT__TEXT);

		waitTableHasRowsEClass = createEClass(WAIT_TABLE_HAS_ROWS);
		createEAttribute(waitTableHasRowsEClass, WAIT_TABLE_HAS_ROWS__ROWS);
		createEAttribute(waitTableHasRowsEClass, WAIT_TABLE_HAS_ROWS__TIMEOUT);

		checkEClass = createEClass(CHECK);

		getTableItemEClass = createEClass(GET_TABLE_ITEM);
		createEAttribute(getTableItemEClass, GET_TABLE_ITEM__ITEM);

		waitEnabledEClass = createEClass(WAIT_ENABLED);
		createEAttribute(waitEnabledEClass, WAIT_ENABLED__TIMEOUT);

		getButtonEClass = createEClass(GET_BUTTON);
		createEAttribute(getButtonEClass, GET_BUTTON__TEXT);

		getTreeEClass = createEClass(GET_TREE);

		getEditboxEClass = createEClass(GET_EDITBOX);
		createEAttribute(getEditboxEClass, GET_EDITBOX__LABEL);

		getCheckboxEClass = createEClass(GET_CHECKBOX);
		createEAttribute(getCheckboxEClass, GET_CHECKBOX__TEXT);

		getItemEClass = createEClass(GET_ITEM);
		createEAttribute(getItemEClass, GET_ITEM__ITEM);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		findControlsEClass.getESuperTypes().add(theCorePackage.getCommand());
		getMenuEClass.getESuperTypes().add(theCorePackage.getCommand());
		getViewEClass.getESuperTypes().add(theCorePackage.getCommand());
		getEditorEClass.getESuperTypes().add(theCorePackage.getCommand());
		getTextEClass.getESuperTypes().add(theCorePackage.getCommand());
		setTextEClass.getESuperTypes().add(theCorePackage.getCommand());
		selectEClass.getESuperTypes().add(theCorePackage.getCommand());
		clickEClass.getESuperTypes().add(theCorePackage.getCommand());
		waitShellClosesEClass.getESuperTypes().add(theCorePackage.getCommand());
		waitShellIsActiveEClass.getESuperTypes().add(theCorePackage.getCommand());
		getTreeItemEClass.getESuperTypes().add(theCorePackage.getCommand());
		contextMenuEClass.getESuperTypes().add(theCorePackage.getCommand());
		getBotEClass.getESuperTypes().add(theCorePackage.getCommand());
		typeTextEClass.getESuperTypes().add(theCorePackage.getCommand());
		waitTableHasRowsEClass.getESuperTypes().add(theCorePackage.getCommand());
		checkEClass.getESuperTypes().add(theCorePackage.getCommand());
		getTableItemEClass.getESuperTypes().add(theCorePackage.getCommand());
		waitEnabledEClass.getESuperTypes().add(theCorePackage.getCommand());
		getButtonEClass.getESuperTypes().add(theCorePackage.getCommand());
		getTreeEClass.getESuperTypes().add(theCorePackage.getCommand());
		getEditboxEClass.getESuperTypes().add(theCorePackage.getCommand());
		getCheckboxEClass.getESuperTypes().add(theCorePackage.getCommand());
		getItemEClass.getESuperTypes().add(theCorePackage.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(findControlsEClass, FindControls.class, "FindControls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFindControls_Type(), ecorePackage.getEString(), "type", null, 0, 1, FindControls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindControls_Text(), ecorePackage.getEString(), "text", null, 0, 1, FindControls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindControls_Label(), ecorePackage.getEString(), "label", null, 0, 1, FindControls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindControls_Index(), theEcorePackage.getEInt(), "index", "-1", 0, 1, FindControls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getMenuEClass, GetMenu.class, "GetMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetMenu_Path(), ecorePackage.getEString(), "path", null, 0, 1, GetMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getViewEClass, GetView.class, "GetView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetView_Title(), ecorePackage.getEString(), "title", null, 0, 1, GetView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getEditorEClass, GetEditor.class, "GetEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetEditor_Title(), ecorePackage.getEString(), "title", null, 0, 1, GetEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTextEClass, GetText.class, "GetText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setTextEClass, SetText.class, "SetText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetText_Text(), ecorePackage.getEString(), "text", null, 1, 1, SetText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelect_Item(), theEcorePackage.getEJavaObject(), "item", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clickEClass, Click.class, "Click", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(waitShellClosesEClass, WaitShellCloses.class, "WaitShellCloses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWaitShellCloses_Text(), ecorePackage.getEString(), "text", null, 1, 1, WaitShellCloses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaitShellCloses_Timeout(), ecorePackage.getELong(), "timeout", "5000", 0, 1, WaitShellCloses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitShellIsActiveEClass, WaitShellIsActive.class, "WaitShellIsActive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWaitShellIsActive_Text(), ecorePackage.getEString(), "text", null, 1, 1, WaitShellIsActive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaitShellIsActive_Timeout(), ecorePackage.getELong(), "timeout", "5000", 0, 1, WaitShellIsActive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTreeItemEClass, GetTreeItem.class, "GetTreeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetTreeItem_Text(), ecorePackage.getEString(), "text", null, 1, 1, GetTreeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextMenuEClass, ContextMenu.class, "ContextMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextMenu_Text(), ecorePackage.getEString(), "text", null, 1, 1, ContextMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getBotEClass, GetBot.class, "GetBot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeTextEClass, TypeText.class, "TypeText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeText_Text(), ecorePackage.getEString(), "text", null, 1, 1, TypeText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitTableHasRowsEClass, WaitTableHasRows.class, "WaitTableHasRows", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWaitTableHasRows_Rows(), theEcorePackage.getEInt(), "rows", null, 1, 1, WaitTableHasRows.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaitTableHasRows_Timeout(), ecorePackage.getELong(), "timeout", "5000", 0, 1, WaitTableHasRows.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getTableItemEClass, GetTableItem.class, "GetTableItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetTableItem_Item(), theEcorePackage.getEJavaObject(), "item", null, 1, 1, GetTableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitEnabledEClass, WaitEnabled.class, "WaitEnabled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWaitEnabled_Timeout(), ecorePackage.getELong(), "timeout", "5000", 0, 1, WaitEnabled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getButtonEClass, GetButton.class, "GetButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetButton_Text(), ecorePackage.getEString(), "text", null, 0, 1, GetButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTreeEClass, GetTree.class, "GetTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getEditboxEClass, GetEditbox.class, "GetEditbox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetEditbox_Label(), ecorePackage.getEString(), "label", null, 1, 1, GetEditbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getCheckboxEClass, GetCheckbox.class, "GetCheckbox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetCheckbox_Text(), ecorePackage.getEString(), "text", null, 1, 1, GetCheckbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getItemEClass, GetItem.class, "GetItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetItem_Item(), ecorePackage.getEString(), "item", null, 1, 1, GetItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // SwtPackageImpl
