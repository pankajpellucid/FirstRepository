package com.test.variable;

public class ReturnValue {

	public static void main(String[] args) {
		 
		System.out.println(math());

	}
	
	public static int math() {
		
		System.out.println(10);
		return 5;
		
	}

}





/* when a method is asked to "return" a value, the data type in the method signature needs to
   be changed from void to the type of value that needs to be returned. Once that method is
   called by the main method, it will execute the "return" code, and in order to visualize that
   returned value, it needs to be printed in the console
   "return" keyword can only be used in the last statement in the method */