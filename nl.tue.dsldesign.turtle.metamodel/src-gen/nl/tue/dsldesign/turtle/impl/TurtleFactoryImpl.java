/**
 */
package nl.tue.dsldesign.turtle.impl;

import nl.tue.dsldesign.turtle.*;

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
public class TurtleFactoryImpl extends EFactoryImpl implements TurtleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TurtleFactory init() {
		try {
			TurtleFactory theTurtleFactory = (TurtleFactory) EPackage.Registry.INSTANCE
					.getEFactory(TurtlePackage.eNS_URI);
			if (theTurtleFactory != null) {
				return theTurtleFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TurtleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtleFactoryImpl() {
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
		case TurtlePackage.PROGRAM:
			return createProgram();
		case TurtlePackage.MOVE:
			return createMove();
		case TurtlePackage.TURN_LEFT:
			return createTurnLeft();
		case TurtlePackage.TURN_RIGHT:
			return createTurnRight();
		case TurtlePackage.TURN_TO_ZERO:
			return createTurnToZero();
		case TurtlePackage.IF:
			return createIf();
		case TurtlePackage.ASSIGNMENT:
			return createAssignment();
		case TurtlePackage.BINARY:
			return createBinary();
		case TurtlePackage.SQR:
			return createSqr();
		case TurtlePackage.SQRT:
			return createSqrt();
		case TurtlePackage.ARCTAN:
			return createArctan();
		case TurtlePackage.ABS:
			return createAbs();
		case TurtlePackage.VAR_REF:
			return createVarRef();
		case TurtlePackage.REAL_CONST:
			return createRealConst();
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
		case TurtlePackage.OPERATION:
			return createOperationFromString(eDataType, initialValue);
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
		case TurtlePackage.OPERATION:
			return convertOperationToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnLeft createTurnLeft() {
		TurnLeftImpl turnLeft = new TurnLeftImpl();
		return turnLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnRight createTurnRight() {
		TurnRightImpl turnRight = new TurnRightImpl();
		return turnRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnToZero createTurnToZero() {
		TurnToZeroImpl turnToZero = new TurnToZeroImpl();
		return turnToZero;
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
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sqr createSqr() {
		SqrImpl sqr = new SqrImpl();
		return sqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sqrt createSqrt() {
		SqrtImpl sqrt = new SqrtImpl();
		return sqrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arctan createArctan() {
		ArctanImpl arctan = new ArctanImpl();
		return arctan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public VarRef createVarRef() {
		VarRefImpl varRef = new VarRefImpl();
		return varRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealConst createRealConst() {
		RealConstImpl realConst = new RealConstImpl();
		return realConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperationFromString(EDataType eDataType, String initialValue) {
		Operation result = Operation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtlePackage getTurtlePackage() {
		return (TurtlePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TurtlePackage getPackage() {
		return TurtlePackage.eINSTANCE;
	}

} //TurtleFactoryImpl
