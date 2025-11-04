
import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class InvalidReturnException extends Exception {
    public InvalidReturnException(String message) {
        super(message);
    }
}

class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String message) {
        super(message);
    }
}

class Library {
    private Map<String, Boolean> books = new HashMap<>();
    private Map<String, List<String>> userRecords = new HashMap<>();

    public Library() {
        books.put("Java Basics", true);
        books.put("Data Structures", true);
        books.put("Algorithms", true);
        books.put("Database Systems", true);
    }

    public void borrowBook(String user, String book)
            throws BookNotAvailableException, UserLimitExceededException {

        if (!books.containsKey(book) || !books.get(book)) {
            throw new BookNotAvailableException("Book not available: " + book);
        }

        userRecords.putIfAbsent(user, new ArrayList<>());

        List<String> borrowed = userRecords.get(user);
        if (borrowed.size() >= 5) {
            throw new UserLimitExceededException("User limit exceeded for: " + user);
        }

        borrowed.add(book);
        books.put(book, false);
        System.out.println(user + " borrowed: " + book);
    }

    public void returnBook(String user, String book) throws InvalidReturnException {
        if (!userRecords.containsKey(user) || !userRecords.get(user).contains(book)) {
            throw new InvalidReturnException("Invalid return attempt by: " + user);
        }

        userRecords.get(user).remove(book);
        books.put(book, true);
        System.out.println(user + " returned: " + book);
    }
}

public class LibraryManagementDemo {
    public static void main(String[] args) {
        Library library = new Library();

        try {
            library.borrowBook("Alice", "Java Basics");
            library.borrowBook("Alice", "Data Structures");
            library.returnBook("Alice", "Algorithms");
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidReturnException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (UserLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Library transaction completed.");
        }
    }
}
