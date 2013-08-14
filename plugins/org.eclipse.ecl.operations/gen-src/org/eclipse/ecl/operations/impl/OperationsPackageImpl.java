/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations.impl;

import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.operations.Abs;
import org.eclipse.ecl.operations.And;
import org.eclipse.ecl.operations.AssertEmpty;
import org.eclipse.ecl.operations.AssertNonEmpty;
import org.eclipse.ecl.operations.AssertTrue;
import org.eclipse.ecl.operations.Between;
import org.eclipse.ecl.operations.BinaryOp;
import org.eclipse.ecl.operations.Bool;
import org.eclipse.ecl.operations.Concat;
import org.eclipse.ecl.operations.Convert;
import org.eclipse.ecl.operations.Div;
import org.eclipse.ecl.operations.Emit;
import org.eclipse.ecl.operations.Eq;
import org.eclipse.ecl.operations.Format;
import org.eclipse.ecl.operations.FormatTime;
import org.eclipse.ecl.operations.GetTime;
import org.eclipse.ecl.operations.Gt;
import org.eclipse.ecl.operations.Int;
import org.eclipse.ecl.operations.Length;
import org.eclipse.ecl.operations.Lt;
import org.eclipse.ecl.operations.Minus;
import org.eclipse.ecl.operations.Mult;
import org.eclipse.ecl.operations.Not;
import org.eclipse.ecl.operations.NotEq;
import org.eclipse.ecl.operations.OperationsFactory;
import org.eclipse.ecl.operations.OperationsPackage;
import org.eclipse.ecl.operations.Or;
import org.eclipse.ecl.operations.Plus;
import org.eclipse.ecl.operations.Repeat;
import org.eclipse.ecl.operations.RepeatWith;
import org.eclipse.ecl.operations.Str;
import org.eclipse.ecl.operations.Try;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperationsPackageImpl extends EPackageImpl implements
		OperationsPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convertEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertTrueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEqEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emitEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatWithEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertEmptyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertNonEmptyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concatEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTimeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatTimeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betweenEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOpEClass = null;

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
	 * @see org.eclipse.ecl.operations.OperationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperationsPackageImpl() {
		super(eNS_URI, OperationsFactory.eINSTANCE);
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
	 * This method is used to initialize {@link OperationsPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OperationsPackage init() {
		if (isInited) return (OperationsPackage)EPackage.Registry.INSTANCE.getEPackage(OperationsPackage.eNS_URI);

		// Obtain or create and register package
		OperationsPackageImpl theOperationsPackage = (OperationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperationsPackage.createPackageContents();

		// Initialize created meta-data
		theOperationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OperationsPackage.eNS_URI, theOperationsPackage);
		return theOperationsPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEq() {
		return eqEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEq_Left() {
		return (EReference)eqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEq_Right() {
		return (EReference)eqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt() {
		return intEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong() {
		return longEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat() {
		return floatEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBool() {
		return boolEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStr() {
		return strEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvert() {
		return convertEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvert_Input() {
		return (EReference)convertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertTrue() {
		return assertTrueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertTrue_Input() {
		return (EAttribute)assertTrueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertTrue_Message() {
		return (EAttribute)assertTrueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLength() {
		return lengthEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLength_Input() {
		return (EReference)lengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotEq() {
		return notEqEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotEq_Left() {
		return (EReference)notEqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotEq_Right() {
		return (EReference)notEqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGt() {
		return gtEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLt() {
		return ltEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_Left() {
		return (EReference)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTry() {
		return tryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTry_Command() {
		return (EReference)tryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTry_Catch() {
		return (EReference)tryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTry_Finally() {
		return (EReference)tryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTry_Times() {
		return (EAttribute)tryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTry_Delay() {
		return (EAttribute)tryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormat() {
		return formatEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormat_Format() {
		return (EAttribute)formatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormat_Args() {
		return (EReference)formatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmit() {
		return emitEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmit_Values() {
		return (EReference)emitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatWith() {
		return repeatWithEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatWith_Commands() {
		return (EReference)repeatWithEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatWith_Command() {
		return (EReference)repeatWithEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeat_Times() {
		return (EAttribute)repeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeat_Command() {
		return (EReference)repeatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeat_Delay() {
		return (EAttribute)repeatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertEmpty() {
		return assertEmptyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertEmpty_Message() {
		return (EAttribute)assertEmptyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertNonEmpty() {
		return assertNonEmptyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertNonEmpty_Message() {
		return (EAttribute)assertNonEmptyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcat() {
		return concatEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcat_Strs() {
		return (EAttribute)concatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_Args() {
		return (EReference)orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Args() {
		return (EReference)andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetTime() {
		return getTimeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormatTime() {
		return formatTimeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormatTime_Format() {
		return (EAttribute)formatTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlus() {
		return plusEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinus() {
		return minusEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiv() {
		return divEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMult() {
		return multEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbs() {
		return absEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbs_Arg() {
		return (EReference)absEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBetween() {
		return betweenEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBetween_Input() {
		return (EReference)betweenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBetween_Left() {
		return (EReference)betweenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBetween_Right() {
		return (EReference)betweenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOp() {
		return binaryOpEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOp_Left() {
		return (EReference)binaryOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOp_Right() {
		return (EReference)binaryOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsFactory getOperationsFactory() {
		return (OperationsFactory)getEFactoryInstance();
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
		eqEClass = createEClass(EQ);
		createEReference(eqEClass, EQ__LEFT);
		createEReference(eqEClass, EQ__RIGHT);

		intEClass = createEClass(INT);

		longEClass = createEClass(LONG);

		floatEClass = createEClass(FLOAT);

		boolEClass = createEClass(BOOL);

		strEClass = createEClass(STR);

		convertEClass = createEClass(CONVERT);
		createEReference(convertEClass, CONVERT__INPUT);

		assertTrueEClass = createEClass(ASSERT_TRUE);
		createEAttribute(assertTrueEClass, ASSERT_TRUE__INPUT);
		createEAttribute(assertTrueEClass, ASSERT_TRUE__MESSAGE);

		lengthEClass = createEClass(LENGTH);
		createEReference(lengthEClass, LENGTH__INPUT);

		notEqEClass = createEClass(NOT_EQ);
		createEReference(notEqEClass, NOT_EQ__LEFT);
		createEReference(notEqEClass, NOT_EQ__RIGHT);

		gtEClass = createEClass(GT);

		ltEClass = createEClass(LT);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__LEFT);

		tryEClass = createEClass(TRY);
		createEReference(tryEClass, TRY__COMMAND);
		createEReference(tryEClass, TRY__CATCH);
		createEReference(tryEClass, TRY__FINALLY);
		createEAttribute(tryEClass, TRY__TIMES);
		createEAttribute(tryEClass, TRY__DELAY);

		formatEClass = createEClass(FORMAT);
		createEAttribute(formatEClass, FORMAT__FORMAT);
		createEReference(formatEClass, FORMAT__ARGS);

		emitEClass = createEClass(EMIT);
		createEReference(emitEClass, EMIT__VALUES);

		repeatWithEClass = createEClass(REPEAT_WITH);
		createEReference(repeatWithEClass, REPEAT_WITH__COMMANDS);
		createEReference(repeatWithEClass, REPEAT_WITH__COMMAND);

		repeatEClass = createEClass(REPEAT);
		createEAttribute(repeatEClass, REPEAT__TIMES);
		createEReference(repeatEClass, REPEAT__COMMAND);
		createEAttribute(repeatEClass, REPEAT__DELAY);

		assertEmptyEClass = createEClass(ASSERT_EMPTY);
		createEAttribute(assertEmptyEClass, ASSERT_EMPTY__MESSAGE);

		assertNonEmptyEClass = createEClass(ASSERT_NON_EMPTY);
		createEAttribute(assertNonEmptyEClass, ASSERT_NON_EMPTY__MESSAGE);

		concatEClass = createEClass(CONCAT);
		createEAttribute(concatEClass, CONCAT__STRS);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__ARGS);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__ARGS);

		getTimeEClass = createEClass(GET_TIME);

		formatTimeEClass = createEClass(FORMAT_TIME);
		createEAttribute(formatTimeEClass, FORMAT_TIME__FORMAT);

		binaryOpEClass = createEClass(BINARY_OP);
		createEReference(binaryOpEClass, BINARY_OP__LEFT);
		createEReference(binaryOpEClass, BINARY_OP__RIGHT);

		plusEClass = createEClass(PLUS);

		minusEClass = createEClass(MINUS);

		divEClass = createEClass(DIV);

		multEClass = createEClass(MULT);

		absEClass = createEClass(ABS);
		createEReference(absEClass, ABS__ARG);

		betweenEClass = createEClass(BETWEEN);
		createEReference(betweenEClass, BETWEEN__INPUT);
		createEReference(betweenEClass, BETWEEN__LEFT);
		createEReference(betweenEClass, BETWEEN__RIGHT);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eqEClass.getESuperTypes().add(theCorePackage.getCommand());
		intEClass.getESuperTypes().add(this.getConvert());
		longEClass.getESuperTypes().add(this.getConvert());
		floatEClass.getESuperTypes().add(this.getConvert());
		boolEClass.getESuperTypes().add(this.getConvert());
		strEClass.getESuperTypes().add(this.getConvert());
		convertEClass.getESuperTypes().add(theCorePackage.getCommand());
		assertTrueEClass.getESuperTypes().add(theCorePackage.getCommand());
		lengthEClass.getESuperTypes().add(theCorePackage.getCommand());
		notEqEClass.getESuperTypes().add(theCorePackage.getCommand());
		gtEClass.getESuperTypes().add(this.getBinaryOp());
		ltEClass.getESuperTypes().add(this.getBinaryOp());
		notEClass.getESuperTypes().add(theCorePackage.getCommand());
		tryEClass.getESuperTypes().add(theCorePackage.getCommand());
		formatEClass.getESuperTypes().add(theCorePackage.getCommand());
		emitEClass.getESuperTypes().add(theCorePackage.getCommand());
		repeatWithEClass.getESuperTypes().add(theCorePackage.getCommand());
		repeatEClass.getESuperTypes().add(theCorePackage.getCommand());
		assertEmptyEClass.getESuperTypes().add(theCorePackage.getCommand());
		assertNonEmptyEClass.getESuperTypes().add(theCorePackage.getCommand());
		concatEClass.getESuperTypes().add(theCorePackage.getCommand());
		orEClass.getESuperTypes().add(theCorePackage.getCommand());
		andEClass.getESuperTypes().add(theCorePackage.getCommand());
		getTimeEClass.getESuperTypes().add(theCorePackage.getCommand());
		formatTimeEClass.getESuperTypes().add(theCorePackage.getCommand());
		binaryOpEClass.getESuperTypes().add(theCorePackage.getCommand());
		plusEClass.getESuperTypes().add(this.getBinaryOp());
		minusEClass.getESuperTypes().add(this.getBinaryOp());
		divEClass.getESuperTypes().add(this.getBinaryOp());
		multEClass.getESuperTypes().add(this.getBinaryOp());
		absEClass.getESuperTypes().add(theCorePackage.getCommand());
		betweenEClass.getESuperTypes().add(theCorePackage.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(eqEClass, Eq.class, "Eq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEq_Left(), theEcorePackage.getEObject(), null, "left", null, 0, 1, Eq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEq_Right(), theEcorePackage.getEObject(), null, "right", null, 0, 1, Eq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intEClass, Int.class, "Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longEClass, org.eclipse.ecl.operations.Long.class, "Long", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatEClass, org.eclipse.ecl.operations.Float.class, "Float", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolEClass, Bool.class, "Bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strEClass, Str.class, "Str", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(convertEClass, Convert.class, "Convert", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConvert_Input(), theEcorePackage.getEObject(), null, "input", null, 0, 1, Convert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertTrueEClass, AssertTrue.class, "AssertTrue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertTrue_Input(), theEcorePackage.getEBoolean(), "input", null, 0, 1, AssertTrue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertTrue_Message(), theEcorePackage.getEString(), "message", null, 0, 1, AssertTrue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLength_Input(), theEcorePackage.getEObject(), null, "input", null, 0, -1, Length.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEqEClass, NotEq.class, "NotEq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotEq_Left(), theEcorePackage.getEObject(), null, "left", null, 0, 1, NotEq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotEq_Right(), theEcorePackage.getEObject(), null, "right", null, 0, 1, NotEq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gtEClass, Gt.class, "Gt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ltEClass, Lt.class, "Lt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Left(), theEcorePackage.getEObject(), null, "left", null, 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tryEClass, Try.class, "Try", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTry_Command(), theCorePackage.getCommand(), null, "command", null, 0, 1, Try.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTry_Catch(), theCorePackage.getCommand(), null, "catch", null, 0, 1, Try.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTry_Finally(), theCorePackage.getCommand(), null, "finally", null, 0, 1, Try.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTry_Times(), theEcorePackage.getEIntegerObject(), "times", "1", 0, 1, Try.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTry_Delay(), theEcorePackage.getEIntegerObject(), "delay", "0", 0, 1, Try.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formatEClass, Format.class, "Format", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormat_Format(), theEcorePackage.getEString(), "format", null, 0, 1, Format.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormat_Args(), theEcorePackage.getEObject(), null, "args", null, 0, -1, Format.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emitEClass, Emit.class, "Emit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmit_Values(), theEcorePackage.getEObject(), null, "values", null, 0, -1, Emit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatWithEClass, RepeatWith.class, "RepeatWith", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatWith_Commands(), theEcorePackage.getEObject(), null, "commands", null, 0, -1, RepeatWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatWith_Command(), theCorePackage.getCommand(), null, "command", null, 0, 1, RepeatWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeat_Times(), theEcorePackage.getEIntegerObject(), "times", "1", 1, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeat_Command(), theCorePackage.getCommand(), null, "command", null, 1, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepeat_Delay(), theEcorePackage.getEIntegerObject(), "delay", "0", 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertEmptyEClass, AssertEmpty.class, "AssertEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertEmpty_Message(), theEcorePackage.getEString(), "message", null, 0, 1, AssertEmpty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertNonEmptyEClass, AssertNonEmpty.class, "AssertNonEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertNonEmpty_Message(), theEcorePackage.getEString(), "message", null, 0, 1, AssertNonEmpty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concatEClass, Concat.class, "Concat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcat_Strs(), theEcorePackage.getEString(), "strs", null, 0, -1, Concat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOr_Args(), theEcorePackage.getEObject(), null, "args", null, 2, -1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_Args(), theEcorePackage.getEObject(), null, "args", null, 2, -1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTimeEClass, GetTime.class, "GetTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formatTimeEClass, FormatTime.class, "FormatTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormatTime_Format(), theEcorePackage.getEString(), "format", null, 0, 1, FormatTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryOpEClass, BinaryOp.class, "BinaryOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOp_Left(), theEcorePackage.getEObject(), null, "left", null, 0, 1, BinaryOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOp_Right(), theEcorePackage.getEObject(), null, "right", null, 0, 1, BinaryOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multEClass, Mult.class, "Mult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(absEClass, Abs.class, "Abs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbs_Arg(), theEcorePackage.getEObject(), null, "arg", null, 0, 1, Abs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(betweenEClass, Between.class, "Between", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBetween_Input(), theEcorePackage.getEObject(), null, "input", null, 0, 1, Between.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBetween_Left(), theEcorePackage.getEObject(), null, "left", null, 0, 1, Between.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBetween_Right(), theEcorePackage.getEObject(), null, "right", null, 0, 1, Between.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/ecl/docs
		createDocsAnnotations();
		// http://www.eclipse.org/ecl/input
		createInputAnnotations();
		// http://www.eclipse.org/ecl/internal
		createInternalAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ecl/docs</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocsAnnotations() {
		String source = "http://www.eclipse.org/ecl/docs";		
		addAnnotation
		  (eqEClass, 
		   source, 
		   new String[] {
			 "description", "Compares arguments on equality",
			 "returns", "<code>true</code> when args are equal, <code>false</code> otherwise."
		   });			
		addAnnotation
		  (getEq_Left(), 
		   source, 
		   new String[] {
			 "description", "Left argument"
		   });		
		addAnnotation
		  (getEq_Right(), 
		   source, 
		   new String[] {
			 "description", "Right argument"
		   });		
		addAnnotation
		  (intEClass, 
		   source, 
		   new String[] {
			 "description", "Converts its argument to int.",
			 "returns", "Returns integer value or fails if value cannot be converted. <code>true</code> is converted to <code>1</code> and <code>false</code> is converted to <code>0</code>."
		   });		
		addAnnotation
		  (longEClass, 
		   source, 
		   new String[] {
			 "description", "Converts its argument to long.",
			 "returns", "Returns long value or fails if value cannot be converted. <code>true</code> is converted to <code>1L</code> and <code>false</code> is converted to <code>0L</code>."
		   });		
		addAnnotation
		  (floatEClass, 
		   source, 
		   new String[] {
			 "description", "Converts its argument to float.",
			 "returns", "<p>Returns float value or fails if value cannot be converted. <code>true</code> is converted to <code>1.0</code> and <code>false</code> is converted to <code>0</code>. This command uses <code>java.lang.Float.parseFloat</code> method, but also supports a few additional text values for infinity:</p>\n<ul>\n  <li><b>+inf</b> &ndash; returns <code>Float.POSITIVE_INFINITY</code></li>\n  <li><b>inf</b> &ndash; returns <code>Float.POSITIVE_INFINITY</code></li>\n  <li><b>-inf</b> &ndash; returns <code>Float.NEGATIVE_INFINITY</code></li>\n</ul>"
		   });		
		addAnnotation
		  (boolEClass, 
		   source, 
		   new String[] {
			 "description", "Converts its argument to boolean.",
			 "returns", "Returns boolean value or fails if value cannot be converted. "
		   });		
		addAnnotation
		  (strEClass, 
		   source, 
		   new String[] {
			 "description", "Converts its argument to string.",
			 "returns", "Returns string value or fails if value cannot be converted. "
		   });			
		addAnnotation
		  (getConvert_Input(), 
		   source, 
		   new String[] {
			 "description", "Argument to be converted."
		   });			
		addAnnotation
		  (assertTrueEClass, 
		   source, 
		   new String[] {
			 "description", "If input is not true, fails",
			 "returns", "Nothing"
		   });		
		addAnnotation
		  (getAssertTrue_Input(), 
		   source, 
		   new String[] {
			 "description", "Input value. Must be true."
		   });			
		addAnnotation
		  (getAssertTrue_Message(), 
		   source, 
		   new String[] {
			 "description", "Message to fail with when input is not true"
		   });		
		addAnnotation
		  (lengthEClass, 
		   source, 
		   new String[] {
			 "description", "Returns count of objects got from input pipe",
			 "returns", "Object count"
		   });		
		addAnnotation
		  (getLength_Input(), 
		   source, 
		   new String[] {
			 "description", "List of objects to get the length for"
		   });			
		addAnnotation
		  (notEqEClass, 
		   source, 
		   new String[] {
			 "description", "Compares arguments are different",
			 "returns", "<code>false</code> when args are equal, <code>true</code> otherwise."
		   });			
		addAnnotation
		  (getNotEq_Left(), 
		   source, 
		   new String[] {
			 "description", "Left argument"
		   });		
		addAnnotation
		  (getNotEq_Right(), 
		   source, 
		   new String[] {
			 "description", "Right argument"
		   });		
		addAnnotation
		  (gtEClass, 
		   source, 
		   new String[] {
			 "description", "Compares arguments on to one be greater then another",
			 "returns", "<code>true</code> when left are greater then right, <code>false</code> otherwise."
		   });		
		addAnnotation
		  (ltEClass, 
		   source, 
		   new String[] {
			 "description", "Compares arguments one are less then another",
			 "returns", "<code>true</code> when left is less then right, <code>false</code> otherwise."
		   });		
		addAnnotation
		  (notEClass, 
		   source, 
		   new String[] {
			 "description", "Return !value",
			 "returns", "<code>true</code> when value is false, <code>false</code> otherwise."
		   });			
		addAnnotation
		  (getNot_Left(), 
		   source, 
		   new String[] {
			 "description", "Left argument"
		   });		
		addAnnotation
		  (tryEClass, 
		   source, 
		   new String[] {
			 "description", "Try to execute command, retry times with delay if command are failed.\nExecute catch if all operations is not succesfull. Execute finally in anyway.",
			 "returns", "return\'s -command output if command is successed.",
			 "example", "try -times 10 -delay 100 -command {\r\n\t// some ECL scripts\r\n}"
		   });		
		addAnnotation
		  (formatEClass, 
		   source, 
		   new String[] {
			 "description", "Writes a formatted string to output pipe",
			 "returns", "Formatted string",
			 "example", "format \"string: %s, int: %d\" \"foo\" 5 | log"
		   });		
		addAnnotation
		  (getFormat_Format(), 
		   source, 
		   new String[] {
			 "description", "Format string as in Java\'s <a href=\"http://docs.oracle.com/javase/6/docs/api/java/util/Formatter.html\">String.format</a>"
		   });		
		addAnnotation
		  (getFormat_Args(), 
		   source, 
		   new String[] {
			 "description", "Arguments for format string"
		   });		
		addAnnotation
		  (emitEClass, 
		   source, 
		   new String[] {
			 "description", "Writes its arguments into output pipe. ",
			 "returns", "List of arguments",
			 "example", "emit \"hello\" \"world\" | foreach { log }"
		   });		
		addAnnotation
		  (repeatWithEClass, 
		   source, 
		   new String[] {
			 "description", "Takes list of commands from input pipe and single command as argument and executes them in following order: \n<pre>\ncommand-from-input-1 | command-from-arg\ncommand-from-input-2 | command-from-arg\n...\n</pre>",
			 "returns", "Aggregated output of command from argument",
			 "example", "// executes commands:\r\n// echo 1 | gt 2\r\n// echo 2 | gt 2\r\n// echo 3 | gt 2\r\n// output: false, false, true\r\nemit { echo 1} { echo 2} { echo 3} | repeat-with { gt 2 } "
		   });			
		addAnnotation
		  (repeatEClass, 
		   source, 
		   new String[] {
			 "description", "Execute specified command multiple times.",
			 "returns", "return\'s -command output if command is successed."
		   });		
		addAnnotation
		  (assertEmptyEClass, 
		   source, 
		   new String[] {
			 "description", "Asserts that input pipe doesn\'t contain anything",
			 "returns", "Nothing"
		   });		
		addAnnotation
		  (getAssertEmpty_Message(), 
		   source, 
		   new String[] {
			 "description", "Message to fail with when input is not empty"
		   });		
		addAnnotation
		  (assertNonEmptyEClass, 
		   source, 
		   new String[] {
			 "description", "Asserts that input pipe contain something",
			 "returns", "Nothing"
		   });		
		addAnnotation
		  (getAssertNonEmpty_Message(), 
		   source, 
		   new String[] {
			 "description", "Message to fail with when input is empty"
		   });		
		addAnnotation
		  (concatEClass, 
		   source, 
		   new String[] {
			 "description", "Concatenates strings passed as arguments",
			 "returns", "Concatenated string value"
		   });		
		addAnnotation
		  (orEClass, 
		   source, 
		   new String[] {
			 "description", "Computes the result of logical Or operation for passed arguments.",
			 "returns", "<code>true</code> or <code>false</code>."
		   });		
		addAnnotation
		  (getOr_Args(), 
		   source, 
		   new String[] {
			 "description", "Arguments to compute on."
		   });		
		addAnnotation
		  (andEClass, 
		   source, 
		   new String[] {
			 "description", "Computes the result of logical And operation for passed arguments.",
			 "returns", "<code>true</code> or <code>false</code>."
		   });		
		addAnnotation
		  (getAnd_Args(), 
		   source, 
		   new String[] {
			 "description", "Arguments to compute on."
		   });		
		addAnnotation
		  (getTimeEClass, 
		   source, 
		   new String[] {
			 "description", "Returns current time as a number of milliseconds since January, 1, 1970.",
			 "returns", "Current time as long integer"
		   });		
		addAnnotation
		  (formatTimeEClass, 
		   source, 
		   new String[] {
			 "description", "Reads timestamp value (as a number of milliseconds since January, 1, 1970) from input pipe and formats according to given format string. Format string is the same as used in <code>java.text.SimpleDateFormat</code>.",
			 "returns", "String representation of given time"
		   });			
		addAnnotation
		  (getBinaryOp_Left(), 
		   source, 
		   new String[] {
			 "description", "Left argument"
		   });		
		addAnnotation
		  (getBinaryOp_Right(), 
		   source, 
		   new String[] {
			 "description", "Right argument"
		   });		
		addAnnotation
		  (plusEClass, 
		   source, 
		   new String[] {
			 "description", "<p>returns <code>left + right</code></p>\n<p>Before performing an operation, arguments are converted to the widest type according to the following rules:</p>\n<ol>\n  <li><code>string</code> arguments converted to <code>long</code></li>\n  <li><code>boolean</code> arguments converted to <code>long</code> (1 for <code>true</code> and 0 for <code>false</code>)</li>\n  <li>If one of arguments is <code>double</code>, converts the other one to <code>double</code></li>\n  <li>If one of arguments is <code>float</code>, converts the other one to <code>float</code></li>\n  <li>If one of arguments is <code>long</code>, converts the other one to <code>long</code></li>\n  <li>Otherwise (in case of <code>byte</code>, <code>char</code>, or <code>short</code>) converts both arguments to <code>int</code></li>\n</ol>\n"
		   });		
		addAnnotation
		  (minusEClass, 
		   source, 
		   new String[] {
			 "description", "<p>returns <code>left - right</code></p>\n<p>Before performing an operation, arguments are converted to the widest type according to the following rules:</p>\n<ol>\n  <li><code>string</code> arguments converted to <code>long</code></li>\n  <li><code>boolean</code> arguments converted to <code>long</code> (1 for <code>true</code> and 0 for <code>false</code>)</li>\n  <li>If one of arguments is <code>double</code>, converts the other one to <code>double</code></li>\n  <li>If one of arguments is <code>float</code>, converts the other one to <code>float</code></li>\n  <li>If one of arguments is <code>long</code>, converts the other one to <code>long</code></li>\n  <li>Otherwise (in case of <code>byte</code>, <code>char</code>, or <code>short</code>) converts both arguments to <code>int</code></li>\n</ol>\n"
		   });		
		addAnnotation
		  (divEClass, 
		   source, 
		   new String[] {
			 "description", "<p>returns <code>left / right</code></p>\n<p>Before performing an operation, arguments are converted to the widest type according to the following rules:</p>\n<ol>\n  <li><code>string</code> arguments converted to <code>long</code></li>\n  <li><code>boolean</code> arguments converted to <code>long</code> (1 for <code>true</code> and 0 for <code>false</code>)</li>\n  <li>If one of arguments is <code>double</code>, converts the other one to <code>double</code></li>\n  <li>If one of arguments is <code>float</code>, converts the other one to <code>float</code></li>\n  <li>If one of arguments is <code>long</code>, converts the other one to <code>long</code></li>\n  <li>Otherwise (in case of <code>byte</code>, <code>char</code>, or <code>short</code>) converts both arguments to <code>int</code></li>\n</ol>\n"
		   });		
		addAnnotation
		  (multEClass, 
		   source, 
		   new String[] {
			 "description", "<p>returns <code>left * right</code></p>\n<p>Before performing an operation, arguments are converted to the widest type according to the following rules:</p>\n<ol>\n  <li><code>string</code> arguments converted to <code>long</code></li>\n  <li><code>boolean</code> arguments converted to <code>long</code> (1 for <code>true</code> and 0 for <code>false</code>)</li>\n  <li>If one of arguments is <code>double</code>, converts the other one to <code>double</code></li>\n  <li>If one of arguments is <code>float</code>, converts the other one to <code>float</code></li>\n  <li>If one of arguments is <code>long</code>, converts the other one to <code>long</code></li>\n  <li>Otherwise (in case of <code>byte</code>, <code>char</code>, or <code>short</code>) converts both arguments to <code>int</code></li>\n</ol>\n"
		   });		
		addAnnotation
		  (absEClass, 
		   source, 
		   new String[] {
			 "description", "<p>returns <code>java.lang.Math.abs(arg)</code></p>\n<p>The return type of an operation is determined by the following rules:</p>\n<ol>\n  <li><code>string</code> arg is converted to <code>long</code></li>\n  <li><code>boolean</code> arg is converted to <code>long</code> (1 for <code>true</code> and 0 for <code>false</code>)</li>\n  <li><code>double</code>, <code>float</code>, <code>long</code> args retain its original type</li>\n  <li>Otherwise (in case of <code>byte</code>, <code>char</code>, or <code>short</code>) the returned value has type <code>int</code></li>\n</ol>\n"
		   });			
		addAnnotation
		  (betweenEClass, 
		   source, 
		   new String[] {
			 "description", "<p>returns <code>true</code> if <code>input</code> is greater than or equal to <code>left</code> and less than or equal to <code>right</code></p>\n\n<p>Before performing an operation, arguments are converted according to the following rules:</p>\n<ol>\n  <li><code>string</code> arguments converted to <code>long</code></li>\n  <li><code>boolean</code> arguments converted to <code>long</code> (1 for <code>true</code> and 0 for <code>false</code>)</li>\n  <li>If one of arguments is <code>double</code>, converts the other one to <code>double</code></li>\n  <li>If one of arguments is <code>float</code>, converts the other one to <code>float</code></li>\n  <li>If one of arguments is <code>long</code>, converts the other one to <code>long</code></li>\n  <li>Otherwise (in case of <code>byte</code>, <code>char</code>, or <code>short</code>) converts both arguments to <code>int</code></li>\n</ol>\n"
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
		  (getEq_Left(), 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  (getConvert_Input(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getAssertTrue_Input(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getLength_Input(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getNotEq_Left(), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  (getNot_Left(), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (getRepeatWith_Commands(), 
		   source, 
		   new String[] {
		   });														
		addAnnotation
		  (getBinaryOp_Left(), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (getAbs_Arg(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getBetween_Input(), 
		   source, 
		   new String[] {
		   });
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
		  (convertEClass, 
		   source, 
		   new String[] {
		   });																																																
	}

} // OperationsPackageImpl
