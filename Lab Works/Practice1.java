/*
  John Paul De Jesus
  Co Sci 290
  
  Lab - comment every single line of code
  
  Output:
  
  
  */
import java.util.Scanner; // is a Java object that allows you take user input
public class Practice1{ // name of the java file
  
  //entry point of app
  public static void main(String[] args){ 
    // it is a access specifier that means it will be accessed by publically. 
    // static : it is access modifier that means when the java program is load then it will create the space in memory automatically. 
    // void : it is a return type i.e it does not return any value. main() : it is a method or a function name
    
    Scanner input = new Scanner(System.in); // needs import java.util.Scanner to be able to use this statement which allows user input
    int operand1; // Variables of type int store the actual binary value for the integer you want for operand1 to be manipulated.
    int operand2; // Variables of type int store the actual binary value for the integer you want to operand2 to be manipulated.
    
    System.out.println("Please enter in a whole number..."); // type in a whole number for operand1
    
    operand1 = input.nextInt(); //stores a number in operand1
    
    System.out.println("Please enter in another whole number..."); // type in a whole number for operand2
    
    operand2 = input.nextInt(); //stores a number in operand2
    
    System.out.println("Let's do some basic math! \n "
                      + "Here are the numbers you chose."); // outputs a statement
    System.out.println("Operand1: " + operand1 + " and Operand2: " + operand2); // outputs Operand1 and Operand2 
    System.out.println(operand1 + operand2); // adds operand1 and operand2
    System.out.println(operand1 * operand2); // multiplies operand1 and operand2
    System.out.println(operand1 / operand2); // divides operand1 and operand2
    System.out.println(operand1 - operand2); // subtracts operand1 and operand2
    
  }
  
}