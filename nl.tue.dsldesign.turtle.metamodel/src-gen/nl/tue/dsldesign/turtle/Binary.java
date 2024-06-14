/**
 */
package nl.tue.dsldesign.turtle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.turtle.Binary#getLeft <em>Left</em>}</li>
 *   <li>{@link nl.tue.dsldesign.turtle.Binary#getRight <em>Right</em>}</li>
 *   <li>{@link nl.tue.dsldesign.turtle.Binary#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.turtle.TurtlePackage#getBinary()
 * @model
 * @generated
 */
public interface Binary extends Expr {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expr)
	 * @see nl.tue.dsldesign.turtle.TurtlePackage#getBinary_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getLeft();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.turtle.Binary#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expr value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expr)
	 * @see nl.tue.dsldesign.turtle.TurtlePackage#getBinary_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getRight();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.turtle.Binary#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expr value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.dsldesign.turtle.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see nl.tue.dsldesign.turtle.Operation
	 * @see #setOperation(Operation)
	 * @see nl.tue.dsldesign.turtle.TurtlePackage#getBinary_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.turtle.Binary#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see nl.tue.dsldesign.turtle.Operation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Binary
