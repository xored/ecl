/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestBoolParamImpl.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model.impl;

import org.eclipse.ecl.core.impl.CommandImpl;

import org.eclipse.ecl.parser.test.model.ParserTestModelPackage;
import org.eclipse.ecl.parser.test.model.TestBoolParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Bool Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.parser.test.model.impl.TestBoolParamImpl#isArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestBoolParamImpl extends CommandImpl implements TestBoolParam {
	/**
	 * The default value of the '{@link #isArg() <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArg()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArg() <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArg()
	 * @generated
	 * @ordered
	 */
	protected boolean arg = ARG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestBoolParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserTestModelPackage.Literals.TEST_BOOL_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArg() {
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArg(boolean newArg) {
		boolean oldArg = arg;
		arg = newArg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserTestModelPackage.TEST_BOOL_PARAM__ARG, oldArg, arg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParserTestModelPackage.TEST_BOOL_PARAM__ARG:
				return isArg();
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
			case ParserTestModelPackage.TEST_BOOL_PARAM__ARG:
				setArg((Boolean)newValue);
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
			case ParserTestModelPackage.TEST_BOOL_PARAM__ARG:
				setArg(ARG_EDEFAULT);
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
			case ParserTestModelPackage.TEST_BOOL_PARAM__ARG:
				return arg != ARG_EDEFAULT;
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
		result.append(" (arg: ");
		result.append(arg);
		result.append(')');
		return result.toString();
	}

} //TestBoolParamImpl
