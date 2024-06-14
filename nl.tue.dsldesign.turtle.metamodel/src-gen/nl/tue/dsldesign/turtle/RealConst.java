/**
 */
package nl.tue.dsldesign.turtle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Const</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.turtle.RealConst#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.turtle.TurtlePackage#getRealConst()
 * @model
 * @generated
 */
public interface RealConst extends Expr {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see nl.tue.dsldesign.turtle.TurtlePackage#getRealConst_Value()
	 * @model required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.turtle.RealConst#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // RealConst
