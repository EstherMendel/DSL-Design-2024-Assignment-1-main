/**
 */
package nl.tue.dsldesign.turtle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.turtle.Assignment#getVar <em>Var</em>}</li>
 *   <li>{@link nl.tue.dsldesign.turtle.Assignment#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.turtle.TurtlePackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Statement {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute.
	 * @see #setVar(String)
	 * @see nl.tue.dsldesign.turtle.TurtlePackage#getAssignment_Var()
	 * @model required="true"
	 * @generated
	 */
	String getVar();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.turtle.Assignment#getVar <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' attribute.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(String value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expr)
	 * @see nl.tue.dsldesign.turtle.TurtlePackage#getAssignment_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getExpr();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.turtle.Assignment#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expr value);

} // Assignment
