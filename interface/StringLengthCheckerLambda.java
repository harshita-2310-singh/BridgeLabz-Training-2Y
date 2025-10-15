@FunctionalInterface
interface LengthChecker {
    void checkLength(String message);
}

public class StringLengthCheckerLambda {
    public static void main(String[] args) {
        int limit = 10;

        LengthChecker checker = (message) -> {
            if (message.length() > limit) {
                System.out.println("Message exceeds the limit of " + limit + " characters.");
            } else {
                System.out.println("Message is within the limit.");
            }
        };

        checker.checkLength("Hello");
        checker.checkLength("Hello, World!");
    }
}
