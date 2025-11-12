import java.util.*;

public class CustomerFeedbackAnalysis {
    public static void main(String[] args) {
        List<String> allFeedbacks = new ArrayList<>();
        Set<String> uniqueFeedbacks = new HashSet<>();
        Queue<String> feedbackQueue = new LinkedList<>();
        Stack<String> recentFeedbacks = new Stack<>();

        addFeedback(allFeedbacks, uniqueFeedbacks, feedbackQueue, recentFeedbacks, "Great service!");
        addFeedback(allFeedbacks, uniqueFeedbacks, feedbackQueue, recentFeedbacks, "Delivery was late.");
        addFeedback(allFeedbacks, uniqueFeedbacks, feedbackQueue, recentFeedbacks, "Loved the product!");
        addFeedback(allFeedbacks, uniqueFeedbacks, feedbackQueue, recentFeedbacks, "Great service!"); // Duplicate ignored
        addFeedback(allFeedbacks, uniqueFeedbacks, feedbackQueue, recentFeedbacks, "Support team was helpful.");

        System.out.println("\nProcessing Feedbacks in Order:");
        while (!feedbackQueue.isEmpty()) {
            System.out.println("Processing: " + feedbackQueue.poll());
        }

        System.out.println("\nAll Feedbacks Collected:");
        for (String f : allFeedbacks) System.out.println(f);

        System.out.println("\nLast Few Feedbacks (Most Recent First):");
        for (int i = 0; i < 3 && !recentFeedbacks.isEmpty(); i++) {
            System.out.println(recentFeedbacks.pop());
        }
    }

    static void addFeedback(List<String> list, Set<String> set, Queue<String> queue, Stack<String> stack, String feedback) {
        list.add(feedback);
        if (set.add(feedback)) {
            queue.add(feedback);
            stack.push(feedback);
            System.out.println("Added Feedback: " + feedback);
        } else {
            System.out.println("Duplicate Ignored: " + feedback);
        }
    }
}
