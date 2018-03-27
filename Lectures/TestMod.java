/* John Paul De Jesus
   Co Sci 290
   
   Testing mod to find remainders and using / to get that remainder as a variable
*/


import java.util.Scanner;

public class TestMod{
  
  //entry point
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    // hardcode a 3-digit number
    int num = 134;
    int temp1 = 0;
    int temp2 = 0;
       
    temp1 = num % 10;
    num = num / 10;
    
    System.out.println("Temp1 " + temp1);
    System.out.println("Num " + num);         
    
    temp2 = num / 10;
    
    System.out.println("Temp2 " + temp2);
                       
  }
                       
}

                       