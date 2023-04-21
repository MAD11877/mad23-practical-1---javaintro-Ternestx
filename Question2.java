import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner MyObj = new Scanner(System.in);
    System.out.println("Enter Height (in meters): ");
    double height = MyObj.nextDouble();

    System.out.println("Enter Weight (in kg): ");
    double weight = MyObj.nextDouble();

    double bmi = weight/(height * height);
    System.out.println(bmi);
  }
}
