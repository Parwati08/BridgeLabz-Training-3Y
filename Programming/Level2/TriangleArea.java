package ProgrammingPractice.Level2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Constants
        double cmPerInch = 2.54;

        // Area in square cm
        double areaCm2 = 0.5 * baseCm * heightCm;

        // Convert to square inches
        double baseIn = baseCm / cmPerInch;
        double heightIn = heightCm / cmPerInch;
        double areaIn2 = 0.5 * baseIn * heightIn;

        // Output
        System.out.println("Area of triangle in cm² = " + areaCm2);
        System.out.println("Area of triangle in in² = " + areaIn2);

        input.close();
    }
}
