import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainApp {
    public static void main(String[] args) {
        // 1. Add a new book
        Book b1 = new Book("Java Programming", "John Doe", "ISBN12345");
        b1.displayBookDetails();

        // 2. Register a new member
        Member m1 = new Member("Alice", 101);
        m1.displayMemberDetails();

        // 3. Issue book to member
        Transaction t1 = new Transaction(b1, m1);
        t1.issueBook();
    }
}
