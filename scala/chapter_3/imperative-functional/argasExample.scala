/*
	Imperative.

	the uses of var is  a proof.
*/

def printArgs(args: Array[String]) : Unit = {
	var i = 0
	while(i < args.length){
		println(args(i))
		i += 1
	}
}

/*
	Functional.
*/

def printArgsFunctional(args : Array[String]): Unit = {
	for (arg <- args) println(arg)
}

def printArgsFunctional2(args : Array[String]) : Unit ={
	args.foreach(println)
}

printArgs(args)
printArgsFunctional(args)
printArgsFunctional2(args)

/*
	100% Functional, return the result.

	The telltale sign of a
	function with side effects is
	that its result type is Unit
*/

def formatArgs (args: Array[String]) = args.mkString(" ")

println(formatArgs(args))
