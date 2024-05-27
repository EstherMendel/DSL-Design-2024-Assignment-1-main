module labour::Syntax
/*
 * Define a concrete syntax for LaBouR. The langauge's specification is available in the PDF (Section 2)
 */
 
lexical Id = "\"" ![\r\n]* "\"";
lexical Integer = [0-9]+;
lexical Color = "white" | "yellow" | "green" | "blue" | "red" | "purple" | "pink" | "black" | "orange";
lexical Str = "\"" ![\"]*  "\"";
 
layout Layout = [\ \t\n\r]*;

syntax BoulderingRoute = "bouldering_route" "{" Route_properties "}";

syntax Route_properties = Grade "," GridBasePoint "," Identifier ","  Hold* ;

syntax Grade = "grade:" Str;

syntax GridBasePoint = "grid_base_point" "{" "x:" Integer "," "y:" Integer "}";

syntax Identifier = "identifier" Id;

syntax Hold  = "hold" "{" "x:" Integer "," "y:" Integer "," "shape:" Id "," "rotation:" Integer "," "color:" Color ("," "starting_labels:" Integer)? ("," "end_label")? "}";

//TODO: Is ambiguous apparently
//TODO: we should not assume order in the statements, as seen in the teams chat