class ChecksumAccumulator {
	// class definition goes here
	var sum = 0
}

/*
	Inside a class definition, you place fields and methods, 
	which are collectively called members.Fields,which you 
	define with either val or var, are variables that refer 
	to objects. Methods, which you define with def, contain 
	executable code. The fields hold the state, or data, of 
	an object, whereas the methods use that data to do the 
	computational work of the object. When you instantiate 
	a class, the runtime setsaside some memory to hold the 
	image of that object's state (i.e., the content of its variables).
*/

val acc = new ChecksumAccumulator
val csa = new ChecksumAccumulator

/*
	When i created a object, the Fiels of the Object aim to
	the same Data places on the machine, so when i created 2
	Objects from the same class, the 2 Objects has the same
	directions in memori, but, when i change the memory from
	1 object, the obbject data aim look for a diferenten place,
	and it Dosen't change the value of the other object.

	Look ObjectReferencesSame like the firts step, and, ObjectReferencesChange
	like the next step (When i change the value of 1 object Field)
*/

acc.sum = 3

