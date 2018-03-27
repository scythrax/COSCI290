/* John Paul De Jesus
   Co Sci 290
   Mid Term
*/


import java.util.Scanner;
public class Midterm{
  public static void main(String[] args){
    
    // Modify your last lab to prompt the user to enter a FIVE-digit integer instead and determines
    // whether it is a palindrome number.
    
    // 3.12 (Palindrome number) Write a program that prompts the user to enter a five-digit
    // integer and determines whether it is a palindrome number. A number is palindrome if it
    // reads the same from right to left and from left to right. Here is a sample run of this
    // program:
    
    Scanner input = new Scanner(System.in); // Setting up Scanner for user input
    
    System.out.print("Enter a five-digit integer:");
    
    int number = input.nextInt();
 
    // Extracting digits
    int first = number / 100;
      
    int second = number % 10;
    
    int third = number % 10;
    
    int fourth = number % 10;
    
    int fifth = number % 10;
    
    
                       
    if (fifth == first || third > number || second == fourth || second > number)
    {
    
    System.out.println(number + " is a palindrome ");
    
    } 
    
    else
      
    {
    
    System.out.println(number + " is not a palindrome ");
    
  }
 
 }
 
}