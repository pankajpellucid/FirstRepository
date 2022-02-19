package com.test.variable;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        
        System.out.println("What is your name?");
        
        String name = input1.nextLine();
        
        System.out.println("What is your age?");
        
        int age = input2.nextInt();
        
        System.out.println("What is your gender?");
        
        String gender = input3.next();
        
        System.out.println("Where are your from?");
        
        String origin = input4.next();
        
        System.out.println("Where do you currently live?");
        
        String location = input5.nextLine();
        
        System.out.println("Hello, My name is "+name+". I am "+age+" years old;"+gender+". I am originally from "+origin+" and I currently live in "+location+".");

	}

}
