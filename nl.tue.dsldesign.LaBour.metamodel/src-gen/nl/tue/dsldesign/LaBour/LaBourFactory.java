/**
 */
package nl.tue.dsldesign.LaBour;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.tue.dsldesign.LaBour.LaBourPackage
 * @generated
 */
public interface LaBourFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaBourFactory eINSTANCE = nl.tue.dsldesign.LaBour.impl.LaBourFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bouldering Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bouldering Route</em>'.
	 * @generated
	 */
	BoulderingRoute createBoulderingRoute();

	/**
	 * Returns a new object of class '<em>Grid Base Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Base Point</em>'.
	 * @generated
	 */
	GridBasePoint createGridBasePoint();

	/**
	 * Returns a new object of class '<em>Hold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hold</em>'.
	 * @generated
	 */
	Hold createHold();

	/**
	 * Returns a new object of class '<em>Grade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grade</em>'.
	 * @generated
	 */
	Grade createGrade();

	/**
	 * Returns a new object of class '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier</em>'.
	 * @generated
	 */
	Identifier createIdentifier();

	/**
	 * Returns a new object of class '<em>x</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>x</em>'.
	 * @generated
	 */
	x createx();

	/**
	 * Returns a new object of class '<em>y</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>y</em>'.
	 * @generated
	 */
	y createy();

	/**
	 * Returns a new object of class '<em>Route Grade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Grade</em>'.
	 * @generated
	 */
	RouteGrade createRouteGrade();

	/**
	 * Returns a new object of class '<em>Route ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route ID</em>'.
	 * @generated
	 */
	RouteID createRouteID();

	/**
	 * Returns a new object of class '<em>shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>shape</em>'.
	 * @generated
	 */
	shape createshape();

	/**
	 * Returns a new object of class '<em>rotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>rotation</em>'.
	 * @generated
	 */
	rotation createrotation();

	/**
	 * Returns a new object of class '<em>Hold Colour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hold Colour</em>'.
	 * @generated
	 */
	HoldColour createHoldColour();

	/**
	 * Returns a new object of class '<em>startinglabels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>startinglabels</em>'.
	 * @generated
	 */
	startinglabels createstartinglabels();

	/**
	 * Returns a new object of class '<em>endlabel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>endlabel</em>'.
	 * @generated
	 */
	endlabel createendlabel();

	/**
	 * Returns a new object of class '<em>Hold Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hold Rotation</em>'.
	 * @generated
	 */
	HoldRotation createHoldRotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LaBourPackage getLaBourPackage();

} //LaBourFactory
