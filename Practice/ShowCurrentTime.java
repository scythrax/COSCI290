/* JP de Jesus
   Co Sci 290
   Practice
*/

import java.util.Scanner;

public class ShowCurrentTime{
  
  public static void main(String[] args){
   
    long totalMilliSeconds = System.currentTimeMillis();
    
    long totalSeconds = totalMilliSeconds / 1000;
    
    long currentSecond = totalSeconds & 60;
    
    long totalMinutes = currentSecond / 60;
    
    long currentMinute = totalMinutes & 60;
    
    long totalHours = currentMinute / 60;
    
    long currentHour = totalHours & 24;
    
    System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        
  }
  
}