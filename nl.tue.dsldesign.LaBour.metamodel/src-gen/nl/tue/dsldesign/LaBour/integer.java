/**
 */
package nl.tue.dsldesign.LaBour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.LaBour.integer#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.LaBour.LaBourPackage#getinteger()
 * @model abstract="true"
 * @generated
 */
public interface integer extends Expr {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see nl.tue.dsldesign.LaBour.LaBourPackage#getinteger_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.LaBour.integer#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // integer
