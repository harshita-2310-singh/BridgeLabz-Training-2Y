import java.util.*;

class Question {
    String text;
    Question(String text) { this.text = text; }
    public String toString() { return text; }
}

class Student {
    String id;
    String name;
    Student(String id, String name) { this.id = id; this.name = name; }
    public String toString() { return name + " (" + id + ")"; }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>(Arrays.asList(
            new Question("What is Java?"),
            new Question("Explain OOP concepts."),
            new Question("What is inheritance?")
        ));
        Collections.shuffle(questions);

        Set<String> studentIDs = new HashSet<>();
        studentIDs.add("S1");
        studentIDs.add("S2");
        studentIDs.add("S1");

        Queue<Student> examQueue = new LinkedList<>();
        examQueue.add(new Student("S1", "Alice"));
        examQueue.add(new Student("S2", "Bob"));

        System.out.println("Students in Queue: " + examQueue);
        System.out.println("Unique Student IDs: " + studentIDs);
        System.out.println("\nExam Starting...");

        while (!examQueue.isEmpty()) {
            Student student = examQueue.poll();
            System.out.println("\nServing: " + student);
            Stack<Question> questionStack = new Stack<>();
            for (Question q : questions) questionStack.push(q);

            while (!questionStack.isEmpty()) {
                System.out.println("Current Question: " + questionStack.peek());
                questionStack.pop();
            }
        }
    }
}
