/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.core.impl;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.Watch;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Watch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.impl.WatchImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.impl.WatchImpl#getWhile <em>While</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WatchImpl extends CommandImpl implements Watch {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWhile() <em>While</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhile()
	 * @generated
	 * @ordered
	 */
	protected Command while_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.WATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WATCH__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getWhile() {
		if (while_ != null && while_.eIsProxy()) {
			InternalEObject oldWhile = (InternalEObject)while_;
			while_ = (Command)eResolveProxy(oldWhile);
			if (while_ != oldWhile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.WATCH__WHILE, oldWhile, while_));
			}
		}
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetWhile() {
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhile(Command newWhile) {
		Command oldWhile = while_;
		while_ = newWhile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WATCH__WHILE, oldWhile, while_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.WATCH__SOURCE:
				return getSource();
			case CorePackage.WATCH__WHILE:
				if (resolve) return getWhile();
				return basicGetWhile();
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
			case CorePackage.WATCH__SOURCE:
				setSource((String)newValue);
				return;
			case CorePackage.WATCH__WHILE:
				setWhile((Command)newValue);
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
			case CorePackage.WATCH__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CorePackage.WATCH__WHILE:
				setWhile((Command)null);
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
			case CorePackage.WATCH__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case CorePackage.WATCH__WHILE:
				return while_ != null;
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
		result.append(" (source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //WatchImpl
