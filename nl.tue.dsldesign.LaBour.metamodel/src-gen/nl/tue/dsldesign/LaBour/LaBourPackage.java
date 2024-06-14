/**
 */
package nl.tue.dsldesign.LaBour;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.tue.dsldesign.LaBour.LaBourFactory
 * @model kind="package"
 * @generated
 */
public interface LaBourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LaBour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/LaBour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LaBour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaBourPackage eINSTANCE = nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl.init();

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.BoulderingRouteImpl <em>Bouldering Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.BoulderingRouteImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getBoulderingRoute()
	 * @generated
	 */
	int BOULDERING_ROUTE = 0;

	/**
	 * The feature id for the '<em><b>Routestatement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_ROUTE__ROUTESTATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Bouldering Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bouldering Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.RouteStatementImpl <em>Route Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.RouteStatementImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getRouteStatement()
	 * @generated
	 */
	int ROUTE_STATEMENT = 3;

	/**
	 * The number of structural features of the '<em>Route Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Route Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.GridBasePointImpl <em>Grid Base Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.GridBasePointImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getGridBasePoint()
	 * @generated
	 */
	int GRID_BASE_POINT = 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BASE_POINT__EXPR = ROUTE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grid Base Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BASE_POINT_FEATURE_COUNT = ROUTE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Grid Base Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BASE_POINT_OPERATION_COUNT = ROUTE_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.HoldImpl <em>Hold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.HoldImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getHold()
	 * @generated
	 */
	int HOLD = 2;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__EXPR = ROUTE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_FEATURE_COUNT = ROUTE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_OPERATION_COUNT = ROUTE_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.GradeImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 4;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__EXPR = ROUTE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = ROUTE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_OPERATION_COUNT = ROUTE_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.IdentifierImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__EXPR = ROUTE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = ROUTE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = ROUTE_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.ExprImpl <em>Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.ExprImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getExpr()
	 * @generated
	 */
	int EXPR = 6;

	/**
	 * The number of structural features of the '<em>Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.integerImpl <em>integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.integerImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getinteger()
	 * @generated
	 */
	int INTEGER = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.xImpl <em>x</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.xImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getx()
	 * @generated
	 */
	int X = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__VALUE = INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>x</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>x</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.yImpl <em>y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.yImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#gety()
	 * @generated
	 */
	int Y = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y__VALUE = INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.stringImpl <em>string</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.stringImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getstring()
	 * @generated
	 */
	int STRING = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__VALUE = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>string</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>string</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.RouteGradeImpl <em>Route Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.RouteGradeImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getRouteGrade()
	 * @generated
	 */
	int ROUTE_GRADE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_GRADE__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Route Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_GRADE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Route Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_GRADE_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.RouteIDImpl <em>Route ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.RouteIDImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getRouteID()
	 * @generated
	 */
	int ROUTE_ID = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ID__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Route ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ID_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Route ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ID_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.shapeImpl <em>shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.shapeImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getshape()
	 * @generated
	 */
	int SHAPE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.rotationImpl <em>rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.rotationImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getrotation()
	 * @generated
	 */
	int ROTATION = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__VALUE = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.HoldColourImpl <em>Hold Colour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.HoldColourImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getHoldColour()
	 * @generated
	 */
	int HOLD_COLOUR = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_COLOUR__VALUE = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hold Colour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_COLOUR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hold Colour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_COLOUR_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.startinglabelsImpl <em>startinglabels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.startinglabelsImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getstartinglabels()
	 * @generated
	 */
	int STARTINGLABELS = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTINGLABELS__VALUE = INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>startinglabels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTINGLABELS_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>startinglabels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTINGLABELS_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.endlabelImpl <em>endlabel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.endlabelImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getendlabel()
	 * @generated
	 */
	int ENDLABEL = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDLABEL__VALUE = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>endlabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDLABEL_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>endlabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDLABEL_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.dsldesign.LaBour.impl.HoldRotationImpl <em>Hold Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.dsldesign.LaBour.impl.HoldRotationImpl
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getHoldRotation()
	 * @generated
	 */
	int HOLD_ROTATION = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_ROTATION__VALUE = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hold Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_ROTATION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hold Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_ROTATION_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Colour</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Colour
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getColour()
	 * @generated
	 */
	int COLOUR = 19;

	/**
	 * The meta object id for the '<em>Angle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Angle
	 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getAngle()
	 * @generated
	 */
	int ANGLE = 20;

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.BoulderingRoute <em>Bouldering Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouldering Route</em>'.
	 * @see nl.tue.dsldesign.LaBour.BoulderingRoute
	 * @generated
	 */
	EClass getBoulderingRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.dsldesign.LaBour.BoulderingRoute#getRoutestatement <em>Routestatement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routestatement</em>'.
	 * @see nl.tue.dsldesign.LaBour.BoulderingRoute#getRoutestatement()
	 * @see #getBoulderingRoute()
	 * @generated
	 */
	EReference getBoulderingRoute_Routestatement();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.GridBasePoint <em>Grid Base Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Base Point</em>'.
	 * @see nl.tue.dsldesign.LaBour.GridBasePoint
	 * @generated
	 */
	EClass getGridBasePoint();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.dsldesign.LaBour.GridBasePoint#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expr</em>'.
	 * @see nl.tue.dsldesign.LaBour.GridBasePoint#getExpr()
	 * @see #getGridBasePoint()
	 * @generated
	 */
	EReference getGridBasePoint_Expr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.Hold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hold</em>'.
	 * @see nl.tue.dsldesign.LaBour.Hold
	 * @generated
	 */
	EClass getHold();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.dsldesign.LaBour.Hold#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expr</em>'.
	 * @see nl.tue.dsldesign.LaBour.Hold#getExpr()
	 * @see #getHold()
	 * @generated
	 */
	EReference getHold_Expr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.RouteStatement <em>Route Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Statement</em>'.
	 * @see nl.tue.dsldesign.LaBour.RouteStatement
	 * @generated
	 */
	EClass getRouteStatement();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see nl.tue.dsldesign.LaBour.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.dsldesign.LaBour.Grade#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see nl.tue.dsldesign.LaBour.Grade#getExpr()
	 * @see #getGrade()
	 * @generated
	 */
	EReference getGrade_Expr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see nl.tue.dsldesign.LaBour.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.dsldesign.LaBour.Identifier#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see nl.tue.dsldesign.LaBour.Identifier#getExpr()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Expr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr</em>'.
	 * @see nl.tue.dsldesign.LaBour.Expr
	 * @generated
	 */
	EClass getExpr();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.x <em>x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>x</em>'.
	 * @see nl.tue.dsldesign.LaBour.x
	 * @generated
	 */
	EClass getx();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.y <em>y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>y</em>'.
	 * @see nl.tue.dsldesign.LaBour.y
	 * @generated
	 */
	EClass gety();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.string <em>string</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>string</em>'.
	 * @see nl.tue.dsldesign.LaBour.string
	 * @generated
	 */
	EClass getstring();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.dsldesign.LaBour.string#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.dsldesign.LaBour.string#getValue()
	 * @see #getstring()
	 * @generated
	 */
	EAttribute getstring_Value();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.RouteGrade <em>Route Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Grade</em>'.
	 * @see nl.tue.dsldesign.LaBour.RouteGrade
	 * @generated
	 */
	EClass getRouteGrade();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.RouteID <em>Route ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route ID</em>'.
	 * @see nl.tue.dsldesign.LaBour.RouteID
	 * @generated
	 */
	EClass getRouteID();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.shape <em>shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>shape</em>'.
	 * @see nl.tue.dsldesign.LaBour.shape
	 * @generated
	 */
	EClass getshape();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.rotation <em>rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>rotation</em>'.
	 * @see nl.tue.dsldesign.LaBour.rotation
	 * @generated
	 */
	EClass getrotation();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.dsldesign.LaBour.rotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.dsldesign.LaBour.rotation#getValue()
	 * @see #getrotation()
	 * @generated
	 */
	EAttribute getrotation_Value();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.HoldColour <em>Hold Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hold Colour</em>'.
	 * @see nl.tue.dsldesign.LaBour.HoldColour
	 * @generated
	 */
	EClass getHoldColour();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.dsldesign.LaBour.HoldColour#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.dsldesign.LaBour.HoldColour#getValue()
	 * @see #getHoldColour()
	 * @generated
	 */
	EAttribute getHoldColour_Value();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.startinglabels <em>startinglabels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>startinglabels</em>'.
	 * @see nl.tue.dsldesign.LaBour.startinglabels
	 * @generated
	 */
	EClass getstartinglabels();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.endlabel <em>endlabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>endlabel</em>'.
	 * @see nl.tue.dsldesign.LaBour.endlabel
	 * @generated
	 */
	EClass getendlabel();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.dsldesign.LaBour.endlabel#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.dsldesign.LaBour.endlabel#isValue()
	 * @see #getendlabel()
	 * @generated
	 */
	EAttribute getendlabel_Value();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.integer <em>integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>integer</em>'.
	 * @see nl.tue.dsldesign.LaBour.integer
	 * @generated
	 */
	EClass getinteger();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.dsldesign.LaBour.integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.dsldesign.LaBour.integer#getValue()
	 * @see #getinteger()
	 * @generated
	 */
	EAttribute getinteger_Value();

	/**
	 * Returns the meta object for class '{@link nl.tue.dsldesign.LaBour.HoldRotation <em>Hold Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hold Rotation</em>'.
	 * @see nl.tue.dsldesign.LaBour.HoldRotation
	 * @generated
	 */
	EClass getHoldRotation();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.dsldesign.LaBour.HoldRotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.tue.dsldesign.LaBour.HoldRotation#getValue()
	 * @see #getHoldRotation()
	 * @generated
	 */
	EAttribute getHoldRotation_Value();

	/**
	 * Returns the meta object for data type '{@link java.lang.Colour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Colour</em>'.
	 * @see java.lang.Colour
	 * @model instanceClass="java.lang.Colour"
	 * @generated
	 */
	EDataType getColour();

	/**
	 * Returns the meta object for data type '{@link java.lang.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle</em>'.
	 * @see java.lang.Angle
	 * @model instanceClass="java.lang.Angle"
	 * @generated
	 */
	EDataType getAngle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LaBourFactory getLaBourFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.BoulderingRouteImpl <em>Bouldering Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.BoulderingRouteImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getBoulderingRoute()
		 * @generated
		 */
		EClass BOULDERING_ROUTE = eINSTANCE.getBoulderingRoute();

		/**
		 * The meta object literal for the '<em><b>Routestatement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOULDERING_ROUTE__ROUTESTATEMENT = eINSTANCE.getBoulderingRoute_Routestatement();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.GridBasePointImpl <em>Grid Base Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.GridBasePointImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getGridBasePoint()
		 * @generated
		 */
		EClass GRID_BASE_POINT = eINSTANCE.getGridBasePoint();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_BASE_POINT__EXPR = eINSTANCE.getGridBasePoint_Expr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.HoldImpl <em>Hold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.HoldImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getHold()
		 * @generated
		 */
		EClass HOLD = eINSTANCE.getHold();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOLD__EXPR = eINSTANCE.getHold_Expr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.RouteStatementImpl <em>Route Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.RouteStatementImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getRouteStatement()
		 * @generated
		 */
		EClass ROUTE_STATEMENT = eINSTANCE.getRouteStatement();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.GradeImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE__EXPR = eINSTANCE.getGrade_Expr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.IdentifierImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__EXPR = eINSTANCE.getIdentifier_Expr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.ExprImpl <em>Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.ExprImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getExpr()
		 * @generated
		 */
		EClass EXPR = eINSTANCE.getExpr();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.xImpl <em>x</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.xImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getx()
		 * @generated
		 */
		EClass X = eINSTANCE.getx();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.yImpl <em>y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.yImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#gety()
		 * @generated
		 */
		EClass Y = eINSTANCE.gety();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.stringImpl <em>string</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.stringImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getstring()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getstring();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__VALUE = eINSTANCE.getstring_Value();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.RouteGradeImpl <em>Route Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.RouteGradeImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getRouteGrade()
		 * @generated
		 */
		EClass ROUTE_GRADE = eINSTANCE.getRouteGrade();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.RouteIDImpl <em>Route ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.RouteIDImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getRouteID()
		 * @generated
		 */
		EClass ROUTE_ID = eINSTANCE.getRouteID();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.shapeImpl <em>shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.shapeImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getshape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getshape();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.rotationImpl <em>rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.rotationImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getrotation()
		 * @generated
		 */
		EClass ROTATION = eINSTANCE.getrotation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__VALUE = eINSTANCE.getrotation_Value();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.HoldColourImpl <em>Hold Colour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.HoldColourImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getHoldColour()
		 * @generated
		 */
		EClass HOLD_COLOUR = eINSTANCE.getHoldColour();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD_COLOUR__VALUE = eINSTANCE.getHoldColour_Value();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.startinglabelsImpl <em>startinglabels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.startinglabelsImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getstartinglabels()
		 * @generated
		 */
		EClass STARTINGLABELS = eINSTANCE.getstartinglabels();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.endlabelImpl <em>endlabel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.endlabelImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getendlabel()
		 * @generated
		 */
		EClass ENDLABEL = eINSTANCE.getendlabel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDLABEL__VALUE = eINSTANCE.getendlabel_Value();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.integerImpl <em>integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.integerImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getinteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getinteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getinteger_Value();

		/**
		 * The meta object literal for the '{@link nl.tue.dsldesign.LaBour.impl.HoldRotationImpl <em>Hold Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.dsldesign.LaBour.impl.HoldRotationImpl
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getHoldRotation()
		 * @generated
		 */
		EClass HOLD_ROTATION = eINSTANCE.getHoldRotation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD_ROTATION__VALUE = eINSTANCE.getHoldRotation_Value();

		/**
		 * The meta object literal for the '<em>Colour</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Colour
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getColour()
		 * @generated
		 */
		EDataType COLOUR = eINSTANCE.getColour();

		/**
		 * The meta object literal for the '<em>Angle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Angle
		 * @see nl.tue.dsldesign.LaBour.impl.LaBourPackageImpl#getAngle()
		 * @generated
		 */
		EDataType ANGLE = eINSTANCE.getAngle();

	}

} //LaBourPackage
