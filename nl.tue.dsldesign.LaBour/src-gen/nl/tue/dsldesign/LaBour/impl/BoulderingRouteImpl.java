/**
 */
package nl.tue.dsldesign.LaBour.impl;

import java.util.Collection;

import nl.tue.dsldesign.LaBour.BoulderingRoute;
import nl.tue.dsldesign.LaBour.LaBourPackage;
import nl.tue.dsldesign.LaBour.RouteStatement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bouldering Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.LaBour.impl.BoulderingRouteImpl#getRoutestatement <em>Routestatement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoulderingRouteImpl extends MinimalEObjectImpl.Container implements BoulderingRoute {
	/**
	 * The cached value of the '{@link #getRoutestatement() <em>Routestatement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutestatement()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteStatement> routestatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoulderingRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaBourPackage.Literals.BOULDERING_ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteStatement> getRoutestatement() {
		if (routestatement == null) {
			routestatement = new EObjectContainmentEList<RouteStatement>(RouteStatement.class, this,
					LaBourPackage.BOULDERING_ROUTE__ROUTESTATEMENT);
		}
		return routestatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LaBourPackage.BOULDERING_ROUTE__ROUTESTATEMENT:
			return ((InternalEList<?>) getRoutestatement()).basicRemove(otherEnd, msgs);
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
		case LaBourPackage.BOULDERING_ROUTE__ROUTESTATEMENT:
			return getRoutestatement();
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
		case LaBourPackage.BOULDERING_ROUTE__ROUTESTATEMENT:
			getRoutestatement().clear();
			getRoutestatement().addAll((Collection<? extends RouteStatement>) newValue);
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
		case LaBourPackage.BOULDERING_ROUTE__ROUTESTATEMENT:
			getRoutestatement().clear();
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
		case LaBourPackage.BOULDERING_ROUTE__ROUTESTATEMENT:
			return routestatement != null && !routestatement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoulderingRouteImpl
