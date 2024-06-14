/**
 */
package nl.tue.dsldesign.turtle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.tue.dsldesign.turtle.TurtleFactory
 * @model kind="package"
 * @generated
 */
public interface TurtlePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "turtle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/turtle";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "turtle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TurtlePackage eINSTANCE = nl.tue.dsldesign.turtle.impl.TurtlePackageImpl.init();

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.ProgramImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.StatementImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.MoveImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 2;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.TurnLeftImpl <em>Turn Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.TurnLeftImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getTurnLeft()
	 * @generated
	 */
	int TURN_LEFT = 3;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.TurnRightImpl <em>Turn Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.TurnRightImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getTurnRight()
	 * @generated
	 */
	int TURN_RIGHT = 4;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.TurnToZeroImpl <em>Turn To Zero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.TurnToZeroImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getTurnToZero()
	 * @generated
	 */
	int TURN_TO_ZERO = 5;

	/**
	 * The number of structural features of the '<em>Turn To Zero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TO_ZERO_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn To Zero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TO_ZERO_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.IfImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getIf()
	 * @generated
	 */
	int IF = 6;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__COND = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.AssignmentImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 7;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VAR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXPR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.ExprImpl <em>Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.ExprImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getExpr()
	 * @generated
	 */
	int EXPR = 8;

	/**
	 * The number of structural features of the '<em>Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.UnaryImpl <em>Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.UnaryImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getUnary()
	 * @generated
	 */
	int UNARY = 9;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__EXPR = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.BinaryImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__LEFT = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__RIGHT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__OPERATION = EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.SqrImpl <em>Sqr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.SqrImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getSqr()
	 * @generated
	 */
	int SQR = 11;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQR__EXPR = UNARY__EXPR;

	/**
	 * The number of structural features of the '<em>Sqr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQR_FEATURE_COUNT = UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQR_OPERATION_COUNT = UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.SqrtImpl <em>Sqrt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.SqrtImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getSqrt()
	 * @generated
	 */
	int SQRT = 12;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT__EXPR = UNARY__EXPR;

	/**
	 * The number of structural features of the '<em>Sqrt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT_FEATURE_COUNT = UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqrt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT_OPERATION_COUNT = UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.ArctanImpl <em>Arctan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.ArctanImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getArctan()
	 * @generated
	 */
	int ARCTAN = 13;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCTAN__EXPR = UNARY__EXPR;

	/**
	 * The number of structural features of the '<em>Arctan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCTAN_FEATURE_COUNT = UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arctan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCTAN_OPERATION_COUNT = UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.AbsImpl <em>Abs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.AbsImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getAbs()
	 * @generated
	 */
	int ABS = 14;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS__EXPR = UNARY__EXPR;

	/**
	 * The number of structural features of the '<em>Abs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_FEATURE_COUNT = UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_OPERATION_COUNT = UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.VarRefImpl <em>Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.VarRefImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getVarRef()
	 * @generated
	 */
	int VAR_REF = 15;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__VAR = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.impl.RealConstImpl <em>Real Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.impl.RealConstImpl
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getRealConst()
	 * @generated
	 */
	int REAL_CONST = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONST__VALUE = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONST_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONST_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.turtle.Operation <em>Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.turtle.Operation
	 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 17;

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see nl.tue.dsldesign.turtle.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.dsldesign.turtle.Program#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see nl.tue.dsldesign.turtle.Program#getStatements()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Statements();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see nl.tue.dsldesign.turtle.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see nl.tue.dsldesign.turtle.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.dsldesign.turtle.Move#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see nl.tue.dsldesign.turtle.Move#getExpr()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Expr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Left</em>'.
	 * @see nl.tue.dsldesign.turtle.TurnLeft
	 * @generated
	 */
	EClass getTurnLeft();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.dsldesign.turtle.TurnLeft#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see nl.tue.dsldesign.turtle.TurnLeft#getExpr()
	 * @see #getTurnLeft()
	 * @generated
	 */
	EReference getTurnLeft_Expr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.TurnRight <em>Turn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Right</em>'.
	 * @see nl.tue.dsldesign.turtle.TurnRight
	 * @generated
	 */
	EClass getTurnRight();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.dsldesign.turtle.TurnRight#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see nl.tue.dsldesign.turtle.TurnRight#getExpr()
	 * @see #getTurnRight()
	 * @generated
	 */
	EReference getTurnRight_Expr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.TurnToZero <em>Turn To Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn To Zero</em>'.
	 * @see nl.tue.dsldesign.turtle.TurnToZero
	 * @generated
	 */
	EClass getTurnToZero();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see nl.tue.dsldesign.turtle.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.dsldesign.turtle.If#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see nl.tue.dsldesign.turtle.If#getCond()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Cond();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.dsldesign.turtle.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
	 * @see nl.tue.dsldesign.turtle.If#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.dsldesign.turtle.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see nl.tue.dsldesign.turtle.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see nl.tue.dsldesign.turtle.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.dsldesign.turtle.Assignment#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see nl.tue.dsldesign.turtle.Assignment#getVar()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Var();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.dsldesign.turtle.Assignment#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see nl.tue.dsldesign.turtle.Assignment#getExpr()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Expr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr</em>'.
	 * @see nl.tue.dsldesign.turtle.Expr
	 * @generated
	 */
	EClass getExpr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.Unary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary</em>'.
	 * @see nl.tue.dsldesign.turtle.Unary
	 * @generated
	 */
	EClass getUnary();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.dsldesign.turtle.Unary#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see nl.tue.dsldesign.turtle.Unary#getExpr()
	 * @see #getUnary()
	 * @generated
	 */
	EReference getUnary_Expr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see nl.tue.dsldesign.turtle.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.dsldesign.turtle.Binary#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see nl.tue.dsldesign.turtle.Binary#getLeft()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Left();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.dsldesign.turtle.Binary#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see nl.tue.dsldesign.turtle.Binary#getRight()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Right();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.dsldesign.turtle.Binary#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see nl.tue.dsldesign.turtle.Binary#getOperation()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Operation();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.Sqr <em>Sqr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqr</em>'.
	 * @see nl.tue.dsldesign.turtle.Sqr
	 * @generated
	 */
	EClass getSqr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.Sqrt <em>Sqrt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqrt</em>'.
	 * @see nl.tue.dsldesign.turtle.Sqrt
	 * @generated
	 */
	EClass getSqrt();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.Arctan <em>Arctan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arctan</em>'.
	 * @see nl.tue.dsldesign.turtle.Arctan
	 * @generated
	 */
	EClass getArctan();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.Abs <em>Abs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs</em>'.
	 * @see nl.tue.dsldesign.turtle.Abs
	 * @generated
	 */
	EClass getAbs();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Ref</em>'.
	 * @see nl.tue.dsldesign.turtle.VarRef
	 * @generated
	 */
	EClass getVarRef();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.dsldesign.turtle.VarRef#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see nl.tue.dsldesign.turtle.VarRef#getVar()
	 * @see #getVarRef()
	 * @generated
	 */
	EAttribute getVarRef_Var();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.turtle.RealConst <em>Real Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Const</em>'.
	 * @see nl.tue.dsldesign.turtle.RealConst
	 * @generated
	 */
	EClass getRealConst();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.dsldesign.turtle.RealConst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.dsldesign.turtle.RealConst#getValue()
	 * @see #getRealConst()
	 * @generated
	 */
	EAttribute getRealConst_Value();

	/**
	 * Returns the meta object for enum '{@link nl.tue.dsldesign.turtle.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation</em>'.
	 * @see nl.tue.dsldesign.turtle.Operation
	 * @generated
	 */
	EEnum getOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TurtleFactory getTurtleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.ProgramImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATEMENTS = eINSTANCE.getProgram_Statements();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.StatementImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.MoveImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__EXPR = eINSTANCE.getMove_Expr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.TurnLeftImpl <em>Turn Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.TurnLeftImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getTurnLeft()
		 * @generated
		 */
		EClass TURN_LEFT = eINSTANCE.getTurnLeft();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURN_LEFT__EXPR = eINSTANCE.getTurnLeft_Expr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.TurnRightImpl <em>Turn Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.TurnRightImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getTurnRight()
		 * @generated
		 */
		EClass TURN_RIGHT = eINSTANCE.getTurnRight();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURN_RIGHT__EXPR = eINSTANCE.getTurnRight_Expr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.TurnToZeroImpl <em>Turn To Zero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.TurnToZeroImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getTurnToZero()
		 * @generated
		 */
		EClass TURN_TO_ZERO = eINSTANCE.getTurnToZero();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.IfImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__COND = eINSTANCE.getIf_Cond();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN = eINSTANCE.getIf_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.AssignmentImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__VAR = eINSTANCE.getAssignment_Var();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__EXPR = eINSTANCE.getAssignment_Expr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.ExprImpl <em>Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.ExprImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getExpr()
		 * @generated
		 */
		EClass EXPR = eINSTANCE.getExpr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.UnaryImpl <em>Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.UnaryImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getUnary()
		 * @generated
		 */
		EClass UNARY = eINSTANCE.getUnary();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY__EXPR = eINSTANCE.getUnary_Expr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.BinaryImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__LEFT = eINSTANCE.getBinary_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__RIGHT = eINSTANCE.getBinary_Right();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY__OPERATION = eINSTANCE.getBinary_Operation();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.SqrImpl <em>Sqr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.SqrImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getSqr()
		 * @generated
		 */
		EClass SQR = eINSTANCE.getSqr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.SqrtImpl <em>Sqrt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.SqrtImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getSqrt()
		 * @generated
		 */
		EClass SQRT = eINSTANCE.getSqrt();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.ArctanImpl <em>Arctan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.ArctanImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getArctan()
		 * @generated
		 */
		EClass ARCTAN = eINSTANCE.getArctan();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.AbsImpl <em>Abs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.AbsImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getAbs()
		 * @generated
		 */
		EClass ABS = eINSTANCE.getAbs();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.VarRefImpl <em>Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.VarRefImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getVarRef()
		 * @generated
		 */
		EClass VAR_REF = eINSTANCE.getVarRef();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_REF__VAR = eINSTANCE.getVarRef_Var();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.impl.RealConstImpl <em>Real Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.impl.RealConstImpl
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getRealConst()
		 * @generated
		 */
		EClass REAL_CONST = eINSTANCE.getRealConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_CONST__VALUE = eINSTANCE.getRealConst_Value();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.turtle.Operation <em>Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.turtle.Operation
		 * @see nl.tue.dsldesign.turtle.impl.TurtlePackageImpl#getOperation()
		 * @generated
		 */
		EEnum OPERATION = eINSTANCE.getOperation();

	}

} //TurtlePackage
