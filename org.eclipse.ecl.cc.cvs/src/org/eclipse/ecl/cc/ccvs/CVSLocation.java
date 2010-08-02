/**
 * <copyright>
 * </copyright>
 *
 * $Id: CVSLocation.java,v 1.1 2010/08/02 09:24:04 andrey Exp $
 */
package org.eclipse.ecl.cc.ccvs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CVS Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getHost <em>Host</em>}</li>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getConnectionType <em>Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.cc.ccvs.CvsPackage#getCVSLocation()
 * @model
 * @generated
 */
public interface CVSLocation extends EObject {
    /**
     * Returns the value of the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host</em>' attribute.
     * @see #setHost(String)
     * @see org.eclipse.ecl.cc.ccvs.CvsPackage#getCVSLocation_Host()
     * @model
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getHost <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host</em>' attribute.
     * @see #getHost()
     * @generated
     */
    void setHost(String value);

    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see org.eclipse.ecl.cc.ccvs.CvsPackage#getCVSLocation_Path()
     * @model
     * @generated
     */
    String getPath();

    /**
     * Sets the value of the '{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    void setPath(String value);

    /**
     * Returns the value of the '<em><b>User</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User</em>' attribute.
     * @see #setUser(String)
     * @see org.eclipse.ecl.cc.ccvs.CvsPackage#getCVSLocation_User()
     * @model
     * @generated
     */
    String getUser();

    /**
     * Sets the value of the '{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getUser <em>User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User</em>' attribute.
     * @see #getUser()
     * @generated
     */
    void setUser(String value);

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(int)
     * @see org.eclipse.ecl.cc.ccvs.CvsPackage#getCVSLocation_Port()
     * @model
     * @generated
     */
    int getPort();

    /**
     * Sets the value of the '{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort(int value);

    /**
     * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.eclipse.ecl.cc.ccvs.CVSConnectionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Type</em>' attribute.
     * @see org.eclipse.ecl.cc.ccvs.CVSConnectionType
     * @see #setConnectionType(CVSConnectionType)
     * @see org.eclipse.ecl.cc.ccvs.CvsPackage#getCVSLocation_ConnectionType()
     * @model
     * @generated
     */
    CVSConnectionType getConnectionType();

    /**
     * Sets the value of the '{@link org.eclipse.ecl.cc.ccvs.CVSLocation#getConnectionType <em>Connection Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Type</em>' attribute.
     * @see org.eclipse.ecl.cc.ccvs.CVSConnectionType
     * @see #getConnectionType()
     * @generated
     */
    void setConnectionType(CVSConnectionType value);

} // CVSLocation
