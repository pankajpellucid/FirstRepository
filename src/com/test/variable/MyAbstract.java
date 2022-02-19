package com.test.variable;

public abstract class MyAbstract {
	
	public static void main(String[] args) {
		
		MyAbstract abs = new ChildAbstract();
		abs.sum();
		abs.print();
	}
       
	  abstract public void sum();
	  
	  
	  
	  public void print() {
		  
		 System.out.println("Anything");
	  }
}

















/*1.Abstraction is the process of hiding implemention and just showing functionality
  2.Abstraction is achieved by creating abstract method, which is created by using keyword "abstract"
  3.Abstract method must be a member of Abstract class, and does not have a body, just signature
  4.Abstract class can have zero to all methods as abstract methods
  5.We cannot create an object of Abstract class, but we can use inheritance to create
    a child class and create an object of child class using parent (abstract) class variable
  6.The child class must use method override in order to implement(have a body for) the 
    abstract method from parent (abstract) class or declare itself as an abstract class 
    itself(since the non abstract child class cannot have any abstract methods*/
