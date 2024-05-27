module labour::Syntax
/*
 * Define a concrete syntax for LaBouR. The langauge's specification is available in the PDF (Section 2)
 */
 
//unused, was used for Identifier
lexical Id = "\"" ![\r\n]* "\"";
lexical Integer = [0-9]+;
lexical Color = "white" | "yellow" | "green" | "blue" | "red" | "purple" | "pink" | "black" | "orange";
 
layout Layout = [\ \t\n\r]*;


<<<<<<< Updated upstream
syntax Route_properties = (Grade | GridBasePoint | Identifier | Hold)*;
=======
//this hack is done to circumvent comma problems
syntax BoulderingRoute = "bouldering_route" "{" (Route_property ",")* Route_property "}";

syntax Route_property = Grade
						| GridBasePoint 
						| Identifier 
						| Holdlist ;
>>>>>>> Stashed changes

syntax Grade = "grade:" Integer;

syntax GridBasePoint = "grid_base_point" "{" "x:" Integer "," "y:" Integer "}";

syntax Identifier = "identifier" Id;

<<<<<<< Updated upstream
syntax Hold  = "hold" "{" "x:" Integer "," "y:" Integer "," "shape:" Id "," "rotation:" Integer "," "color:" Color ("," "starting_labels:" Integer)? ("," "end_label")? "}";
=======
syntax Holdlist = Hold*;

//syntax Hold  = "hold" "{" "x:" Integer "," "y:" Integer "," "shape:" Str "," "rotation:" Integer "," "color:" Color ("," "starting_labels:" Integer)? ("," "end_label")? "}";

syntax Hold  = "hold" "{" (HoldExpr ",")* HoldExpr "}";

syntax HoldExpr = "x:" Integer
				| "y:" Integer
				| "shape:" Str
				| "rotation:" Integer
				| "color:" Color
				| "starting_labels:" Integer
				| "end_label";


//TODO: Is ambiguous apparently
//TODO: we should not assume order in the statements, as seen in the teams chat
>>>>>>> Stashed changes
