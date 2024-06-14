/**
 */
package nl.tue.dsldesign.LaBour.impl;

import java.util.Collection;

import nl.tue.dsldesign.LaBour.Expr;
import nl.tue.dsldesign.LaBour.GridBasePoint;
import nl.tue.dsldesign.LaBour.LaBourPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Base Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.LaBour.impl.GridBasePointImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridBasePointImpl extends RouteStatementImpl implements GridBasePoint {
	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected EList<Expr> expr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridBasePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaBourPackage.Literals.GRID_BASE_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expr> getExpr() {
		if (expr == null) {
			expr = new EObjectContainmentEList<Expr>(Expr.class, this, LaBourPackage.GRID_BASE_POINT__EXPR);
		}
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LaBourPackage.GRID_BASE_POINT__EXPR:
			return ((InternalEList<?>) getExpr()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LaBourPackage.GRID_BASE_POINT__EXPR:
			return getExpr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LaBourPackage.GRID_BASE_POINT__EXPR:
			getExpr().clear();
			getExpr().addAll((Collection<? extends Expr>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LaBourPackage.GRID_BASE_POINT__EXPR:
			getExpr().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LaBourPackage.GRID_BASE_POINT__EXPR:
			return expr != null && !expr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GridBasePointImpl
