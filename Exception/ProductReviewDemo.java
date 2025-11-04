class InvalidRatingException extends Exception {
    public InvalidRatingException(String message) {
        super(message);
    }
}

class EmptyReviewException extends Exception {
    public EmptyReviewException(String message) {
        super(message);
    }
}

class ProductReview {
    public void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {

        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Invalid rating: must be between 1 and 5.");
        }

        if (comment == null || comment.trim().isEmpty()) {
            throw new EmptyReviewException("Review comment cannot be empty.");
        }

        System.out.println("Review submitted successfully. Rating: " + rating + ", Comment: " + comment);
    }
}

public class ProductReviewDemo {
    public static void main(String[] args) {
        ProductReview review = new ProductReview();

        try {
            review.submitReview(6, "Excellent product!");
        } catch (InvalidRatingException e) {
            System.out.println(e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Review submission process completed.");
        }
    }
}
