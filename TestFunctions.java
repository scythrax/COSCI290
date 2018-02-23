/* John Paul De Jesus
   Co Sci 290 Lecture
   
*/


//testing custom function called findSum()
System.out.println("The sum of 2 and 3 is: " + findSum(2, 3));

//test printHello()
System.out.println(printHello("Sina"));

}

//this function funds the sum of two given numbers
public static int findsum(int num1, int num2){
  int sum = num1 + num2;
  return sum;
}

public static void printHello(String name){
  System.out.println("Hello " + name);
}

}