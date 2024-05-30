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
        //okay this works, but I am 100% sure I did this before
        case (Route_property)`grade: <Str s>`: 
        {
        	println("matched with grade!");
        	return grade("<s>");
        }
        case (Route_property)`grid_base_point { x: <Integer i>, y: <Integer j> }`:
        {
        	println("matched with grid base point!");
        	//yes this looks dumb, but that is just how we defined it hehe
        	return gridBasePoint(gridBasePoint(toInt("<i>"), toInt("<j>")));
        }
        case (Route_property)`identifier <Id i>`:
        {
        	println("matched with identifier!!");
        	return identifier(id("<i>"));
        }
 //       case Identifier id:
 //          return identifier(toAId(id.id));
 //       case Holdlist hl:
 //           return holdlist(toAHoldList(hl));
 		default:
 			throw "Unexpected Route_property: <prop>";
    }
}

AGridBasePoint gbp2agbp(Route_property gbp)
{
	return gridBasePoint(<i>, <j>);
}
