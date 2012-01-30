/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.ui.commands;

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
 * @see org.eclipse.ecl.platform.ui.commands.CommandsFactory
 * @model kind="package"
 * @generated
 */
public interface CommandsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commands";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ecl/platform.ui/commands.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.ecl.platform.ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandsPackage eINSTANCE = org.eclipse.ecl.platform.ui.commands.impl.CommandsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.ui.commands.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.ui.commands.impl.AlertImpl
	 * @see org.eclipse.ecl.platform.ui.commands.impl.CommandsPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__MESSAGE = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.ui.commands.impl.ListWorkingSetsImpl <em>List Working Sets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.ui.commands.impl.ListWorkingSetsImpl
	 * @see org.eclipse.ecl.platform.ui.commands.impl.CommandsPackageImpl#getListWorkingSets()
	 * @generated
	 */
	int LIST_WORKING_SETS = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WORKING_SETS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WORKING_SETS__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>List Working Sets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WORKING_SETS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.ui.commands.impl.CreateWorkingSetImpl <em>Create Working Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.ui.commands.impl.CreateWorkingSetImpl
	 * @see org.eclipse.ecl.platform.ui.commands.impl.CommandsPackageImpl#getCreateWorkingSet()
	 * @generated
	 */
	int CREATE_WORKING_SET = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_WORKING_SET__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_WORKING_SET__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_WORKING_SET__NAME = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Working Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_WORKING_SET_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.ui.commands.impl.RemoveWorkingSetImpl <em>Remove Working Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.ui.commands.impl.RemoveWorkingSetImpl
	 * @see org.eclipse.ecl.platform.ui.commands.impl.CommandsPackageImpl#getRemoveWorkingSet()
	 * @generated
	 */
	int REMOVE_WORKING_SET = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_WORKING_SET__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_WORKING_SET__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_WORKING_SET__NAME = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Working Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_WORKING_SET_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.ui.commands.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert</em>'.
	 * @see org.eclipse.ecl.platform.ui.commands.Alert
	 * @generated
	 */
	EClass getAlert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.platform.ui.commands.Alert#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.ecl.platform.ui.commands.Alert#getMessage()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Message();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.ui.commands.ListWorkingSets <em>List Working Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Working Sets</em>'.
	 * @see org.eclipse.ecl.platform.ui.commands.ListWorkingSets
	 * @generated
	 */
	EClass getListWorkingSets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.ui.commands.CreateWorkingSet <em>Create Working Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Working Set</em>'.
	 * @see org.eclipse.ecl.platform.ui.commands.CreateWorkingSet
	 * @generated
	 */
	EClass getCreateWorkingSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.platform.ui.commands.CreateWorkingSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.ecl.platform.ui.commands.CreateWorkingSet#getName()
	 * @see #getCreateWorkingSet()
	 * @generated
	 */
	EAttribute getCreateWorkingSet_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.ui.commands.RemoveWorkingSet <em>Remove Working Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Working Set</em>'.
	 * @see org.eclipse.ecl.platform.ui.commands.RemoveWorkingSet
	 * @generated
	 */
	EClass getRemoveWorkingSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.platform.ui.commands.RemoveWorkingSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.ecl.platform.ui.commands.RemoveWorkingSet#getName()
	 * @see #getRemoveWorkingSet()
	 * @generated
	 */
	EAttribute getRemoveWorkingSet_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommandsFactory getCommandsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.ui.commands.impl.AlertImpl <em>Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.ui.commands.impl.AlertImpl
		 * @see org.eclipse.ecl.platform.ui.commands.impl.CommandsPackageImpl#getAlert()
		 * @generated
		 */
		EClass ALERT = eINSTANCE.getAlert();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__MESSAGE = eINSTANCE.getAlert_Message();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.ui.commands.impl.ListWorkingSetsImpl <em>List Working Sets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.ui.commands.impl.ListWorkingSetsImpl
		 * @see org.eclipse.ecl.platform.ui.commands.impl.CommandsPackageImpl#getListWorkingSets()
		 * @generated
		 */
		EClass LIST_WORKING_SETS = eINSTANCE.getListWorkingSets();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.ui.commands.impl.CreateWorkingSetImpl <em>Create Working Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.ui.commands.impl.CreateWorkingSetImpl
		 * @see org.eclipse.ecl.platform.ui.commands.impl.CommandsPackageImpl#getCreateWorkingSet()
		 * @generated
		 */
		EClass CREATE_WORKING_SET = eINSTANCE.getCreateWorkingSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_WORKING_SET__NAME = eINSTANCE.getCreateWorkingSet_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.ui.commands.impl.RemoveWorkingSetImpl <em>Remove Working Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.ui.commands.impl.RemoveWorkingSetImpl
		 * @see org.eclipse.ecl.platform.ui.commands.impl.CommandsPackageImpl#getRemoveWorkingSet()
		 * @generated
		 */
		EClass REMOVE_WORKING_SET = eINSTANCE.getRemoveWorkingSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_WORKING_SET__NAME = eINSTANCE.getRemoveWorkingSet_Name();

	}

} //CommandsPackage
