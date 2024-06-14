/**
 */
package nl.tue.dsldesign.turtle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.turtle.VarRef#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.turtle.TurtlePackage#getVarRef()
 * @model
 * @generated
 */
public interface VarRef extends Expr {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute.
	 * @see #setVar(String)
	 * @see nl.tue.dsldesign.turtle.TurtlePackage#getVarRef_Var()
	 * @model required="true"
	 * @generated
	 */
	String getVar();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.turtle.VarRef#getVar <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' attribute.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(String value);

} // VarRef
