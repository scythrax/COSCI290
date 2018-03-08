//John Paul De Jesus
//Co Sci 290
//Homework 1

 /*
   This is a very short story-telling game about a Zombie Professor.
 */

import java.util.Scanner;

public class GameDriver{
  
  //main method, where the application starts
  public static void main(String[] args){
    
    //variable declarations with default values
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    int numberOfStudents = 0;
    String Professor = "";
    int randomNum = 0;
    int minimum = 1; //set min for range for random numbers
    int maximum = 16; //set max for range for random numbers
 
    //Splash Screen
    System.out.println( " @@@@@@@@@@   @@@ @@@  \n"
                      + " @@@@@@@@@@@  @@@ @@@  \n"
                      + " @@! @@! @@!  @@! !@@  \n"
                      + " !@! !@! !@!  !@! @!!  \n"
                      + " @!! !!@ @!@   !@!@!   \n"
                      + " !@!   ! !@!    @!!!   \n"
                      + " !!:     !!:    !!:    \n" 
                      + " :!:     :!:    :!:    \n"
                      + " :::     ::      ::    \n" 
                      + "  :      :       :     \n" 
                      
                                                                     
+ " @@@@@@@  @@@@@@@@   @@@@@@    @@@@@@@  @@@  @@@  @@@@@@@@  @@@@@@@  \n" 
+ " @@@@@@@  @@@@@@@@  @@@@@@@@  @@@@@@@@  @@@  @@@  @@@@@@@@  @@@@@@@@   \n"
+ "   @@!    @@!       @@!  @@@  !@@       @@!  @@@  @@!       @@!  @@@  \n"
+ "   !@!    !@!       !@!  @!@  !@!       !@!  @!@  !@!       !@!  @!@  \n"
+ "   @!!    @!!!:!    @!@!@!@!  !@!       @!@!@!@!  @!!!:!    @!@!!@!  \n" 
+ "   !!!    !!!!!:    !!!@!!!!  !!!       !!!@!!!!  !!!!!:    !!@!@!   \n" 
+ "   !!:    !!:       !!:  !!!  :!!       !!:  !!!  !!:       !!: :!!  \n" 
+ "   :!:    :!:       :!:  !:!  :!:       :!:  !:!  :!:       :!:  !:! \n" 
+ "    ::     :: ::::  ::   :::   ::: :::  ::   :::   :: ::::  ::   ::: \n" 
+ "    :     : :: ::    :   : :   :: :: :   :   : :  : :: ::    :   : :  \n"
                       
                                               
+ " @@@   @@@@@@       @@@@@@ \n"  
+ " @@@  @@@@@@@      @@@@@@@@ \n"
+ " @@!  !@@          @@!  @@@ \n" 
+ " !@!  !@!          !@!  @!@ \n" 
+ " !!@  !!@@!!       @!@!@!@! \n" 
+ " !!!   !!@!!!      !!!@!!!! \n" 
+ " !!:       !:!     !!:  !!! \n" 
+ " :!:      !:!      :!:  !:! \n" 
+ "  ::  :::: ::      ::   ::: \n" 
+ " :    :: : :        :   : : \n" 
                            
                                                          
+ " @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@   @@@  @@@@@@@@ \n"
+ " @@@@@@@@  @@@@@@@@  @@@@@@@@@@@  @@@@@@@@  @@@  @@@@@@@@ \n" 
+ "      @@!  @@!  @@@  @@! @@! @@!  @@!  @@@  @@!  @@!      \n" 
+ "     !@!   !@!  @!@  !@! !@! !@!  !@   @!@  !@!  !@!      \n" 
+ "    @!!    @!@  !@!  @!! !!@ @!@  @!@!@!@   !!@  @!!!:!   \n"  
+ "   !!!     !@!  !!!  !@!   ! !@!  !!!@!!!!  !!!  !!!!!:   \n"  
+ "  !!:      !!:  !!!  !!:     !!:  !!:  !!!  !!:  !!:      \n"  
+ " :!:       :!:  !:!  :!:     :!:  :!:  !:!  :!:  :!:      \n"  
+ "  :: ::::  ::::: ::  :::     ::    :: ::::   ::   :: :::: \n" 
+ " : :: : :   : :  :    :      :    :: : ::   :    : :: ::  \n");                       

                                                                     
    System.out.println("\nIt happens during in our class when the sun eclipse happens... \n");
    System.out.println("\nOur Professor starts talking weird gibberish words and all of the sudden her skin begins to change... \n");
    System.out.println("\nHer skin starts to look grey and the veins are popping out as if it's pumping more blood... \n");
    System.out.println("\nProfessor, is there something wrong? \n");
    
    Professor = input.next();  
    System.out.println("\nWell " + Professor + " But I am kinda hungry!!!!");
    System.out.println("How many students are here? Hmmm");
   
    numberOfStudents = input.nextInt(); //get number of students from user and assign to numberOfStudents variable declared above
      
    System.out.println("\nThere are ONLY " + numberOfStudents + " student(s) in class with you? Then I think");
      
    //get a random number
    randomNum = minimum + (int)(Math.random() * maximum);
    
    if(randomNum >= 16){
      System.out.println("\nI will let you all live for now!!");
    }
    else{
      System.out.println("\nAll of you will be eaten by me. Rawr!!!...");
    }
    
    
    System.out.println( " @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@ \n"
                      + " @@@@@@@@@  @@@@@@@@  @@@@@@@@@@@  @@@@@@@@ \n" 
                      + "  !@@        @@!  @@@  @@! @@! @@!  @@! \n"      
                      + "  !@!        !@!  @!@  !@! !@! !@!  !@! \n"      
                      + "  !@! @!@!@  @!@!@!@!  @!! !!@ @!@  @!!!:! \n"    
                      + "  !!! !!@!!  !!!@!!!!  !@!   ! !@!  !!!!!: \n"   
                      + "  :!!   !!:  !!:  !!!  !!:     !!:  !!: \n"      
                      + "  :!:   !::  :!:  !:!  :!:     :!:  :!: \n"      
                      + "  ::: ::::  ::   :::  :::     ::    :: :::: \n" 
                      + "  :: :: :    :   : :   :      :    : :: :: \n"  
                                            
                                        
                      + "   @@@@@@   @@@  @@@  @@@@@@@@  @@@@@@@  \n" 
                      + "   @@@@@@@@  @@@  @@@  @@@@@@@@  @@@@@@@@  \n"
                      + "   @@!  @@@  @@!  @@@  @@!       @@!  @@@  \n"
                      + "   !@!  @!@  !@!  @!@  !@!       !@!  @!@  \n"
                      + "   @!@  !@!  @!@  !@!  @!!!:!    @!@!!@!  \n" 
                      + "   !@!  !!!  !@!  !!!  !!!!!:    !!@!@!  \n"  
                      + "   !!:  !!!  :!:  !!:  !!:       !!: :!!  \n" 
                      + "   :!:  !:!   ::!!:!   :!:       :!:  !:!  \n"
                      + "   ::::: ::    ::::     :: ::::  ::   :::  \n"
                      + "    : :  :      :      : :: ::    :   : :  \n ");
    
    
  }
}