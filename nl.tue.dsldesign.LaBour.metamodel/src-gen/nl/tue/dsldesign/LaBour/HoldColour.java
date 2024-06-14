/**
 */
package nl.tue.dsldesign.LaBour;

import java.lang.Colour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hold Colour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.LaBour.HoldColour#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.LaBour.LaBourPackage#getHoldColour()
 * @model
 * @generated
 */
public interface HoldColour extends Expr {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Colour)
	 * @see nl.tue.dsldesign.LaBour.LaBourPackage#getHoldColour_Value()
	 * @model dataType="nl.tue.dsldesign.LaBour.Colour"
	 * @generated
	 */
	Colour getValue();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.LaBour.HoldColour#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Colour value);

} // HoldColour
