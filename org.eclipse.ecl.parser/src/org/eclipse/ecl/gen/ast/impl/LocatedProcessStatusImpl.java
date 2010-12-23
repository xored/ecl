/**
 * <copyright>
 * </copyright>
 *
 * $Id: LocatedProcessStatusImpl.java,v 1.1 2010/12/23 08:12:01 alena Exp $
 */
package org.eclipse.ecl.gen.ast.impl;

import org.eclipse.ecl.core.impl.ProcessStatusImpl;

import org.eclipse.ecl.gen.ast.AstNode;
import org.eclipse.ecl.gen.ast.AstPackage;
import org.eclipse.ecl.gen.ast.LocatedProcessStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Located Process Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.gen.ast.impl.LocatedProcessStatusImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.impl.LocatedProcessStatusImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.impl.LocatedProcessStatusImpl#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocatedProcessStatusImpl extends ProcessStatusImpl implements LocatedProcessStatus {
	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected int column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatedProcessStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.LOCATED_PROCESS_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(int newColumn) {
		int oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.LOCATED_PROCESS_STATUS__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.LOCATED_PROCESS_STATUS__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.LOCATED_PROCESS_STATUS__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.LOCATED_PROCESS_STATUS__COLUMN:
				return getColumn();
			case AstPackage.LOCATED_PROCESS_STATUS__LINE:
				return getLine();
			case AstPackage.LOCATED_PROCESS_STATUS__LENGTH:
				return getLength();
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
			case AstPackage.LOCATED_PROCESS_STATUS__COLUMN:
				setColumn((Integer)newValue);
				return;
			case AstPackage.LOCATED_PROCESS_STATUS__LINE:
				setLine((Integer)newValue);
				return;
			case AstPackage.LOCATED_PROCESS_STATUS__LENGTH:
				setLength((Integer)newValue);
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
			case AstPackage.LOCATED_PROCESS_STATUS__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case AstPackage.LOCATED_PROCESS_STATUS__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case AstPackage.LOCATED_PROCESS_STATUS__LENGTH:
				setLength(LENGTH_EDEFAULT);
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
			case AstPackage.LOCATED_PROCESS_STATUS__COLUMN:
				return column != COLUMN_EDEFAULT;
			case AstPackage.LOCATED_PROCESS_STATUS__LINE:
				return line != LINE_EDEFAULT;
			case AstPackage.LOCATED_PROCESS_STATUS__LENGTH:
				return length != LENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AstNode.class) {
			switch (derivedFeatureID) {
				case AstPackage.LOCATED_PROCESS_STATUS__COLUMN: return AstPackage.AST_NODE__COLUMN;
				case AstPackage.LOCATED_PROCESS_STATUS__LINE: return AstPackage.AST_NODE__LINE;
				case AstPackage.LOCATED_PROCESS_STATUS__LENGTH: return AstPackage.AST_NODE__LENGTH;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AstNode.class) {
			switch (baseFeatureID) {
				case AstPackage.AST_NODE__COLUMN: return AstPackage.LOCATED_PROCESS_STATUS__COLUMN;
				case AstPackage.AST_NODE__LINE: return AstPackage.LOCATED_PROCESS_STATUS__LINE;
				case AstPackage.AST_NODE__LENGTH: return AstPackage.LOCATED_PROCESS_STATUS__LENGTH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (column: ");
		result.append(column);
		result.append(", line: ");
		result.append(line);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //LocatedProcessStatusImpl
