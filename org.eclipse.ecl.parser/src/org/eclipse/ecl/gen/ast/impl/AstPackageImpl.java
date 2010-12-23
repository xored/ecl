/**
 * <copyright>
 * </copyright>
 *
 * $Id: AstPackageImpl.java,v 1.5 2010/12/23 08:12:01 alena Exp $
 */
package org.eclipse.ecl.gen.ast.impl;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.ecl.gen.ast.AstExec;
import org.eclipse.ecl.gen.ast.AstFactory;
import org.eclipse.ecl.gen.ast.AstLiteral;
import org.eclipse.ecl.gen.ast.AstNode;
import org.eclipse.ecl.gen.ast.AstPackage;

import org.eclipse.ecl.gen.ast.LocatedProcessStatus;
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
public class AstPackageImpl extends EPackageImpl implements AstPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astExecEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatedProcessStatusEClass = null;

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
	 * @see org.eclipse.ecl.gen.ast.AstPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AstPackageImpl() {
		super(eNS_URI, AstFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AstPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AstPackage init() {
		if (isInited) return (AstPackage)EPackage.Registry.INSTANCE.getEPackage(AstPackage.eNS_URI);

		// Obtain or create and register package
		AstPackageImpl theAstPackage = (AstPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AstPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AstPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAstPackage.createPackageContents();

		// Initialize created meta-data
		theAstPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAstPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AstPackage.eNS_URI, theAstPackage);
		return theAstPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAstNode() {
		return astNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstNode_Column() {
		return (EAttribute)astNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstNode_Line() {
		return (EAttribute)astNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstNode_Length() {
		return (EAttribute)astNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAstExec() {
		return astExecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAstLiteral() {
		return astLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocatedProcessStatus() {
		return locatedProcessStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstFactory getAstFactory() {
		return (AstFactory)getEFactoryInstance();
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
		astNodeEClass = createEClass(AST_NODE);
		createEAttribute(astNodeEClass, AST_NODE__COLUMN);
		createEAttribute(astNodeEClass, AST_NODE__LINE);
		createEAttribute(astNodeEClass, AST_NODE__LENGTH);

		astExecEClass = createEClass(AST_EXEC);

		astLiteralEClass = createEClass(AST_LITERAL);

		locatedProcessStatusEClass = createEClass(LOCATED_PROCESS_STATUS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		astExecEClass.getESuperTypes().add(theCorePackage.getExec());
		astExecEClass.getESuperTypes().add(this.getAstNode());
		astLiteralEClass.getESuperTypes().add(theCorePackage.getLiteralParameter());
		astLiteralEClass.getESuperTypes().add(this.getAstNode());
		locatedProcessStatusEClass.getESuperTypes().add(theCorePackage.getProcessStatus());
		locatedProcessStatusEClass.getESuperTypes().add(this.getAstNode());

		// Initialize classes and features; add operations and parameters
		initEClass(astNodeEClass, AstNode.class, "AstNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAstNode_Column(), ecorePackage.getEInt(), "column", null, 0, 1, AstNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstNode_Line(), ecorePackage.getEInt(), "line", null, 0, 1, AstNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstNode_Length(), ecorePackage.getEInt(), "length", null, 0, 1, AstNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(astExecEClass, AstExec.class, "AstExec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(astLiteralEClass, AstLiteral.class, "AstLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locatedProcessStatusEClass, LocatedProcessStatus.class, "LocatedProcessStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/ecl/internal
		createInternalAnnotations();
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
		  (getAstNode_Column(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getAstNode_Line(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getAstNode_Length(), 
		   source, 
		   new String[] {
		   });
	}

} //AstPackageImpl
