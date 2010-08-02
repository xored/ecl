/**
 * <copyright>
 * </copyright>
 *
 * $Id: DLTKTestPackage.java,v 1.1 2010/08/02 09:24:09 andrey Exp $
 */
package org.eclipse.dltk.tcl.ui.tests.ecl.dltktest;

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
 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestFactory
 * @model kind="package"
 * @generated
 */
public interface DLTKTestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dltktest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ecl/dltktest.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.dltk.tcl.ui.tests.ecl.dltktest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DLTKTestPackage eINSTANCE = org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AddInterpreterImpl <em>Add Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AddInterpreterImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getAddInterpreter()
	 * @generated
	 */
	int ADD_INTERPRETER = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INTERPRETER__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INTERPRETER__LANGUAGE = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INTERPRETER__NAME = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INTERPRETER__PATH = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INTERPRETER_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.RemoveInterpreterImpl <em>Remove Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.RemoveInterpreterImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getRemoveInterpreter()
	 * @generated
	 */
	int REMOVE_INTERPRETER = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERPRETER__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERPRETER__NAME = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERPRETER_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.RemoveAllInterpretersImpl <em>Remove All Interpreters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.RemoveAllInterpretersImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getRemoveAllInterpreters()
	 * @generated
	 */
	int REMOVE_ALL_INTERPRETERS = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ALL_INTERPRETERS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ALL_INTERPRETERS__LANGUAGE = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove All Interpreters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ALL_INTERPRETERS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.OpenPerspectiveImpl <em>Open Perspective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.OpenPerspectiveImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getOpenPerspective()
	 * @generated
	 */
	int OPEN_PERSPECTIVE = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_PERSPECTIVE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_PERSPECTIVE__NAME = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_PERSPECTIVE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.CreateProjectImpl <em>Create Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.CreateProjectImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getCreateProject()
	 * @generated
	 */
	int CREATE_PROJECT = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROJECT__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROJECT__NAME = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROJECT__SOURCE = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROJECT_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DeleteProjectImpl <em>Delete Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DeleteProjectImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getDeleteProject()
	 * @generated
	 */
	int DELETE_PROJECT = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PROJECT__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PROJECT__NAME = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PROJECT_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.CloseProjectImpl <em>Close Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.CloseProjectImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getCloseProject()
	 * @generated
	 */
	int CLOSE_PROJECT = 6;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_PROJECT__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_PROJECT__NAME = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Close Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_PROJECT_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertPerspectiveImpl <em>Assert Perspective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertPerspectiveImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getAssertPerspective()
	 * @generated
	 */
	int ASSERT_PERSPECTIVE = 7;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_PERSPECTIVE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_PERSPECTIVE__NAME = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assert Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_PERSPECTIVE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertInterpreterImpl <em>Assert Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertInterpreterImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getAssertInterpreter()
	 * @generated
	 */
	int ASSERT_INTERPRETER = 8;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_INTERPRETER__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_INTERPRETER__PROJECT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_INTERPRETER__NAME = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assert Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_INTERPRETER_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertNoInterpretersImpl <em>Assert No Interpreters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertNoInterpretersImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getAssertNoInterpreters()
	 * @generated
	 */
	int ASSERT_NO_INTERPRETERS = 9;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NO_INTERPRETERS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NO_INTERPRETERS__PROJECT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assert No Interpreters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_NO_INTERPRETERS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.IsProjectExistImpl <em>Is Project Exist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.IsProjectExistImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getIsProjectExist()
	 * @generated
	 */
	int IS_PROJECT_EXIST = 10;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROJECT_EXIST__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROJECT_EXIST__NAME = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Project Exist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROJECT_EXIST_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.IsProjectOpenImpl <em>Is Project Open</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.IsProjectOpenImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getIsProjectOpen()
	 * @generated
	 */
	int IS_PROJECT_OPEN = 11;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROJECT_OPEN__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROJECT_OPEN__NAME = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Project Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROJECT_OPEN_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.GetPluginPathImpl <em>Get Plugin Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.GetPluginPathImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getGetPluginPath()
	 * @generated
	 */
	int GET_PLUGIN_PATH = 12;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PLUGIN_PATH__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PLUGIN_PATH__PLUGIN = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Plugin Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PLUGIN_PATH_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.WaitForJobImpl <em>Wait For Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.WaitForJobImpl
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getWaitForJob()
	 * @generated
	 */
	int WAIT_FOR_JOB = 13;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_JOB__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_JOB__FAMILY = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_JOB__TIMEOUT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wait For Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_JOB_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter <em>Add Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Interpreter</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter
	 * @generated
	 */
	EClass getAddInterpreter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter#getLanguage()
	 * @see #getAddInterpreter()
	 * @generated
	 */
	EAttribute getAddInterpreter_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter#getName()
	 * @see #getAddInterpreter()
	 * @generated
	 */
	EAttribute getAddInterpreter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AddInterpreter#getPath()
	 * @see #getAddInterpreter()
	 * @generated
	 */
	EAttribute getAddInterpreter_Path();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveInterpreter <em>Remove Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Interpreter</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveInterpreter
	 * @generated
	 */
	EClass getRemoveInterpreter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveInterpreter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveInterpreter#getName()
	 * @see #getRemoveInterpreter()
	 * @generated
	 */
	EAttribute getRemoveInterpreter_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveAllInterpreters <em>Remove All Interpreters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove All Interpreters</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveAllInterpreters
	 * @generated
	 */
	EClass getRemoveAllInterpreters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveAllInterpreters#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.RemoveAllInterpreters#getLanguage()
	 * @see #getRemoveAllInterpreters()
	 * @generated
	 */
	EAttribute getRemoveAllInterpreters_Language();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.OpenPerspective <em>Open Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Perspective</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.OpenPerspective
	 * @generated
	 */
	EClass getOpenPerspective();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.OpenPerspective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.OpenPerspective#getName()
	 * @see #getOpenPerspective()
	 * @generated
	 */
	EAttribute getOpenPerspective_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CreateProject <em>Create Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Project</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CreateProject
	 * @generated
	 */
	EClass getCreateProject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CreateProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CreateProject#getName()
	 * @see #getCreateProject()
	 * @generated
	 */
	EAttribute getCreateProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CreateProject#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CreateProject#getSource()
	 * @see #getCreateProject()
	 * @generated
	 */
	EAttribute getCreateProject_Source();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DeleteProject <em>Delete Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Project</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DeleteProject
	 * @generated
	 */
	EClass getDeleteProject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DeleteProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DeleteProject#getName()
	 * @see #getDeleteProject()
	 * @generated
	 */
	EAttribute getDeleteProject_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CloseProject <em>Close Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Project</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CloseProject
	 * @generated
	 */
	EClass getCloseProject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CloseProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CloseProject#getName()
	 * @see #getCloseProject()
	 * @generated
	 */
	EAttribute getCloseProject_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertPerspective <em>Assert Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Perspective</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertPerspective
	 * @generated
	 */
	EClass getAssertPerspective();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertPerspective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertPerspective#getName()
	 * @see #getAssertPerspective()
	 * @generated
	 */
	EAttribute getAssertPerspective_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertInterpreter <em>Assert Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Interpreter</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertInterpreter
	 * @generated
	 */
	EClass getAssertInterpreter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertInterpreter#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertInterpreter#getProject()
	 * @see #getAssertInterpreter()
	 * @generated
	 */
	EAttribute getAssertInterpreter_Project();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertInterpreter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertInterpreter#getName()
	 * @see #getAssertInterpreter()
	 * @generated
	 */
	EAttribute getAssertInterpreter_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertNoInterpreters <em>Assert No Interpreters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert No Interpreters</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertNoInterpreters
	 * @generated
	 */
	EClass getAssertNoInterpreters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertNoInterpreters#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.AssertNoInterpreters#getProject()
	 * @see #getAssertNoInterpreters()
	 * @generated
	 */
	EAttribute getAssertNoInterpreters_Project();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectExist <em>Is Project Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Project Exist</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectExist
	 * @generated
	 */
	EClass getIsProjectExist();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectExist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectExist#getName()
	 * @see #getIsProjectExist()
	 * @generated
	 */
	EAttribute getIsProjectExist_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectOpen <em>Is Project Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Project Open</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectOpen
	 * @generated
	 */
	EClass getIsProjectOpen();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectOpen#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.IsProjectOpen#getName()
	 * @see #getIsProjectOpen()
	 * @generated
	 */
	EAttribute getIsProjectOpen_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.GetPluginPath <em>Get Plugin Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Plugin Path</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.GetPluginPath
	 * @generated
	 */
	EClass getGetPluginPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.GetPluginPath#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.GetPluginPath#getPlugin()
	 * @see #getGetPluginPath()
	 * @generated
	 */
	EAttribute getGetPluginPath_Plugin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob <em>Wait For Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait For Job</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob
	 * @generated
	 */
	EClass getWaitForJob();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob#getFamily()
	 * @see #getWaitForJob()
	 * @generated
	 */
	EAttribute getWaitForJob_Family();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob#getTimeout()
	 * @see #getWaitForJob()
	 * @generated
	 */
	EAttribute getWaitForJob_Timeout();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DLTKTestFactory getDLTKTestFactory();

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
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AddInterpreterImpl <em>Add Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AddInterpreterImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getAddInterpreter()
		 * @generated
		 */
		EClass ADD_INTERPRETER = eINSTANCE.getAddInterpreter();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_INTERPRETER__LANGUAGE = eINSTANCE.getAddInterpreter_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_INTERPRETER__NAME = eINSTANCE.getAddInterpreter_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_INTERPRETER__PATH = eINSTANCE.getAddInterpreter_Path();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.RemoveInterpreterImpl <em>Remove Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.RemoveInterpreterImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getRemoveInterpreter()
		 * @generated
		 */
		EClass REMOVE_INTERPRETER = eINSTANCE.getRemoveInterpreter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_INTERPRETER__NAME = eINSTANCE.getRemoveInterpreter_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.RemoveAllInterpretersImpl <em>Remove All Interpreters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.RemoveAllInterpretersImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getRemoveAllInterpreters()
		 * @generated
		 */
		EClass REMOVE_ALL_INTERPRETERS = eINSTANCE.getRemoveAllInterpreters();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_ALL_INTERPRETERS__LANGUAGE = eINSTANCE.getRemoveAllInterpreters_Language();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.OpenPerspectiveImpl <em>Open Perspective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.OpenPerspectiveImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getOpenPerspective()
		 * @generated
		 */
		EClass OPEN_PERSPECTIVE = eINSTANCE.getOpenPerspective();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_PERSPECTIVE__NAME = eINSTANCE.getOpenPerspective_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.CreateProjectImpl <em>Create Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.CreateProjectImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getCreateProject()
		 * @generated
		 */
		EClass CREATE_PROJECT = eINSTANCE.getCreateProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PROJECT__NAME = eINSTANCE.getCreateProject_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PROJECT__SOURCE = eINSTANCE.getCreateProject_Source();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DeleteProjectImpl <em>Delete Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DeleteProjectImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getDeleteProject()
		 * @generated
		 */
		EClass DELETE_PROJECT = eINSTANCE.getDeleteProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_PROJECT__NAME = eINSTANCE.getDeleteProject_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.CloseProjectImpl <em>Close Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.CloseProjectImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getCloseProject()
		 * @generated
		 */
		EClass CLOSE_PROJECT = eINSTANCE.getCloseProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSE_PROJECT__NAME = eINSTANCE.getCloseProject_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertPerspectiveImpl <em>Assert Perspective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertPerspectiveImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getAssertPerspective()
		 * @generated
		 */
		EClass ASSERT_PERSPECTIVE = eINSTANCE.getAssertPerspective();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_PERSPECTIVE__NAME = eINSTANCE.getAssertPerspective_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertInterpreterImpl <em>Assert Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertInterpreterImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getAssertInterpreter()
		 * @generated
		 */
		EClass ASSERT_INTERPRETER = eINSTANCE.getAssertInterpreter();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_INTERPRETER__PROJECT = eINSTANCE.getAssertInterpreter_Project();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_INTERPRETER__NAME = eINSTANCE.getAssertInterpreter_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertNoInterpretersImpl <em>Assert No Interpreters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.AssertNoInterpretersImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getAssertNoInterpreters()
		 * @generated
		 */
		EClass ASSERT_NO_INTERPRETERS = eINSTANCE.getAssertNoInterpreters();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_NO_INTERPRETERS__PROJECT = eINSTANCE.getAssertNoInterpreters_Project();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.IsProjectExistImpl <em>Is Project Exist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.IsProjectExistImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getIsProjectExist()
		 * @generated
		 */
		EClass IS_PROJECT_EXIST = eINSTANCE.getIsProjectExist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_PROJECT_EXIST__NAME = eINSTANCE.getIsProjectExist_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.IsProjectOpenImpl <em>Is Project Open</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.IsProjectOpenImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getIsProjectOpen()
		 * @generated
		 */
		EClass IS_PROJECT_OPEN = eINSTANCE.getIsProjectOpen();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_PROJECT_OPEN__NAME = eINSTANCE.getIsProjectOpen_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.GetPluginPathImpl <em>Get Plugin Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.GetPluginPathImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getGetPluginPath()
		 * @generated
		 */
		EClass GET_PLUGIN_PATH = eINSTANCE.getGetPluginPath();

		/**
		 * The meta object literal for the '<em><b>Plugin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PLUGIN_PATH__PLUGIN = eINSTANCE.getGetPluginPath_Plugin();

		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.WaitForJobImpl <em>Wait For Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.WaitForJobImpl
		 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.impl.DLTKTestPackageImpl#getWaitForJob()
		 * @generated
		 */
		EClass WAIT_FOR_JOB = eINSTANCE.getWaitForJob();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_FOR_JOB__FAMILY = eINSTANCE.getWaitForJob_Family();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_FOR_JOB__TIMEOUT = eINSTANCE.getWaitForJob_Timeout();

	}

} //DLTKTestPackage
