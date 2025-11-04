import java.io.IOException;

class InvalidStudentException extends Exception {
    public InvalidStudentException(String message) {
        super(message);
    }
}

class OnlineExam {
    private boolean validStudent;

    public OnlineExam(boolean validStudent) {
        this.validStudent = validStudent;
    }

    public void validateStudent() throws InvalidStudentException {
        if (!validStudent) {
            throw new InvalidStudentException("Invalid student: access denied.");
        }
    }

    public void submitExam() throws InvalidStudentException, IOException {
        validateStudent();

        boolean systemError = true;
        if (systemError) {
            throw new IOException("Submission failed due to system error.");
        }

        System.out.println("Exam submitted successfully.");
    }
}

public class OnlineExamSystemDemo {
    public static void main(String[] args) {
        OnlineExam exam = new OnlineExam(false);

        try {
            exam.submitExam();
        } catch (InvalidStudentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
