/**
 */
package nl.tue.dsldesign.LaBour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bouldering Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.LaBour.BoulderingRoute#getRoutestatement <em>Routestatement</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.LaBour.LaBourPackage#getBoulderingRoute()
 * @model
 * @generated
 */
public interface BoulderingRoute extends EObject {
	/**
	 * Returns the value of the '<em><b>Routestatement</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.dsldesign.LaBour.RouteStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routestatement</em>' containment reference list.
	 * @see nl.tue.dsldesign.LaBour.LaBourPackage#getBoulderingRoute_Routestatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<RouteStatement> getRoutestatement();

} // BoulderingRoute
