package constructorslevel1;

public class Book2 {
		    String title;
		    String author;
		    double price;
		    boolean available;

		    Book2(String title, String author, double price, boolean available) {
		        this.title = title;
		        this.author = author;
		        this.price = price;
		        this.available = available;
		    }

		    void borrowBook() {
		        if (available) {
		            System.out.println(title + " has been borrowed.");
		            available = false;
		        } else {
		            System.out.println(title + " is not available.");
		        }
		    }

		    void display() {
		        System.out.println("Title: " + title);
		        System.out.println("Author: " + author);
		        System.out.println("Price: " + price);
		        System.out.println("Available: " + available);
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        Book2 b1 = new Book2("1984", "George Orwell", 299.0, true);
		        b1.display();

		        b1.borrowBook();
		        b1.display();

		        b1.borrowBook();
		    }
		}

