val oneTwo = List(1,2)
val threeFour = List(3,4)

val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

/*

	* List aren't mutable, so you coud'n change the value afther the initialize. 

	* The Mid-operator ::: is a method of List, and indicates concatenation (Creat a new list by the comment before)

	*onces you initialize, it's imposible to change.

	* the ::: Operator agrup the list in one new list.

	* One of the big ideas of the functional style of programming is that methods should not have side
		effects. A method's only act should be to compute and return a value. Some benefits gained when you
		take this approach are that methods become less entangled, and therefore more reliable and reusable.
		Another benefit (in a statically typed language) is that everything that goes into and out of a method is
		checked by a type checker, so logic errors are more likely to manifest themselves as type errors.
		Applying this functional philosophy to the world of objects means making objects immutable.

			take from page 46.
*/

val twoThree = List(2,3)

val oneTwoThree = 1::twoThree

println(oneTwoThree)

/*
	* the operator :: which is pronunced "cons" indicated "add a element to a existens list 
		(At the beginning)an afther thatcreted a new list" 

	* The Operator :: is from the list, for this reason the compiler run twoThree.(1), like 1 as a 
		value, and not reverce, this is by the :, if a method end whit a : (colon) indicated the
		method below from the rigth object

			If a method is used in operator notation, such as a * b, the method is invoked on the left
			operand, as in a.*(b)—unless the method name ends in a colon. If the method name ends in a colon, the
			method is invoked on the right operand.

				take from page 47 
*/

val differentWay = 1::2::3::Nil

println(differentWay)

/*
	*the operator Nill, indicated a empty list.
*/

/*
	the full power are in chapter 16
*/