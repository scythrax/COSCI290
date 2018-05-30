/* John Paul De Jesus
   Co Sci 290
   Lab 22
*/

// Write a program that generates 200 random integers between 0 and 14 and displays the count for each number. 
// (Hint: Use an array of 15 integers, say counts, to store the counts for the number of 0s, 1s, . . . , 14s.)

public class Lab22{
  
  public static void main(String[] args){
    
    int[] counts = new int[15];
    
    for(int i = 1; i <= 200; i++){
      
      counts[(int)(Math.random() * 15)]++;
      
    }
    
    System.out.println("Count for each number between 0 and 14: ");
    
    for(int i = 0; i < counts.length; i++){
      
      System.out.println(i + "s: " + counts[i]);
      
    }
    
  }
  
}


