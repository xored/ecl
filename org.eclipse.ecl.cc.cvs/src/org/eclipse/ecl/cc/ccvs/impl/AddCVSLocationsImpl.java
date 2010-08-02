/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddCVSLocationsImpl.java,v 1.1 2010/08/02 09:24:04 andrey Exp $
 */
package org.eclipse.ecl.cc.ccvs.impl;

import java.util.Collection;

import org.eclipse.ecl.cc.ccvs.AddCVSLocations;
import org.eclipse.ecl.cc.ccvs.CVSLocation;
import org.eclipse.ecl.cc.ccvs.CvsPackage;

import org.eclipse.ecl.core.impl.CommandImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add CVS Locations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.impl.AddCVSLocationsImpl#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddCVSLocationsImpl extends CommandImpl implements AddCVSLocations {
    /**
     * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected EList<CVSLocation> input;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AddCVSLocationsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CvsPackage.Literals.ADD_CVS_LOCATIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CVSLocation> getInput() {
        if (input == null) {
            input = new EObjectContainmentEList<CVSLocation>(CVSLocation.class, this, CvsPackage.ADD_CVS_LOCATIONS__INPUT);
        }
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CvsPackage.ADD_CVS_LOCATIONS__INPUT:
                return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CvsPackage.ADD_CVS_LOCATIONS__INPUT:
                return getInput();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CvsPackage.ADD_CVS_LOCATIONS__INPUT:
                getInput().clear();
                getInput().addAll((Collection<? extends CVSLocation>)newValue);
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
            case CvsPackage.ADD_CVS_LOCATIONS__INPUT:
                getInput().clear();
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
            case CvsPackage.ADD_CVS_LOCATIONS__INPUT:
                return input != null && !input.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AddCVSLocationsImpl
