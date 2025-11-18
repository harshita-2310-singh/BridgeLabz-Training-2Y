import java.util.*;

public class EmployeeDepartments {
    public static void main(String[] args) {
        Map<Integer, String> empDept = new HashMap<>();

        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "HR");
        empDept.put(106, "Marketing");

        empDept.put(103, "IT");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department to search:");
        String dept = sc.nextLine();

        System.out.println("Employees in " + dept + ":");
        for (var e : empDept.entrySet())
            if (e.getValue().equals(dept))
                System.out.println(e.getKey());

        Map<String, Integer> count = new HashMap<>();
        for (String d : empDept.values())
            count.put(d, count.getOrDefault(d, 0) + 1);

        System.out.println("Total employees per department:");
        for (var e : count.entrySet())
            System.out.println(e.getKey() + " = " + e.getValue());
    }
}
