/* John Paul De Jesus

*/

public class Practice{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double radius; // Declare radius
    double area; // Declare area
    
    // Assign a radius
    radius = 20; // radius is now 20
    
    // Compute area
    area = radius * radius * 3.14159;
    
    // Display results
    System.out.println("The area for the circle of radius " +
      radius + " is " + area);
    
        
    // Prompt the user to enter the radius
    System.out.print("Enter a number for radius: ");
    double radius = input.Nextdouble();
    
    // Compute area
    double area = radius * radius * 3.14159;
    
    // Display results
    System.out.println("The area for the circle " +
                      radius + " is " + area);
  }
}