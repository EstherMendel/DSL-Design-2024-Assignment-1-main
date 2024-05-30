module labour::Plugin

import ParseTree;
import util::IDE;
import labour::Check;
import labour::Parser;
import labour::CST2AST;
import IO;

/*
* This function is defined to test the functionality of the whole assignment. It receives a file path as a parameter and returns true if the program satisfies the specification or false otherwise.
* First, it calls the parser (Parser.rsc). Then, it transforms the resulting parse tree of the previous program and calls the function cst2ast (CST2AST.rsc), responsible for transforming a parse tree into an abstract syntax tree.
* Finally, the resulting AST is used to evaluate the well-formedness of the labour program using the check function (Check.rsc).
*/
bool checkWellformedness(loc fil) {
	// Parsing
	println("processing file: <fil>");
	//println("now parsing to CST");
	&T resource = parserLaBouR(fil);
	//print out the result
	//println(resource);
	// Transform the parse tree into an abstract syntax tree
	//println("now transforming to AST");
	&T ast = cst2ast(resource);
	//println(ast);
	// Check the well-formedness of the program
	return checkBoulderRouteConfiguration(ast);
}

/*
* This is the main function of the project. This function enables the editor's syntax highlighting.
* After calling this function from the terminal, all files with extension .labour will be parsed using the parser defined in module labour::Parser.
* If there are syntactic errors in the program, no highlighting will be shown in the editor.
*/
void main() {
	registerLanguage("LaBouR - DSLD", "labour", Tree(str _, loc path) {
		return parserLaBouR(path);
  	});
  	println("Check for correct route");
  	println(checkWellformedness(|project://LaBouR//testfiles/example.labour|));
  	//println("Check for non-uniform colors:");
  	//println(checkWellformedness(|project://LaBouR//testfiles/nonuniform_colors.labour|));
  	//println("Check for only 1 hold:");
  	//println(checkWellformedness(|project://LaBouR//testfiles/only_one_hold.labour|));
  	//println("Check for more than 2 start holds:");
  	//println(checkWellformedness(|project://LaBouR//testfiles/more_than_two_start_holds.labour|));
  	//println("Check for no Grid Base Point:");
  	//println(checkWellformedness(|project://LaBouR//testfiles/no_gbp.labour|));
  	//println("Check for no Only a GBP:");
  	//println(checkWellformedness(|project://LaBouR//testfiles/only_a_gbp.labour|));
  	//println("Check for Invalid GBP:");
  	//println(checkWellformedness(|project://LaBouR//testfiles/invalid_gbp.labour|));
  	//println("Check for Invalid Holds:");
  	//println(checkWellformedness(|project://LaBouR//testfiles/invalid_holds.labour|));
  	//println("Check for Invalid Colors, this is caught in the AST!:");
  	//try
  	//{
  	//	println(checkWellformedness(|project://LaBouR//testfiles/invalid_color.labour|));
  	//}
  	//catch:
  	//{
  	//	println("Exception caught!");
  	//}
  	//println("Check for Invalid Rotation:");
  	//println(checkWellformedness(|project://LaBouR//testfiles/invalid_rotation.labour|));
  	println("Checking a valid long route:");
  	println(checkWellformedness(|project://LaBouR//testfiles/epic_long_route.labour|));
  	println("Checking for duplicate route properties:");
  	println(checkWellformedness(|project://LaBouR//testfiles/duplicate_route_properties.labour|));
}


//THIS COMMAND IN THE TERMINAL:
//checkWellformedness(|project://LaBouR/example.labour|);