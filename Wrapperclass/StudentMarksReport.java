import java.util.ArrayList;

public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc"};
        ArrayList<Integer> validMarks = new ArrayList<>();
        int sum = 0;

        for (Object mark : marks) {
            try {
                if (mark == null) continue;
                int value;

                if (mark instanceof String) {
                    String str = (String) mark;
                    if (str.equalsIgnoreCase("null")) continue;
                    value = Integer.parseInt(str);
                } else if (mark instanceof Integer) {
                    value = (Integer) mark;
                } else {
                    continue;
                }

                validMarks.add(value);
                sum += value;
            } catch (NumberFormatException e) {
                
            }
        }

        double average = validMarks.size() > 0 ? (double) sum / validMarks.size() : 0.0;

        System.out.println("Valid marks: " + validMarks);
        System.out.println("Average marks: " + average);
    }
}
