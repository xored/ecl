/**
 * <copyright>
 * </copyright>
 *
 * $Id: CVSConnectionType.java,v 1.1 2010/08/02 09:24:04 andrey Exp $
 */
package org.eclipse.ecl.cc.ccvs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CVS Connection Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.cc.ccvs.CvsPackage#getCVSConnectionType()
 * @model
 * @generated
 */
public enum CVSConnectionType implements Enumerator {
    /**
     * The '<em><b>Pserver</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PSERVER_VALUE
     * @generated
     * @ordered
     */
    PSERVER(0, "pserver", "pserver"),

    /**
     * The '<em><b>Extssh</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXTSSH_VALUE
     * @generated
     * @ordered
     */
    EXTSSH(1, "extssh", "extssh"),

    /**
     * The '<em><b>Ext</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXT_VALUE
     * @generated
     * @ordered
     */
    EXT(2, "ext", "ext"),

    /**
     * The '<em><b>Pserverssh2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PSERVERSSH2_VALUE
     * @generated
     * @ordered
     */
    PSERVERSSH2(3, "pserverssh2", "pserverssh2");

    /**
     * The '<em><b>Pserver</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pserver</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PSERVER
     * @model name="pserver"
     * @generated
     * @ordered
     */
    public static final int PSERVER_VALUE = 0;

    /**
     * The '<em><b>Extssh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Extssh</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXTSSH
     * @model name="extssh"
     * @generated
     * @ordered
     */
    public static final int EXTSSH_VALUE = 1;

    /**
     * The '<em><b>Ext</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ext</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXT
     * @model name="ext"
     * @generated
     * @ordered
     */
    public static final int EXT_VALUE = 2;

    /**
     * The '<em><b>Pserverssh2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pserverssh2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PSERVERSSH2
     * @model name="pserverssh2"
     * @generated
     * @ordered
     */
    public static final int PSERVERSSH2_VALUE = 3;

    /**
     * An array of all the '<em><b>CVS Connection Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final CVSConnectionType[] VALUES_ARRAY =
        new CVSConnectionType[] {
            PSERVER,
            EXTSSH,
            EXT,
            PSERVERSSH2,
        };

    /**
     * A public read-only list of all the '<em><b>CVS Connection Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<CVSConnectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>CVS Connection Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CVSConnectionType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CVSConnectionType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>CVS Connection Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CVSConnectionType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CVSConnectionType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>CVS Connection Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CVSConnectionType get(int value) {
        switch (value) {
            case PSERVER_VALUE: return PSERVER;
            case EXTSSH_VALUE: return EXTSSH;
            case EXT_VALUE: return EXT;
            case PSERVERSSH2_VALUE: return PSERVERSSH2;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private CVSConnectionType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //CVSConnectionType
