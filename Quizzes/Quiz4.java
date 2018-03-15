/* John Paul De Jesus
   Co Sci 290
   Quiz4a Question 1 Problem 2.18
*/

import java.util.Scanner;

public class Quiz4{ // Note: There was technical difficulty in uploading this java on time.
  
  // Print a table. Write a program that displays the following table. 
  // Cast floating-point numbers into integers.Print
  
  public static void main(String[] args) { 
    
    float a, b; 
    
    System.out.println("a        b        pow(a, b)"); 
    
    a = 1; 
    
    b = 2; 
    
    System.out.println((int)a + "        " + (int)b +  
                       
  	"        " + (int)Math.pow(a, b)); // mathematical operation exponent (a, b)
    
    a++; // increment, increases the value by 1
    
    b++; // increment, increases the value by 1
    
    System.out.println((int)a + "        " + (int)b +  
                       
  	"        " + (int)Math.pow(a, b)); 
    
    a++; // increases value by 1 more
    
    b++; // increases value by 1 more
    
    System.out.println((int)a + "        " + (int)b +  
                       
  	"        " + (int)Math.pow(a, b)); 
    
    a++; // increases value by 1 more
    
    b++; // increases value by 1 more
    
    System.out.println((int)a + "        " + (int)b +  
                       
  	"        " + (int)Math.pow(a, b)); 
    
    a++; // increases value by 1 more
    
    b++; // increases value by 1 more
    
    System.out.println((int)a + "        " + (int)b +  
                       
  	"        " + (int)Math.pow(a, b)); 
 
  }
  
}