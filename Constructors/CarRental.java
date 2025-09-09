class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000.0;  // example rate per day

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Default Model";
        rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
