package objectmodeling;

public class LibraryAggregationDemo {
	    public static void main(String[] args) {
	        Book book1 = new Book("Moby Dick", "Herman Melville");
	        Book book2 = new Book("Pride and Prejudice", "Jane Austen");

	        Library lib = new Library("Central Library", book1, book2);
	        lib.displayBooks();
	    }
	}

	class Book {
	    String title;
	    String author;

	    Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    String getDetails() {
	        return title + " by " + author;
	    }
	}

	class Library {
	    String name;
	    Book book1;
	    Book book2;

	    Library(String name, Book book1, Book book2) {
	        this.name = name;
	        this.book1 = book1;
	        this.book2 = book2;
	    }

	    void displayBooks() {
	        System.out.println("Books in " + name + ":");
	        System.out.println(book1.getDetails());
	        System.out.println(book2.getDetails());
	    }
	}
