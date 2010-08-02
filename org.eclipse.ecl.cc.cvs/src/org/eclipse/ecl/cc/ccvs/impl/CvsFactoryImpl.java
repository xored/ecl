/**
 * <copyright>
 * </copyright>
 *
 * $Id: CvsFactoryImpl.java,v 1.1 2010/08/02 09:24:04 andrey Exp $
 */
package org.eclipse.ecl.cc.ccvs.impl;

import org.eclipse.ecl.cc.ccvs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CvsFactoryImpl extends EFactoryImpl implements CvsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CvsFactory init() {
        try {
            CvsFactory theCvsFactory = (CvsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ecl/cc/cvs.ecore"); 
            if (theCvsFactory != null) {
                return theCvsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CvsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CvsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case CvsPackage.GET_CVS_LOCATIONS: return createGetCVSLocations();
            case CvsPackage.CVS_LOCATION: return createCVSLocation();
            case CvsPackage.ADD_CVS_LOCATIONS: return createAddCVSLocations();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case CvsPackage.CVS_CONNECTION_TYPE:
                return createCVSConnectionTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case CvsPackage.CVS_CONNECTION_TYPE:
                return convertCVSConnectionTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GetCVSLocations createGetCVSLocations() {
        GetCVSLocationsImpl getCVSLocations = new GetCVSLocationsImpl();
        return getCVSLocations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CVSLocation createCVSLocation() {
        CVSLocationImpl cvsLocation = new CVSLocationImpl();
        return cvsLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddCVSLocations createAddCVSLocations() {
        AddCVSLocationsImpl addCVSLocations = new AddCVSLocationsImpl();
        return addCVSLocations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CVSConnectionType createCVSConnectionTypeFromString(EDataType eDataType, String initialValue) {
        CVSConnectionType result = CVSConnectionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCVSConnectionTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CvsPackage getCvsPackage() {
        return (CvsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CvsPackage getPackage() {
        return CvsPackage.eINSTANCE;
    }

} //CvsFactoryImpl
