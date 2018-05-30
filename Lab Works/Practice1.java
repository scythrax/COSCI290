/*
  John Paul De Jesus
  Co Sci 290
  
  Lab - comment every single line of code
  
  Output:
  
  
  */
import java.util.Scanner; // is a Java object that allows you take user input
public class Practice1{ // name of the java file
  
  //entry point of app
  
    // it is a access specifier that means it will be accessed by publically. 
    // static : it is access modifier that means when the java program is load then it will create the space in memory automatically. 
    // void : it is a return type i.e it does not return any value. main() : it is a method or a function name
   
   public static int banana(int[] a){
     // Storing result of calculation
      int kiwi = 1;
      // Storing index to travserse `a`
      int i = 0;
      while (i < a.length){
         kiwi = kiwi * a[i];
         i++;
      }
      return kiwi;
   }
   
   /**
   * Finds the index of first `grape` in `a`
   * indexOf(`grape`)
   * @return Index of `grape`; -1 if not found
   */
   public static int grapefruit(int[]a, int grape){
      for (int i=0;i<a.length;i++){
         if (a[i] == grape){
            return i;
         }
      }
      return -1;
   }
   
   /**
   * Counts the total appearance of `apple` in `a`
   * (a.filter {$0 == apple}).count
   */
   public static int pineapple(int[] a, int apple){
      // Storing total number of `apple`
      int pear = 0;
      for (int pine: a){
         if (pine == apple){
            pear++;
         }
      }
      return pear;
   }
  
  public static void main(String[] args){
    return;
  }
}


      


    
 









































