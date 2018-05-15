/* John Paul De Jesus
   Co Sci 290
   Lab 20
*/

public class Lab20{
  //starting point of a program
  public static void main(String[] args){

   //declare an array of integers
    int[] numbers = new int[5];
    // {0, 0, 0, 0, 0}
    //  0  1  2  3  4
    
    //assign a value inside this array called numbers
    numbers[0] = -30;
    numbers[1] = 42;
    numbers[2] = 9;
    numbers[3] = 11;
    numbers[4] = 200;
    
    //randomly assigned into each index using a loop
    for(int i = 0; i < 5; i++){
      numbers[i] = (int)(Math.random() * 100) + 1;
    }
    
    //print out each element (iterate the array)
    for(int i = 0; 1 < 5; i++){
      System.out.println(numbers[i] + " dmg"); //prints out the dmg
    }
     

    
  }//end main
}//end class