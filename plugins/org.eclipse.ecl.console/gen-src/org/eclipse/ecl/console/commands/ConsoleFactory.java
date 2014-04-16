/**
 */
package org.eclipse.ecl.console.commands;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.console.commands.ConsolePackage
 * @generated
 */
public interface ConsoleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConsoleFactory eINSTANCE = org.eclipse.ecl.console.commands.impl.ConsoleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Write</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write</em>'.
	 * @generated
	 */
	Write createWrite();

	/**
	 * Returns a new object of class '<em>List Commands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Commands</em>'.
	 * @generated
	 */
	ListCommands createListCommands();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConsolePackage getConsolePackage();

} //ConsoleFactory
