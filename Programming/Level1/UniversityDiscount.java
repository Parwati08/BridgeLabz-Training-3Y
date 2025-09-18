package ProgrammingPractice.Level1;

public class UniversityDiscount {
     public static void main(String[] args) {

        // Fixed values
        double fee = 125000;
        double discountPercent = 10;

        // Results
        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;

        // Output
        System.out.println("The discount amount is INR " + discountAmount +
        " and final discounted fee is INR " + finalFee);
    }
}
