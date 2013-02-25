/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.interop.impl;

import org.eclipse.ecl.interop.*;

import org.eclipse.emf.ecore.EClass;
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
public class InteropFactoryImpl extends EFactoryImpl implements InteropFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteropFactory init() {
		try {
			InteropFactory theInteropFactory = (InteropFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ecl/interop.ecore"); 
			if (theInteropFactory != null) {
				return theInteropFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteropFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteropFactoryImpl() {
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
			case InteropPackage.INVOKE: return createInvoke();
			case InteropPackage.EXEC_PROCESS: return createExecProcess();
			case InteropPackage.EXEC_PROCESS_RESULT: return createExecProcessResult();
			case InteropPackage.GET: return createGet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoke createInvoke() {
		InvokeImpl invoke = new InvokeImpl();
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecProcess createExecProcess() {
		ExecProcessImpl execProcess = new ExecProcessImpl();
		return execProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecProcessResult createExecProcessResult() {
		ExecProcessResultImpl execProcessResult = new ExecProcessResultImpl();
		return execProcessResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Get createGet() {
		GetImpl get = new GetImpl();
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteropPackage getInteropPackage() {
		return (InteropPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteropPackage getPackage() {
		return InteropPackage.eINSTANCE;
	}

} //InteropFactoryImpl
