
//Created a list 

val nameList = List("Will", "fill",  "until")

//Get something

val stringCool = nameList(0)

println(stringCool)

//Count

val count = nameList.count(s => s == "Cool")
val count2 = nameList.count(s => s.length == 4)
val count3 = nameList.length

println(count) 

// Drop - return a new list staring from the element indicate beetwen the ( ).
println(nameList.drop(2))   

//Returns the thrill list without its rightmost 2 elements (returns List("Cool"))

println(nameList.dropRight(2))
 
//Return true/ or false if the value exists

println(nameList.exists(s => s == "Cool"))

//Returns a list of all elements, in order, of the thrilllist that have length 4 (returns List("Cool", "rule"))

println(nameList.filter(s => s.length == 4))

//Indicates whether all elements in the thrill list end with the letter "l" (returns true)

println(nameList.forall(s => s.endsWith("l")))

// For each

println(nameList.foreach(println))

//Returns the first element in the thrill list (returns"Will")

println(nameList.head)

val newList = List(Array("Hola"))

println(newList(0)(0))

newList(0).update(0,"By")

println(newList(0)(0))


//No Funciona

/*
//Returns a list containing all elements of the thrilllist in alphabetical order
//of the first character lowercased (returns List("fill", "until", "Will"))

val numberList = List(8,7,6,5,4,3)

println(numberList.sorted((s, t) => s.charAt(0).toLower < t.charAt(0).toLower))

*/