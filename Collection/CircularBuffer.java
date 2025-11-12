import java.util.*;

public class CircularBuffer {
    private int[] buffer;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void add(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % capacity;
        if (size < capacity) {
            size++;
        } else {
            front = (front + 1) % capacity;
        }
    }

    public List<Integer> getBufferElements() {
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            elements.add(buffer[(front + i) % capacity]);
        }
        return elements;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        System.out.println("Buffer: " + cb.getBufferElements());
        cb.add(4);
        System.out.println("After adding 4: " + cb.getBufferElements());
    }
}
