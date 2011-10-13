/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id: EditingPackageImpl.java,v 1.1 2010/09/01 05:56:00 alena Exp $
 */
package org.eclipse.ecl.model.editing.impl;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.ecl.model.editing.Complete;
import org.eclipse.ecl.model.editing.Description;
import org.eclipse.ecl.model.editing.Doc;
import org.eclipse.ecl.model.editing.EditingFactory;
import org.eclipse.ecl.model.editing.EditingPackage;

import org.eclipse.ecl.model.editing.Proposal;
import org.eclipse.ecl.model.editing.ProposalType;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditingPackageImpl extends EPackageImpl implements EditingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proposalEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum proposalTypeEEnum = null;

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
	 * @see org.eclipse.ecl.model.editing.EditingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EditingPackageImpl() {
		super(eNS_URI, EditingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EditingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EditingPackage init() {
		if (isInited) return (EditingPackage)EPackage.Registry.INSTANCE.getEPackage(EditingPackage.eNS_URI);

		// Obtain or create and register package
		EditingPackageImpl theEditingPackage = (EditingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EditingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EditingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEditingPackage.createPackageContents();

		// Initialize created meta-data
		theEditingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEditingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EditingPackage.eNS_URI, theEditingPackage);
		return theEditingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplete() {
		return completeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplete_Text() {
		return (EAttribute)completeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplete_Offset() {
		return (EAttribute)completeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProposal() {
		return proposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProposal_Insert() {
		return (EAttribute)proposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProposal_Display() {
		return (EAttribute)proposalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProposal_Type() {
		return (EAttribute)proposalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Text() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Offset() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoc() {
		return docEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoc_Text() {
		return (EAttribute)docEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProposalType() {
		return proposalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingFactory getEditingFactory() {
		return (EditingFactory)getEFactoryInstance();
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
		completeEClass = createEClass(COMPLETE);
		createEAttribute(completeEClass, COMPLETE__TEXT);
		createEAttribute(completeEClass, COMPLETE__OFFSET);

		proposalEClass = createEClass(PROPOSAL);
		createEAttribute(proposalEClass, PROPOSAL__INSERT);
		createEAttribute(proposalEClass, PROPOSAL__DISPLAY);
		createEAttribute(proposalEClass, PROPOSAL__TYPE);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__TEXT);
		createEAttribute(descriptionEClass, DESCRIPTION__OFFSET);

		docEClass = createEClass(DOC);
		createEAttribute(docEClass, DOC__TEXT);

		// Create enums
		proposalTypeEEnum = createEEnum(PROPOSAL_TYPE);
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
		completeEClass.getESuperTypes().add(theCorePackage.getCommand());
		descriptionEClass.getESuperTypes().add(theCorePackage.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(completeEClass, Complete.class, "Complete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplete_Text(), theEcorePackage.getEString(), "text", null, 1, 1, Complete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplete_Offset(), theEcorePackage.getEInt(), "offset", null, 1, 1, Complete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proposalEClass, Proposal.class, "Proposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProposal_Insert(), theEcorePackage.getEString(), "insert", null, 0, 1, Proposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProposal_Display(), theEcorePackage.getEString(), "display", null, 0, 1, Proposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProposal_Type(), this.getProposalType(), "type", null, 0, 1, Proposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Text(), theEcorePackage.getEString(), "text", null, 1, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_Offset(), theEcorePackage.getEInt(), "offset", null, 1, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(docEClass, Doc.class, "Doc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoc_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Doc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(proposalTypeEEnum, ProposalType.class, "ProposalType");
		addEEnumLiteral(proposalTypeEEnum, ProposalType.COMMAND_NAME);
		addEEnumLiteral(proposalTypeEEnum, ProposalType.PARAM_NAME);

		// Create resource
		createResource(eNS_URI);
	}

} //EditingPackageImpl
