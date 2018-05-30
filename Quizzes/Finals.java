/*  
    John Paul De Jesus
    Co Sci 290
    Final
*/

//A. Write a program that generates 300 random integers between 0 and 14 and displays the count for each number.
//   (Hint: Use an array of 15 integers, say counts, to store the counts for the number of 0s, 1s, . . . , 14s.)

//B. Then let's analyze the data that was randomly generated (make sure to output these):

//Find the total counts for even numbers (zero is an even number)
//Find the total counts for odd numbers 





public class Finals{
  //starting point of program
  public static void main(String[] args){
    
    //declare an array of integers
    int [] counts = new int[15];
        
    //randomly assigned into each index using a loop
    for(int i = 1; i <= 300; i++){
      
      counts[(int)(Math.random() * 15)]++;
        
    }
    
    System.out.println("Count for each even number between 0 and 15 ");
  
    //print out each element (iterate the array)
    for(int i = 0; i <= counts.length; i++){
      
      if (i%2==0) 
      
      System.out.println(i + "s " + counts[i]);
                
    }
    
    System.out.println("Count for each odd number between 0 and 15 ");
    
    //print out each element (iterate the array)
    for(int i = 0; i <= counts.length; i++){
      
      if(i%2!=0)     
        
        System.out.println(i + "s " + counts[i]);
    }
       
    
  }//end main
  
}//end class