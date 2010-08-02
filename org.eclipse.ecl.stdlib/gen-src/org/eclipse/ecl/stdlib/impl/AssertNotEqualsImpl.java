/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssertNotEqualsImpl.java,v 1.1 2010/08/02 09:24:20 andrey Exp $
 */
package org.eclipse.ecl.stdlib.impl;

import org.eclipse.ecl.core.impl.CommandImpl;

import org.eclipse.ecl.stdlib.AssertNotEquals;
import org.eclipse.ecl.stdlib.StandartLibraryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Not Equals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.stdlib.impl.AssertNotEqualsImpl#getExpected <em>Expected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertNotEqualsImpl extends CommandImpl implements AssertNotEquals {
	/**
	 * The default value of the '{@link #getExpected() <em>Expected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpected()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpected() <em>Expected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpected()
	 * @generated
	 * @ordered
	 */
	protected String expected = EXPECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertNotEqualsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandartLibraryPackage.Literals.ASSERT_NOT_EQUALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpected() {
		return expected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpected(String newExpected) {
		String oldExpected = expected;
		expected = newExpected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandartLibraryPackage.ASSERT_NOT_EQUALS__EXPECTED, oldExpected, expected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandartLibraryPackage.ASSERT_NOT_EQUALS__EXPECTED:
				return getExpected();
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
			case StandartLibraryPackage.ASSERT_NOT_EQUALS__EXPECTED:
				setExpected((String)newValue);
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
			case StandartLibraryPackage.ASSERT_NOT_EQUALS__EXPECTED:
				setExpected(EXPECTED_EDEFAULT);
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
			case StandartLibraryPackage.ASSERT_NOT_EQUALS__EXPECTED:
				return EXPECTED_EDEFAULT == null ? expected != null : !EXPECTED_EDEFAULT.equals(expected);
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
		result.append(" (expected: ");
		result.append(expected);
		result.append(')');
		return result.toString();
	}

} //AssertNotEqualsImpl
