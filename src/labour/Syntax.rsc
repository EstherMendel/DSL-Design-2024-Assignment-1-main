module labour::Syntax
/*
 * Define a concrete syntax for LaBouR. The langauge's specification is available in the PDF (Section 2)
 */

 
lexical Id = "\"" ![\r\n]* "\"";
lexical Integer = [0-9]+;
//we hard code the colors, so inputting a wrong color will lead to a parse error
lexical Color = "white" | "yellow" | "green" | "blue" | "red" | "purple" | "pink" | "black" | "orange";
lexical Str = "\"" ![\"]*  "\"";

 
layout Layout = [\ \t\n\r]*;


start syntax BoulderingRoute = "bouldering_route" "{" {Route_property "," }+ properties "}";

syntax Route_property = Grade
						| GridBasePoint 
						| Identifier 
						| Holdlist ;

syntax Grade = "grade:" Str;

syntax GridBasePoint = "grid_base_point" "{" {GBPExpr ","}* exprs "}";

syntax GBPExpr = "x:" Integer
			   | "y:" Integer;

syntax Identifier = "identifier" Id;

syntax Holdlist = Hold*;

syntax Hold  = "hold" "{" {HoldExpr ","}+ holdexpressions "}";

syntax HoldExpr = "x:" Integer
				| "y:" Integer
				| "shape:" Id
				| "rotation:" Integer
				| "color:" Color
				| "starting_labels:" Integer
				| "end_label";
