package com.bridgelabz.oops.levelone;
public class CartItem {
    String itemName;
    double price;
    int quantity;
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public double getTotalCost() {
        return price * quantity;
    }
    public void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotalCost());
    }
    public static void main(String[] args) {
        CartItem[] cart = new CartItem[10];
        int itemCount = 0;
        cart[itemCount++] = new CartItem("Laptop", 50000, 1);
        cart[itemCount++] = new CartItem("Mouse", 800, 2);
        cart[itemCount++] = new CartItem("Keyboard", 1200, 1);
        String itemToRemove = "Mouse";
        boolean removed = false;
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].itemName.equalsIgnoreCase(itemToRemove)) {
                for (int j = i; j < itemCount - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[--itemCount] = null;
                removed = true;
                System.out.println("Removed: " + itemToRemove);
                break;
            }
        }
        if (!removed) {
            System.out.println("Item not found: " + itemToRemove);
        }
        double total = 0;
        System.out.println("\n--- Cart Summary ---");
        for (int i = 0; i < itemCount; i++) {
            cart[i].displayItem();
            total += cart[i].getTotalCost();
        }
        System.out.println("Total Cost: ₹" + total);
    }
}
