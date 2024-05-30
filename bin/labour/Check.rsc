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
 
 //booleans describing different requirements
 //constraints
 bool betweenZeroAndTwoStartHolds = true;
 bool hasSameColor = true;
 bool allHoldsAreValid = true;
 bool colorsAreValid = true;
 bool holdRotationBetween0And359 = true;
 bool noMoreThanTwoStartLabelStripsPerHold = true;
 
 //requirements
 bool atLeastTwoHolds = false;
 bool hasGrade = false;
 bool hasGridBasePoint = false;
 bool hasIdentifier = false;
 bool gridBasePointIsValid = false;
 bool hasEndHold = false;
 
 int counterX = 0;
 int counterY = 0;
 
 bool hasX = false;
 bool hasY = false;
 bool hasShape = false;
 bool hasRotation = false;
 bool hasColor = false;
 
 //extra requirements not specified in the doc, but do make sense
 //these were made in consultation with the teacher
 //as of course, it makes no sense for there to be multiple of these in a route
 bool maxOneGrade = true;
 bool maxOneGbp = true;
 bool maxOneId = true;
 bool maxOneHoldList = true;
 
 int no_grades = 0;
 int no_gbps = 0;
 int no_ids = 0;
 int no_holdlists = 0;
 
 
 //used to check for same colors
 list[AColor] colors = [];
 
 bool checkBoulderRouteConfiguration(ABoulderingRoute thing)
 {
 	//if any of the bools that are true become false, you can instantly return false and print out why
 	//at the end we check the conjunction of the remaining ones and print out if any are false and why
 	atLeastTwoHolds = false;
 	betweenZeroAndTwoStartHolds = true;//
 	hasGrade = false;//
 	hasGridBasePoint = false;//
 	hasIdentifier = false;//
 	gridBasePointIsValid = false;
 	noMoreThanTwoStartLabelStripsPerHold = true;
 	hasEndHold = false;//
 	hasSameColor = true;
 	colorsAreValid = true;
 	holdRotationBetween0And359 = true;
 	colors=[];
 	
 	holdCounter = 0;
 	startHoldCounter = 0;
 	startLabelCounter = 0;
 	
 	colors=[];
 	
 	no_grades = 0;
 	no_gbps = 0;
	no_ids = 0;
	no_holdlists = 0;
 	
 	//go over each property
 	for (prop <- thing.aproperties) {
 		switch(prop) {
 		case grade(str s):
        {
        	//set to true if route has grade
        	hasGrade = true;
        	no_grades = no_grades + 1;
        }
        case gridBasePoint(AGridBasePoint point):
        {
        	//set to true if route has gridbasepoint
        	hasGridBasePoint = true;
        	//check holdproperty requirement
        	checkGridBasePointConfiguration(point);
        	//checkGridBasePointConfiguration(point);
        	no_gbps = no_gbps + 1;
        }
        case identifier(AId id):
        {
        	//set to true if route has identifier
        	hasIdentifier = true;
        	no_ids = no_ids + 1;
        }
        case holdlist(list[AHold] holds):
        {
        	//check each hold's requirements
        	checkHoldPropertiesConfiguration(holds);
        	no_holdlists = no_holdlists + 1;
        }
        
 		default:
 			throw "Unexpected Route_property: <prop>";
 		}
 	}
    
    //conclusions on the booleans
    
    //check if there are at least two different holds
 	if(holdCounter >= 2)
 	{
 		atLeastTwoHolds = true;
 	}
 	else
 	{
		atLeastTwoHolds = false;
 		print("Your route has \<2 holds: ");
 		println(holdCounter);
 	}
 	
 	//check if the colors are all the same
 	if (!isEmpty(colors)) {
	 	AColor firstColor = colors[0];
	    for (AColor color <- colors) {
	        if (color != firstColor) {
	            hasSameColor=false;
		 		println("Your route does not have all same colors:");  
		 		println(colors);          
	            break;
	        }
	    }
    }
    
    //check if there are between 0 and 2 start hand placement
 	if (!(0<= startHoldCounter && startHoldCounter <= 2))
 	{
 		betweenZeroAndTwoStartHolds = false;
 		println("Your route has \<0 or \>2 start holds");
 	}
 	
 	//check if there are at most 2 start labels
 	if(startLabelCounter > 2)
 	{
 		println("Your route has \>2 start labels");
 		noMoreThanTwoStartLabelStripsPerHold = false;
 	}
 	
 	//check if there is an end hold 	
 	if(!hasEndHold) {
 		println("Your route has no end hold");
 	}
 	
 	//check if there is an identifier
 	if(!hasIdentifier) {
 		println("Your route has no identifier");
 	}
 	
 	//check if there is a gridbasepoint
 	if(!hasGridBasePoint) {
 		println("Your route has no grid base point");
 	}
 	
 	//check if there is a grade
 	if(!hasGrade) {
 		println("Your route has no grade");
 	}
 	
 	if(no_grades > 1)
 	{
 		println("Your route has multiple grades");
 		maxOneGrade = false;
 	}
 	if(no_gbps > 1)
 	{
 		println("Your route has multiple grid base points");
 		maxOneGbp = false;
 	}
 	if(no_ids > 1)
 	{
 		println("Your route has multiple ids");
 		maxOneId = false;
 	}
 	if(no_holdlists > 1)
 	{
 		println("Your route has multiple hold lists");
 		maxOneHoldList = false;
 	}
    
    //return the combination of all statements, if not all are true, the input is invalid and false will be returned
 	return atLeastTwoHolds && betweenZeroAndTwoStartHolds 
 	&& hasGrade && hasGridBasePoint && hasIdentifier 
 	&& noMoreThanTwoStartLabelStripsPerHold 
 	&& hasEndHold && hasSameColor && allHoldsAreValid && gridBasePointIsValid && colorsAreValid && holdRotationBetween0And359;
 
 }

//check if gridbasepoint has x and y
bool checkGridBasePointConfiguration(AGridBasePoint point)
 {
 	counterX =0;
 	counterY=0;
 	
	for (coord <- point.coords) {
		switch(coord) {
			case x(int i): {
				counterX += 1;
			}
			case y(int j): {
 				counterY+=1;
			}
			default:
				throw "Unexpected gridbasepoint: <coord>";
		}
	}
	gridBasePointIsValid = (counterX == 1) && (counterY==1);
	if (!gridBasePointIsValid) {
		println("your gridbasepoint does not have exactly 1 x and 1 y");
	}
 	return true;
 }

//checks the holdlist
bool checkHoldPropertiesConfiguration(list[AHold] holds)
 {
 	//go over each hold
 	for (hold <- holds) {
 		//booleans for aspects that need to be checked for each separate hold
 		hasX = false;
		hasY = false;
		hasShape = false;
		hasRotation = false;
		hasColor = false;
		
 		holdCounter = holdCounter + 1;
 		//check the properties of the hold
 		checkHoldPropertyConfiguration(hold);
 		
 		if (!hasX) {
 			print("Your hold ");
 			print(hold);
 			println(" does not have an x");
		}
		if (!hasY) {
 			print("Your hold ");
 			print(hold);
 			println(" does not have a y");
		}
		if (!hasShape) {
 			print("Your hold ");
 			print(hold);
 			println(" does not have a shape");
		}
		if (!hasRotation) {
 			print("Your hold ");
 			print(hold);
 			println(" does not have a rotation");
		}
		if (!hasColor) {
 			print("Your hold ");
 			print(hold);
 			println(" does not have a color");
		}
		
		//if any hold is not correct, not all holds are valid, which should affect the final return
		if (!(hasX && hasY && hasShape && hasRotation && hasColor)) {
			allHoldsAreValid = false;
		}
 	}
 	
 	return true;
 }
 
//checks an individualhold
bool checkHoldPropertyConfiguration(AHold thing)
 {
 	for (expr <- thing.expressions) {
 		switch(expr) {
 		case x(int i):
        {
        	//check if it has an X
        	hasX = true;
        }
        case y(int i):
        {
        	//check if it has a Y
        	hasY = true;
        }
        case shape(AId s):
        {
        	hasShape = true;
        }
        case rotation(int r):
        {
        	hasRotation = true;
        	if (r < 0 || r > 359) {
            	hasValidRotation = false;
            	println("Your hold ");
            	println(thing);
            	println(" does not have the right rotation");
        	};
        }
        case color(AColor c):
        {
        	hasColor= true;
        	colors += [c];
        }
        case startingLabels(int i):
        {
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