package ProgrammingPractice.Level1;

public class Convert {
    public static void main(String[] args) {
        // Fixed values
        double kilometers = 10.8;
        double kmToMileFactor = 1.6;  // 1 mile = 1.6 km

        // Result variable
        double miles = kilometers / kmToMileFactor;

        // Output
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}  
