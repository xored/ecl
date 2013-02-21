/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.core.util;

import org.eclipse.ecl.core.*;
import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Block;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.ConvertedToEMFPipe;
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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter casePipeline(Pipeline object) {
				return createPipelineAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseParallel(Parallel object) {
				return createParallelAdapter();
			}
			@Override
			public Adapter caseWith(With object) {
				return createWithAdapter();
			}
			@Override
			public Adapter caseExec(Exec object) {
				return createExecAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseExecutableParameter(ExecutableParameter object) {
				return createExecutableParameterAdapter();
			}
			@Override
			public Adapter caseLiteralParameter(LiteralParameter object) {
				return createLiteralParameterAdapter();
			}
			@Override
			public Adapter caseForeach(Foreach object) {
				return createForeachAdapter();
			}
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseProcessStatus(ProcessStatus object) {
				return createProcessStatusAdapter();
			}
			@Override
			public Adapter caseConvertedToEMFPipe(ConvertedToEMFPipe object) {
				return createConvertedToEMFPipeAdapter();
			}
			@Override
			public Adapter caseSerialized(Serialized object) {
				return createSerializedAdapter();
			}
			@Override
			public Adapter caseNullable(Nullable object) {
				return createNullableAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseBoxedValue(BoxedValue object) {
				return createBoxedValueAdapter();
			}
			@Override
			public Adapter caseEclByte(EclByte object) {
				return createEclByteAdapter();
			}
			@Override
			public Adapter caseEclShort(EclShort object) {
				return createEclShortAdapter();
			}
			@Override
			public Adapter caseEclInteger(EclInteger object) {
				return createEclIntegerAdapter();
			}
			@Override
			public Adapter caseEclLong(EclLong object) {
				return createEclLongAdapter();
			}
			@Override
			public Adapter caseEclDouble(EclDouble object) {
				return createEclDoubleAdapter();
			}
			@Override
			public Adapter caseEclFloat(EclFloat object) {
				return createEclFloatAdapter();
			}
			@Override
			public Adapter caseEclBoolean(EclBoolean object) {
				return createEclBooleanAdapter();
			}
			@Override
			public Adapter caseEclChar(EclChar object) {
				return createEclCharAdapter();
			}
			@Override
			public Adapter caseEclString(EclString object) {
				return createEclStringAdapter();
			}
			@Override
			public Adapter caseEclException(EclException object) {
				return createEclExceptionAdapter();
			}
			@Override
			public Adapter caseEclStackTraceEntry(EclStackTraceEntry object) {
				return createEclStackTraceEntryAdapter();
			}
			@Override
			public Adapter caseWatch(Watch object) {
				return createWatchAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Pipeline
	 * @generated
	 */
	public Adapter createPipelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Parallel
	 * @generated
	 */
	public Adapter createParallelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.With <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.With
	 * @generated
	 */
	public Adapter createWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Exec <em>Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Exec
	 * @generated
	 */
	public Adapter createExecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.ExecutableParameter <em>Executable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.ExecutableParameter
	 * @generated
	 */
	public Adapter createExecutableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.LiteralParameter <em>Literal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.LiteralParameter
	 * @generated
	 */
	public Adapter createLiteralParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Foreach <em>Foreach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Foreach
	 * @generated
	 */
	public Adapter createForeachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.ProcessStatus <em>Process Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.ProcessStatus
	 * @generated
	 */
	public Adapter createProcessStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.ConvertedToEMFPipe <em>Converted To EMF Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.ConvertedToEMFPipe
	 * @generated
	 */
	public Adapter createConvertedToEMFPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Serialized <em>Serialized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Serialized
	 * @generated
	 */
	public Adapter createSerializedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Nullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Nullable
	 * @generated
	 */
	public Adapter createNullableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.EclString <em>Ecl String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.EclString
	 * @generated
	 */
	public Adapter createEclStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.EclException <em>Ecl Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.EclException
	 * @generated
	 */
	public Adapter createEclExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.EclStackTraceEntry <em>Ecl Stack Trace Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.EclStackTraceEntry
	 * @generated
	 */
	public Adapter createEclStackTraceEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.Watch <em>Watch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.Watch
	 * @generated
	 */
	public Adapter createWatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.EclBoolean <em>Ecl Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.EclBoolean
	 * @generated
	 */
	public Adapter createEclBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.EclChar <em>Ecl Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.EclChar
	 * @generated
	 */
	public Adapter createEclCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.EclInteger <em>Ecl Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.EclInteger
	 * @generated
	 */
	public Adapter createEclIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.EclFloat <em>Ecl Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.EclFloat
	 * @generated
	 */
	public Adapter createEclFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.EclLong <em>Ecl Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.EclLong
	 * @generated
	 */
	public Adapter createEclLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.EclDouble <em>Ecl Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.EclDouble
	 * @generated
	 */
	public Adapter createEclDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.BoxedValue <em>Boxed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.BoxedValue
	 * @generated
	 */
	public Adapter createBoxedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.EclByte <em>Ecl Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.EclByte
	 * @generated
	 */
	public Adapter createEclByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ecl.core.EclShort <em>Ecl Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ecl.core.EclShort
	 * @generated
	 */
	public Adapter createEclShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoreAdapterFactory
