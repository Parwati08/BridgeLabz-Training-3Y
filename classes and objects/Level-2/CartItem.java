class CartItem {
    String itemName;
    double price;
    int quantity;

    double totalCost() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + totalCost());
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();
        item.itemName = "Notebook";
        item.price = 55.0;
        item.quantity = 3;

        item.displayItem();
    }
}
