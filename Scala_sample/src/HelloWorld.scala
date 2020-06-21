object HelloWorld {
	def add_fun(x:Int, y:Int) : Int = {
		return(x+y)
	}
	def main(args: Array[String]) = {
		/*
    	 * val name = "mark"

    	val age = 18.5
    	println(name+" is "+age+" years old")
    	println(name + " is " + age + " years old")

    	println(s"$name is $age years old")

    	println(f"$name%s is $age%f years old")

    	println("Hello, world")
    	println("Hello, \nworld")
    	println(s"Hello, \nworld")
    	println(raw"Hello, \nworld")
    	// it is used as one line comment
    	// /*   */ is used for multiline comment
    	 *
    	 */
		/*
		val x: Int = 20;
		var res = "";
		if (x == 20) {
			res = "x = 20"
		} else {
			res = "x != 20"
		}

		println(res);

		val res2 = if (x != 20) "x ==20" else "x !=20"

		println(res2);
	}
	*/
	/*
		var x = 0;
		while(x <= 10){
			println(" x = "+x)
			x += 1
		}
		var y = 0;
		do{
			print(" y = "+y+ "\n")
			y += 1
		}while(y < 10)
		*/
		
		/*
		//using for loop 
		for(i <- 1 to 5){
			println("i using simple to " +i)
		}
		
		// it can be writtin like this
		for(i <- 1.to(5)){
			println("i using dot to " +i)
		}
		
		// it can be writtin like this
		for(i <- 1.until(6)){
			println("i using dot until " +i)
		}
		
		// it can be writtin like this
		for(i <- 1 until 6){
			println("i using simple until " +i)
		}
		
		// using ranges by :
		for(i <- 1.until(10) ; j <- 1.until(4)){
			println("i using until " +i+ " " +j)
		}
		
		//Printing a list
		val lst = List(0,2,4,6,8,10,1,3,5,7,9)
		for(i <- lst){
			println("i using List " +i)
		}
		
		//Printing a list and filering
		//val lst = List(0,2,4,6,8,10,1,3,5,7,9)
		for(i <- lst; if i < 6){
			println("i using List filtering value grater than 6 " +i)
		}
		
		// using for loop as an expression
		val result = for{i<- lst; if i <6} yield {
			i*i print
		}
		println("result = " +result)
		*/
		val result = add_fun(10,20) 
		println(" Adding 10 and 20 reults in = " +result)
		
	}
}