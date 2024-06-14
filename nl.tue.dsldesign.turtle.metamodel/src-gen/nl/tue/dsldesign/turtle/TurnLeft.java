/**
 */
package nl.tue.dsldesign.turtle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Left</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.turtle.TurnLeft#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.turtle.TurtlePackage#getTurnLeft()
 * @model
 * @generated
 */
public interface TurnLeft extends Statement {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expr)
	 * @see nl.tue.dsldesign.turtle.TurtlePackage#getTurnLeft_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getExpr();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.turtle.TurnLeft#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expr value);

} // TurnLeft
