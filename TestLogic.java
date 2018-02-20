/*
  John Paul De Jesus
  Co Sci 290
  
  Topics:
    -multi-way if-else
    -logical operators
    -symbolic logical
    
*/

import java.util.Scanner;
public class TestLogic{
  
  //prompt the user to enter in a grade
  public static void main(String[] args){
    
    //Setting up Scanner for user input
    Scanner input = new Scanner(System.in);
    int grade = 90;
    
    //simple if
    if(grade >= 90){
      System.out.println("A");
   
    
    //two-way if-else
    if(grade < 90){
      System.out.println("grade is not an A");
    }
    else{
      System.out.println("grade is an A");
    }
    
    //multi if-else-elseif
    if(grade >= 90){
      System.out.println("A");
    }
    else if(grade >= 80){
      System.out.println("B");
    }
    else if(grade >= 70){
      System.out.println("C");
    }
    else{
      System.out.println("F");
    }
      
    /*
      Logical operators
      
      ! - NOT
      != - NOT equal to
      == - is equal to?
      && - AND
      || - OR
      
    */
    
    //using if-else, write code that checks whether
    //a student grade is good, average, or bad
    if(grade >= 80){
      System.out.println("This is a good grade.");
      
      //nested-if
      if(grade >= 90){
        System.out.println("Wow, you got an A!");
        
      }
    }  
    else if(grade < 80 && grade >= 70){
      System.out.println("This is a average. ");
    }
    else{
      System.out.println("This is a bad grade");
    }  
      
  }

}
