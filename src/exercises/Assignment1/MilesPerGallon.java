package exercises.Assignment1;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven:");
        double miles = input.nextDouble();
        System.out.println("Gas used (in gallons):");
        double gasConsumed = input.nextDouble();
        input.close();
        double mileage = miles / gasConsumed;
        System.out.println("Your car is getting " + mileage + " miles per gallon.");

    }
}
