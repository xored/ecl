/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestUnknownParamImpl.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model.impl;

import org.eclipse.ecl.core.impl.CommandImpl;

import org.eclipse.ecl.parser.test.model.ParserTestModelPackage;
import org.eclipse.ecl.parser.test.model.TestUnknownParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Unknown Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.parser.test.model.impl.TestUnknownParamImpl#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestUnknownParamImpl extends CommandImpl implements TestUnknownParam {
	/**
	 * The cached value of the '{@link #getArg() <em>Arg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg()
	 * @generated
	 * @ordered
	 */
	protected EObject arg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestUnknownParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserTestModelPackage.Literals.TEST_UNKNOWN_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getArg() {
		if (arg != null && arg.eIsProxy()) {
			InternalEObject oldArg = (InternalEObject)arg;
			arg = eResolveProxy(oldArg);
			if (arg != oldArg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParserTestModelPackage.TEST_UNKNOWN_PARAM__ARG, oldArg, arg));
			}
		}
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetArg() {
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArg(EObject newArg) {
		EObject oldArg = arg;
		arg = newArg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserTestModelPackage.TEST_UNKNOWN_PARAM__ARG, oldArg, arg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParserTestModelPackage.TEST_UNKNOWN_PARAM__ARG:
				if (resolve) return getArg();
				return basicGetArg();
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
			case ParserTestModelPackage.TEST_UNKNOWN_PARAM__ARG:
				setArg((EObject)newValue);
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
			case ParserTestModelPackage.TEST_UNKNOWN_PARAM__ARG:
				setArg((EObject)null);
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
			case ParserTestModelPackage.TEST_UNKNOWN_PARAM__ARG:
				return arg != null;
		}
		return super.eIsSet(featureID);
	}

} //TestUnknownParamImpl
