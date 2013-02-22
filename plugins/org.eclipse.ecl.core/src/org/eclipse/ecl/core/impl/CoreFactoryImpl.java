/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.core.impl;

import org.eclipse.ecl.core.*;
import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.ConvertedToEMFPipe;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.EclBoolean;
import org.eclipse.ecl.core.EclByte;
import org.eclipse.ecl.core.EclChar;
import org.eclipse.ecl.core.EclDouble;
import org.eclipse.ecl.core.EclException;
import org.eclipse.ecl.core.EclFloat;
import org.eclipse.ecl.core.EclInteger;
import org.eclipse.ecl.core.EclLong;
import org.eclipse.ecl.core.EclShort;
import org.eclipse.ecl.core.EclStackTraceEntry;
import org.eclipse.ecl.core.EclString;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.ExecutableParameter;
import org.eclipse.ecl.core.Foreach;
import org.eclipse.ecl.core.If;
import org.eclipse.ecl.core.LiteralParameter;
import org.eclipse.ecl.core.Nullable;
import org.eclipse.ecl.core.Parallel;
import org.eclipse.ecl.core.Parameter;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.ProcessStatus;
import org.eclipse.ecl.core.Script;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.core.Serialized;
import org.eclipse.ecl.core.With;
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
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ecl/core.ecore"); 
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
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
			case CorePackage.COMMAND: return createCommand();
			case CorePackage.BINDING: return createBinding();
			case CorePackage.PIPELINE: return createPipeline();
			case CorePackage.SEQUENCE: return createSequence();
			case CorePackage.PARALLEL: return createParallel();
			case CorePackage.WITH: return createWith();
			case CorePackage.EXEC: return createExec();
			case CorePackage.PARAMETER: return createParameter();
			case CorePackage.EXECUTABLE_PARAMETER: return createExecutableParameter();
			case CorePackage.LITERAL_PARAMETER: return createLiteralParameter();
			case CorePackage.FOREACH: return createForeach();
			case CorePackage.SCRIPT: return createScript();
			case CorePackage.PROCESS_STATUS: return createProcessStatus();
			case CorePackage.CONVERTED_TO_EMF_PIPE: return createConvertedToEMFPipe();
			case CorePackage.SERIALIZED: return createSerialized();
			case CorePackage.NULLABLE: return createNullable();
			case CorePackage.IF: return createIf();
			case CorePackage.ECL_BYTE: return createEclByte();
			case CorePackage.ECL_SHORT: return createEclShort();
			case CorePackage.ECL_INTEGER: return createEclInteger();
			case CorePackage.ECL_LONG: return createEclLong();
			case CorePackage.ECL_DOUBLE: return createEclDouble();
			case CorePackage.ECL_FLOAT: return createEclFloat();
			case CorePackage.ECL_BOOLEAN: return createEclBoolean();
			case CorePackage.ECL_CHAR: return createEclChar();
			case CorePackage.ECL_STRING: return createEclString();
			case CorePackage.ECL_EXCEPTION: return createEclException();
			case CorePackage.ECL_STACK_TRACE_ENTRY: return createEclStackTraceEntry();
			case CorePackage.LISTEN: return createListen();
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
			case CorePackage.THROWABLE:
				return createThrowableFromString(eDataType, initialValue);
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
			case CorePackage.THROWABLE:
				return convertThrowableToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public With createWith() {
		WithImpl with = new WithImpl();
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exec createExec() {
		ExecImpl exec = new ExecImpl();
		return exec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableParameter createExecutableParameter() {
		ExecutableParameterImpl executableParameter = new ExecutableParameterImpl();
		return executableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralParameter createLiteralParameter() {
		LiteralParameterImpl literalParameter = new LiteralParameterImpl();
		return literalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foreach createForeach() {
		ForeachImpl foreach = new ForeachImpl();
		return foreach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStatus createProcessStatus() {
		ProcessStatusImpl processStatus = new ProcessStatusImpl();
		return processStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConvertedToEMFPipe createConvertedToEMFPipe() {
		ConvertedToEMFPipeImpl convertedToEMFPipe = new ConvertedToEMFPipeImpl();
		return convertedToEMFPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serialized createSerialized() {
		SerializedImpl serialized = new SerializedImpl();
		return serialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nullable createNullable() {
		NullableImpl nullable = new NullableImpl();
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclByte createEclByte() {
		EclByteImpl eclByte = new EclByteImpl();
		return eclByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclShort createEclShort() {
		EclShortImpl eclShort = new EclShortImpl();
		return eclShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclString createEclString() {
		EclStringImpl eclString = new EclStringImpl();
		return eclString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclException createEclException() {
		EclExceptionImpl eclException = new EclExceptionImpl();
		return eclException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclStackTraceEntry createEclStackTraceEntry() {
		EclStackTraceEntryImpl eclStackTraceEntry = new EclStackTraceEntryImpl();
		return eclStackTraceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listen createListen() {
		ListenImpl listen = new ListenImpl();
		return listen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclBoolean createEclBoolean() {
		EclBooleanImpl eclBoolean = new EclBooleanImpl();
		return eclBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclChar createEclChar() {
		EclCharImpl eclChar = new EclCharImpl();
		return eclChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclInteger createEclInteger() {
		EclIntegerImpl eclInteger = new EclIntegerImpl();
		return eclInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclFloat createEclFloat() {
		EclFloatImpl eclFloat = new EclFloatImpl();
		return eclFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclLong createEclLong() {
		EclLongImpl eclLong = new EclLongImpl();
		return eclLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclDouble createEclDouble() {
		EclDoubleImpl eclDouble = new EclDoubleImpl();
		return eclDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throwable createThrowableFromString(EDataType eDataType, String initialValue) {
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThrowableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
