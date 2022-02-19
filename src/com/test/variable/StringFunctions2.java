package com.test.variable;

import java.util.Scanner;

public class StringFunctions2 {

	public static void main(String[] args) {

       
       
       System.out.println("Please enter a String");
       
       Scanner input = new Scanner(System.in);
       String string1 = input.next();
       
       char[] string1Array = string1.toCharArray();
       
       String reverseString1 = "";
       
       for(int i=string1Array.length-1; i>=0; i--) {
    	  // System.out.println(string1Array[i]);
    	  reverseString1 = reverseString1 + string1Array[i];
       }
          System.out.println(reverseString1);   
          
      //    StringBuilder str = new StringBuilder(string1);
          
     //     System.out.println(str.reverse());
       
       String string2 = string1.toUpperCase();
       
       System.out.println(string2);
       System.out.println(string2.length());
       
       String string3 = string2.replace('O', 'Z');
       
       System.out.println(string3);
       
       System.out.println(string3.charAt(4));
       
       System.out.println(string1.concat(" Test"));
       
       
       
	}

}



/* In order to create a reverse String, first split the String into chars using
   "toCharArray", then run a for loop to run the chars in reverse(descending order);
   also create a String variable with empty value, then concat with charArray as above
   An alternate(and easier way) is to use "StringBuilder" reverse function as above*/
