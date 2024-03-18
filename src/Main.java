import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
*/

        // Creating Scanner object

        Scanner sc = new Scanner(System.in);

        // Create constant value
        final double METERS_PER_FOOT = 0.305;

        // User input
        System.out.println("Enter value in Feet");
        double feet=sc.nextDouble();

        // Convert feet into meters

        double meters = feet*METERS_PER_FOOT;

        //Display result


        System.out.println("meter is  "+meters);



    }
}