/**
 * <copyright>
 * </copyright>
 *
 * $Id: CvsPackage.java,v 1.1 2010/08/02 09:24:04 andrey Exp $
 */
package org.eclipse.ecl.cc.ccvs;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.cc.ccvs.CvsFactory
 * @model kind="package"
 * @generated
 */
public interface CvsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "ccvs";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.eclipse.org/ecl/cc/cvs.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "org.eclipse.ecl.cc.cvs";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CvsPackage eINSTANCE = org.eclipse.ecl.cc.ccvs.impl.CvsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.eclipse.ecl.cc.ccvs.impl.GetCVSLocationsImpl <em>Get CVS Locations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecl.cc.ccvs.impl.GetCVSLocationsImpl
     * @see org.eclipse.ecl.cc.ccvs.impl.CvsPackageImpl#getGetCVSLocations()
     * @generated
     */
    int GET_CVS_LOCATIONS = 0;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_CVS_LOCATIONS__HOST = CorePackage.COMMAND__HOST;

    /**
     * The number of structural features of the '<em>Get CVS Locations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_CVS_LOCATIONS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.ecl.cc.ccvs.impl.CVSLocationImpl <em>CVS Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecl.cc.ccvs.impl.CVSLocationImpl
     * @see org.eclipse.ecl.cc.ccvs.impl.CvsPackageImpl#getCVSLocation()
     * @generated
     */
    int CVS_LOCATION = 1;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CVS_LOCATION__HOST = 0;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CVS_LOCATION__PATH = 1;

    /**
     * The feature id for the '<em><b>User</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CVS_LOCATION__USER = 2;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CVS_LOCATION__PORT = 3;

    /**
     * The feature id for the '<em><b>Connection Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CVS_LOCATION__CONNECTION_TYPE = 4;

    /**
     * The number of structural features of the '<em>CVS Location</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CVS_LOCATION_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.eclipse.ecl.cc.ccvs.impl.AddCVSLocationsImpl <em>Add CVS Locations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecl.cc.ccvs.impl.AddCVSLocationsImpl
     * @see org.eclipse.ecl.cc.ccvs.impl.CvsPackageImpl#getAddCVSLocations()
     * @generated
     */
    int ADD_CVS_LOCATIONS = 2;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADD_CVS_LOCATIONS__HOST = CorePackage.COMMAND__HOST;

    /**
     * The feature id for the '<em><b>Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADD_CVS_LOCATIONS__INPUT = CorePackage.COMMAND_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Add CVS Locations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADD_CVS_LOCATIONS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.ecl.cc.ccvs.CVSConnectionType <em>CVS Connection Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecl.cc.ccvs.CVSConnectionType
     * @see org.eclipse.ecl.cc.ccvs.impl.CvsPackageImpl#getCVSConnectionType()
     * @generated
     */
    int CVS_CONNECTION_TYPE = 3;


    /**
     * Returns the meta object for class '{@link org.eclipse.ecl.cc.ccvs.GetCVSLocations <em>Get CVS Locations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Get CVS Locations</em>'.
     * @see org.eclipse.ecl.cc.ccvs.GetCVSLocations
     * @generated
     */
    EClass getGetCVSLocations();

    /**
     * Returns the meta object for class '{@link org.eclipse.ecl.cc.ccvs.CVSLocation <em>CVS Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CVS Location</em>'.
     * @see org.eclipse.ecl.cc.ccvs.CVSLocation
     * @generated
     */
    EClass getCVSLocation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.eclipse.ecl.cc.ccvs.CVSLocation#getHost()
     * @see #getCVSLocation()
     * @generated
     */
    EAttribute getCVSLocation_Host();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.eclipse.ecl.cc.ccvs.CVSLocation#getPath()
     * @see #getCVSLocation()
     * @generated
     */
    EAttribute getCVSLocation_Path();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getUser <em>User</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User</em>'.
     * @see org.eclipse.ecl.cc.ccvs.CVSLocation#getUser()
     * @see #getCVSLocation()
     * @generated
     */
    EAttribute getCVSLocation_User();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.eclipse.ecl.cc.ccvs.CVSLocation#getPort()
     * @see #getCVSLocation()
     * @generated
     */
    EAttribute getCVSLocation_Port();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getConnectionType <em>Connection Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Type</em>'.
     * @see org.eclipse.ecl.cc.ccvs.CVSLocation#getConnectionType()
     * @see #getCVSLocation()
     * @generated
     */
    EAttribute getCVSLocation_ConnectionType();

    /**
     * Returns the meta object for class '{@link org.eclipse.ecl.cc.ccvs.AddCVSLocations <em>Add CVS Locations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Add CVS Locations</em>'.
     * @see org.eclipse.ecl.cc.ccvs.AddCVSLocations
     * @generated
     */
    EClass getAddCVSLocations();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.ecl.cc.ccvs.AddCVSLocations#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Input</em>'.
     * @see org.eclipse.ecl.cc.ccvs.AddCVSLocations#getInput()
     * @see #getAddCVSLocations()
     * @generated
     */
    EReference getAddCVSLocations_Input();

    /**
     * Returns the meta object for enum '{@link org.eclipse.ecl.cc.ccvs.CVSConnectionType <em>CVS Connection Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>CVS Connection Type</em>'.
     * @see org.eclipse.ecl.cc.ccvs.CVSConnectionType
     * @generated
     */
    EEnum getCVSConnectionType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CvsFactory getCvsFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.eclipse.ecl.cc.ccvs.impl.GetCVSLocationsImpl <em>Get CVS Locations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.ecl.cc.ccvs.impl.GetCVSLocationsImpl
         * @see org.eclipse.ecl.cc.ccvs.impl.CvsPackageImpl#getGetCVSLocations()
         * @generated
         */
        EClass GET_CVS_LOCATIONS = eINSTANCE.getGetCVSLocations();

        /**
         * The meta object literal for the '{@link org.eclipse.ecl.cc.ccvs.impl.CVSLocationImpl <em>CVS Location</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.ecl.cc.ccvs.impl.CVSLocationImpl
         * @see org.eclipse.ecl.cc.ccvs.impl.CvsPackageImpl#getCVSLocation()
         * @generated
         */
        EClass CVS_LOCATION = eINSTANCE.getCVSLocation();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CVS_LOCATION__HOST = eINSTANCE.getCVSLocation_Host();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CVS_LOCATION__PATH = eINSTANCE.getCVSLocation_Path();

        /**
         * The meta object literal for the '<em><b>User</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CVS_LOCATION__USER = eINSTANCE.getCVSLocation_User();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CVS_LOCATION__PORT = eINSTANCE.getCVSLocation_Port();

        /**
         * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CVS_LOCATION__CONNECTION_TYPE = eINSTANCE.getCVSLocation_ConnectionType();

        /**
         * The meta object literal for the '{@link org.eclipse.ecl.cc.ccvs.impl.AddCVSLocationsImpl <em>Add CVS Locations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.ecl.cc.ccvs.impl.AddCVSLocationsImpl
         * @see org.eclipse.ecl.cc.ccvs.impl.CvsPackageImpl#getAddCVSLocations()
         * @generated
         */
        EClass ADD_CVS_LOCATIONS = eINSTANCE.getAddCVSLocations();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADD_CVS_LOCATIONS__INPUT = eINSTANCE.getAddCVSLocations_Input();

        /**
         * The meta object literal for the '{@link org.eclipse.ecl.cc.ccvs.CVSConnectionType <em>CVS Connection Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.ecl.cc.ccvs.CVSConnectionType
         * @see org.eclipse.ecl.cc.ccvs.impl.CvsPackageImpl#getCVSConnectionType()
         * @generated
         */
        EEnum CVS_CONNECTION_TYPE = eINSTANCE.getCVSConnectionType();

    }

} //CvsPackage
