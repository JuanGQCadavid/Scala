
/*
	private fields can only be accessed
	by methods defined in the same class,
	all the code that can update the state
	will be localized to the class.
*/

class ChecksumAccumulator  {
	private var sum = 0

	/*
		Methods with a result type of Unit, such as ChecksumAccumulator's add method, are executed for their
		side effects. A side effect is generally defined as mutating state somewhere external to the method or
		performing an I/O action. In add's case, the side effect is that sum is reassigned. A method that is
		executed only for its side effects is known as a procedure.
	*/
	def add(b: Byte) : Unit = {
		sum += b; println(sum)
	}

	// Scala method returns the last value computed by the method.
	def checkSum() = ~(sum & 0xFF) + 1
	
}

val exampleObject = new ChecksumAccumulator

exampleObject.add(5)
/*
	Public is Scala's
	default access level.
*/

/*
	One important characteristic of method
	parameters in Scala is that they are vals, not vars
*/
