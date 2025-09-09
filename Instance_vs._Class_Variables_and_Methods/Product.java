class Product {
    String productName;
    double price;

    static int totalProducts = 0;  // class variable

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // increment total products when a new product is created
    }

    // Instance Method
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: ₹" + price);
    }

    // Class Method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
