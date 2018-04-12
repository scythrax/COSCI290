/* John Paul De Jesus
   Co Sci 290
	 Lab 12
*/

import java.util.Scanner; //is a Java object that allows you take user input

public class Lab12{ // name of the class file
	
	public static void main(String[] args){ //entry point of application
	
	  Scanner input = new Scanner(System.in); // Setting up Scanner for user input
	
	  System.out.println("This program will check if a number" +  "is even or odd..."); // prints the message to output
	
	  System.out.println("Please enter in a whole number..."); // prints the message to output
	
	  int num = input.nextInt(); // reads the incoming input

    if(num % 2 == 0){ // If statement and assign modulus which divides left-hand operand by right-hand operand and returns remainder.

	    System.out.println("The number " + num  + " is even..."); // prints the message to output
	
	  }
	
    else{
	
	    System.out.println("The number " + num  + " Is odd..."); // prints the message to output

    }
	
	}
	
}
// end of the program