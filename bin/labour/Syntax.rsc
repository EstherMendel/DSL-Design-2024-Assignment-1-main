module labour::Syntax
/*
 * Define a concrete syntax for LaBouR. The langauge's specification is available in the PDF (Section 2)
 */
 
//unused, was used for Identifier
lexical Id = "\"" ![\r\n]* "\"";
lexical Integer = [0-9]+;
lexical Color = "white" | "yellow" | "green" | "blue" | "red" | "purple" | "pink" | "black" | "orange";
lexical Str = "\"" ![\"]*  "\"";

 
layout Layout = [\ \t\n\r]*;


//this hack is done to circumvent comma problems
start syntax BoulderingRoute = "bouldering_route" "{" {Route_property "," }+ properties "}";

syntax Route_property = Grade
						| GridBasePoint 
						| Identifier 
						| Holdlist ;

syntax Grade = "grade:" Str;

syntax GridBasePoint = "grid_base_point" "{" "x:" Integer "," "y:" Integer "}";

syntax Identifier = "identifier" Id;

syntax Holdlist = Hold*;

syntax Hold  = "hold" "{" {HoldExpr ","}+  "}";

syntax HoldExpr = "x:" Integer
				| "y:" Integer
				| "shape:" Id
				| "rotation:" Integer
				| "color:" Color
				| "starting_labels:" Integer
				| "end_label";


//TODO: Is ambiguous apparently
//TODO: we should not assume order in the statements, as seen in the teams chat