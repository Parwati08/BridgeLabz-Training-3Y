package ProgrammingPractice.Level2;

import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter double a: ");
        double a = input.nextDouble();

        System.out.print("Enter double b: ");
        double b = input.nextDouble();

        System.out.print("Enter double c: ");
        double c = input.nextDouble();

        // Calculations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Output
        System.out.println("Results of double operations are: " +
        result1 + ", " + result2 + ", " + result3 + ", " + result4);

        input.close();
    }
}
