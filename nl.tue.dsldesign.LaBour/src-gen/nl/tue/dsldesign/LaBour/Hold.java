/**
 */
package nl.tue.dsldesign.LaBour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.LaBour.Hold#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.LaBour.LaBourPackage#getHold()
 * @model
 * @generated
 */
public interface Hold extends RouteStatement {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.dsldesign.LaBour.Expr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference list.
	 * @see nl.tue.dsldesign.LaBour.LaBourPackage#getHold_Expr()
	 * @model containment="true" lower="7" upper="7"
	 * @generated
	 */
	EList<Expr> getExpr();

} // Hold
