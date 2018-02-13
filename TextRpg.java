/*
   John Paul De Jesus
   Co Sci 290
   Lab February 13, 2018
   Testing datatypes and input from the user
   
 */
 import java.util.Scanner; //is a Java object that allows you take user input

 public class TextRpg{
 
 public static void main(String[] args){
 int numberofSurvivors = 17;
 double avgDEATHS = 200;
 String name = "";
     boolean gameOver = false; //or true
     int age = 0;
   
      
     Scanner input = new Scanner(System.in);
     
     System.out.println("Hi, what do things do you wanna look for in order to survive first: ");
     
     name = input.next(); //.next() is String types
     
     System.out.println("Look for water bottles inside the packages " + name);
     
     System.out.println("How old are you?");
     
     age = input.nextInt(); //nextInt() is for int types
     
     System.out.println("You are "+ age + " years old!");
     
     
    
   
 
    }
   
 }