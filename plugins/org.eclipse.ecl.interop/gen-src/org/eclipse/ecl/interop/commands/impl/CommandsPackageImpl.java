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
import org.eclipse.ecl.interop.commands.Invoke;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

		// Initialize classes and features; add operations and parameters
		initEClass(invokeEClass, Invoke.class, "Invoke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvoke_Object(), theEcorePackage.getEJavaObject(), "object", null, 1, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoke_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoke_Args(), theEcorePackage.getEJavaObject(), "args", null, 0, -1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "description", "Object to call method on."
		   });		
		addAnnotation
		  (getInvoke_Name(), 
		   source, 
		   new String[] {
			 "description", "Name of the method to call. As a useful addtion, there are three pseudo-methods for arrays: \"get index\", \"set index value\" and \"length\"."
		   });		
		addAnnotation
		  (getInvoke_Args(), 
		   source, 
		   new String[] {
			 "description", "Variable number of arguments to the method."
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
	}

} //CommandsPackageImpl
