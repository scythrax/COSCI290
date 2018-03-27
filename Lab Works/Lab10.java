/* John Paul De Jesus
   Co Sci 290
   Lab 10
*/

import java.util.Scanner; //is a Java object that allows you take user input

public class Lab10{ // name of the class file
  
  public static void main(String[] args){ //entry point of application
  
    // 3.8 (Sort three integers)
    // Write a program that prompts the user to enter three integers and display the 
    // integers in non-decreasing order.
    // HINT: Use if-elseif-else for this problem.
    
    Scanner input = new Scanner(System.in); // Setting up Scanner for user input
    
    System.out.print("Enter three integers: "); // prompts the user to enter the integers
    
    int num1 = input.nextInt(); // reads the incoming input
    
    int num2 = input.nextInt(); // reads the incoming input
    
    int num3 = input.nextInt(); // reads the incoming input
            
    int temp; // stores the value
    
    if(num1 > num2 && num1 > num3 && num2 > num3)
      
    {
            System.out.println("Integers in non-decreasing order: " + num1 + " " + num2 + " " + num3);
      
        }
    
    else if(num2 < num1 && num3 < num2)
      
    {
      
            System.out.println("Integers in non-decreasing order: " + num3 + " " + num2 + " " + num1);
      
        }
    
    else if(num2 < num1 && num2 < num3 && num1 > num3)
      
    {
      
            System.out.println("Integers in non-decreasing order: " + num1 + " " + num3 + " " + num2);
      
        }
    
    else if(num2 < num1 && num2 < num3 && num3 > num1)
      
    {
      
            System.out.println("Integers in non-decreasing order: " + num2 + " " + num1 + " " + num3);
      
        }
    
    else if(num2 < num1 && num2 > num3 && num3 < num1)
      
    {
      
            System.out.println("Integers in non-decreasing order: " + num2 + " " + num3 + " " + num1);
      
        }
    
    else
      
    {
      
            System.out.println("Integers in non-decreasing order: " + num3 + " " + num1 + " " + num2);     
      
        }
             
  }
  
}