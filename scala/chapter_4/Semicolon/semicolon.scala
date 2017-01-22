/*
	In a Scala program, a semicolon at the end 
	of a statement is usually optional. You can
	type one if you want but you don't have to if 
	the statement appears by itself on a single 
	line. On the other hand, a semicolon is required 
	if you write multiple statements on a single line
*/

val s = "Hello";println(s)

/*
	x
	+ y 

	can be

	(x
	+ y)

	or 

	x +
	y
*/

/*
	RULES

	The precise rules for statement separation are surprisingly
	simple for how well they work. In short, a line ending is 
	treated as a semicolon unless one of the following conditions is true:

		1. The line in question ends in a word that would not be legal as 
		the end of a statement, such as a period or an infix operator.

		2. The next line begins with a word that cannot start a statement.

		3. The line ends while inside parentheses (...) or brackets [...], 
		because these cannot contain multiple statements anyway.
*/