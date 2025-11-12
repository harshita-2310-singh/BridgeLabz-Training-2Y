import java.util.*;

class Book {
    String bookId;
    String title;
    String status; // Available, Issued, Returned

    Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.status = "Available";
    }

    public String toString() {
        return "[" + bookId + "] " + title + " (" + status + ")";
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<Book> allBooks = new ArrayList<>();
        Set<String> memberIDs = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returnedStack = new Stack<>();

        allBooks.add(new Book("B101", "Java Programming"));
        allBooks.add(new Book("B102", "Data Structures"));
        allBooks.add(new Book("B103", "Database Systems"));

        registerMember(memberIDs, "M1");
        registerMember(memberIDs, "M2");
        registerMember(memberIDs, "M1"); // Duplicate ignored

        issueQueue.add(allBooks.get(0));
        issueQueue.add(allBooks.get(1));

        System.out.println("Issuing Books...\n");
        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.poll();
            b.status = "Issued";
            System.out.println("Issued: " + b);
        }

        System.out.println("\nReturning Books...");
        allBooks.get(0).status = "Returned";
        returnedStack.push(allBooks.get(0));
        System.out.println("Returned: " + allBooks.get(0));

        System.out.println("\nRe-Issuing Most Recently Returned Book...");
        if (!returnedStack.isEmpty()) {
            Book reIssue = returnedStack.pop();
            reIssue.status = "Issued";
            System.out.println("Re-Issued: " + reIssue);
        }

        System.out.println("\nFinal Book Status:");
        for (Book b : allBooks) System.out.println(b);

        System.out.println("\nRegistered Members: " + memberIDs);
    }

    static void registerMember(Set<String> members, String id) {
        if (members.add(id))
            System.out.println("Member Registered: " + id);
        else
            System.out.println("Duplicate Member ID Ignored: " + id);
    }
}
