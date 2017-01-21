def greet() = print("Hello, te result is: ")

def sum(x: Int, y: Int): Int  = x+y

def show(x:Int) = println(x)

def fac(x:Int): Int ={
	println(x)
	if(x == 0) return 1;

	return x * fac(x = x -1)

}

def argumentos(): Unit ={

	
}

greet()

show(sum(5,5))

show(fac(6))

argumentos();
