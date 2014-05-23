/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations.impl;

import org.eclipse.ecl.operations.Abs;
import org.eclipse.ecl.operations.And;
import org.eclipse.ecl.operations.AssertEmpty;
import org.eclipse.ecl.operations.AssertNonEmpty;
import org.eclipse.ecl.operations.AssertTrue;
import org.eclipse.ecl.operations.Between;
import org.eclipse.ecl.operations.BinaryOp;
import org.eclipse.ecl.operations.Bool;
import org.eclipse.ecl.operations.Concat;
import org.eclipse.ecl.operations.Div;
import org.eclipse.ecl.operations.Each;
import org.eclipse.ecl.operations.Emit;
import org.eclipse.ecl.operations.Entry;
import org.eclipse.ecl.operations.Eq;
import org.eclipse.ecl.operations.Format;
import org.eclipse.ecl.operations.FormatTime;
import org.eclipse.ecl.operations.GetTime;
import org.eclipse.ecl.operations.Gt;
import org.eclipse.ecl.operations.Int;
import org.eclipse.ecl.operations.Length;
import org.eclipse.ecl.operations.List;
import org.eclipse.ecl.operations.Loop;
import org.eclipse.ecl.operations.Lt;
import org.eclipse.ecl.operations.Map;
import org.eclipse.ecl.operations.Minus;
import org.eclipse.ecl.operations.Mod;
import org.eclipse.ecl.operations.Mult;
import org.eclipse.ecl.operations.Not;
import org.eclipse.ecl.operations.NotEq;
import org.eclipse.ecl.operations.OperationsFactory;
import org.eclipse.ecl.operations.OperationsPackage;
import org.eclipse.ecl.operations.Or;
import org.eclipse.ecl.operations.ParseTime;
import org.eclipse.ecl.operations.Plus;
import org.eclipse.ecl.operations.Recur;
import org.eclipse.ecl.operations.Repeat;
import org.eclipse.ecl.operations.RepeatWith;
import org.eclipse.ecl.operations.Split;
import org.eclipse.ecl.operations.Str;
import org.eclipse.ecl.operations.ToList;
import org.eclipse.ecl.operations.Try;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperationsFactoryImpl extends EFactoryImpl implements
		OperationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static OperationsFactory init() {
		try {
			OperationsFactory theOperationsFactory = (OperationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ecl/operations.ecore"); 
			if (theOperationsFactory != null) {
				return theOperationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OperationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OperationsPackage.EQ: return createEq();
			case OperationsPackage.INT: return createInt();
			case OperationsPackage.LONG: return createLong();
			case OperationsPackage.FLOAT: return createFloat();
			case OperationsPackage.BOOL: return createBool();
			case OperationsPackage.STR: return createStr();
			case OperationsPackage.ASSERT_TRUE: return createAssertTrue();
			case OperationsPackage.LENGTH: return createLength();
			case OperationsPackage.NOT_EQ: return createNotEq();
			case OperationsPackage.GT: return createGt();
			case OperationsPackage.LT: return createLt();
			case OperationsPackage.NOT: return createNot();
			case OperationsPackage.TRY: return createTry();
			case OperationsPackage.FORMAT: return createFormat();
			case OperationsPackage.EMIT: return createEmit();
			case OperationsPackage.REPEAT_WITH: return createRepeatWith();
			case OperationsPackage.REPEAT: return createRepeat();
			case OperationsPackage.ASSERT_EMPTY: return createAssertEmpty();
			case OperationsPackage.ASSERT_NON_EMPTY: return createAssertNonEmpty();
			case OperationsPackage.CONCAT: return createConcat();
			case OperationsPackage.OR: return createOr();
			case OperationsPackage.AND: return createAnd();
			case OperationsPackage.GET_TIME: return createGetTime();
			case OperationsPackage.FORMAT_TIME: return createFormatTime();
			case OperationsPackage.BINARY_OP: return createBinaryOp();
			case OperationsPackage.PLUS: return createPlus();
			case OperationsPackage.MINUS: return createMinus();
			case OperationsPackage.DIV: return createDiv();
			case OperationsPackage.MULT: return createMult();
			case OperationsPackage.ABS: return createAbs();
			case OperationsPackage.MOD: return createMod();
			case OperationsPackage.BETWEEN: return createBetween();
			case OperationsPackage.ENTRY: return createEntry();
			case OperationsPackage.MAP: return createMap();
			case OperationsPackage.LIST: return createList();
			case OperationsPackage.LOOP: return createLoop();
			case OperationsPackage.RECUR: return createRecur();
			case OperationsPackage.TO_LIST: return createToList();
			case OperationsPackage.EACH: return createEach();
			case OperationsPackage.SPLIT: return createSplit();
			case OperationsPackage.PARSE_TIME: return createParseTime();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Eq createEq() {
		EqImpl eq = new EqImpl();
		return eq;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Int createInt() {
		IntImpl int_ = new IntImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ecl.operations.Long createLong() {
		LongImpl long_ = new LongImpl();
		return long_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ecl.operations.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Bool createBool() {
		BoolImpl bool = new BoolImpl();
		return bool;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Str createStr() {
		StrImpl str = new StrImpl();
		return str;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssertTrue createAssertTrue() {
		AssertTrueImpl assertTrue = new AssertTrueImpl();
		return assertTrue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotEq createNotEq() {
		NotEqImpl notEq = new NotEqImpl();
		return notEq;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Gt createGt() {
		GtImpl gt = new GtImpl();
		return gt;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Lt createLt() {
		LtImpl lt = new LtImpl();
		return lt;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Try createTry() {
		TryImpl try_ = new TryImpl();
		return try_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Format createFormat() {
		FormatImpl format = new FormatImpl();
		return format;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Emit createEmit() {
		EmitImpl emit = new EmitImpl();
		return emit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatWith createRepeatWith() {
		RepeatWithImpl repeatWith = new RepeatWithImpl();
		return repeatWith;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat createRepeat() {
		RepeatImpl repeat = new RepeatImpl();
		return repeat;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssertEmpty createAssertEmpty() {
		AssertEmptyImpl assertEmpty = new AssertEmptyImpl();
		return assertEmpty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssertNonEmpty createAssertNonEmpty() {
		AssertNonEmptyImpl assertNonEmpty = new AssertNonEmptyImpl();
		return assertNonEmpty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Concat createConcat() {
		ConcatImpl concat = new ConcatImpl();
		return concat;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GetTime createGetTime() {
		GetTimeImpl getTime = new GetTimeImpl();
		return getTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FormatTime createFormatTime() {
		FormatTimeImpl formatTime = new FormatTimeImpl();
		return formatTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Mult createMult() {
		MultImpl mult = new MultImpl();
		return mult;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Abs createAbs() {
		AbsImpl abs = new AbsImpl();
		return abs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mod createMod() {
		ModImpl mod = new ModImpl();
		return mod;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Between createBetween() {
		BetweenImpl between = new BetweenImpl();
		return between;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recur createRecur() {
		RecurImpl recur = new RecurImpl();
		return recur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToList createToList() {
		ToListImpl toList = new ToListImpl();
		return toList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Each createEach() {
		EachImpl each = new EachImpl();
		return each;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split createSplit() {
		SplitImpl split = new SplitImpl();
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParseTime createParseTime() {
		ParseTimeImpl parseTime = new ParseTimeImpl();
		return parseTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOp createBinaryOp() {
		BinaryOpImpl binaryOp = new BinaryOpImpl();
		return binaryOp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsPackage getOperationsPackage() {
		return (OperationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationsPackage getPackage() {
		return OperationsPackage.eINSTANCE;
	}

} // OperationsFactoryImpl
