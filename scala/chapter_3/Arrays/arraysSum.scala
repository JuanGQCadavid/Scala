val sumOfInts: Array[Int] = new Array[Int](4)

sumOfInts(0) = 5
sumOfInts(1) = 10
sumOfInts(2) = 9
sumOfInts.update(3, 1)

var sum:Int = 0

for(i <- 0 to 3)
	sum += sumOfInts(i)

println(sum)	
/*
	*println(sumOfInts(3))
*/