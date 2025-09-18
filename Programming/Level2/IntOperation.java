package ProgrammingPractice.Level2;

import java.util.Scanner;

public class IntOperation {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter integer a: ");
        int a = input.nextInt();

        System.out.print("Enter integer b: ");
        int b = input.nextInt();

        System.out.print("Enter integer c: ");
        int c = input.nextInt();

        // Calculations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Output
        System.out.println("Results of integer operations are: " +
                           result1 + ", " + result2 + ", " + result3 + ", " + result4);

        input.close();
    }
}
