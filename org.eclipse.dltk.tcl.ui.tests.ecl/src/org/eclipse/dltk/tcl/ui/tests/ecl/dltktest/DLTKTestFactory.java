/**
 * <copyright>
 * </copyright>
 *
 * $Id: DLTKTestFactory.java,v 1.1 2010/08/02 09:24:09 andrey Exp $
 */
package org.eclipse.dltk.tcl.ui.tests.ecl.dltktest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage
 * @generated
 */
public interface DLTKTestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DLTKTestFactory eINSTANCE = org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Interpreter</em>'.
	 * @generated
	 */
	AddInterpreter createAddInterpreter();

	/**
	 * Returns a new object of class '<em>Remove Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Interpreter</em>'.
	 * @generated
	 */
	RemoveInterpreter createRemoveInterpreter();

	/**
	 * Returns a new object of class '<em>Remove All Interpreters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove All Interpreters</em>'.
	 * @generated
	 */
	RemoveAllInterpreters createRemoveAllInterpreters();

	/**
	 * Returns a new object of class '<em>Open Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Perspective</em>'.
	 * @generated
	 */
	OpenPerspective createOpenPerspective();

	/**
	 * Returns a new object of class '<em>Create Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Project</em>'.
	 * @generated
	 */
	CreateProject createCreateProject();

	/**
	 * Returns a new object of class '<em>Delete Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Project</em>'.
	 * @generated
	 */
	DeleteProject createDeleteProject();

	/**
	 * Returns a new object of class '<em>Close Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Close Project</em>'.
	 * @generated
	 */
	CloseProject createCloseProject();

	/**
	 * Returns a new object of class '<em>Assert Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Perspective</em>'.
	 * @generated
	 */
	AssertPerspective createAssertPerspective();

	/**
	 * Returns a new object of class '<em>Assert Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Interpreter</em>'.
	 * @generated
	 */
	AssertInterpreter createAssertInterpreter();

	/**
	 * Returns a new object of class '<em>Assert No Interpreters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert No Interpreters</em>'.
	 * @generated
	 */
	AssertNoInterpreters createAssertNoInterpreters();

	/**
	 * Returns a new object of class '<em>Is Project Exist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Project Exist</em>'.
	 * @generated
	 */
	IsProjectExist createIsProjectExist();

	/**
	 * Returns a new object of class '<em>Is Project Open</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Project Open</em>'.
	 * @generated
	 */
	IsProjectOpen createIsProjectOpen();

	/**
	 * Returns a new object of class '<em>Get Plugin Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Plugin Path</em>'.
	 * @generated
	 */
	GetPluginPath createGetPluginPath();

	/**
	 * Returns a new object of class '<em>Wait For Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait For Job</em>'.
	 * @generated
	 */
	WaitForJob createWaitForJob();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DLTKTestPackage getDLTKTestPackage();

} //DLTKTestFactory
