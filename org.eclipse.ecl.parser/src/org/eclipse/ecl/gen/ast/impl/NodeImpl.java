/**
 * <copyright>
 * </copyright>
 *
 * $Id: NodeImpl.java,v 1.2 2010/11/08 08:42:15 alena Exp $
 */
package org.eclipse.ecl.gen.ast.impl;

import org.eclipse.ecl.ast.Ast;
import org.eclipse.ecl.gen.ast.AstPackage;
import org.eclipse.ecl.gen.ast.Node;
import org.eclipse.ecl.parser.EclPartition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.gen.ast.impl.NodeImpl#getAst <em>Ast</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.impl.NodeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.impl.NodeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.impl.NodeImpl#getPartition <em>Partition</em>}</li>
 *   <li>{@link org.eclipse.ecl.gen.ast.impl.NodeImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getAst() <em>Ast</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAst()
	 * @generated
	 * @ordered
	 */
	protected static final Ast AST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAst() <em>Ast</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAst()
	 * @generated
	 * @ordered
	 */
	protected Ast ast = AST_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected int end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartition() <em>Partition</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected static final EclPartition PARTITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartition() <em>Partition</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected EclPartition partition = PARTITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> children;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Ast getAst() {
		return ast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAst(Ast newAst) {
		Ast oldAst = ast;
		ast = newAst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.NODE__AST, oldAst, ast));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.NODE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(int newEnd) {
		int oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.NODE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Node>(Node.class, this, AstPackage.NODE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EclPartition getPartition() {
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartition(EclPartition newPartition) {
		EclPartition oldPartition = partition;
		partition = newPartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.NODE__PARTITION, oldPartition, partition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.NODE__AST:
				return getAst();
			case AstPackage.NODE__START:
				return getStart();
			case AstPackage.NODE__END:
				return getEnd();
			case AstPackage.NODE__PARTITION:
				return getPartition();
			case AstPackage.NODE__CHILDREN:
				return getChildren();
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
			case AstPackage.NODE__AST:
				setAst((Ast)newValue);
				return;
			case AstPackage.NODE__START:
				setStart((Integer)newValue);
				return;
			case AstPackage.NODE__END:
				setEnd((Integer)newValue);
				return;
			case AstPackage.NODE__PARTITION:
				setPartition((EclPartition)newValue);
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
			case AstPackage.NODE__AST:
				setAst(AST_EDEFAULT);
				return;
			case AstPackage.NODE__START:
				setStart(START_EDEFAULT);
				return;
			case AstPackage.NODE__END:
				setEnd(END_EDEFAULT);
				return;
			case AstPackage.NODE__PARTITION:
				setPartition(PARTITION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AstPackage.NODE__AST:
				return AST_EDEFAULT == null ? ast != null : !AST_EDEFAULT.equals(ast);
			case AstPackage.NODE__START:
				return start != START_EDEFAULT;
			case AstPackage.NODE__END:
				return end != END_EDEFAULT;
			case AstPackage.NODE__PARTITION:
				return PARTITION_EDEFAULT == null ? partition != null : !PARTITION_EDEFAULT.equals(partition);
			case AstPackage.NODE__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ast: ");
		result.append(ast);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", partition: ");
		result.append(partition);
		result.append(')');
		return result.toString();
	}

} // NodeImpl
