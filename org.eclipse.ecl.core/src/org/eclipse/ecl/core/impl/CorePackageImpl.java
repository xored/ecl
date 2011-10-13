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

import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Block;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.ConvertedToEMFPipe;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.ExecutableParameter;
import org.eclipse.ecl.core.Foreach;
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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipelineEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreachEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processStatusEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convertedToEMFPipeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType throwableEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.ecl.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link CorePackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_Host() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_Bindings() {
		return (EReference)commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Feature() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Command() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Commands() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPipeline() {
		return pipelineEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWith() {
		return withEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWith_Object() {
		return (EReference)withEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWith_Do() {
		return (EReference)withEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExec() {
		return execEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExec_Namespace() {
		return (EAttribute)execEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExec_Name() {
		return (EAttribute)execEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExec_Parameters() {
		return (EReference)execEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableParameter() {
		return executableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableParameter_Command() {
		return (EReference)executableParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralParameter() {
		return literalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralParameter_Literal() {
		return (EAttribute)literalParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralParameter_Format() {
		return (EAttribute)literalParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeach() {
		return foreachEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeach_Do() {
		return (EReference)foreachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeach_Input() {
		return (EReference)foreachEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessStatus() {
		return processStatusEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessStatus_PluginId() {
		return (EAttribute)processStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessStatus_Code() {
		return (EAttribute)processStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessStatus_Message() {
		return (EAttribute)processStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessStatus_Severity() {
		return (EAttribute)processStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessStatus_Exception() {
		return (EAttribute)processStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvertedToEMFPipe() {
		return convertedToEMFPipeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvertedToEMFPipe_Object() {
		return (EReference)convertedToEMFPipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerialized() {
		return serializedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerialized_Bytes() {
		return (EAttribute)serializedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullable() {
		return nullableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNullable_Value() {
		return (EReference)nullableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullable_Type() {
		return (EAttribute)nullableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getThrowable() {
		return throwableEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Content() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__HOST);
		createEReference(commandEClass, COMMAND__BINDINGS);

		bindingEClass = createEClass(BINDING);
		createEReference(bindingEClass, BINDING__FEATURE);
		createEReference(bindingEClass, BINDING__COMMAND);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__COMMANDS);

		pipelineEClass = createEClass(PIPELINE);

		sequenceEClass = createEClass(SEQUENCE);

		parallelEClass = createEClass(PARALLEL);

		withEClass = createEClass(WITH);
		createEReference(withEClass, WITH__OBJECT);
		createEReference(withEClass, WITH__DO);

		execEClass = createEClass(EXEC);
		createEAttribute(execEClass, EXEC__NAMESPACE);
		createEAttribute(execEClass, EXEC__NAME);
		createEReference(execEClass, EXEC__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);

		executableParameterEClass = createEClass(EXECUTABLE_PARAMETER);
		createEReference(executableParameterEClass, EXECUTABLE_PARAMETER__COMMAND);

		literalParameterEClass = createEClass(LITERAL_PARAMETER);
		createEAttribute(literalParameterEClass, LITERAL_PARAMETER__LITERAL);
		createEAttribute(literalParameterEClass, LITERAL_PARAMETER__FORMAT);

		foreachEClass = createEClass(FOREACH);
		createEReference(foreachEClass, FOREACH__DO);
		createEReference(foreachEClass, FOREACH__INPUT);

		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__CONTENT);

		processStatusEClass = createEClass(PROCESS_STATUS);
		createEAttribute(processStatusEClass, PROCESS_STATUS__PLUGIN_ID);
		createEAttribute(processStatusEClass, PROCESS_STATUS__CODE);
		createEAttribute(processStatusEClass, PROCESS_STATUS__MESSAGE);
		createEAttribute(processStatusEClass, PROCESS_STATUS__SEVERITY);
		createEAttribute(processStatusEClass, PROCESS_STATUS__EXCEPTION);

		convertedToEMFPipeEClass = createEClass(CONVERTED_TO_EMF_PIPE);
		createEReference(convertedToEMFPipeEClass, CONVERTED_TO_EMF_PIPE__OBJECT);

		serializedEClass = createEClass(SERIALIZED);
		createEAttribute(serializedEClass, SERIALIZED__BYTES);

		nullableEClass = createEClass(NULLABLE);
		createEReference(nullableEClass, NULLABLE__VALUE);
		createEAttribute(nullableEClass, NULLABLE__TYPE);

		// Create data types
		throwableEDataType = createEDataType(THROWABLE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blockEClass.getESuperTypes().add(this.getCommand());
		pipelineEClass.getESuperTypes().add(this.getBlock());
		sequenceEClass.getESuperTypes().add(this.getBlock());
		parallelEClass.getESuperTypes().add(this.getBlock());
		withEClass.getESuperTypes().add(this.getCommand());
		execEClass.getESuperTypes().add(this.getCommand());
		executableParameterEClass.getESuperTypes().add(this.getParameter());
		literalParameterEClass.getESuperTypes().add(this.getParameter());
		foreachEClass.getESuperTypes().add(this.getCommand());
		scriptEClass.getESuperTypes().add(this.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Host(), ecorePackage.getEString(), "host", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_Bindings(), this.getBinding(), null, "bindings", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_Command(), this.getCommand(), null, "command", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Commands(), this.getCommand(), null, "commands", null, 1, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(withEClass, With.class, "With", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWith_Object(), theEcorePackage.getEObject(), null, "object", null, 1, 1, With.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWith_Do(), this.getCommand(), null, "do", null, 1, 1, With.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(execEClass, Exec.class, "Exec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExec_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExec_Name(), ecorePackage.getEString(), "name", null, 0, 1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExec_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executableParameterEClass, ExecutableParameter.class, "ExecutableParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutableParameter_Command(), this.getCommand(), null, "command", null, 1, 1, ExecutableParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalParameterEClass, LiteralParameter.class, "LiteralParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralParameter_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, LiteralParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteralParameter_Format(), ecorePackage.getEString(), "format", null, 0, 1, LiteralParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreachEClass, Foreach.class, "Foreach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForeach_Do(), this.getCommand(), null, "do", null, 0, 1, Foreach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeach_Input(), ecorePackage.getEObject(), null, "input", null, 0, -1, Foreach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processStatusEClass, ProcessStatus.class, "ProcessStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessStatus_PluginId(), ecorePackage.getEString(), "pluginId", null, 0, 1, ProcessStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessStatus_Code(), ecorePackage.getEInt(), "code", null, 0, 1, ProcessStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessStatus_Message(), ecorePackage.getEString(), "message", null, 0, 1, ProcessStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessStatus_Severity(), ecorePackage.getEInt(), "severity", null, 0, 1, ProcessStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessStatus_Exception(), this.getThrowable(), "exception", null, 0, 1, ProcessStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(convertedToEMFPipeEClass, ConvertedToEMFPipe.class, "ConvertedToEMFPipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConvertedToEMFPipe_Object(), theEcorePackage.getEObject(), null, "object", null, 0, 1, ConvertedToEMFPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serializedEClass, Serialized.class, "Serialized", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSerialized_Bytes(), ecorePackage.getEByteArray(), "bytes", null, 0, 1, Serialized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullableEClass, Nullable.class, "Nullable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNullable_Value(), theEcorePackage.getEObject(), null, "value", null, 0, 1, Nullable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNullable_Type(), theEcorePackage.getEString(), "type", null, 0, 1, Nullable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(throwableEDataType, Throwable.class, "Throwable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/ecl/internal
		createInternalAnnotations();
		// http://www.eclipse.org/ecl/input
		createInputAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ecl/internal</b>.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void createInternalAnnotations() {
		String source = "http://www.eclipse.org/ecl/internal";		
		addAnnotation
		  (getCommand_Host(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getCommand_Bindings(), 
		   source, 
		   new String[] {
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ecl/input</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createInputAnnotations() {
		String source = "http://www.eclipse.org/ecl/input";				
		addAnnotation
		  (getForeach_Input(), 
		   source, 
		   new String[] {
		   });
	}

} // CorePackageImpl
