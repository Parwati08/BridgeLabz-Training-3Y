package ProgrammingPractice.Level1;

public class DividePens {
    public static void main(String[] args) {

        // Fixed values
        int totalPens = 14;
        int students = 3;

        // Results
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        // Output
        System.out.println("The Pen Per Student is " + pensPerStudent +
        " and the remaining pen not distributed is " + remainingPens);
    }
}
