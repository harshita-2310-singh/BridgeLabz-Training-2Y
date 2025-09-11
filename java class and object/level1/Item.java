package com.bridgelabz.oops.levelone;

public class Item {
		    int itemCode;
		    String itemName;
		    double price;
		    public void displayItemDetails() {
		        System.out.println("Item Code: " + itemCode);
		        System.out.println("Item Name: " + itemName);
		        System.out.println("Price per Unit: " + price);
		    }
		    public double calculateTotalCost(int quantity) {
		        return price * quantity;
		    }

		    public static void main(String[] args) {
		        Item item = new Item();
		        item.itemCode = 101;
		        item.itemName = "Laptop";
		        item.price = 75000.00;
		        item.displayItemDetails();
		        int quantity = 2;
		        double totalCost = item.calculateTotalCost(quantity);

		        System.out.println("Quantity: " + quantity);
		        System.out.println("Total Cost: " + totalCost);
		    }
		}