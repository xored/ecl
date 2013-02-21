/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.interop.commands.impl;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.ecl.interop.commands.CommandsFactory;
import org.eclipse.ecl.interop.commands.CommandsPackage;
import org.eclipse.ecl.interop.commands.ExecProcess;
import org.eclipse.ecl.interop.commands.ExecProcessResult;
import org.eclipse.ecl.interop.commands.Get;
import org.eclipse.ecl.interop.commands.ExecProcessStatus;
import org.eclipse.ecl.interop.commands.Invoke;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandsPackageImpl extends EPackageImpl implements CommandsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execProcessResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.ecl.interop.commands.CommandsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommandsPackageImpl() {
		super(eNS_URI, CommandsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommandsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommandsPackage init() {
		if (isInited) return (CommandsPackage)EPackage.Registry.INSTANCE.getEPackage(CommandsPackage.eNS_URI);

		// Obtain or create and register package
		CommandsPackageImpl theCommandsPackage = (CommandsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommandsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommandsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommandsPackage.createPackageContents();

		// Initialize created meta-data
		theCommandsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommandsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommandsPackage.eNS_URI, theCommandsPackage);
		return theCommandsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoke() {
		return invokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoke_Object() {
		return (EAttribute)invokeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoke_Name() {
		return (EAttribute)invokeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoke_Args() {
		return (EAttribute)invokeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecProcess() {
		return execProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecProcess_Command() {
		return (EAttribute)execProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecProcess_Args() {
		return (EAttribute)execProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecProcess_Timeout() {
		return (EAttribute)execProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecProcess_IgnoreExitCode() {
		return (EAttribute)execProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecProcess_IgnoreStderr() {
		return (EAttribute)execProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecProcess_Stdin() {
		return (EAttribute)execProcessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecProcessResult() {
		return execProcessResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecProcessResult_ExitCode() {
		return (EAttribute)execProcessResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecProcessResult_Stdout() {
		return (EAttribute)execProcessResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecProcessResult_Stderr() {
		return (EAttribute)execProcessResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGet() {
		return getEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet_Object() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet_PropertyName() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsFactory getCommandsFactory() {
		return (CommandsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		invokeEClass = createEClass(INVOKE);
		createEAttribute(invokeEClass, INVOKE__OBJECT);
		createEAttribute(invokeEClass, INVOKE__NAME);
		createEAttribute(invokeEClass, INVOKE__ARGS);

		execProcessEClass = createEClass(EXEC_PROCESS);
		createEAttribute(execProcessEClass, EXEC_PROCESS__COMMAND);
		createEAttribute(execProcessEClass, EXEC_PROCESS__ARGS);
		createEAttribute(execProcessEClass, EXEC_PROCESS__TIMEOUT);
		createEAttribute(execProcessEClass, EXEC_PROCESS__IGNORE_EXIT_CODE);
		createEAttribute(execProcessEClass, EXEC_PROCESS__IGNORE_STDERR);
		createEAttribute(execProcessEClass, EXEC_PROCESS__STDIN);

		execProcessResultEClass = createEClass(EXEC_PROCESS_RESULT);
		createEAttribute(execProcessResultEClass, EXEC_PROCESS_RESULT__EXIT_CODE);
		createEAttribute(execProcessResultEClass, EXEC_PROCESS_RESULT__STDOUT);
		createEAttribute(execProcessResultEClass, EXEC_PROCESS_RESULT__STDERR);

		getEClass = createEClass(GET);
		createEAttribute(getEClass, GET__OBJECT);
		createEAttribute(getEClass, GET__PROPERTY_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		invokeEClass.getESuperTypes().add(theCorePackage.getCommand());
		execProcessEClass.getESuperTypes().add(theCorePackage.getCommand());
		getEClass.getESuperTypes().add(theCorePackage.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(invokeEClass, Invoke.class, "Invoke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvoke_Object(), theEcorePackage.getEJavaObject(), "object", null, 1, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoke_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoke_Args(), theEcorePackage.getEJavaObject(), "args", null, 0, -1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(execProcessEClass, ExecProcess.class, "ExecProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecProcess_Command(), theEcorePackage.getEString(), "command", null, 1, 1, ExecProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecProcess_Args(), theEcorePackage.getEString(), "args", null, 0, -1, ExecProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecProcess_Timeout(), theEcorePackage.getEInt(), "timeout", "60", 0, 1, ExecProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecProcess_IgnoreExitCode(), theEcorePackage.getEBoolean(), "ignoreExitCode", "false", 0, 1, ExecProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecProcess_IgnoreStderr(), theEcorePackage.getEBoolean(), "ignoreStderr", "false", 0, 1, ExecProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecProcess_Stdin(), theEcorePackage.getEString(), "stdin", null, 0, 1, ExecProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(execProcessResultEClass, ExecProcessResult.class, "ExecProcessResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecProcessResult_ExitCode(), theEcorePackage.getEInt(), "exitCode", null, 0, 1, ExecProcessResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecProcessResult_Stdout(), theEcorePackage.getEString(), "stdout", null, 0, 1, ExecProcessResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecProcessResult_Stderr(), theEcorePackage.getEString(), "stderr", null, 0, 1, ExecProcessResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getEClass, Get.class, "Get", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGet_Object(), theEcorePackage.getEJavaObject(), "object", null, 1, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet_PropertyName(), theEcorePackage.getEString(), "propertyName", null, 1, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/ecl/docs
		createDocsAnnotations();
		// http://www.eclipse.org/ecl/input
		createInputAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ecl/docs</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocsAnnotations() {
		String source = "http://www.eclipse.org/ecl/docs";		
		addAnnotation
		  (invokeEClass, 
		   source, 
		   new String[] {
			 "description", "Invokes method on Java object.",
			 "returns", "Value returned by method."
		   });			
		addAnnotation
		  (getInvoke_Object(), 
		   source, 
		   new String[] {
			 "description", "Object to call the method on."
		   });		
		addAnnotation
		  (getInvoke_Name(), 
		   source, 
		   new String[] {
			 "description", "Name of the method to call. As a useful addtion, there are three pseudo-methods for arrays: <code>get <i>index</i></code>, <code>set <i>index value</i></code> and <code>length</code>."
		   });		
		addAnnotation
		  (getInvoke_Args(), 
		   source, 
		   new String[] {
			 "description", "Variable number of arguments to the method."
		   });		
		addAnnotation
		  (execProcessEClass, 
		   source, 
		   new String[] {
			 "description", "Executes shell command.",
			 "returns", "ExecProcessResult filled with execution results: exit code, captured stdout and stderr."
		   });		
		addAnnotation
		  (getExecProcess_Command(), 
		   source, 
		   new String[] {
			 "description", "Shell command to execute."
		   });		
		addAnnotation
		  (getExecProcess_Args(), 
		   source, 
		   new String[] {
			 "description", "Arguments for the command."
		   });		
		addAnnotation
		  (getExecProcess_Timeout(), 
		   source, 
		   new String[] {
			 "description", "Timeout period in seconds. Use zero timeout (<code>-timeout 0</code>) for infinite timeout."
		   });		
		addAnnotation
		  (getExecProcess_IgnoreExitCode(), 
		   source, 
		   new String[] {
			 "description", "If set to true, command will not fail with error message if non-zero exit code returned."
		   });		
		addAnnotation
		  (getExecProcess_IgnoreStderr(), 
		   source, 
		   new String[] {
			 "description", "If set to true, command will not fail with error message if stderr is not empty."
		   });			
		addAnnotation
		  (getExecProcess_Stdin(), 
		   source, 
		   new String[] {
			 "description", "String to send to stdin of executed command."
		   });		
		addAnnotation
		  (getEClass, 
		   source, 
		   new String[] {
			 "description", "Gets the property value of an object.",
			 "returns", "Property value."
		   });			
		addAnnotation
		  (getGet_Object(), 
		   source, 
		   new String[] {
			 "description", "Object to the get property value from."
		   });		
		addAnnotation
		  (getGet_PropertyName(), 
		   source, 
		   new String[] {
			 "description", "Name of the property to get the value for."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ecl/input</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createInputAnnotations() {
		String source = "http://www.eclipse.org/ecl/input";			
		addAnnotation
		  (getInvoke_Object(), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  (getExecProcess_Stdin(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getGet_Object(), 
		   source, 
		   new String[] {
		   });		
	}

} //CommandsPackageImpl
