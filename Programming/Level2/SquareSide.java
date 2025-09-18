package ProgrammingPractice.Level2;

import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        // Formula: side = perimeter / 4
        double sideLength = perimeter / 4;

        // Output
        System.out.println("The side length is " + sideLength + " for a perimeter of " + perimeter);

        input.close();
    }
}
