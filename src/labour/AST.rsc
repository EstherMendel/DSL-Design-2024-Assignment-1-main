module labour::AST

/*
 * Define the Abstract Syntax for LaBouR
 *
 * - make sure there is an almost one-to-one correspondence with the grammar in Syntax.rsc
 */
 
data BoulderingRoute = route(Grade grade, GridBasePoint gridBasePoint, Identifier identifier, list[Hold] holds);

data Grade = grade(str value);

data GridBasePoint = gridBasePoint(int x, int y);

data Identifier = identifier(str id);

//startingLabels syntax is a bit unclear. it states:
//"Of these holds, one or two may be labeled with one or two label strips to indicate they serve as hand start holds for one or both hands"
//so I guess use an int as it can be either 0, 1 or 2?
data Hold = hold(int x, int y, str shape, int rotation, str color, int startingLabels, bool endLabel);