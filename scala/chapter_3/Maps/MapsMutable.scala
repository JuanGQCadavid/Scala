import scala.collection.mutable

val treasureMap = mutable.Map[Int, String] ()

	treasureMap += (1 -> "Go to Island.")
	treasureMap += (2 -> "Find big X on ground")
	treasureMap += (3 -> "Dig")

println(treasureMap(2))

/*
	the Scala compiler transforms a binary 
	operation expression like 1 -> "Go to 
	island." into (1).->("Go to island."). Thus,
	when you say 1 -> "Go to island.", you 
	are actually calling a method named -> on an integer 
	with the value 1, passing in a string with 
	the value "Go to island." This -> method, 
	which you can invoke on any	object in a Scala program,
	 returns a two-element tuple containing the key and value.
*/