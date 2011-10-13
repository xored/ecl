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
 * $Id: ProposalImpl.java,v 1.1 2010/09/01 05:56:00 alena Exp $
 */
package org.eclipse.ecl.model.editing.impl;

import org.eclipse.ecl.model.editing.EditingPackage;
import org.eclipse.ecl.model.editing.Proposal;
import org.eclipse.ecl.model.editing.ProposalType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proposal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.model.editing.impl.ProposalImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.ecl.model.editing.impl.ProposalImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.ecl.model.editing.impl.ProposalImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProposalImpl extends EObjectImpl implements Proposal {
	/**
	 * The default value of the '{@link #getInsert() <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsert()
	 * @generated
	 * @ordered
	 */
	protected static final String INSERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsert() <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsert()
	 * @generated
	 * @ordered
	 */
	protected String insert = INSERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected String display = DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ProposalType TYPE_EDEFAULT = ProposalType.COMMAND_NAME;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ProposalType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditingPackage.Literals.PROPOSAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsert() {
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsert(String newInsert) {
		String oldInsert = insert;
		insert = newInsert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditingPackage.PROPOSAL__INSERT, oldInsert, insert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(String newDisplay) {
		String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditingPackage.PROPOSAL__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProposalType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ProposalType newType) {
		ProposalType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditingPackage.PROPOSAL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EditingPackage.PROPOSAL__INSERT:
				return getInsert();
			case EditingPackage.PROPOSAL__DISPLAY:
				return getDisplay();
			case EditingPackage.PROPOSAL__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EditingPackage.PROPOSAL__INSERT:
				setInsert((String)newValue);
				return;
			case EditingPackage.PROPOSAL__DISPLAY:
				setDisplay((String)newValue);
				return;
			case EditingPackage.PROPOSAL__TYPE:
				setType((ProposalType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EditingPackage.PROPOSAL__INSERT:
				setInsert(INSERT_EDEFAULT);
				return;
			case EditingPackage.PROPOSAL__DISPLAY:
				setDisplay(DISPLAY_EDEFAULT);
				return;
			case EditingPackage.PROPOSAL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EditingPackage.PROPOSAL__INSERT:
				return INSERT_EDEFAULT == null ? insert != null : !INSERT_EDEFAULT.equals(insert);
			case EditingPackage.PROPOSAL__DISPLAY:
				return DISPLAY_EDEFAULT == null ? display != null : !DISPLAY_EDEFAULT.equals(display);
			case EditingPackage.PROPOSAL__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (insert: ");
		result.append(insert);
		result.append(", display: ");
		result.append(display);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ProposalImpl
