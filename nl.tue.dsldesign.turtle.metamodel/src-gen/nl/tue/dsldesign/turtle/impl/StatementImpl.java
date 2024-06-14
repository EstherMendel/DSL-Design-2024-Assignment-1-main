/**
 */
package nl.tue.dsldesign.turtle.impl;

import nl.tue.dsldesign.turtle.Statement;
import nl.tue.dsldesign.turtle.TurtlePackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StatementImpl extends MinimalEObjectImpl.Container implements Statement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlePackage.Literals.STATEMENT;
	}

} //StatementImpl
