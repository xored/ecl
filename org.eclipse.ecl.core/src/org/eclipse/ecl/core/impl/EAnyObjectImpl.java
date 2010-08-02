/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAnyObjectImpl.java,v 1.1 2010/08/02 09:24:00 andrey Exp $
 */
package org.eclipse.ecl.core.impl;

import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.EAnyObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAny Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.impl.EAnyObjectImpl#getEmfObject <em>Emf Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EAnyObjectImpl extends AnyObjectImpl implements EAnyObject {
	/**
	 * The cached value of the '{@link #getEmfObject() <em>Emf Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfObject()
	 * @generated
	 * @ordered
	 */
	protected EObject emfObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAnyObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EANY_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getEmfObject() {
		if (emfObject != null && emfObject.eIsProxy()) {
			InternalEObject oldEmfObject = (InternalEObject)emfObject;
			emfObject = eResolveProxy(oldEmfObject);
			if (emfObject != oldEmfObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.EANY_OBJECT__EMF_OBJECT, oldEmfObject, emfObject));
			}
		}
		return emfObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetEmfObject() {
		return emfObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmfObject(EObject newEmfObject) {
		EObject oldEmfObject = emfObject;
		emfObject = newEmfObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EANY_OBJECT__EMF_OBJECT, oldEmfObject, emfObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.EANY_OBJECT__EMF_OBJECT:
				if (resolve) return getEmfObject();
				return basicGetEmfObject();
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
			case CorePackage.EANY_OBJECT__EMF_OBJECT:
				setEmfObject((EObject)newValue);
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
			case CorePackage.EANY_OBJECT__EMF_OBJECT:
				setEmfObject((EObject)null);
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
			case CorePackage.EANY_OBJECT__EMF_OBJECT:
				return emfObject != null;
		}
		return super.eIsSet(featureID);
	}

} //EAnyObjectImpl
