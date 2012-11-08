/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.interop.commands.impl;

import org.eclipse.ecl.interop.commands.CommandsPackage;
import org.eclipse.ecl.interop.commands.ExecProcessResult;
import org.eclipse.ecl.interop.commands.ExecProcessStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exec Process Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.interop.commands.impl.ExecProcessResultImpl#getExitCode <em>Exit Code</em>}</li>
 *   <li>{@link org.eclipse.ecl.interop.commands.impl.ExecProcessResultImpl#getStdout <em>Stdout</em>}</li>
 *   <li>{@link org.eclipse.ecl.interop.commands.impl.ExecProcessResultImpl#getStderr <em>Stderr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecProcessResultImpl extends EObjectImpl implements ExecProcessResult {
	/**
	 * The default value of the '{@link #getExitCode() <em>Exit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitCode()
	 * @generated
	 * @ordered
	 */
	protected static final int EXIT_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExitCode() <em>Exit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitCode()
	 * @generated
	 * @ordered
	 */
	protected int exitCode = EXIT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStdout() <em>Stdout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdout()
	 * @generated
	 * @ordered
	 */
	protected static final String STDOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStdout() <em>Stdout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdout()
	 * @generated
	 * @ordered
	 */
	protected String stdout = STDOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStderr() <em>Stderr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStderr()
	 * @generated
	 * @ordered
	 */
	protected static final String STDERR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStderr() <em>Stderr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStderr()
	 * @generated
	 * @ordered
	 */
	protected String stderr = STDERR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecProcessResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandsPackage.Literals.EXEC_PROCESS_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExitCode() {
		return exitCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitCode(int newExitCode) {
		int oldExitCode = exitCode;
		exitCode = newExitCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandsPackage.EXEC_PROCESS_RESULT__EXIT_CODE, oldExitCode, exitCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStdout() {
		return stdout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdout(String newStdout) {
		String oldStdout = stdout;
		stdout = newStdout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandsPackage.EXEC_PROCESS_RESULT__STDOUT, oldStdout, stdout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStderr() {
		return stderr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStderr(String newStderr) {
		String oldStderr = stderr;
		stderr = newStderr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandsPackage.EXEC_PROCESS_RESULT__STDERR, oldStderr, stderr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommandsPackage.EXEC_PROCESS_RESULT__EXIT_CODE:
				return getExitCode();
			case CommandsPackage.EXEC_PROCESS_RESULT__STDOUT:
				return getStdout();
			case CommandsPackage.EXEC_PROCESS_RESULT__STDERR:
				return getStderr();
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
			case CommandsPackage.EXEC_PROCESS_RESULT__EXIT_CODE:
				setExitCode((Integer)newValue);
				return;
			case CommandsPackage.EXEC_PROCESS_RESULT__STDOUT:
				setStdout((String)newValue);
				return;
			case CommandsPackage.EXEC_PROCESS_RESULT__STDERR:
				setStderr((String)newValue);
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
			case CommandsPackage.EXEC_PROCESS_RESULT__EXIT_CODE:
				setExitCode(EXIT_CODE_EDEFAULT);
				return;
			case CommandsPackage.EXEC_PROCESS_RESULT__STDOUT:
				setStdout(STDOUT_EDEFAULT);
				return;
			case CommandsPackage.EXEC_PROCESS_RESULT__STDERR:
				setStderr(STDERR_EDEFAULT);
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
			case CommandsPackage.EXEC_PROCESS_RESULT__EXIT_CODE:
				return exitCode != EXIT_CODE_EDEFAULT;
			case CommandsPackage.EXEC_PROCESS_RESULT__STDOUT:
				return STDOUT_EDEFAULT == null ? stdout != null : !STDOUT_EDEFAULT.equals(stdout);
			case CommandsPackage.EXEC_PROCESS_RESULT__STDERR:
				return STDERR_EDEFAULT == null ? stderr != null : !STDERR_EDEFAULT.equals(stderr);
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
		result.append(" (exitCode: ");
		result.append(exitCode);
		result.append(", stdout: ");
		result.append(stdout);
		result.append(", stderr: ");
		result.append(stderr);
		result.append(')');
		return result.toString();
	}

} //ExecProcessResultImpl