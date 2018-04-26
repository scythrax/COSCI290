/*
  John Paul De Jesus
  
  Lecture:
    Introduction to methods
    
  Lab 13
    Finish the multiply and division methods.
*/

public class Lab13{
  
  //start of program
  public static void main(String[] args){
    
    //declare variables
    int a = 1;
    int b = 3;
    int c = 0;
    int d = -5;
    
    //print the operations of a and b
    System.out.println("Operations on a and b: ");
    System.out.println("addition = " + add(a, b));
    System.out.println("subtraction = " + subtract(a, b));
    System.out.println("multipication = " + multiply(a, b));
    System.out.println("division = " + divide(a, b));
    
    //print the operations of c and d
    System.out.println("Operations on c and d: ");
    System.out.println("addition = " + add(c, d));
    System.out.println("subtraction = " + subtract(c, d));
    System.out.println("multipication = " + multiply(c, d));
    System.out.println("division = " + divide(c, d));
    
  }//end of main
  
  
  //this custom method adds two integers
  public static int add(int num1, int num2){
    
    //declare variables
    int sum = 0;
    
    //add num1 and num2 and assign to sum
    sum = num1 + num2;  
    
    //return sum of num1 and num2
    return sum;
    
  }//end of add
  
  
  //this custom method subtracts two integers
  public static int subtract(int num1, int num2){
    
    //declare variables
    int difference = 0;
    
    //subtract num1 by num2 and assign to difference
    difference = num1 - num2;
    
    //return the difference
    return difference;
    
  }//end of subtract;
  
  
  //this custom method multiplies two integers
  public static int multiply(int num1, int num2){
    
    //declare variables
    int product = 0;
    
    //multiply num1 and num2 and assign to product
    product = num1 * num2;
    
    //return the multiplication
    return product;
    
  }//end of multiply;
  
  
  //this custom method divides two integers
  public static int divide(int num1, int num2){
    
    //declare variables
    int quotient = 0;
    
    //divide num1 and num2 and assign to quotient
    quotient = num1 / num2;
    
    //return the division
    return quotient;
        
  }//end of divide
  
}//end of class