package com.test.variable;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		
		
		System.out.println("Hello, what is your name?");
		
		Scanner input1 = new Scanner(System.in);
		String name = input1.next();
		
		
		System.out.println("Hello "+name);
		
		System.out.println("How old are you?");
		
		Scanner input2 = new Scanner(System.in);
		int age = input2.nextInt();
		
		System.out.println("You are "+age+" years old");

	}

}




/* System.out is used to output value in console eg. by using print or println
   System.in can be used to input value in console, by using "Scanner" class
   and calling "next" method as above. If input has space between two words,
   "nextLine" method needs to be used. In practice, it is used to accept and
    interpret values from users eg through an automated chat */