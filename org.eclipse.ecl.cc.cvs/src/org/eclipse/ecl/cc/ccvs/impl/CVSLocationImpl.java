/**
 * <copyright>
 * </copyright>
 *
 * $Id: CVSLocationImpl.java,v 1.1 2010/08/02 09:24:04 andrey Exp $
 */
package org.eclipse.ecl.cc.ccvs.impl;

import org.eclipse.ecl.cc.ccvs.CVSConnectionType;
import org.eclipse.ecl.cc.ccvs.CVSLocation;
import org.eclipse.ecl.cc.ccvs.CvsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CVS Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.impl.CVSLocationImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.impl.CVSLocationImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.impl.CVSLocationImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.impl.CVSLocationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.impl.CVSLocationImpl#getConnectionType <em>Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CVSLocationImpl extends EObjectImpl implements CVSLocation {
    /**
     * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected static final String HOST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected String host = HOST_EDEFAULT;

    /**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected static final String PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected String path = PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getUser() <em>User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUser()
     * @generated
     * @ordered
     */
    protected static final String USER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUser()
     * @generated
     * @ordered
     */
    protected String user = USER_EDEFAULT;

    /**
     * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected static final int PORT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected int port = PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionType()
     * @generated
     * @ordered
     */
    protected static final CVSConnectionType CONNECTION_TYPE_EDEFAULT = CVSConnectionType.PSERVER;

    /**
     * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionType()
     * @generated
     * @ordered
     */
    protected CVSConnectionType connectionType = CONNECTION_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CVSLocationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CvsPackage.Literals.CVS_LOCATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHost() {
        return host;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHost(String newHost) {
        String oldHost = host;
        host = newHost;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CvsPackage.CVS_LOCATION__HOST, oldHost, host));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPath() {
        return path;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPath(String newPath) {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CvsPackage.CVS_LOCATION__PATH, oldPath, path));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUser() {
        return user;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUser(String newUser) {
        String oldUser = user;
        user = newUser;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CvsPackage.CVS_LOCATION__USER, oldUser, user));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPort() {
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPort(int newPort) {
        int oldPort = port;
        port = newPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CvsPackage.CVS_LOCATION__PORT, oldPort, port));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CVSConnectionType getConnectionType() {
        return connectionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectionType(CVSConnectionType newConnectionType) {
        CVSConnectionType oldConnectionType = connectionType;
        connectionType = newConnectionType == null ? CONNECTION_TYPE_EDEFAULT : newConnectionType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CvsPackage.CVS_LOCATION__CONNECTION_TYPE, oldConnectionType, connectionType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CvsPackage.CVS_LOCATION__HOST:
                return getHost();
            case CvsPackage.CVS_LOCATION__PATH:
                return getPath();
            case CvsPackage.CVS_LOCATION__USER:
                return getUser();
            case CvsPackage.CVS_LOCATION__PORT:
                return new Integer(getPort());
            case CvsPackage.CVS_LOCATION__CONNECTION_TYPE:
                return getConnectionType();
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
            case CvsPackage.CVS_LOCATION__HOST:
                setHost((String)newValue);
                return;
            case CvsPackage.CVS_LOCATION__PATH:
                setPath((String)newValue);
                return;
            case CvsPackage.CVS_LOCATION__USER:
                setUser((String)newValue);
                return;
            case CvsPackage.CVS_LOCATION__PORT:
                setPort(((Integer)newValue).intValue());
                return;
            case CvsPackage.CVS_LOCATION__CONNECTION_TYPE:
                setConnectionType((CVSConnectionType)newValue);
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
            case CvsPackage.CVS_LOCATION__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case CvsPackage.CVS_LOCATION__PATH:
                setPath(PATH_EDEFAULT);
                return;
            case CvsPackage.CVS_LOCATION__USER:
                setUser(USER_EDEFAULT);
                return;
            case CvsPackage.CVS_LOCATION__PORT:
                setPort(PORT_EDEFAULT);
                return;
            case CvsPackage.CVS_LOCATION__CONNECTION_TYPE:
                setConnectionType(CONNECTION_TYPE_EDEFAULT);
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
            case CvsPackage.CVS_LOCATION__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case CvsPackage.CVS_LOCATION__PATH:
                return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
            case CvsPackage.CVS_LOCATION__USER:
                return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
            case CvsPackage.CVS_LOCATION__PORT:
                return port != PORT_EDEFAULT;
            case CvsPackage.CVS_LOCATION__CONNECTION_TYPE:
                return connectionType != CONNECTION_TYPE_EDEFAULT;
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
        result.append(" (host: ");
        result.append(host);
        result.append(", path: ");
        result.append(path);
        result.append(", user: ");
        result.append(user);
        result.append(", port: ");
        result.append(port);
        result.append(", connectionType: ");
        result.append(connectionType);
        result.append(')');
        return result.toString();
    }

} //CVSLocationImpl
