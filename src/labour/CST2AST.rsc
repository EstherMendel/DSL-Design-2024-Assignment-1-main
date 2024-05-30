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
//	println("Processing Route_property: <prop>");
//	println("Type of prop: <typeOf(prop)>");
	//println("Concrete type: <prop.concreteType()>");
    switch (prop) {
        //okay this works, but I am 100% sure I did this before
        case (Route_property)`grade: <Str s>`: 
        {
        	return grade("<s>");
        }
        case (Route_property)`grid_base_point { x: <Integer i>, y: <Integer j> }`:
        {
        	//yes this looks dumb, but that is just how we defined it hehe
        	return gridBasePoint(gridBasePoint(toInt("<i>"), toInt("<j>")));
        }
        case (Route_property)`identifier <Id i>`:
        {
        	return identifier(id("<i>"));
        }
        case (Route_property)`<Hold* holds>`: 
        {
        	return holdlist(toList(holds));
        }
 		default:
 			throw "Unexpected Route_property: <prop>";
    }
}

//this is the LIST of holds
list[AHold] toList(Hold* holds) {
	list[AHold] result = [];
    for (Hold hold <- holds) {
        result += toList(hold.holdexpressions);
    }
    return result;
    //return [cst2ast(q) | (Question q <- questions)];
}

//this is ONE hold
AHold toList({HoldExpr "," }+ holdexprs) {
	list[AHoldExpr] result = [];
    for (HoldExpr holdexpr <- holdexprs) {
        result += toAHoldExpr(holdexpr);
    }
    return hold(result);
    //return [cst2ast(q) | (Question q <- questions)];
}


// Function to transform individual Route_property
AHoldExpr toAHoldExpr(HoldExpr hold) {
//	println("Processing HoldExpr: <hold>");
//	println("Type of Expr: <typeOf(hold)>");
	//println("Concrete type: <prop.concreteType()>");
    switch (hold) {
        //okay this works, but I am 100% sure I did this before
        case (HoldExpr)`x: <Integer i>`: 
        {
        	return x(toInt("<i>"));
        }
        case (HoldExpr)`y: <Integer i>`: 
        {
        	return y(toInt("<i>"));
        }
        case (HoldExpr)`shape: <Id s>`:
        {
        	return shape(id("<s>"));
        }
        case (HoldExpr)`rotation: <Integer r>`:
        {
        	return rotation(toInt("<r>"));
        }
        case (HoldExpr)`color: <Color c>`:
        {
        	str col = "<c>";
        	return color(strToColor(col));
        }
        case (HoldExpr)`starting_labels: <Integer sl>`:
        {
        	return startingLabels(toInt("<sl>"));
        }
        case (HoldExpr)`end_label`:
        {
        	return endLabel();
        }
 		default:
 			throw "Unexpected Route_property: <hold>";
    }
}

//yes, this is just a big switch statement with string matching
AColor strToColor(str c)
{
	switch(c)
	{
		case "white": return white();
		case "yellow": return yellow();
		case "green": return green();
		case "blue": return blue();
		case "red": return red();
		case "purple": return purple();
		case "pink": return pink();
		case "black": return black();
		case "orange": return orange();
		default: throw "Unexpected Color: <c>";
	}
}
