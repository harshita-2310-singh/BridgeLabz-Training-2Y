import java.util.*;
import java.util.function.Predicate;

class Notification {
    String type;
    String message;

    public Notification(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type.toUpperCase() + "] " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {


        List<Notification> notifications = Arrays.asList(
            new Notification("emergency", "Patient heart rate critical!"),
            new Notification("appointment", "Your appointment is at 3 PM."),
            new Notification("healthtip", "Drink 8 glasses of water daily."),
            new Notification("emergency", "ICU bed available!"),
            new Notification("appointment", "Dental checkup tomorrow.")
        );

        
        Predicate<Notification> showEmergencyOnly = n -> n.type.equalsIgnoreCase("emergency");
        Predicate<Notification> showAppointmentsOnly = n -> n.type.equalsIgnoreCase("appointment");
        Predicate<Notification> showNonEmergency = n -> !n.type.equalsIgnoreCase("emergency");

        System.out.println("All Notifications:");
        notifications.forEach(System.out::println);

        System.out.println("\nFiltered: Emergency Only");
        filterAndShow(notifications, showEmergencyOnly);

        System.out.println("\nFiltered: Appointments Only");
        filterAndShow(notifications, showAppointmentsOnly);

        System.out.println("\nFiltered: Non-Emergency");
        filterAndShow(notifications, showNonEmergency);
    }

    public static void filterAndShow(List<Notification> list, Predicate<Notification> condition) {
        list.stream()
            .filter(condition)
            .forEach(System.out::println);
    }
}
