
/*
	A singleton object that does not share the same name 
	with a companion class is called astandalone object. 
	You can use standalone objects for many purposes, 
	including collecting related utility methods together or 
	defining an entry point to a Scala application. 
*/
import ChecksumAccumulator.calculate

object Summer{
	def main(args: Array[String]): Unit= {

		for (arg <- args)
			println(arg + " : " +  calculate(arg))


	}

}

/*
	To run a Scala program, you must supply the name of a 
	standalone singleton object with amain method that takes
	one parameter, an Array[String], and has a result type of Unit.
	Any standalone object with 	a main method of the proper 
	signature can be used as the entry point into an application. 

*/