package constructorslevel1;

class BookLibrary {
    public String ISBN;
    protected String title;
    private String author;

    BookLibrary(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

class EBookLibrary extends BookLibrary {
    double fileSizeMB;

    EBookLibrary(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    void displayEBookDetails() {
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println();
    }
}

class LibraryDemo {
    public static void main(String[] args) {
        BookLibrary b1 = new BookLibrary("123-XYZ", "The Great Gatsby", "F. Scott Fitzgerald");
        b1.displayBookDetails();

        b1.setAuthor("Francis Scott Fitzgerald");
        b1.displayBookDetails();

        EBookLibrary eb1 = new EBookLibrary("456-ABC", "Digital Fortress", "Dan Brown", 2.5);
        eb1.displayEBookDetails();
    }
}
