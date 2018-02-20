public class TestingRandom{

 
  public static void main(String[] args){
  
    int minimum = 1;
    int maximum = 100;
    int randomNum = minimum + (int)(Math.random() * maximum);
    
    if(randomNum >= 90){
      System.out.println("You get a staff!");
      if(randomNum != 90){
        System.out.println("Wow, you get a mace!");
       
      }
    }
    else if(randomNum <= 80 || randomNum <= 70){
      System.out.println("You get a dagger.");
    }
    else{
      System.out.println("Well, see you in next life.");
    }
    
  }
}