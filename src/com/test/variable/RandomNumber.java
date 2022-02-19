package com.test.variable;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

       Random random = new Random();
       int rNumber = random.nextInt(99);
       System.out.println(rNumber);

	}

}






/* "Random" class can be used with "nextInt" method in order to ask java to generate random
  numbers. As a reminder, "nextInt" function is used with Scanner class as well in order to
  take input and here it is used to give output. In practice, "Random" class variable can
  be used alongside test data (eg name, email) to generate random data for testing */