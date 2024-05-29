module labour::CST2AST

import labour::AST;
import labour::Syntax;


/*
 * Implement a mapping from concrete syntax trees (CSTs) to abstract syntax trees (ASTs)
 * Hint: Use switch to do case distinction with concrete patterns
 * Map regular CST arguments (e.g., *, +, ?) to lists
 * Map lexical nodes to Rascal primitive types (bool, int, str)
 */

import ParseTree;

// Function to transform boulderingroute to 
ABoulderingRoute cst2ast(start[BoulderingRoute] sr) {
		appl(_, children) = sr;
		// parse trees vd properties
		for (Tree child <- children)
		{
			//ignore layout
			
			//switch case over the full ting
		}
		BoulderingRoute r = sr.top;
		ABoulderingRoute result = boulderingRoute(toList(r.properties));
		return result;
    }
    
list[ARoute_property] toList(Route_property* properties) {
    return [grade("1a")];
}


