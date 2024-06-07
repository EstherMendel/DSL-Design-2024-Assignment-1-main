module labour::AST

/*
 * Define the Abstract Syntax for LaBouR
 *
 * - make sure there is an almost one-to-one correspondence with the grammar in Syntax.rsc
 */
 

data ABoulderingRoute = boulderingRoute(list[ARoute_property] aproperties);

data ARoute_property = grade(str s)
  | gridBasePoint(AGridBasePoint point)
  | identifier(AId id)
  | holdlist(list[AHold] holds);

//is a list of AHoldExpr as these share the x and y fields, otherwise Rascal gets confused if we add a new ADT with the same fields
data AGridBasePoint = gridBasePoint(list[AHoldExpr] coords);

data AHold = hold(list[AHoldExpr] expressions);

data AHoldExpr = x(int i)
  			| y(int i)
  			| shape(AId s)
 			| rotation(int i)
 			| color(AColor c)
  			| startingLabels(int i)
  			| endLabel();
  
  
//colors are hard-coded from this point, hence why it gives errors when incorrect colors are input.
data AColor = white() 
           | yellow() 
           | green() 
           | blue() 
           | red() 
           | purple() 
           | pink() 
           | black() 
           | orange();
           
data AId = id(str s);