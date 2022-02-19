package com.test.variable;

public class StringFunctions {

	public static void main(String[] args) {
		
		String name1 = "QA";
		String name2 = "QA Automation";
		String name3 = "Tester";
		String name4 = "QA";
		String name5 = "     QA Automation    ";
		String name6 = "tester";

	String str = new String("QA");
	
	
	
		System.out.println(name1==name4);
		System.out.println(name1.equals(name4));
		System.out.println(name1==str);
		System.out.println(name1.equals(str));
		System.out.println(name3.equalsIgnoreCase(name6));
		
		System.out.println(name2.concat(" "+name3));
		
		System.out.println(name3.indexOf("T"));
		System.out.println(name1.indexOf("T"));
		
		System.out.println(name3.charAt(0));
		System.out.println(name2.charAt(name2.length()-1));
		
		System.out.println(name3.toCharArray()[0]);
		
		//char[] name7 = name3.toCharArray();
		//System.out.println(name7[0]);
		
		System.out.println(name2.split(" ")[0]);
		
		//String[] name8 = name2.split(" ");
		//System.out.println(name8[0]);
		
		System.out.println(name3.replace("Tester", "Engineer"));
		
		System.out.println(name2.substring(3, 7));
		System.out.println(name2.substring(3));
		System.out.println(name2.substring(3).toUpperCase().length());
		
		System.out.println(name2.length());
		
		System.out.println(name5.trim());
		
		System.out.println(name2.toLowerCase());
		
		System.out.println(str.concat(name3));
		
		
		
		
    StringBuilder str1 = new StringBuilder("Michael");
    StringBuilder str2 = new StringBuilder("Michael");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
	
	    System.out.println(str1.append(" "+"Myers"));
	
	    System.out.println(str1.append(" "+"Myers").hashCode());
	
		
	
    StringBuffer str3 = new StringBuffer("Michael");
	
	    System.out.println(str3.append(" "+"Myers"));	
	}

}

/* 1.String is immutable, because it is stored in string literal constant pool,
   i.e. it cannot be altered once created, attempt to alter(eg concat) will create a 
   new string (at a different location)e.g line 24. Also if the string of the same value 
   is already created/present in the pool, any new variable will be assigned to that exact 
   value(at the same location) instead of creating a new one(in a different location).
   2.Creating an object of string(e.g. "str") will create memory location in JAVA HEAP and 
   that location will then refer to the actual string in string constant pool, so the object
   variable indirectly refers to the String value, vs the string variable which directly refers.
   3.A String with same exact value can be assigned to multiple variables and
   those variables can refer to String constant pool(==) or JAVA HEAP(equals)
   4.Strings can be compared using "equals" or "=="; integers can only be compared with "=="
   5."substring" function is used to extract a portion of the string based on index values,
   the initial index value captures the first char but the last index value captures the
   char one before that value, see above "auto" extraction.
   6.StringBuilder and StringBuffer use JAVA HEAP i.e they store value by creating object
   and cannot store in String constant pool (like "str" above) and they use "append"
   method instead of "concat". Also if two objects are created with same value, they will
   still refer to different locations in JAVA HEAP. They also help make string mutable, since 
   the string value is altered and stored in the same location, see above "hashCode".
   This makes them more efficient than using String variables.
   7.String is a non primitive datatype as well as a Java class!*/
    
