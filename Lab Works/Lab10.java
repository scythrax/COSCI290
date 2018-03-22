/* John Paul De Jesus
   Co Sci 290
   Lab 10
*/

import java.util.Scanner;

public class Lab10{
  
  public static void main(String[] args){
  
    // 3.8 (Sort three integers)
    // Write a program that prompts the user to enter three integers and display the 
    // integers in non-decreasing order.
    // HINT: Use if-elseif-else for this problem.
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter three integers: ");
    
    int num1 = input.nextInt();
    
    int num2 = input.nextInt();
    
    int num3 = input.nextInt();
            
    int temp;
    
    if(num1 < num2 && num1 < num3 && num2 < num3)
      
    {
            System.out.println("Decreasing order: " + num1 + " " + num2 + " " + num3);
      
        }
    
    else if(num2 < num1 && num3 < num2)
      
    {
      
            System.out.println("Decreasing order: " + num3 + " " + num2 + " " + num1);
      
        }
    
    else if(num2 > num1 && num2 > num3 && num1 < num3)
      
    {
      
            System.out.println("Decreasing order: " + num1 + " " + num3 + " " + num2);
      
        }
    
    else if(num2 > num1 && num2 > num3 && num3 < num1)
      
    {
      
            System.out.println("Decreasing order: " + num2 + " " + num1 + " " + num3);
      
        }
    
    else if(num2 > num1 && num2 > num3 && num3 > num1)
      
    {
      
            System.out.println("Decreasing order: " + num2 + " " + num3 + " " + num1);
      
        }
    
    else
      
    {
      
            System.out.println("Decreasing order: " + num3 + " " + num1 + " " + num2);     
      
        }
             
  }
  
}