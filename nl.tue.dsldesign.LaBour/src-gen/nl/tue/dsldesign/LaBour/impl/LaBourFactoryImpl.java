/**
 */
package nl.tue.dsldesign.LaBour.impl;

import java.lang.Angle;
import java.lang.Colour;

import nl.tue.dsldesign.LaBour.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaBourFactoryImpl extends EFactoryImpl implements LaBourFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LaBourFactory init() {
		try {
			LaBourFactory theLaBourFactory = (LaBourFactory) EPackage.Registry.INSTANCE
					.getEFactory(LaBourPackage.eNS_URI);
			if (theLaBourFactory != null) {
				return theLaBourFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LaBourFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaBourFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case LaBourPackage.BOULDERING_ROUTE:
			return createBoulderingRoute();
		case LaBourPackage.GRID_BASE_POINT:
			return createGridBasePoint();
		case LaBourPackage.HOLD:
			return createHold();
		case LaBourPackage.GRADE:
			return createGrade();
		case LaBourPackage.IDENTIFIER:
			return createIdentifier();
		case LaBourPackage.X:
			return createx();
		case LaBourPackage.Y:
			return createy();
		case LaBourPackage.ROUTE_GRADE:
			return createRouteGrade();
		case LaBourPackage.ROUTE_ID:
			return createRouteID();
		case LaBourPackage.SHAPE:
			return createshape();
		case LaBourPackage.ROTATION:
			return createrotation();
		case LaBourPackage.HOLD_COLOUR:
			return createHoldColour();
		case LaBourPackage.STARTINGLABELS:
			return createstartinglabels();
		case LaBourPackage.ENDLABEL:
			return createendlabel();
		case LaBourPackage.HOLD_ROTATION:
			return createHoldRotation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case LaBourPackage.COLOUR:
			return createColourFromString(eDataType, initialValue);
		case LaBourPackage.ANGLE:
			return createAngleFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case LaBourPackage.COLOUR:
			return convertColourToString(eDataType, instanceValue);
		case LaBourPackage.ANGLE:
			return convertAngleToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoulderingRoute createBoulderingRoute() {
		BoulderingRouteImpl boulderingRoute = new BoulderingRouteImpl();
		return boulderingRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridBasePoint createGridBasePoint() {
		GridBasePointImpl gridBasePoint = new GridBasePointImpl();
		return gridBasePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hold createHold() {
		HoldImpl hold = new HoldImpl();
		return hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grade createGrade() {
		GradeImpl grade = new GradeImpl();
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public x createx() {
		xImpl x = new xImpl();
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public y createy() {
		yImpl y = new yImpl();
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteGrade createRouteGrade() {
		RouteGradeImpl routeGrade = new RouteGradeImpl();
		return routeGrade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteID createRouteID() {
		RouteIDImpl routeID = new RouteIDImpl();
		return routeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public shape createshape() {
		shapeImpl shape = new shapeImpl();
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public rotation createrotation() {
		rotationImpl rotation = new rotationImpl();
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HoldColour createHoldColour() {
		HoldColourImpl holdColour = new HoldColourImpl();
		return holdColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public startinglabels createstartinglabels() {
		startinglabelsImpl startinglabels = new startinglabelsImpl();
		return startinglabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public endlabel createendlabel() {
		endlabelImpl endlabel = new endlabelImpl();
		return endlabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HoldRotation createHoldRotation() {
		HoldRotationImpl holdRotation = new HoldRotationImpl();
		return holdRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colour createColourFromString(EDataType eDataType, String initialValue) {
		return (Colour) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColourToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angle createAngleFromString(EDataType eDataType, String initialValue) {
		return (Angle) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LaBourPackage getLaBourPackage() {
		return (LaBourPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LaBourPackage getPackage() {
		return LaBourPackage.eINSTANCE;
	}

} //LaBourFactoryImpl
