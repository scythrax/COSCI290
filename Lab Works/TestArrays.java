/*
  Author: Sina
  Purpose; Go over the basics of an array.
*/
public class TestArrays{
  //starting point of program
  public static void main(String[] args){
    
    //declare an array of integers
    int[] numbers = new int[5];
    // {0, 0, 0, 0, 0}
    //  0  1  2  3  4
    
    //assign a value inside this array called numbers
    numbers[0] = 100;
    numbers[1] = 33;
    numbers[2] = -1;
    numbers[3] = 3;
    numbers[4] = -8;
    
    //update a value
    numbers[0] = 3;
    numbers = new int[6];
    //{0, 0, 0, 0, 0, 0}
    numbers[5] = -12;
    //{0, 0, 0, 0, 0, -12}
    
    //randomly assigned into each index using a loop
    for(int i = 0; i < 6; i++){
      numbers[i] = (int)(Math.random() * 100) + 1;
    }
    
    //print out each element (iterate the array)
    for(int i = 0; 1 < 6; i++){
      System.out.println(numbers[i] + " ");
    }
     

    
  }//end main
}//end class
  