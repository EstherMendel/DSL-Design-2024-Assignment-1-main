/**
 */
package nl.tue.dsldesign.turtle.util;

import nl.tue.dsldesign.turtle.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.tue.dsldesign.turtle.TurtlePackage
 * @generated
 */
public class TurtleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TurtlePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TurtlePackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurtleSwitch<Adapter> modelSwitch = new TurtleSwitch<Adapter>() {
		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseMove(Move object) {
			return createMoveAdapter();
		}

		@Override
		public Adapter caseTurnLeft(TurnLeft object) {
			return createTurnLeftAdapter();
		}

		@Override
		public Adapter caseTurnRight(TurnRight object) {
			return createTurnRightAdapter();
		}

		@Override
		public Adapter caseTurnToZero(TurnToZero object) {
			return createTurnToZeroAdapter();
		}

		@Override
		public Adapter caseIf(If object) {
			return createIfAdapter();
		}

		@Override
		public Adapter caseAssignment(Assignment object) {
			return createAssignmentAdapter();
		}

		@Override
		public Adapter caseExpr(Expr object) {
			return createExprAdapter();
		}

		@Override
		public Adapter caseUnary(Unary object) {
			return createUnaryAdapter();
		}

		@Override
		public Adapter caseBinary(Binary object) {
			return createBinaryAdapter();
		}

		@Override
		public Adapter caseSqr(Sqr object) {
			return createSqrAdapter();
		}

		@Override
		public Adapter caseSqrt(Sqrt object) {
			return createSqrtAdapter();
		}

		@Override
		public Adapter caseArctan(Arctan object) {
			return createArctanAdapter();
		}

		@Override
		public Adapter caseAbs(Abs object) {
			return createAbsAdapter();
		}

		@Override
		public Adapter caseVarRef(VarRef object) {
			return createVarRefAdapter();
		}

		@Override
		public Adapter caseRealConst(RealConst object) {
			return createRealConstAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.TurnLeft
	 * @generated
	 */
	public Adapter createTurnLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.TurnRight <em>Turn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.TurnRight
	 * @generated
	 */
	public Adapter createTurnRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.TurnToZero <em>Turn To Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.TurnToZero
	 * @generated
	 */
	public Adapter createTurnToZeroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.Expr
	 * @generated
	 */
	public Adapter createExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.Unary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.Unary
	 * @generated
	 */
	public Adapter createUnaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.Binary
	 * @generated
	 */
	public Adapter createBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.Sqr <em>Sqr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.Sqr
	 * @generated
	 */
	public Adapter createSqrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.Sqrt <em>Sqrt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.Sqrt
	 * @generated
	 */
	public Adapter createSqrtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.Arctan <em>Arctan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.Arctan
	 * @generated
	 */
	public Adapter createArctanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.Abs <em>Abs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.Abs
	 * @generated
	 */
	public Adapter createAbsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.VarRef
	 * @generated
	 */
	public Adapter createVarRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.turtle.RealConst <em>Real Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.turtle.RealConst
	 * @generated
	 */
	public Adapter createRealConstAdapter() {
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

} //TurtleAdapterFactory
