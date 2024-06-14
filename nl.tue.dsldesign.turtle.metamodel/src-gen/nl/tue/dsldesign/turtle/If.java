/**
 */
package nl.tue.dsldesign.turtle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.turtle.If#getCond <em>Cond</em>}</li>
 *   <li>{@link nl.tue.dsldesign.turtle.If#getThen <em>Then</em>}</li>
 *   <li>{@link nl.tue.dsldesign.turtle.If#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.turtle.TurtlePackage#getIf()
 * @model
 * @generated
 */
public interface If extends Statement {
	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(Expr)
	 * @see nl.tue.dsldesign.turtle.TurtlePackage#getIf_Cond()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getCond();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.turtle.If#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Expr value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.dsldesign.turtle.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference list.
	 * @see nl.tue.dsldesign.turtle.TurtlePackage#getIf_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statement> getThen();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.dsldesign.turtle.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference list.
	 * @see nl.tue.dsldesign.turtle.TurtlePackage#getIf_Else()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getElse();

} // If
