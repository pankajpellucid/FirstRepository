package com.test.variable;

public class StaticConcepts {
	
	String name = "John";
	static String email = "john1@gmail.com";

	public static void main(String[] args) {
		
		StaticConcepts sc1 = new StaticConcepts();
		
		System.out.println(sc1.name);
		
		System.out.println(email);
		
		
		studentDetails();
		

			}

	public static void studentDetails() {
	
		System.out.println(email);
		StaticConcepts sc2 = new StaticConcepts();
		sc2.math();
	}
	
	
	public void math() {
		System.out.println(email);
		studentDetails();
	}
	
	
}

/* Static global variable can be used in both static and non static methods e.g static String email
   Static method can be directly called to another static or static main method e.g. studentDetails
   Non static method needs an object of the class to be created before it can be called,
   unless one non static method is calling another non static method in the same class!
   Static method in the same class can be called just by method name i.e. methodname();, but 
   for a different class needs the classname and methodname i.e classname.methodname();
   The same rules for methods above apply to global variables*/