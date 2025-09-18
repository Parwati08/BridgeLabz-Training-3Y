package ProgrammingPractice.Level1;

import java.util.Scanner;

public class ConvertInput {
     public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Variable declaration
        double kilometers;
        double kmToMileFactor = 1.6; // 1 mile = 1.6 km
        double miles;

        // Input
        System.out.print("Enter distance in kilometers: ");
        kilometers = input.nextDouble();

        // Calculation
        miles = kilometers / kmToMileFactor;

        // Output
        System.out.println("The total miles is " + miles +
                           " mile for the given " + kilometers + " km");

        input.close();
    }
}
