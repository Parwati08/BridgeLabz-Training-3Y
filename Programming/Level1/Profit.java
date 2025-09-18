package ProgrammingPractice.Level1;

public class Profit {
    public static void main(String[] args) {

        // Fixed values
        double costPrice = 129.0;
        double sellingPrice = 191.0;

        // Results
        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;

        // Output (single print, multi-line)
        System.out.println("The Cost Price is INR " + costPrice + 
                           " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + 
                           " and the Profit Percentage is " + profitPercent);
    }
}
