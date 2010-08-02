/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnyModelObjectImpl.java,v 1.1 2010/08/02 09:23:59 andrey Exp $
 */
package org.eclipse.ecl.core.impl;

import org.eclipse.ecl.core.AnyModelObject;
import org.eclipse.ecl.core.CorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Model Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.impl.AnyModelObjectImpl#getJavaObject <em>Java Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnyModelObjectImpl extends AnyObjectImpl implements AnyModelObject {
	/**
	 * The default value of the '{@link #getJavaObject() <em>Java Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object JAVA_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaObject() <em>Java Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaObject()
	 * @generated
	 * @ordered
	 */
	protected Object javaObject = JAVA_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyModelObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ANY_MODEL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getJavaObject() {
		return javaObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaObject(Object newJavaObject) {
		Object oldJavaObject = javaObject;
		javaObject = newJavaObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ANY_MODEL_OBJECT__JAVA_OBJECT, oldJavaObject, javaObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ANY_MODEL_OBJECT__JAVA_OBJECT:
				return getJavaObject();
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
			case CorePackage.ANY_MODEL_OBJECT__JAVA_OBJECT:
				setJavaObject(newValue);
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
			case CorePackage.ANY_MODEL_OBJECT__JAVA_OBJECT:
				setJavaObject(JAVA_OBJECT_EDEFAULT);
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
			case CorePackage.ANY_MODEL_OBJECT__JAVA_OBJECT:
				return JAVA_OBJECT_EDEFAULT == null ? javaObject != null : !JAVA_OBJECT_EDEFAULT.equals(javaObject);
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
		result.append(" (javaObject: ");
		result.append(javaObject);
		result.append(')');
		return result.toString();
	}

} //AnyModelObjectImpl
