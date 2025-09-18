package ProgrammingPractice.Level1;

public class Age {
    public static void main(String[] args) {
        
        // Fixed values
        String name = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;

        // Result variable
        int age = currentYear - birthYear;

        // Output
        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}
