/*

  John Paul De Jesus
  Co Sci 290
  
*/

// 5.10 (Find numbers divisible by 5 and 6)
// Write a program that displays all the num-
// bers from 100 to 1,000, ten per line, that 
// are divisible by 5 and 6. Numbers are
// separated by exactly one space

public class Lab18{
  
  //entry point of program
  public static void main(String[] args){
      
    int counter = 0;
    
    for(int i = 100; i <= 1000; i++){ //i++ is the same as i = i + 100
      
      if(i % 5 == 0 && i % 6 == 0){ // i is divisble by 5 and i is divisible by 6
        
        counter++;
            
      System.out.print(i + " ");
          
      if(counter % 10 == 0){
        
         System.out.println();    
        
      }          
        
      }
      
    } 
 
  }//end of main
  
  // 5.16 (Find the factors of an integer)
  // Write a program that reads an integer and displays all its smallest factors in increasing order. 
  // For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3 , 5
  
  int factor = 2;
  
  while (factor <= n) {
  if (n % factor == 0)
  break;
    
    factor++;
    
    }
  
  System.out.println("The smallest factor other than 1 for "
                    + n + " is " + factor);
  
}//end of class
