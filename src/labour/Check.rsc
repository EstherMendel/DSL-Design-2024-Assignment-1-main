module labour::Check

import labour::AST;

import IO;
import List;

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
 bool checkBoulderRouteConfiguration(thing)
 {
 	return true;
 }

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
 * testtesttest
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