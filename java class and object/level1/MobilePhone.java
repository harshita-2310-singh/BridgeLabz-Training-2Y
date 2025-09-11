package com.bridgelabz.oops.levelone;

public class MobilePhone {
		    String brand;
		    String model;
		    double price;
		    public void displayDetails() {
		        System.out.println("Mobile Brand: " + brand);
		        System.out.println("Mobile Model: " + model);
		        System.out.println("Price: " + price);
		    }

		    public static void main(String[] args) {
		        MobilePhone phone = new MobilePhone();
		        phone.brand = "Samsung";
		        phone.model = "Galaxy S21";
		        phone.price = 69999.00;
		        phone.displayDetails();
		    }
		}
