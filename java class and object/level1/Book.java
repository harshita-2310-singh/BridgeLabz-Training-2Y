package com.bridgelabz.oops.levelone;

public class Book {
	    String title;
	    String author;
	    double price;
	    public void displayDetails() {
	        System.out.println("Book Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {
	        Book book = new Book();
	        book.title = "Java Programming";
	        book.author = "James Gosling";
	        book.price = 499.99;

	        book.displayDetails();
	    }
	}


