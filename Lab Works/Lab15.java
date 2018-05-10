/*
  John Paul De Jesus
  
  CO SCI 290
  
  Lab 15
*/

import java.util.Scanner;

public class Lab15{
  
  //start of program
  public static void main(String[] args){
    
// 6.2 (Sum the digits in an integer)
// Write a method that computes the sum of the digits in an integer. 
// Use the following method header:
// public static int sumDigits(int n)
// Max digit size of n is 3.
// For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator to extract digits, and the / 
// operator to remove the extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 
// 4 from 234, use 234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit until all the digits 
// are extracted. Write a test program that prompts the user to enter an integer and displays the sum of all 
// its digits. 
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the sum of the digits: ");
    
    int value = input.nextInt();
    
    System.out.println("The sum of the digits in an integer: " + sumDigits(value));
    
  }
  
  public static int sumDigits(int n){
    
    int sum = 0;
    
    do{
      
    sum += n % 10;
 
    }  
    
    while ((n = n / 10) != 0);
    
    return sum;
    
  }
  
  // 6.5 (Sort three numbers)
  // Write a method with the following header to display three numbers in increasing order:
  // public static void displaySortedNumbers( double num1, double num2, double num3)
  
  System.out.print("Enter the three numbers: ");
    
    double number1 = input.nextDouble();
    
    double number2 = input.nextDouble();
    
    double number3 = input.nextDouble();
    
    displaySortedNumbers(number1, number2, number3);
  
  public static void displaySortedNumbers(double num1, double num2, double num3){
    
    double temp;
    
    if(num2 < num1 && num3 < 2){
      
      temp = num1;
      
      num1 = num2;
      
      num2 = temp;
      
    }
    
    else if(num3 < num1 && num3 < num2){
      
      temp = num1;
      
      num1 = num3;
      
      num3 = temp;
      
    }
    
    if(num3 < num2){
      
      temp = num2;
      
      num2 = num3;
      
      num3 = temp;
      
    }
    
    System.out.println(num1 + "" + num2 + "" + num3);
    
  }

}




