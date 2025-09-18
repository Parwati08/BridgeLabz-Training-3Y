package ProgrammingPractice.Level1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables
        double base, height, areaSqCm, areaSqInches;
        double cmPerInch = 2.54;

        // Input
        System.out.print("Enter base (cm): ");
        base = input.nextDouble();
        System.out.print("Enter height (cm): ");
        height = input.nextDouble();

        // Calculations
        areaSqCm = 0.5 * base * height;
        areaSqInches = areaSqCm / (cmPerInch * cmPerInch);

        // Output
        System.out.println("Area in square centimeters is " + areaSqCm +
                           " and in square inches is " + areaSqInches);

        input.close();
    }
}
