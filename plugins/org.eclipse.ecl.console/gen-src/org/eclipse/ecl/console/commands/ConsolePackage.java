/**
 */
package org.eclipse.ecl.console.commands;

import org.eclipse.ecl.core.CorePackage;

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
 * @see org.eclipse.ecl.console.commands.ConsoleFactory
 * @model kind="package"
 * @generated
 */
public interface ConsolePackage extends EPackage {
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
	String eNS_URI = "http://eclipse.org/ecl/console/commands.core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.ecl.console.commands";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConsolePackage eINSTANCE = org.eclipse.ecl.console.commands.impl.ConsolePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.console.commands.impl.WriteImpl <em>Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.console.commands.impl.WriteImpl
	 * @see org.eclipse.ecl.console.commands.impl.ConsolePackageImpl#getWrite()
	 * @generated
	 */
	int WRITE = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.console.commands.impl.ListCommandsImpl <em>List Commands</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.console.commands.impl.ListCommandsImpl
	 * @see org.eclipse.ecl.console.commands.impl.ConsolePackageImpl#getListCommands()
	 * @generated
	 */
	int LIST_COMMANDS = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMMANDS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMMANDS__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>List Commands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMMANDS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.console.commands.Write <em>Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write</em>'.
	 * @see org.eclipse.ecl.console.commands.Write
	 * @generated
	 */
	EClass getWrite();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.console.commands.ListCommands <em>List Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Commands</em>'.
	 * @see org.eclipse.ecl.console.commands.ListCommands
	 * @generated
	 */
	EClass getListCommands();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConsoleFactory getConsoleFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ecl.console.commands.impl.WriteImpl <em>Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.console.commands.impl.WriteImpl
		 * @see org.eclipse.ecl.console.commands.impl.ConsolePackageImpl#getWrite()
		 * @generated
		 */
		EClass WRITE = eINSTANCE.getWrite();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.console.commands.impl.ListCommandsImpl <em>List Commands</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.console.commands.impl.ListCommandsImpl
		 * @see org.eclipse.ecl.console.commands.impl.ConsolePackageImpl#getListCommands()
		 * @generated
		 */
		EClass LIST_COMMANDS = eINSTANCE.getListCommands();

	}

} //ConsolePackage
