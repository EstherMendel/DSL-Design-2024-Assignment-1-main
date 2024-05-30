module labour::Check

import labour::AST;

import ParseTree;
import IO;
import List;
import Message;

void hello()
{
	println("Hello world from ancient proprietary course software no. 36!");
}

/*
 * -Implement a well-formedness checker for the LaBouR language. For this you must use the AST. 
 * - Hint: Map regular CST arguments (e.g., *, +, ?) to lists 
 * - Hint: Map lexical nodes to Rascal primitive types (bool, int, str)
 * - Hint: Use switch to do case distinction with concrete patterns
 */

 /*
 * Create a function called checkBoulderRouteConfiguration(...), which is responsible for calling all the required functions that check the program's well-formedness as described in the PDF (Section 2.2.) 
 * This function takes as a parameter the program's AST and returns true if the program is well-formed or false otherwise.
 */
 
 int holdCounter = 0;
 int startHoldCounter = 0;
 int startLabelCounter = 0;
 
 //beware of a massive block of booleans
 bool atLeastTwoHolds = false;
 bool betweenZeroAndTwoStartHolds = true;
 bool hasGrade = false;
 //we do not check wether there is only 1 gbp
 bool hasGridBasePoint = false;
 bool hasIdentifier = false;
 //combined one for x and y
 bool gridBasePointIsValid = false;
 bool noMoreThanTwoStartLabelStripsPerHold = true;
 bool maxTwoStartLabelStrips = true;
 bool hasEndHold = false;
 bool hasSameColor = true;
 //combined one for x,y, etc.
 bool allHoldsAreValid = true;
 //this one CAN'T be false as it is enforced in the CST2AST
 bool colorsAreValid = true;
 bool holdRotationBetween0And359 = true;
 
 list[AColor] colors = [];
 
 bool checkBoulderRouteConfiguration(ABoulderingRoute thing)
 {
 	//if any of the bools that are true become false, you can instantly return false and print out why
 	//at the end we check the conjunction of the remaining ones 
 	atLeastTwoHolds = false;
 	betweenZeroAndTwoStartHolds = true;
 	hasGrade = false;
 	hasGridBasePoint = false;
 	hasIdentifier = false;
 	gridBasePointIsValid = false;
 	noMoreThanTwoStartLabelStripsPerHold = true;
 	maxTwoStartLabelStrips = true;
 	hasEndHold = false;
 	hasSameColor = true;
 	allHoldsAreValid = true;
 	colorsAreValid = true;
 	holdRotationBetween0And359 = true;
 	
 	
 	for (prop <- thing.aproperties) {
 		switch(prop) {
 		case grade(str s):
        {
        	println(s);
        	hasGrade = true;
        }
        case gridBasePoint(AGridBasePoint point):
        {
        	println(point.x);
        	hasGridBasePoint = true;
        }
        case identifier(AId id):
        {
        	println(id);
        	hasIdentifier = true;
        }
        case holdlist(list[AHold] holds):
        {
        	checkHoldPropertiesConfiguration(holds);
        }
        
 		default:
 			throw "Unexpected Route_property: <prop>";
 		}
 	}
 	
 	if (!isEmpty(colors)) {
	 	AColor firstColor = colors[0];
	    for (AColor color <- colors) {
	        if (color != firstColor) {
	            hasSameColor=false;
	            break;
	        }
	    }
    }
 	//a lot of the bools are missing because as said earlier the function exits early if these become false
 	return atLeastTwoHolds && betweenZeroAndTwoStartHolds && hasGrade && hasGridBasePoint && hasGrade && hasGridBasePoint && hasIdentifier && gridBasePointIsValid && noMoreThanTwoStartLabelStripsPerHold && maxTwoStartLabelStrips && hasEndHold && hasSameColor && allHoldsAreValid&& colorsAreValid && holdRotationBetween0And359;
 	
 }

//checks the holdlist
bool checkHoldPropertiesConfiguration(list[AHold] holds)
 {
 	holdCounter = 0;
 	startHoldCounter = 0;
 	startLabelCounter = 0;
 	for (hold <- holds) {
 		holdCounter = holdCounter + 1;
 		checkHoldPropertyConfiguration(hold);
 	}
 	
 	//conclusions on the booleans
 	if(holdCounter >= 2)
 	{
 		atLeastTwoHolds = true;
 	}
 	else
 	{
 		println("<2 holds in route");
 	}
 	if(!(0<= startHoldCounter && startHoldCounter <= 2))
 	{
 		betweenZeroAndTwoStartHolds = false;
 		println("<0 or >2 start holds in route");
 	}
 	if(startLabelCounter > 2)
 	{
 		println("more than 2 start labels in route!");
 		noMoreThanTwoStartLabelStripsPerHold = false;
 	}
 	println(holdCounter);
 	println(startHoldCounter);
 	return true;
 }
 
//checks an individualhold
bool checkHoldPropertyConfiguration(AHold thing)
 {
 	for (expr <- thing.expressions) {
 		switch(expr) {
 		case x(int i):
        {
        	println(i);
        }
        case y(int i):
        {
        	println(i);
        }
        case shape(AId s):
        {
        	println(s);
        }
        case rotation(int r):
        {
        	println(r>0);
        	if (r < 0 || r > 359) {
            	hasValidRotation = false;
        	};
        }
        case color(AColor c):
        {
        	colors += [c];
        }
        case startingLabels(int i):
        {
        	println(i);
        	startHoldCounter = startHoldCounter + 1;
        	startLabelCounter = startLabelCounter + i;
        }
        case endLabel():
        {
        	hasEndHold = true;
        }        
 		default:
 			throw "Unexpected Expressions: <expr>";
 		}
 	}
 	return true;
}
//
//bool checkHoldPropertyConfiguration(AHoldExpr thing)
// {
// 	for (expr <- thing.expressions) {
// 		;
// 	}
// 	return true;
// }

 /*
 * determine between 0 and 2 start holds
 * this is all comment for now, no idea how this is gonna work lmao
 * no clue, I assume the route will be a list but the docs are of course unusable
 * my plan is to match 'start_hold' holds in the list, and just count them
 * so code shown below is completely unrelated lol
 *
 * for (/assign(("start_hold"), Expr is_start_hold) <- route)
 * {
 * 	println("hold is a start hold: <is_start_hold>");
 * }
 *
 * for the second thing I have no clue what they even mean
 *
 * for the singular end hold, I plan the same thing of matching a hold with the end label
 * IMPORTANT: it is not stated here that the start and end holds necessarily need to be at the start and end of the route
 *
 * for the route colour, I will match the first list element, and then just match the rest to that hold's colour
 *
 * idem for having the route colour be valid, we could just use a datatype (e.g. enum) for it tho
 *
 * the hold rotation values are just a match statement
 */
 
/*
* Define a function per each verification defined in the PDF (Section 2.2.)
*/
