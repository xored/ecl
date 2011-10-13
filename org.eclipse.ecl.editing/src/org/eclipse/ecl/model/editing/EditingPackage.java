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
 * $Id: EditingPackage.java,v 1.1 2010/09/01 05:56:00 alena Exp $
 */
package org.eclipse.ecl.model.editing;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.ecl.model.editing.EditingFactory
 * @model kind="package"
 * @generated
 */
public interface EditingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "editing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ecl/editing.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.ecl.editing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EditingPackage eINSTANCE = org.eclipse.ecl.model.editing.impl.EditingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.model.editing.impl.CompleteImpl <em>Complete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.model.editing.impl.CompleteImpl
	 * @see org.eclipse.ecl.model.editing.impl.EditingPackageImpl#getComplete()
	 * @generated
	 */
	int COMPLETE = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE__TEXT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE__OFFSET = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.model.editing.impl.ProposalImpl <em>Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.model.editing.impl.ProposalImpl
	 * @see org.eclipse.ecl.model.editing.impl.EditingPackageImpl#getProposal()
	 * @generated
	 */
	int PROPOSAL = 1;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__INSERT = 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__DISPLAY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.model.editing.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.model.editing.impl.DescriptionImpl
	 * @see org.eclipse.ecl.model.editing.impl.EditingPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__TEXT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__OFFSET = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.model.editing.impl.DocImpl <em>Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.model.editing.impl.DocImpl
	 * @see org.eclipse.ecl.model.editing.impl.EditingPackageImpl#getDoc()
	 * @generated
	 */
	int DOC = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.model.editing.ProposalType <em>Proposal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.model.editing.ProposalType
	 * @see org.eclipse.ecl.model.editing.impl.EditingPackageImpl#getProposalType()
	 * @generated
	 */
	int PROPOSAL_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.model.editing.Complete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complete</em>'.
	 * @see org.eclipse.ecl.model.editing.Complete
	 * @generated
	 */
	EClass getComplete();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.model.editing.Complete#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.model.editing.Complete#getText()
	 * @see #getComplete()
	 * @generated
	 */
	EAttribute getComplete_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.model.editing.Complete#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.ecl.model.editing.Complete#getOffset()
	 * @see #getComplete()
	 * @generated
	 */
	EAttribute getComplete_Offset();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.model.editing.Proposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposal</em>'.
	 * @see org.eclipse.ecl.model.editing.Proposal
	 * @generated
	 */
	EClass getProposal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.model.editing.Proposal#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert</em>'.
	 * @see org.eclipse.ecl.model.editing.Proposal#getInsert()
	 * @see #getProposal()
	 * @generated
	 */
	EAttribute getProposal_Insert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.model.editing.Proposal#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.eclipse.ecl.model.editing.Proposal#getDisplay()
	 * @see #getProposal()
	 * @generated
	 */
	EAttribute getProposal_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.model.editing.Proposal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.ecl.model.editing.Proposal#getType()
	 * @see #getProposal()
	 * @generated
	 */
	EAttribute getProposal_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.model.editing.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.eclipse.ecl.model.editing.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.model.editing.Description#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.model.editing.Description#getText()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.model.editing.Description#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.ecl.model.editing.Description#getOffset()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Offset();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.model.editing.Doc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc</em>'.
	 * @see org.eclipse.ecl.model.editing.Doc
	 * @generated
	 */
	EClass getDoc();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.model.editing.Doc#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ecl.model.editing.Doc#getText()
	 * @see #getDoc()
	 * @generated
	 */
	EAttribute getDoc_Text();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.ecl.model.editing.ProposalType <em>Proposal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Proposal Type</em>'.
	 * @see org.eclipse.ecl.model.editing.ProposalType
	 * @generated
	 */
	EEnum getProposalType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EditingFactory getEditingFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ecl.model.editing.impl.CompleteImpl <em>Complete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.model.editing.impl.CompleteImpl
		 * @see org.eclipse.ecl.model.editing.impl.EditingPackageImpl#getComplete()
		 * @generated
		 */
		EClass COMPLETE = eINSTANCE.getComplete();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE__TEXT = eINSTANCE.getComplete_Text();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETE__OFFSET = eINSTANCE.getComplete_Offset();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.model.editing.impl.ProposalImpl <em>Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.model.editing.impl.ProposalImpl
		 * @see org.eclipse.ecl.model.editing.impl.EditingPackageImpl#getProposal()
		 * @generated
		 */
		EClass PROPOSAL = eINSTANCE.getProposal();

		/**
		 * The meta object literal for the '<em><b>Insert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSAL__INSERT = eINSTANCE.getProposal_Insert();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSAL__DISPLAY = eINSTANCE.getProposal_Display();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSAL__TYPE = eINSTANCE.getProposal_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.model.editing.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.model.editing.impl.DescriptionImpl
		 * @see org.eclipse.ecl.model.editing.impl.EditingPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__TEXT = eINSTANCE.getDescription_Text();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__OFFSET = eINSTANCE.getDescription_Offset();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.model.editing.impl.DocImpl <em>Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.model.editing.impl.DocImpl
		 * @see org.eclipse.ecl.model.editing.impl.EditingPackageImpl#getDoc()
		 * @generated
		 */
		EClass DOC = eINSTANCE.getDoc();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC__TEXT = eINSTANCE.getDoc_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.model.editing.ProposalType <em>Proposal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.model.editing.ProposalType
		 * @see org.eclipse.ecl.model.editing.impl.EditingPackageImpl#getProposalType()
		 * @generated
		 */
		EEnum PROPOSAL_TYPE = eINSTANCE.getProposalType();

	}

} //EditingPackage
