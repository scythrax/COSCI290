/* John Paul De Jesus
   Co Sci 290
*/


import java.util.Scanner;
public class Lab11{
  public static void main(String[] args){
    
    
    // 3.12 (Palindrome number) Write a program that prompts the user to enter a three-digit
    // integer and determines whether it is a palindrome number. A number is palindrome if it
    // reads the same from right to left and from left to right. Here is a sample run of this
    // program:
    
    
    Scanner input = new Scanner(System.in); // Setting up Scanner for user input
    
    System.out.print("Enter a three-digit integer:");
    
    int number = input.nextInt();
 
    // Extracting digits
    int first = number / 100;
    
    int last = number % 10;
    
    if (last == first)
  
    {
    
    System.out.println(number + " is a palindrome ");
    
    } 
    
    else
      
    {
    
    System.out.println(number + " is not a palindrome ");
    
  }
 
 }
 
}