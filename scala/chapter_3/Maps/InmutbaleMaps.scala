/*
	Inmutable Maps dont need to import something
	becouse it's the default way to maps.
*/

val romanNumbers = Map(
		1 -> "I",
		2 -> "II",
		3 -> "III",
		4 -> "IV",
		5 -> "V"
	)

println(romanNumbers(2))

for(i <- 1 to 5)println(romanNumbers(i))

