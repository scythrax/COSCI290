/*
  John Paul De Jesus
  Co Sci 290
  
  Use control structures to do string manipulation
    and user validation
    
  Built-in String functions
    str.length()
    str.toLowerCase() - makes all letters lowercase
    str.toUpperCase() - makes all letters uppercase
    str.equals("some other string") - checks if two strings are
        exactly regardless of case
    str.equalsIgnorease("no") - checks if two strings are
      equal regardless of case
    str.charAt(int index) - get a specific character at index
    
  */
  public class Logic1{
  
    //main method
    public static void main(String[] args){
    
    //declare variables
    String str = "Java Rules!"; //length = 11
    int num = 10;
    
    //use loop to iterate through str
    for(int index = 0; index < str.length(); index++){
      //first iteration - index = 0 - "J" - index updates to 1
      //2nd iteration - index = 1 - "a" - index updates to 2...
      System.out.println(str.charAt(index));   
     
      }//end for-loop 
      
      if(num % 2 == 0){
        System.out.println("This number is even!");
    }
    else{
       System.out.println("This number is odd!");
    }
    
  }
  
}