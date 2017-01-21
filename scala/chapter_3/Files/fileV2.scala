import scala.io.Source

/*
	Get the length of the number.
*/
def widthOfLength(s: String) = s.length.toString.length

/*
	Main.

	if there aren't files, show messeges error.
*/
if(args.length > 0){

	/*
		Source.fromFile makes a Source Object of the file, get Lines iteretr the
		lines in the document, finilly toList makes a list from everyLine of the
		method getLines. So val Lines is a List.
	*/
	val lines = Source.fromFile(args(0)).getLines().toList

	/*
		this return the max length number.

		.reduceLift is a method gets 2 lines from the list, make the comparation
		and compared the result with the next Line, for every line 
	*/
	val longestLine = lines.reduceLeft(
			(a,b) => if (a.length > b.length) a else b
		)
	/*
		we know the longest line of the whole lines, so,
		we need to know the length of the line for
		know the number of spaces we need to add
		for the other number that has a less length.
			455
			 54
			667
			  8
		so 455 or 667 are the longest line, so the length is 3.
		54 need 1 space for has the same length.
	*/
	val maxWidth = widthOfLength(longestLine)
	/*
		Iterato, by each line, makes.
	*/
	for(line <- lines){
		/*
			numScpaces is the number of spaces that they need
			to be the same length.
				455
				 54
				667
				  8
			so 455 or 667 are the longest line, so the length is 3.
			54 need 1 space for has the same length.

			54 has 2 of length, so numSpaces  =  3-2 = 1

			54 need 1 spaces for be the same Alignment

			padding is " " , so pading * 1  is "  "

			so, to sum up, padding is the numnber os spaces tha the
			number need to has for be alignment with the rest.
		*/
		val numSpaces = maxWidth - widthOfLength(line)
		val padding = " " * numSpaces
		println(padding + line.length+ " | " + line)

	}
}else
	Console.err.println("Please enter filename")