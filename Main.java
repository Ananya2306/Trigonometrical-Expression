// Importing java.util Package to use Scanner Class
import java.util.Scanner;

// Name the Class
class Main 
{
  public static void main(String args[]) 
  {

    // Making Scanner Object
    Scanner sc = new Scanner(System.in);

    // Taking the First angle A in Degrees
    System.out.print("Enter angle A in degrees: ");
    // Storing that angle A in a variable
    double angleA = sc.nextDouble();

    // Taking the second angle B in Degrees
    System.out.print("Enter angle B in degrees: ");
    // Storing that angle B in a variable
    double angleB = sc.nextDouble();

    // Converting angle A degree to radian
    double ARad = (22 * angleA) / (7 * 180);

    // Converting angle Bdegree to radian
    double BRad = (22 * angleB) / (7 * 180);

    // Calculating the Numerator of both angles Radian
    double nume = Math.tan(ARad) - Math.tan(BRad);

    // Calculating the Denominator of both angles Radian
    double deno = 1 + Math.tan(ARad) * Math.tan(BRad);

    // Calculating the Trigonometrical Expression
    double trigExp = nume / deno;

    // Displaying the Trigonometrical Expression
    System.out.println("tan(A - B) = " + trigExp);

  }

}