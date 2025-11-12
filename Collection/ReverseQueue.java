import java.util.*;

public class ReverseQueue {
    public static <T> void reverse(Queue<T> queue) {
        if (queue.isEmpty()) return;
        T front = queue.remove();
        reverse(queue);
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        reverse(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
