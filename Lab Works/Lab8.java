/*
  John Paul De Jesus
  Co Sci 290
  Lab 8
*/

import java.util.Scanner; //is a Java object that allows you take user input

public class Lab8{ // name of the Java file
  
  public static void main(String[] args){ //entry point of application

    // Problem 2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, 
    // then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows: fahrenheit = (9 / 5) 
    // * celsius + 32 Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
    
    Scanner input = new Scanner(System.in); //Setting up Scanner for user input
    
    System.out.print("Enter a number for celsius: "); //prompt the user to enter in a celsius
    
    double celsius = input.nextDouble(); // Declare celsius to be a double variable and let the user input the number in celsius
    
    double fahrenheit = (9 / 5) * celsius + 32; // Declare fahrenheit to be a double variable and calculate its formula
        
    System.out.println("The fahrenheit " + "is " + fahrenheit); //prompt the user to enter in a calculated fahrenheit
    
    // Problem 2.2 (Compute the volume of a cylinder) Write a program that reads in the radius
    // and length of a cylinder and computes the area and volume using the following formulas:
    // area = radius * radius * pi
    // volume = area * length
           
    final double PI_VALUE = 3.1415; //costants are all capital,
                                     //multiples words separated by underscores
    
    System.out.println("Enter a number for radius: "); //prompt the user to enter in a radius
    
    int radius = input.nextInt(); //lets user input the variable for radius
    
    System.out.println("Enter a number for length: "); //prompt the user to enter in a length
    
    int length = input.nextInt(); // lets user input the variable for length
     
    double area = radius * radius * PI_VALUE; //Declare area to be a double variable and calculate its formula
    
    double volume = area * length; // Declare volume to be a double variable and calculate its formula
    
    System.out.println("The volume of a cylinder " + "is " + volume); // prompt the user to enter in a calculated volume of the cylinder
    
   } 
}
