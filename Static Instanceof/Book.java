package keywords;

public class Book {
	    private static String libraryName = "Central City Library";

	    private String title;
	    private String author;
	    private final String isbn;

	    public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	    }

	    public static void displayLibraryName() {
	        System.out.println("Library Name: " + libraryName);
	    }

	    public void displayBookDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("ISBN: " + isbn);
	    }

	    public String getIsbnIfBook(Object obj) {
	        if (obj instanceof Book) {
	            return ((Book) obj).isbn;
	        } else {
	            return "Invalid object";
	        }
	    }
	}

	class LibraryManagementSystem {
	    public static void main(String[] args) {
	        Book book1 = new Book("1984", "George Orwell", "ISBN123456");
	        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN789012");

	        Book.displayLibraryName();
	        System.out.println();

	        if (book1 instanceof Book) {
	            book1.displayBookDetails();
	            System.out.println("Verified ISBN: " + book1.getIsbnIfBook(book1));
	        }

	        System.out.println();

	        if (book2 instanceof Book) {
	            book2.displayBookDetails();
	            System.out.println("Verified ISBN: " + book2.getIsbnIfBook(book2));
	        }
	    }
	}
