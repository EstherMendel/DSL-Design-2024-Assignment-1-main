module labour::AST

/*
 * Define the Abstract Syntax for LaBouR
 *
 * - make sure there is an almost one-to-one correspondence with the grammar in Syntax.rsc
 */

data BoulderingRoute = boulderingRoute(list[Route_property] properties);

data Route_property 
  = grade(str s)
  | gridBasePoint(GridBasePoint point)
  | identifier(str id)
  | holdlist(list[Hold] holds);

data GridBasePoint = gridBasePoint(int x, int y);

data Hold = hold(list[HoldExpr] expressions);

data HoldExpr = x(int i)
  			| y(int i)
  			| shape(str s)
 			| rotation(int i)
 			| color(Color c)
  			| startingLabels(int i)
  			| endLabel();
  
data Color = white() 
           | yellow() 
           | green() 
           | blue() 
           | red() 
           | purple() 
           | pink() 
           | black() 
           | orange();
           
data Str = Str(str s);
data Id = id(str s);
data Integer = integer(int i);