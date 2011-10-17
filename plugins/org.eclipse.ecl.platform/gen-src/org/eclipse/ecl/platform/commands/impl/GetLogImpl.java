/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.commands.impl;

import org.eclipse.ecl.core.impl.CommandImpl;

import org.eclipse.ecl.platform.commands.CommandsPackage;
import org.eclipse.ecl.platform.commands.GetLog;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.platform.commands.impl.GetLogImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.eclipse.ecl.platform.commands.impl.GetLogImpl#isSkipInfo <em>Skip Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetLogImpl extends CommandImpl implements GetLog {
	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected int limit = LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSkipInfo() <em>Skip Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipInfo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SKIP_INFO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSkipInfo() <em>Skip Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipInfo()
	 * @generated
	 * @ordered
	 */
	protected boolean skipInfo = SKIP_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandsPackage.Literals.GET_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(int newLimit) {
		int oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandsPackage.GET_LOG__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSkipInfo() {
		return skipInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkipInfo(boolean newSkipInfo) {
		boolean oldSkipInfo = skipInfo;
		skipInfo = newSkipInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandsPackage.GET_LOG__SKIP_INFO, oldSkipInfo, skipInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommandsPackage.GET_LOG__LIMIT:
				return getLimit();
			case CommandsPackage.GET_LOG__SKIP_INFO:
				return isSkipInfo();
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
			case CommandsPackage.GET_LOG__LIMIT:
				setLimit((Integer)newValue);
				return;
			case CommandsPackage.GET_LOG__SKIP_INFO:
				setSkipInfo((Boolean)newValue);
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
			case CommandsPackage.GET_LOG__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case CommandsPackage.GET_LOG__SKIP_INFO:
				setSkipInfo(SKIP_INFO_EDEFAULT);
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
			case CommandsPackage.GET_LOG__LIMIT:
				return limit != LIMIT_EDEFAULT;
			case CommandsPackage.GET_LOG__SKIP_INFO:
				return skipInfo != SKIP_INFO_EDEFAULT;
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
		result.append(" (limit: ");
		result.append(limit);
		result.append(", skipInfo: ");
		result.append(skipInfo);
		result.append(')');
		return result.toString();
	}

} //GetLogImpl
