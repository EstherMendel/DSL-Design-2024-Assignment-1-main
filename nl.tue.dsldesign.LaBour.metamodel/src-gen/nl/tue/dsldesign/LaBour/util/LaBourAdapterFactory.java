/**
 */
package nl.tue.dsldesign.LaBour.util;

import nl.tue.dsldesign.LaBour.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.tue.dsldesign.LaBour.LaBourPackage
 * @generated
 */
public class LaBourAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LaBourPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaBourAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LaBourPackage.eINSTANCE;
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
	protected LaBourSwitch<Adapter> modelSwitch = new LaBourSwitch<Adapter>() {
		@Override
		public Adapter caseBoulderingRoute(BoulderingRoute object) {
			return createBoulderingRouteAdapter();
		}

		@Override
		public Adapter caseGridBasePoint(GridBasePoint object) {
			return createGridBasePointAdapter();
		}

		@Override
		public Adapter caseHold(Hold object) {
			return createHoldAdapter();
		}

		@Override
		public Adapter caseRouteStatement(RouteStatement object) {
			return createRouteStatementAdapter();
		}

		@Override
		public Adapter caseGrade(Grade object) {
			return createGradeAdapter();
		}

		@Override
		public Adapter caseIdentifier(Identifier object) {
			return createIdentifierAdapter();
		}

		@Override
		public Adapter caseExpr(Expr object) {
			return createExprAdapter();
		}

		@Override
		public Adapter casex(x object) {
			return createxAdapter();
		}

		@Override
		public Adapter casey(y object) {
			return createyAdapter();
		}

		@Override
		public Adapter casestring(string object) {
			return createstringAdapter();
		}

		@Override
		public Adapter caseRouteGrade(RouteGrade object) {
			return createRouteGradeAdapter();
		}

		@Override
		public Adapter caseRouteID(RouteID object) {
			return createRouteIDAdapter();
		}

		@Override
		public Adapter caseshape(shape object) {
			return createshapeAdapter();
		}

		@Override
		public Adapter caserotation(rotation object) {
			return createrotationAdapter();
		}

		@Override
		public Adapter caseHoldColour(HoldColour object) {
			return createHoldColourAdapter();
		}

		@Override
		public Adapter casestartinglabels(startinglabels object) {
			return createstartinglabelsAdapter();
		}

		@Override
		public Adapter caseendlabel(endlabel object) {
			return createendlabelAdapter();
		}

		@Override
		public Adapter caseinteger(integer object) {
			return createintegerAdapter();
		}

		@Override
		public Adapter caseHoldRotation(HoldRotation object) {
			return createHoldRotationAdapter();
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
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.BoulderingRoute <em>Bouldering Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.BoulderingRoute
	 * @generated
	 */
	public Adapter createBoulderingRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.GridBasePoint <em>Grid Base Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.GridBasePoint
	 * @generated
	 */
	public Adapter createGridBasePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.Hold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.Hold
	 * @generated
	 */
	public Adapter createHoldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.RouteStatement <em>Route Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.RouteStatement
	 * @generated
	 */
	public Adapter createRouteStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.Grade
	 * @generated
	 */
	public Adapter createGradeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.Expr
	 * @generated
	 */
	public Adapter createExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.x <em>x</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.x
	 * @generated
	 */
	public Adapter createxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.y <em>y</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.y
	 * @generated
	 */
	public Adapter createyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.string <em>string</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.string
	 * @generated
	 */
	public Adapter createstringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.RouteGrade <em>Route Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.RouteGrade
	 * @generated
	 */
	public Adapter createRouteGradeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.RouteID <em>Route ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.RouteID
	 * @generated
	 */
	public Adapter createRouteIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.shape <em>shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.shape
	 * @generated
	 */
	public Adapter createshapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.rotation <em>rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.rotation
	 * @generated
	 */
	public Adapter createrotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.HoldColour <em>Hold Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.HoldColour
	 * @generated
	 */
	public Adapter createHoldColourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.startinglabels <em>startinglabels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.startinglabels
	 * @generated
	 */
	public Adapter createstartinglabelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.endlabel <em>endlabel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.endlabel
	 * @generated
	 */
	public Adapter createendlabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.integer <em>integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.integer
	 * @generated
	 */
	public Adapter createintegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.dsldesign.LaBour.HoldRotation <em>Hold Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.dsldesign.LaBour.HoldRotation
	 * @generated
	 */
	public Adapter createHoldRotationAdapter() {
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

} //LaBourAdapterFactory
