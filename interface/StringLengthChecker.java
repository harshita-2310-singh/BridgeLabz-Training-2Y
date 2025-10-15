interface LengthChecker {
    void checkLength(String message);
}

class MessageLengthChecker implements LengthChecker {
    private int limit;

    public MessageLengthChecker(int limit) {
        this.limit = limit;
    }

    public void checkLength(String message) {
        if (message.length() > limit) {
            System.out.println("Message exceeds the limit of " + limit + " characters.");
        } else {
            System.out.println("Message is within the limit.");
        }
    }
}

public class StringLengthChecker {
    public static void main(String[] args) {
        LengthChecker checker = new MessageLengthChecker(10);

        checker.checkLength("Hello");
        checker.checkLength("Hello, World!");
    }
}
