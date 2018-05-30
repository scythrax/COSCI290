/* John Paul De Jesus
   Co Sci 290
   Lab 21
*/

import java.util.Scanner;

public class Lab21{
  
   public static void main(String[] args){
     
     //7.7 (Count single digits) Write a program that generates 100 random integers between
    //0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
    //say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)     
     
     int[] counts = new int[10];
     
     for(int i = 1; i <= 100; i++){
       
       counts[(int)(Math.random() * 10)]++;
       
     }
     
     System.out.println("Count for each number between 0 and 9: ");
     
     for(int i = 0; i < counts.length; i++){
       
       System.out.println(i + "s " + counts[i]);
       
     }
     
     
     
     

       
     
     //7.12  (Reverse an array) The reverse method in Section 7.7 reverses an array by copying 
     //it to a new array. Rewrite the method that reverses the array passed in the argument and
     //returns this array. Write a test program that prompts the user to enter ten numbers, 
     //invokes the method to reverse the numbers, and displays the numbers.
     
     Scanner input = new Scanner(System.in);
     
     int[] numbers = new int[10];
     
 
     System.out.print("Enter 10 integers:");
     
     for (int i = 0; i < numbers.length; i++){
       
       numbers[i] = input.nextInt();
       
     }
     
     int[] reverseNumbers = reverse(numbers);
     
           
        //Printing both the original array and returned array.
        //This is a good demonstration of what happen when arrays are passed to function.
        //They are both pointing to the same array after the function call.
    
     System.out.println("Pringting the original array: ");
     
     for (int i = 0; i < numbers.length; i++){
       
       System.out.print(numbers[i] + " "); 
     }
     
   
     System.out.println();
     
     System.out.println("Pringting the returned array: ");
     
     for (int i = 0; i < reverseNumbers.length; i++){
     
       System.out.println(reverseNumbers[i] + " "); 
       
     }
     
 }
  
 
  public static int[] reverse(int[] list){
   
    int temp;
   
    for (int i = 0, j = list.length -1; i < list.length/2; i++, j--){
      
     temp = list[j];
      
      list[j] = list[i];
      
      list[i] = temp;
      
  }
 
    return list;
    
    
    
    //7.15  (Eliminate duplicates) Write a method that returns a new array by eliminating
    //the duplicate values in the array using the following method header:
    
    //public static int[] eliminateDuplicates(int[] list)
    
    //Write a test program that reads in ten integers, invokes the method, and displays the results.
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 }//end main
 
}//end class