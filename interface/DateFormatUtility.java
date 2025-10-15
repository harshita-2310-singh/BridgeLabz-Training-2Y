import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtility {

    interface DateFormatter {
        String format(Date date);
    }
    static class SimpleDateFormatter implements DateFormatter {
        private SimpleDateFormat sdf;

        public SimpleDateFormatter(String pattern) {
            this.sdf = new SimpleDateFormat(pattern);
        }

        public String format(Date date) {
            return sdf.format(date);
        }
    }

    public static void main(String[] args) {
        Date now = new Date();

        DateFormatter formatterObj = new SimpleDateFormatter("dd-MM-yyyy");

        DateFormatter formatterLambda = date -> {
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
            return sdf.format(date);
        };

        System.out.println("Date Formatting:\n");

        System.out.println("Object-oriented format: " + formatterObj.format(now));
        System.out.println("Lambda format:          " + formatterLambda.format(now));
    }
}
