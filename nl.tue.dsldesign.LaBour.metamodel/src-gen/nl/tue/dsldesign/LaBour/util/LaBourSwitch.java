/**
 */
package nl.tue.dsldesign.LaBour.util;

import nl.tue.dsldesign.LaBour.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nl.tue.dsldesign.LaBour.LaBourPackage
 * @generated
 */
public class LaBourSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LaBourPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaBourSwitch() {
		if (modelPackage == null) {
			modelPackage = LaBourPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case LaBourPackage.BOULDERING_ROUTE: {
			BoulderingRoute boulderingRoute = (BoulderingRoute) theEObject;
			T result = caseBoulderingRoute(boulderingRoute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.GRID_BASE_POINT: {
			GridBasePoint gridBasePoint = (GridBasePoint) theEObject;
			T result = caseGridBasePoint(gridBasePoint);
			if (result == null)
				result = caseRouteStatement(gridBasePoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.HOLD: {
			Hold hold = (Hold) theEObject;
			T result = caseHold(hold);
			if (result == null)
				result = caseRouteStatement(hold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.ROUTE_STATEMENT: {
			RouteStatement routeStatement = (RouteStatement) theEObject;
			T result = caseRouteStatement(routeStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.GRADE: {
			Grade grade = (Grade) theEObject;
			T result = caseGrade(grade);
			if (result == null)
				result = caseRouteStatement(grade);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.IDENTIFIER: {
			Identifier identifier = (Identifier) theEObject;
			T result = caseIdentifier(identifier);
			if (result == null)
				result = caseRouteStatement(identifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.EXPR: {
			Expr expr = (Expr) theEObject;
			T result = caseExpr(expr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.X: {
			x x = (x) theEObject;
			T result = casex(x);
			if (result == null)
				result = caseinteger(x);
			if (result == null)
				result = caseExpr(x);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.Y: {
			y y = (y) theEObject;
			T result = casey(y);
			if (result == null)
				result = caseinteger(y);
			if (result == null)
				result = caseExpr(y);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.STRING: {
			string string = (string) theEObject;
			T result = casestring(string);
			if (result == null)
				result = caseExpr(string);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.ROUTE_GRADE: {
			RouteGrade routeGrade = (RouteGrade) theEObject;
			T result = caseRouteGrade(routeGrade);
			if (result == null)
				result = casestring(routeGrade);
			if (result == null)
				result = caseExpr(routeGrade);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.ROUTE_ID: {
			RouteID routeID = (RouteID) theEObject;
			T result = caseRouteID(routeID);
			if (result == null)
				result = casestring(routeID);
			if (result == null)
				result = caseExpr(routeID);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.SHAPE: {
			shape shape = (shape) theEObject;
			T result = caseshape(shape);
			if (result == null)
				result = casestring(shape);
			if (result == null)
				result = caseExpr(shape);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.ROTATION: {
			rotation rotation = (rotation) theEObject;
			T result = caserotation(rotation);
			if (result == null)
				result = caseExpr(rotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.HOLD_COLOUR: {
			HoldColour holdColour = (HoldColour) theEObject;
			T result = caseHoldColour(holdColour);
			if (result == null)
				result = caseExpr(holdColour);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.STARTINGLABELS: {
			startinglabels startinglabels = (startinglabels) theEObject;
			T result = casestartinglabels(startinglabels);
			if (result == null)
				result = caseinteger(startinglabels);
			if (result == null)
				result = caseExpr(startinglabels);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.ENDLABEL: {
			endlabel endlabel = (endlabel) theEObject;
			T result = caseendlabel(endlabel);
			if (result == null)
				result = caseExpr(endlabel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.INTEGER: {
			integer integer = (integer) theEObject;
			T result = caseinteger(integer);
			if (result == null)
				result = caseExpr(integer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBourPackage.HOLD_ROTATION: {
			HoldRotation holdRotation = (HoldRotation) theEObject;
			T result = caseHoldRotation(holdRotation);
			if (result == null)
				result = caseExpr(holdRotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bouldering Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bouldering Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoulderingRoute(BoulderingRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Base Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Base Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridBasePoint(GridBasePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHold(Hold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteStatement(RouteStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrade(Grade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpr(Expr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>x</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>x</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casex(x object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>y</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>y</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casey(y object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>string</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>string</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestring(string object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Grade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Grade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteGrade(RouteGrade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteID(RouteID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseshape(shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserotation(rotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hold Colour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hold Colour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoldColour(HoldColour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>startinglabels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>startinglabels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestartinglabels(startinglabels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>endlabel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>endlabel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseendlabel(endlabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinteger(integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hold Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hold Rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoldRotation(HoldRotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LaBourSwitch
