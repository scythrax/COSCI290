import java.util.Scanner;

public class Sample11{
  
  public static void main(String[] args){
    
    
    // 3.12 (Palindrome number) Write a program that prompts the user to enter a three-digit
    // integer and determines whether it is a palindrome number. A number is palindrome if it
    // reads the same from right to left and from left to right. Here is a sample run of this
    // program:
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the three-digit number: ");

    int user_input = input.nextInt();

        int temp_remaning = 0;

        int d1 = user_input % 10;
        temp_remaning = user_input / 10;
        int d2 = temp_remaning % 10;
        int d3 = temp_remaning / 10;

        String rev = Integer.toString(d3) + Integer.toString(d2) + Integer.toString(d1);
        String original = Integer.toString(user_input);
        

        if(rev.equals(original)){
            System.out.println(original + " is a palindrone");
        }else{
            System.out.println(original + " is not a palindrone");

        }  
                          
  }
                       
}
