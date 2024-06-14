/**
 */
package nl.tue.dsldesign.LaBour;

import java.lang.Angle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hold Rotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.LaBour.HoldRotation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.LaBour.LaBourPackage#getHoldRotation()
 * @model
 * @generated
 */
public interface HoldRotation extends Expr {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Angle)
	 * @see nl.tue.dsldesign.LaBour.LaBourPackage#getHoldRotation_Value()
	 * @model dataType="nl.tue.dsldesign.LaBour.Angle"
	 * @generated
	 */
	Angle getValue();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.LaBour.HoldRotation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Angle value);

} // HoldRotation
