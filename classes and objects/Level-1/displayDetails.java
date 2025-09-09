class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = 1001;
        item.itemName = "Pen";
        item.price = 10.5;

        item.displayDetails();
        int qty = 5;
        System.out.println("Total Cost for " + qty + " items: " + item.calculateTotalCost(qty));
    }
}
