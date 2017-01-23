

// In file ChecksumAccumulator.scala
 class ChecksumAccumulator {

 	/*
		The class is called the companion class of the singleton object
 	*/
	 private var sum = 0
	 def add(b: Byte): Unit = { sum += b }
	 def checksum(): Int = ~(sum & 0xFF) + 1
 }
 // In file ChecksumAccumulator.scala
 import scala.collection.mutable



/*
	The singleton object in this figure is named ChecksumAccumulator,
	the same name as the class in the previous example. When a singleton 
	object shares the same name with a class, it is called that class's companion
	object. You must define both the class and its companion object in 
	the same source file. The class is called the companion class of the 
	singleton object. A class and its companion object can access each 
	other's private members.
*/
 object ChecksumAccumulator {


 	/*
		 When a singleton object shares the same name
		 with a class, it is called that class's companion object. 
 	*/

	 private val cache = mutable.Map.empty[String, Int]


	 def calculate(s: String): Int =

		 if (cache.contains(s))
		 	cache(s)
		 else {
			 val acc = new ChecksumAccumulator

			 //The object with the same name of the class can acces to the private members.
			 //println(acc.sum)
			 for (c <- s)
			 	acc.add(c.toByte)
			 val cs = acc.checksum()
			 cache += (s -> cs)
			 cs
	 	}
	 def showMap() : Unit = {
	 	for(base:String <- cache.keys)
	 		println(cache(base))

	 }
	//def showMap(): String = { var cadena = cache("Every value is an object.") +  " "+ cache("Every value is an object. per second time!!");  cadena  }
 }

 println(ChecksumAccumulator.calculate("Every value is an object."))
 println(ChecksumAccumulator.calculate("Every value is an object. per second time!!"))
 println(ChecksumAccumulator.showMap())

/*
	A singleton object that does not share the same name 
	with a companion class is called astandalone object. 
	You can use standalone objects for many purposes, 
	including collecting related utility methods together or 
	defining an entry point to a Scala application. 
*/