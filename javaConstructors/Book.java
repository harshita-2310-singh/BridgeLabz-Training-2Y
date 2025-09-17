package constructorslevel1;		
class Book {
		    String title;
		    String author;
		    double price;
		    Book() {
		        title = "Unknown";
		        author = "Unknown";
		        price = 0.0;
		    }
		    Book(String t, String a, double p) {
		        title = t;
		        author = a;
		        price = p;
		    }
		    void display() {
		        System.out.println("Title: " + title);
		        System.out.println("Author: " + author);
		        System.out.println("Price: " + price);
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        Book b1 = new Book();
		        b1.display();

		        Book b2 = new Book("The Alchemist", "Paulo Coelho", 399.0);
		        b2.display();
		    }
		}
	

