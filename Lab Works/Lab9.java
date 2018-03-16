/* John Paul De Jesus
   Co Sci 290
   Lab 9   
*/

import java.util.Scanner;

public class Lab9{
  
  public static void main(String[] args){
    
    // Sum the digits in an integer. Write a program that reads an integer between 0 and 1000
    // and adds all digits in the integer. For example, if an integer is 932, the sum of all
    // its digits is 14.
    
    // Hint: Use the % operator to extract digits, and use the / operator to remove the extracted
    // digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.digit
    
    Scanner input = new Scanner(System.in);
     
    System.out.print("Enter an integer between 0 and 1000: "); // Enter a number between 0 and 1000
    
    int v1 = input.nextInt(); // inputs the entered value
    
    int v2 = v1 % 10; // Enters the first digit. The remainder becomes 0.
    
    v1 /= 10; // The remaining digit stays.
       
    int v3 = v1 % 10; // Enters the second digit. The remainder becomes 0.
    
    v1 /= 10; // The remaining digit stays.
    
    int v4 = v1 % 10; // Enters the third digit. The remainder becomes 0.
    
    v1 /= 10; // The remaining digit stays.
    
    int sum = (v4 + v3 + v2); // sum variable adds all entered integers
    
    System.out.println("The sum of all digits in an integer is " + sum); // Displays the result: 9+3+2 = 14
                                                                             
  }
  
}