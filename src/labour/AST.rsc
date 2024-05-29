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

data AGridBasePoint = gridBasePoint(int x, int y);

data AHold = hold(list[AHoldExpr] expressions);

data AHoldExpr = x(int i)
  			| y(int i)
  			| shape(AId s)
 			| rotation(int i)
 			| color(AColor c)
  			| startingLabels(int i)
  			| endLabel();
  
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