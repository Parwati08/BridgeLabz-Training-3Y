package ProgrammingPractice.Level1;

import java.util.Scanner;

public class Handshake {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables
        int numberOfStudents;
        int handshakes;

        // Input
        System.out.print("Enter number of students: ");
        numberOfStudents = input.nextInt();

        // Calculation using formula (n * (n - 1)) / 2
        handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("The maximum number of possible handshakes is " + handshakes);

        input.close();
    }
}
