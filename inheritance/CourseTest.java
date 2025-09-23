class CourseBase {
    String courseName;
    int duration; 

    CourseBase(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourseEx extends CourseBase {
    String platform;
    boolean isRecorded;

    OnlineCourseEx(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourseEx extends OnlineCourseEx {
    double fee;
    double discount; 

    PaidOnlineCourseEx(String courseName, int duration, String platform, boolean isRecorded,
                       double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee after Discount: $" + getFinalFee());
    }
}

public class CourseTest {
    public static void main(String[] args) {
        CourseBase c1 = new CourseBase("Introduction to Programming", 8);
        OnlineCourseEx c2 = new OnlineCourseEx("Data Structures", 10, "Coursera", true);
        PaidOnlineCourseEx c3 = new PaidOnlineCourseEx("Advanced Java", 12, "Udemy", true, 200.0, 20.0);

        c1.displayDetails();
        System.out.println();

        c2.displayDetails();
        System.out.println();

        c3.displayDetails();
    }
}
