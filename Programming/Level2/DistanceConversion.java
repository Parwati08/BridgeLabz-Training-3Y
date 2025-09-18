package ProgrammingPractice.Level2;

import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();

        // Conversion constants
        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        // Calculations
        double distanceYards = distanceFeet / feetPerYard;
        double distanceMiles = distanceYards / yardsPerMile;

        // Output
        System.out.println("Distance in yards = " + distanceYards);
        System.out.println("Distance in miles = " + distanceMiles);

        input.close();
    }
}
