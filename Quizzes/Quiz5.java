/* 
   John Paul De Jesus
   Co Sci 290
   Quiz 5
*/

// Write a program that uses Scanner to prompt the user for a name. 
// Loop through each character in this name to count how many vowels
// are in this name.
// For example, String name = "Sina";
// Using the charAt(i) built-in function for the String class, you can 
// use a for-loop to go through each index (which is each character in the name) 
// and nest if-statements to check for cases when the character is equal to 
// 'a', 'e', 'i', 'o', or 'u' (we will ignore 'y'). 
// So, using the following code bit:

// name.charAt(i)

// in a loop will allow you to grab that character at that index. Be sure to use
// i < name.length() in the conditional in the for-loop to terminate the loop.
// Based on the example above, the output should be:
// "There are 2 vowels in the name Sina."

public class Quiz5{
    
  //entry point of program
  public static void main(String args[]){
    
    //declare variables
    String name = "John Paul De Jesus";
    
    int vowels = 0;
    
    int consonants = 0;
    
    int numbers = 0;
    
    int spaces = 0;

    name = name.toLowerCase();
    
    for(int i = 0; i < name.length(); ++i){
      
      char ch = name.charAt(i);
            
      if(ch == 'a' || ch == 'e' || ch == 'i'
         
         || ch == 'o' || ch == 'u'){
        
        ++vowels;
        
      }
      
      else if((ch >= 'a' && ch <= 'z')){
        
        ++consonants;
        
      }
      
      else if(ch >= '0' && ch <= '9')
        
      {
        
        ++numbers;
        
      }
      else if(ch == ' ')
        
      {
        
        ++spaces;
        
      }
        
    }
    
    System.out.println("There are " + vowels + " vowels" + " in John Paul De Jesus.");            

  }//end of main

}//end of class
          