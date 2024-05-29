module labour::CST2AST

import labour::AST;
import labour::Syntax;
import IO;

import Type;
import String;


/*
 * Implement a mapping from concrete syntax trees (CSTs) to abstract syntax trees (ASTs)
 * Hint: Use switch to do case distinction with concrete patterns
 * Map regular CST arguments (e.g., *, +, ?) to lists
 * Map lexical nodes to Rascal primitive types (bool, int, str)
 */

import ParseTree;

// Function to transform boulderingroute to 
ABoulderingRoute cst2ast(start[BoulderingRoute] sr) {
//ABoulderingRoute cst2ast(Tree sr) {
		//start[BoulderingRoute] route = sr;
		BoulderingRoute r = sr.top;
		ABoulderingRoute result = boulderingRoute(toList(r.properties));
		return result;
		//return 0;
    }
    
//list[ARoute_property] toList({Route_property "," }+ properties) {
//	println(properties);
//    return [grade("1a")];
//}

//behold, ChatGPT code

// Function to transform the list of Route_property
list[ARoute_property] toList({Route_property "," }+ properties) {
    list[ARoute_property] result = [];
    for (Route_property prop <- properties) {
        result += toARouteProperty(prop);
    }
    return result;
}

// Function to transform individual Route_property
ARoute_property toARouteProperty(Route_property prop) {
	println("Processing Route_property: <prop>");
	println("Type of prop: <typeOf(prop)>");
	//println("Concrete type: <prop.concreteType()>");
    switch (prop) {
        case Grade g:
        {
        	Grade g = <prop>;
            println("Matched Grade with value: <g.s>");
            return grade("<g.s>");
        }
        case (Route_property)`grade: <Str s>`:
        {
        	println("Matched Grade with value: <s>");
        	println("Type of string: <typeOf(<s>)>");
        	println(<s>[0]);
            return grade(toStr(<s>[0]));
        }
 //       case GridBasePoint gbp:
 //           return gridBasePoint(toAGridBasePoint(gbp));
 //       case Identifier id:
 //          return identifier(toAId(id.id));
 //       case Holdlist hl:
 //           return holdlist(toAHoldList(hl));
 		default:
 			throw "Unexpected Route_property: <prop>";
    }
}

// Function to transform Grade
// this bulshit argument type brought to you by the parser who just decided this is what a Str is.
str toStr(Str s) {
	println("Inside toStr with Str: <s>");
	println("Type of string: <typeOf(<s>[0])>");
	println("here goes nothing!");
	Str content = <s>[0];
	str contentStr = content;
	println("Content string: <contentStr>");
    return substring(contentStr, 1, size(contentStr) - 1);  // Remove the quotes
}