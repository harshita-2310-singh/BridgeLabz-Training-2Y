import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DatabaseManager db = new DatabaseManager();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {  
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                db.addStudent(name, marks);
            }

            else if (ch == 2) {
                ArrayList<Student> list = db.getStudents();

                System.out.println("\nID | Name | Marks");
                for (Student s : list)
                    System.out.println(s);
            }

            else if (ch == 3) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();

                db.deleteStudent(id);
            }

            else if (ch == 4) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new name: ");
                String newName = sc.nextLine();

                System.out.print("Enter new marks: ");
                int newMarks = sc.nextInt();

                db.updateStudent(id, newName, newMarks);
            }

            else if (ch == 5) {
                System.out.println("Exit");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
