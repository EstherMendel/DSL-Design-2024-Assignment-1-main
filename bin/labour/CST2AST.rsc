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

//Start of the translation function
ABoulderingRoute cst2ast(start[BoulderingRoute] sr) {
		BoulderingRoute r = sr.top;
		ABoulderingRoute result = boulderingRoute(toList(r.properties));
		return result;
    }


//Transforms the list of Route_properties
list[ARoute_property] toList({Route_property "," }+ properties) {
    list[ARoute_property] result = [];
    for (Route_property prop <- properties) {
        result += toARouteProperty(prop);
    }
    return result;
}

//Transforms individual Route_properties
ARoute_property toARouteProperty(Route_property prop) {
    switch (prop) {
        case (Route_property)`grade: <Str s>`: 
        {
        	return grade("<s>");
        }
        case (Route_property)`grid_base_point { <{GBPExpr ","}* exprs> }`:
        {
        	return gridBasePoint(gridBasePoint(toList(exprs)));
        }
        case (Route_property)`identifier <Id i>`:
        {
        	return identifier(id("<i>"));
        }
        case (Route_property)`<Hold* holds>`: 
        {
        	return holdlist(toList(holds));
        }
        //we should never reach here
 		default:
 			throw "Unexpected Route_property: <prop>";
    }
}

//handles the list of gbpExprs and hands back a list of AHoldExprs (see AST.rsc for explanation why)
list[AHoldExpr] toList({GBPExpr ","}* exprs)
{
	list[AHoldExpr] result = [];
    for (GBPExpr expr <- exprs) {
        result += toAgbpExpr(expr);
    }
    return result;
}

//handles individual GBPExprs
AHoldExpr toAgbpExpr(GBPExpr expr)
{
	switch (expr) {
        case (GBPExpr)`x: <Integer i>`: 
        {
        	return x(toInt("<i>"));
        }
        case (GBPExpr)`y: <Integer i>`: 
        {
        	return y(toInt("<i>"));
        }
        default:
 			throw "Unexpected GBPExpr: <hold>";
 	}
}

//this handles a LIST of holds
list[AHold] toList(Hold* holds) {
	list[AHold] result = [];
    for (Hold hold <- holds) {
        result += toList(hold.holdexpressions);
    }
    return result;
}

//this handles ONE hold
AHold toList({HoldExpr "," }+ holdexprs) {
	list[AHoldExpr] result = [];
    for (HoldExpr holdexpr <- holdexprs) {
        result += toAHoldExpr(holdexpr);
    }
    return hold(result);
}


// Function to transform an individual holdExpr
AHoldExpr toAHoldExpr(HoldExpr hold) {
    switch (hold) {
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
        	//typecast to string, to match the string to an actual color
        	//this is why it gives errors when you input incorrect colors
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
