/* John Paul De Jesus
   Co Sci 290
   HW 3
*/

import java.util.Scanner;

public class HW3{
  
  //  2.12 (Physics: finding runway length)
  
  //  Given an airplane acceleration a and take-off speed v, you can compute the minimum runway length
  //  needed for an airplane to take off using the following formula: length = v2/2a 
  //  Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in 
  //  meters/second squared (m/s2), and displays the minimum runway length. Here is a sample run:
  
  //  Enter speed and acceleration: 60 3.5 
  //  The minimum runway length for this airplane is 514.286 
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the speed and accleration: ");
    
    double volume = input.nextDouble();  // declare volume = speed symbol
    
    double acceleration = input.nextDouble();  // declare acceleration = acceleration symbol
    
    double length = Math.pow(volume, 2) / (2 * acceleration);   
    
    System.out.println("The minimum runway length for this " + "airplane is " + length); // display results
    
    
  //  2.13 (Financial application: compound value)  
  //  Suppose you save $100 each month into a savings account with the annual interest rate 5%.
  //  Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value in
  //  the account becomes 
    
  //  100 * (1 + 0.00417) = 100.417
    
  //  After the second month, the value in the account becomes
    
  //  (100 + 100.417) * (1 + 0.00417) = 201.252
    
  //  After the third month, the value in the account becomes
    
  //  (100 + 201.252) * (1 + 0.00417) = 302.507
    
  //  Write a program that prompts the user to enter a monthly saving amount and displays the account
  //  value after the sixth month. (In Exercise 5.30, you will use a loop to simplify the code and display 
  //  the account value for any month.)
    
  //  Enter the monthly saving amount: 100 
  //  After the sixth month, the account value is $608.81 
    
    final double MONTHLY_INTEREST_RATE = 0.00417; // initialize constant
    
    System.out.println("Enter the monthly savings amount: ");
    
    double savingAmount = input.nextDouble();
      
    double total = 100 * (1 + MONTHLY_INTEREST_RATE); // First month of account value
    
    total = (100 + total) * (1 + MONTHLY_INTEREST_RATE); // Second month of account value
    
    total = (100 + total) * (1 + MONTHLY_INTEREST_RATE); // Third month of account value
    
    total = (100 + total) * (1 + MONTHLY_INTEREST_RATE); // Fourth month of account value
    
    total = (100 + total) * (1 + MONTHLY_INTEREST_RATE); // Fifth month of account value
    
    total = (100 + total) * (1 + MONTHLY_INTEREST_RATE); // Sixth month of account value
    
    System.out.println("After sixth months, " + "the total savings is: " + total);
   
  //  2.14  (Health application: computing BMI)
  //  Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your
  //  weight in kilograms and dividing by the square of your height in meters. Write a program that
  //  prompts the user to enter a weight in pounds and height in inches and displays the BMI. Note
  //  that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is a sample run:
    
  //  Enter weight in pounds: 95.5 
  //  Enter height in inches: 50 
  //  BMI is 26.8573 
  
    final double KILOGRAMS_PER_POUND = 0.45359237; // initialize constant value for kilograms per pound
    
    final double METERS_PER_INCH = 0.0254; // intialize constant value for meters per inch
    
    System.out.println("Enter the weight in pounds: "); // prompts the user to enter the value for weight in pounds
    
    double weight = input.nextDouble(); // records the value from the first variable
    
    System.out.println("Enter the height in inches: "); // prompts the user to enter the value for height in inches   
     
    double height = input.nextDouble(); // records the value from the second variable
    
    weight = weight * KILOGRAMS_PER_POUND; // converts pounds to kilograms
    
    height = height * METERS_PER_INCH; // converts inches to meters
    
    double bodyMassIndex = weight / (Math.pow(height, 2)); // initiate the formula of the body mass index
        
    System.out.println("BMI is " + bodyMassIndex); // displays the result

  }
  
}