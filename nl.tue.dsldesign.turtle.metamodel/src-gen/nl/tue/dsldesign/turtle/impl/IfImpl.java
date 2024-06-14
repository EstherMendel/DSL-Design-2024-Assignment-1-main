/**
 */
package nl.tue.dsldesign.turtle.impl;

import java.util.Collection;

import nl.tue.dsldesign.turtle.Expr;
import nl.tue.dsldesign.turtle.If;
import nl.tue.dsldesign.turtle.Statement;
import nl.tue.dsldesign.turtle.TurtlePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.turtle.impl.IfImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link nl.tue.dsldesign.turtle.impl.IfImpl#getThen <em>Then</em>}</li>
 *   <li>{@link nl.tue.dsldesign.turtle.impl.IfImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends StatementImpl implements If {
	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected Expr cond;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlePackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expr getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCond(Expr newCond, NotificationChain msgs) {
		Expr oldCond = cond;
		cond = newCond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurtlePackage.IF__COND,
					oldCond, newCond);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond(Expr newCond) {
		if (newCond != cond) {
			NotificationChain msgs = null;
			if (cond != null)
				msgs = ((InternalEObject) cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurtlePackage.IF__COND,
						null, msgs);
			if (newCond != null)
				msgs = ((InternalEObject) newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurtlePackage.IF__COND,
						null, msgs);
			msgs = basicSetCond(newCond, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlePackage.IF__COND, newCond, newCond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getThen() {
		if (then == null) {
			then = new EObjectContainmentEList<Statement>(Statement.class, this, TurtlePackage.IF__THEN);
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getElse() {
		if (else_ == null) {
			else_ = new EObjectContainmentEList<Statement>(Statement.class, this, TurtlePackage.IF__ELSE);
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TurtlePackage.IF__COND:
			return basicSetCond(null, msgs);
		case TurtlePackage.IF__THEN:
			return ((InternalEList<?>) getThen()).basicRemove(otherEnd, msgs);
		case TurtlePackage.IF__ELSE:
			return ((InternalEList<?>) getElse()).basicRemove(otherEnd, msgs);
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
		case TurtlePackage.IF__COND:
			return getCond();
		case TurtlePackage.IF__THEN:
			return getThen();
		case TurtlePackage.IF__ELSE:
			return getElse();
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
		case TurtlePackage.IF__COND:
			setCond((Expr) newValue);
			return;
		case TurtlePackage.IF__THEN:
			getThen().clear();
			getThen().addAll((Collection<? extends Statement>) newValue);
			return;
		case TurtlePackage.IF__ELSE:
			getElse().clear();
			getElse().addAll((Collection<? extends Statement>) newValue);
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
		case TurtlePackage.IF__COND:
			setCond((Expr) null);
			return;
		case TurtlePackage.IF__THEN:
			getThen().clear();
			return;
		case TurtlePackage.IF__ELSE:
			getElse().clear();
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
		case TurtlePackage.IF__COND:
			return cond != null;
		case TurtlePackage.IF__THEN:
			return then != null && !then.isEmpty();
		case TurtlePackage.IF__ELSE:
			return else_ != null && !else_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
