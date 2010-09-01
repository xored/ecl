/**
 * <copyright>
 * </copyright>
 *
 * $Id: Proposal.java,v 1.1 2010/09/01 05:56:00 alena Exp $
 */
package org.eclipse.ecl.model.editing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.model.editing.Proposal#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.ecl.model.editing.Proposal#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.ecl.model.editing.Proposal#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.model.editing.EditingPackage#getProposal()
 * @model
 * @generated
 */
public interface Proposal extends EObject {
	/**
	 * Returns the value of the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' attribute.
	 * @see #setInsert(String)
	 * @see org.eclipse.ecl.model.editing.EditingPackage#getProposal_Insert()
	 * @model
	 * @generated
	 */
	String getInsert();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.model.editing.Proposal#getInsert <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert</em>' attribute.
	 * @see #getInsert()
	 * @generated
	 */
	void setInsert(String value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see #setDisplay(String)
	 * @see org.eclipse.ecl.model.editing.EditingPackage#getProposal_Display()
	 * @model
	 * @generated
	 */
	String getDisplay();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.model.editing.Proposal#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.ecl.model.editing.ProposalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.ecl.model.editing.ProposalType
	 * @see #setType(ProposalType)
	 * @see org.eclipse.ecl.model.editing.EditingPackage#getProposal_Type()
	 * @model
	 * @generated
	 */
	ProposalType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.model.editing.Proposal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.ecl.model.editing.ProposalType
	 * @see #getType()
	 * @generated
	 */
	void setType(ProposalType value);

} // Proposal
