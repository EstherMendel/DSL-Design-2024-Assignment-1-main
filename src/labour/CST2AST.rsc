module labour::CST2AST

import labour::AST;
import labour::Syntax;


/*
 * Implement a mapping from concrete syntax trees (CSTs) to abstract syntax trees (ASTs)
 * Hint: Use switch to do case distinction with concrete patterns
 * Map regular CST arguments (e.g., *, +, ?) to lists
 * Map lexical nodes to Rascal primitive types (bool, int, str)
 */

//start of bouldering route always starts with this
start[BoulderingRoute]: boulderingRoute  = "bouldering_route" "{" route_properties "}" => route(route_properties);

//translate respecive elements to Abstract syntax
route_properties[BoulderingRoute]: Route_properties
  = grade: "grade:" str "," gridBasePoint: grid_base_point "," identifier: identifier "," holds: hold* 
    => route(grade(grade), gridBasePoint, identifier, holds);

grid_base_point[GridBasePoint]: GridBasePoint
  = "grid_base_point" "{" "x:" x:Integer "," "y:" y:Integer "}" => gridBasePoint(x, y);

identifier[Identifier]: Identifier
  = "identifier" id:Id => identifier(id);

hold[Hold]: Hold
  = "hold" "{" "x:" x:Integer "," "y:" y:Integer "," "shape:" shape:Id "," "rotation:" rotation:Integer "," "color:" color:Color 
    ("," "starting_labels:" startingLabels:Integer)? ("," "end_label")? "}"
    => hold(x, y, shape, rotation, color, startingLabels, endLabel != null);

//the function that actually invokes all stuff above
//maybe decleration should be 'Tree' instead
public Tree cst2ast(str input) 
{
    return parse(#start[BoulderingRoute], input);
}