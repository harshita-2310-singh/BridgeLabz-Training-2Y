import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNameUppercase {
    public static void main(String[] args) {


        List<String> employees = Arrays.asList("Harshita", "Shreya", "Amit", "Rohan", "Priya");

        System.out.println("Original Employee Names:");
        employees.forEach(System.out::println);

    
        List<String> upperCaseNames = employees.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());

        System.out.println("\nEmployee Names in Uppercase:");
        upperCaseNames.forEach(System.out::println);
    }
}
