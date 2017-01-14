/*
	* tuples are like List, both are Unmutabe.

	* tubles can has diferentes values, for examplo (Int,String,Int)

		*Whereas a list might be a List[Int] or aList[String], a tuple could
			contain both an integer and a string at the same time.

	* tuples Type are acording of the number of values.

		* var TuplesExample = (5,4) -> the type is -> Tuple2[Int,Int]
		* var TuplesSecondExmaple = ('u', 'r', "the", 1, 4, "me") -> Tuple6[Char,Char,String,Int,Int,String]
	
	*Tuples are very useful, for example, if you need
		to return multiple objects from a method
	
*/

val pair = (99,"Hola")

println(pair._1)

println(pair._2)

def intento():Tuple2[Int,String] = {
	val result = (88,"Hello")
	result
}


println(intento._1)

/*
	*To acces a place into Tuples you can not used pair(0) cuz in List are all the same, 
		but in Tublas has several types.
*/
