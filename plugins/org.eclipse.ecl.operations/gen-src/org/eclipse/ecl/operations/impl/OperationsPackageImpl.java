/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations.impl;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.ecl.operations.AssertTrue;
import org.eclipse.ecl.operations.Bool;
import org.eclipse.ecl.operations.Convert;
import org.eclipse.ecl.operations.Eq;
import org.eclipse.ecl.operations.Gt;
import org.eclipse.ecl.operations.Int;
import org.eclipse.ecl.operations.Length;
import org.eclipse.ecl.operations.Lt;
import org.eclipse.ecl.operations.Not;
import org.eclipse.ecl.operations.NotEq;
import org.eclipse.ecl.operations.OperationsFactory;
import org.eclipse.ecl.operations.OperationsPackage;

import org.eclipse.ecl.operations.Str;
import org.eclipse.ecl.operations.Try;
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
public class OperationsPackageImpl extends EPackageImpl implements OperationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertTrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryEClass = null;

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
	 * @see org.eclipse.ecl.operations.OperationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperationsPackageImpl() {
		super(eNS_URI, OperationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OperationsPackage init() {
		if (isInited) return (OperationsPackage)EPackage.Registry.INSTANCE.getEPackage(OperationsPackage.eNS_URI);

		// Obtain or create and register package
		OperationsPackageImpl theOperationsPackage = (OperationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OperationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new OperationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperationsPackage.createPackageContents();

		// Initialize created meta-data
		theOperationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperationsPackage.freeze();

		return theOperationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEq() {
		return eqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEq_Left() {
		return (EReference)eqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEq_Right() {
		return (EReference)eqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt() {
		return intEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBool() {
		return boolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStr() {
		return strEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvert() {
		return convertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvert_Input() {
		return (EReference)convertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertTrue() {
		return assertTrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertTrue_Input() {
		return (EAttribute)assertTrueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertTrue_Message() {
		return (EAttribute)assertTrueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLength() {
		return lengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLength_Input() {
		return (EReference)lengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotEq() {
		return notEqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotEq_Left() {
		return (EReference)notEqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotEq_Right() {
		return (EReference)notEqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGt() {
		return gtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGt_Left() {
		return (EReference)gtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGt_Right() {
		return (EReference)gtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLt() {
		return ltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLt_Left() {
		return (EReference)ltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLt_Right() {
		return (EReference)ltEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_Left() {
		return (EReference)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTry() {
		return tryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTry_Command() {
		return (EReference)tryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTry_Catch() {
		return (EReference)tryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTry_Finally() {
		return (EReference)tryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTry_Times() {
		return (EAttribute)tryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTry_Delay() {
		return (EAttribute)tryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsFactory getOperationsFactory() {
		return (OperationsFactory)getEFactoryInstance();
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
		eqEClass = createEClass(EQ);
		createEReference(eqEClass, EQ__LEFT);
		createEReference(eqEClass, EQ__RIGHT);

		intEClass = createEClass(INT);

		boolEClass = createEClass(BOOL);

		strEClass = createEClass(STR);

		convertEClass = createEClass(CONVERT);
		createEReference(convertEClass, CONVERT__INPUT);

		assertTrueEClass = createEClass(ASSERT_TRUE);
		createEAttribute(assertTrueEClass, ASSERT_TRUE__INPUT);
		createEAttribute(assertTrueEClass, ASSERT_TRUE__MESSAGE);

		lengthEClass = createEClass(LENGTH);
		createEReference(lengthEClass, LENGTH__INPUT);

		notEqEClass = createEClass(NOT_EQ);
		createEReference(notEqEClass, NOT_EQ__LEFT);
		createEReference(notEqEClass, NOT_EQ__RIGHT);

		gtEClass = createEClass(GT);
		createEReference(gtEClass, GT__LEFT);
		createEReference(gtEClass, GT__RIGHT);

		ltEClass = createEClass(LT);
		createEReference(ltEClass, LT__LEFT);
		createEReference(ltEClass, LT__RIGHT);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__LEFT);

		tryEClass = createEClass(TRY);
		createEReference(tryEClass, TRY__COMMAND);
		createEReference(tryEClass, TRY__CATCH);
		createEReference(tryEClass, TRY__FINALLY);
		createEAttribute(tryEClass, TRY__TIMES);
		createEAttribute(tryEClass, TRY__DELAY);
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
		eqEClass.getESuperTypes().add(theCorePackage.getCommand());
		intEClass.getESuperTypes().add(this.getConvert());
		boolEClass.getESuperTypes().add(this.getConvert());
		strEClass.getESuperTypes().add(this.getConvert());
		convertEClass.getESuperTypes().add(theCorePackage.getCommand());
		assertTrueEClass.getESuperTypes().add(theCorePackage.getCommand());
		lengthEClass.getESuperTypes().add(theCorePackage.getCommand());
		notEqEClass.getESuperTypes().add(theCorePackage.getCommand());
		gtEClass.getESuperTypes().add(theCorePackage.getCommand());
		ltEClass.getESuperTypes().add(theCorePackage.getCommand());
		notEClass.getESuperTypes().add(theCorePackage.getCommand());
		tryEClass.getESuperTypes().add(theCorePackage.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(eqEClass, Eq.class, "Eq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEq_Left(), theEcorePackage.getEObject(), null, "left", null, 0, 1, Eq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEq_Right(), theEcorePackage.getEObject(), null, "right", null, 0, 1, Eq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intEClass, Int.class, "Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolEClass, Bool.class, "Bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strEClass, Str.class, "Str", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(convertEClass, Convert.class, "Convert", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConvert_Input(), theEcorePackage.getEObject(), null, "input", null, 0, 1, Convert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertTrueEClass, AssertTrue.class, "AssertTrue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertTrue_Input(), theEcorePackage.getEBoolean(), "input", null, 0, 1, AssertTrue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertTrue_Message(), theEcorePackage.getEString(), "message", null, 0, 1, AssertTrue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLength_Input(), theEcorePackage.getEObject(), null, "input", null, 0, -1, Length.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEqEClass, NotEq.class, "NotEq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotEq_Left(), theEcorePackage.getEObject(), null, "left", null, 0, 1, NotEq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotEq_Right(), theEcorePackage.getEObject(), null, "right", null, 0, 1, NotEq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gtEClass, Gt.class, "Gt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGt_Left(), theEcorePackage.getEObject(), null, "left", null, 0, 1, Gt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGt_Right(), theEcorePackage.getEObject(), null, "right", null, 0, 1, Gt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ltEClass, Lt.class, "Lt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLt_Left(), theEcorePackage.getEObject(), null, "left", null, 0, 1, Lt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLt_Right(), theEcorePackage.getEObject(), null, "right", null, 0, 1, Lt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Left(), theEcorePackage.getEObject(), null, "left", null, 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tryEClass, Try.class, "Try", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTry_Command(), theCorePackage.getCommand(), null, "command", null, 0, 1, Try.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTry_Catch(), theCorePackage.getCommand(), null, "catch", null, 0, 1, Try.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTry_Finally(), theCorePackage.getCommand(), null, "finally", null, 0, 1, Try.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTry_Times(), theEcorePackage.getEIntegerObject(), "times", "1", 0, 1, Try.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTry_Delay(), theEcorePackage.getEIntegerObject(), "delay", "0", 0, 1, Try.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/ecl/docs
		createDocsAnnotations();
		// http://www.eclipse.org/ecl/input
		createInputAnnotations();
		// http://www.eclipse.org/ecl/internal
		createInternalAnnotations();
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
		  (eqEClass, 
		   source, 
		   new String[] {
			 "description", "Compares arguments on equality",
			 "returns", "<code>true</code> when args are equal, <code>false</code> otherwise."
		   });			
		addAnnotation
		  (getEq_Left(), 
		   source, 
		   new String[] {
			 "description", "Left argument"
		   });		
		addAnnotation
		  (getEq_Right(), 
		   source, 
		   new String[] {
			 "description", "Right argument"
		   });		
		addAnnotation
		  (intEClass, 
		   source, 
		   new String[] {
			 "description", "Converts its argument to int.",
			 "returns", "Returns integer value or fails if value cannot be converted. <code>true</code> is converted to <code>1</code> and <code>false</code> is converted to <code>0</code>."
		   });		
		addAnnotation
		  (boolEClass, 
		   source, 
		   new String[] {
			 "description", "Converts its argument to boolean.",
			 "returns", "Returns boolean value or fails if value cannot be converted. "
		   });		
		addAnnotation
		  (strEClass, 
		   source, 
		   new String[] {
			 "description", "Converts its argument to string.",
			 "returns", "Returns string value or fails if value cannot be converted. "
		   });			
		addAnnotation
		  (getConvert_Input(), 
		   source, 
		   new String[] {
			 "description", "Argument to be converted to string."
		   });			
		addAnnotation
		  (assertTrueEClass, 
		   source, 
		   new String[] {
			 "description", "If input is not true, fails",
			 "returns", "Nothing"
		   });		
		addAnnotation
		  (getAssertTrue_Input(), 
		   source, 
		   new String[] {
			 "description", "Input value. Must be true."
		   });			
		addAnnotation
		  (getAssertTrue_Message(), 
		   source, 
		   new String[] {
			 "description", "Message to fail with when input is not true"
		   });		
		addAnnotation
		  (lengthEClass, 
		   source, 
		   new String[] {
			 "description", "Returns count of objects got from input pipe",
			 "returns", "Object count"
		   });		
		addAnnotation
		  (getLength_Input(), 
		   source, 
		   new String[] {
			 "description", "List of objects to get the length for"
		   });			
		addAnnotation
		  (notEqEClass, 
		   source, 
		   new String[] {
			 "description", "Compares arguments are different",
			 "returns", "<code>false</code> when args are equal, <code>true</code> otherwise."
		   });			
		addAnnotation
		  (getNotEq_Left(), 
		   source, 
		   new String[] {
			 "description", "Left argument"
		   });		
		addAnnotation
		  (getNotEq_Right(), 
		   source, 
		   new String[] {
			 "description", "Right argument"
		   });		
		addAnnotation
		  (gtEClass, 
		   source, 
		   new String[] {
			 "description", "Compares arguments on to one be greater then another",
			 "returns", "<code>true</code> when left are greater then right, <code>false</code> otherwise."
		   });			
		addAnnotation
		  (getGt_Left(), 
		   source, 
		   new String[] {
			 "description", "Left argument"
		   });		
		addAnnotation
		  (getGt_Right(), 
		   source, 
		   new String[] {
			 "description", "Right argument"
		   });		
		addAnnotation
		  (ltEClass, 
		   source, 
		   new String[] {
			 "description", "Compares arguments one are less then another",
			 "returns", "<code>true</code> when left is less then right, <code>false</code> otherwise."
		   });			
		addAnnotation
		  (getLt_Left(), 
		   source, 
		   new String[] {
			 "description", "Left argument"
		   });		
		addAnnotation
		  (getLt_Right(), 
		   source, 
		   new String[] {
			 "description", "Right argument"
		   });		
		addAnnotation
		  (notEClass, 
		   source, 
		   new String[] {
			 "description", "Return !value",
			 "returns", "<code>true</code> when value is false, <code>false</code> otherwise."
		   });			
		addAnnotation
		  (getNot_Left(), 
		   source, 
		   new String[] {
			 "description", "Left argument"
		   });		
		addAnnotation
		  (tryEClass, 
		   source, 
		   new String[] {
			 "description", "Try to execute command, retry times with delay if command are failed.\nExecute catch if all operations is not succesfull. Execute finally in anyway.",
			 "returns", "return\'s -command output if command is successed."
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
		  (getEq_Left(), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (getConvert_Input(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getAssertTrue_Input(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getLength_Input(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getNotEq_Left(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getGt_Left(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getLt_Left(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getNot_Left(), 
		   source, 
		   new String[] {
		   });		
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ecl/internal</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createInternalAnnotations() {
		String source = "http://www.eclipse.org/ecl/internal";									
		addAnnotation
		  (convertEClass, 
		   source, 
		   new String[] {
		   });																									
	}

} //OperationsPackageImpl
