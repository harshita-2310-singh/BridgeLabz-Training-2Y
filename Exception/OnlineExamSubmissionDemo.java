import java.time.LocalDateTime;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String message) {
        super(message);
    }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}

class ExamPortal {
    private LocalDateTime deadline = LocalDateTime.of(2025, 11, 5, 18, 0);

    public void submitExam(String fileName, LocalDateTime submissionTime)
            throws LateSubmissionException, InvalidFileFormatException {

        if (!fileName.endsWith(".pdf")) {
            throw new InvalidFileFormatException("Submission failed: invalid file format");
        }

        if (submissionTime.isAfter(deadline)) {
            throw new LateSubmissionException("Submission failed: submission is late");
        }

        System.out.println("Exam submitted successfully: " + fileName);
    }
}

public class OnlineExamSubmissionDemo {
    public static void main(String[] args) {
        ExamPortal portal = new ExamPortal();

        try {
            LocalDateTime submissionTime = LocalDateTime.of(2025, 11, 5, 19, 0);
            portal.submitExam("answer_sheet.docx", submissionTime);
        } catch (LateSubmissionException e) {
            System.out.println(e.getMessage());
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
