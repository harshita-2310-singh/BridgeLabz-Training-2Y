class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title + ", Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        System.out.println("Book Title: " + title + ", Publication Year: " + publicationYear +
                           "\nAuthor: " + name + ", Bio: " + bio);
    }
}

class LibraryTest {
    public static void main(String[] args) {
        Author a1 = new Author("Java Programming", 2021, "James Gosling", "Father of Java Programming");
        Author a2 = new Author("Effective Java", 2018, "Joshua Bloch", "Expert in Java and Software Design");

        a1.displayInfo();
        System.out.println();
        a2.displayInfo();
    }
}
