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
 bool checkBoulderRouteConfiguration(ABoulderingRoute thing)
 {
 	//beware of a massive block of booleans
 	//if any of the bools that are true become false, you can instantly return false and print out why
 	//at the end we check the conjunction of the remaining ones 
 	bool atLeastTwoHolds = false;
 	bool betweenZeroAndTwoStartHolds = true;
 	bool hasGrade = false;
 	//we do not check wether there is only 1 gbp
 	bool hasGridBasePoint = false;
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
 	
 	
 	for (prop <- thing.aproperties) {
 		switch(prop) {
 		case grade(str s):
        {
        	println(s);
        }
        case gridBasePoint(AGridBasePoint point):
        {
        	println(point.x);
        }
        case identifier(AId id):
        {
        	println(id);
        }
        case holdlist(list[AHold] holds):
        {
        	checkHoldPropertiesConfiguration(holds);
        }
        
 		default:
 			throw "Unexpected Route_property: <prop>";
 		}
 	}
 	return true;
 }

bool checkHoldPropertiesConfiguration(list[AHold] holds)
 {
 	for (hold <- holds) {
 		println(hold);
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

/*
* yeah, so like, this is what gets called upon startup
*/
void main()
{
	hello();
	println(checkBoulderRouteConfiguration());
	println(":(");
}