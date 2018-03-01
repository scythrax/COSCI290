/* 
  John Paul De Jesus
  Co Sci 290
  
  Demo on the String class
*/

import java.util.Scanner;
public class TestStrings{

  //main method
  public static void main(String[] args){
    
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    /*
      Impose some rules on user input
      name.length() - gives a int of how many characters the String is long
            
    */
      
    int nameLength = 0;
    String answer = "";
    boolean flag = false;
    
    //example of a while loop
    while(answer.length() < 2 && !flag){
      
      System.out.println("What is your name?");
      
      //get answer from console
      String answer = input.next();
      
      //check if name is less than 2 characters
      if(answer.length() < 2 || flag){
      System.out.println("Please enter in a name that is at least"
                        + "two characters long");
      }
      else{ //name is at least 2 characters
        
        //check if name contains letters
        
        //for example, go through each letters in the name "Lo!gan"
        //name.charAt(0) to look at the character in index 0
        
        //use a for-loop because we know how many letters it has
        for(int index = 0; index < answer.length(); index++){
          
          System.out.println(answer.charAT(index));
        
          //check if the character is a letter or a number
          if(!Character.isLetter(answer.charAt(index))){ //if it's not a letter
            flag = true;
            break; //gets out of current loop
          }
          else{
            System.out.println(answer.charAt(index));
          }
        }
        
      }
      
      
      
      nameLength = answer.length();
    } //end while loop
   
    /*
       When you want code to run at least once, use a do-while loop
       
      do{
        the body with code.
        ...
        
      }while(some condition)
      
    /*
      Example below is to test for specific response
      
      answer.toLowerCase() - makes all letters lowercase
      answer.toUpperCase() - makes all letters uppercase
      answer.equals("some other string") - checks if two Strings are
        exactly regardless of case
      answer.equalsIgnoreCase("no") - checks if two Strings are
        equal regardless of case
        
    */
    
    System.out.println("example of getting a specifc");
    //check if answer is specifically Yes or No
    if(answer.equalsIgnorCase("No")){ //"no" != "No" != NO != nO
      System.out.println("That sucks!");
    }
    else{
      System.out.println("Cool.");
    }
    
  }
  
}