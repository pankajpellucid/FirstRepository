package com.test.variable;

public class Math{

	public static void main(String[] args) {
      
		
		
		int a = 10;
		
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		 Math calc = new Math();
	    
		
		calc.sum(10,11,12);
		calc.sum(8, 9, 10);
		calc.sum(11, 12, 13);
		
		
	}
	
	public void sum(int a, int b, int c) {
		
		int sum = a+b+c;
		
		System.out.println(sum);
		
	} 
		
	}





