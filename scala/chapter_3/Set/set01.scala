/*
	*Sets can be Mutable or unmutable, becouse, set are definied
		in both packaged.

	
*/


var jetSet = Set("Boeing","Airbus")

/*
	jetSet is a Inmutable Scala set, becouse, is by default.
	jetSet is Type Set[String]
*/

jetSet += "Lear"

println(jetSet.contains("Cessna")) // Return if jetSet contains "Cessna"

println(jetSet)

jetSet -="Learg" // If Learg are not in Set, Scala Ommit.

println(jetSet)

jetSet -="Lear"

println(jetSet)

/*
	On both mutable and	immutable sets, 
	the + method will create and return 
	a new set with the element added
*/

/*
	Mutable Scala Get.
*/

import scala.collection.mutable

val movieSet = mutable.Set("Hitch", "Poltergeist")

movieSet += "Shrek"

println(movieSet)

/*
	Mutables += is a Metohd , so movieSet.+=("Shrek")
	Inmutables += is a simply ShortHand jetSet = jetSet + Cessna
*/

