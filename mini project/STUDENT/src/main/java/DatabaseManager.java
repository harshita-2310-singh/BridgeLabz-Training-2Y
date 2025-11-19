import java.sql.*;
import java.util.ArrayList;

public class DatabaseManager {

    final String URL = "jdbc:mysql://localhost:3306/studentdb";
    final String USER = "root";
    final String PASS = "Harshita@2005";

    public DatabaseManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
        } catch (Exception e) {
            System.out.println("Driver Error: " + e.getMessage());
        }
    }

    // ADD STUDENT
    public void addStudent(String name, int marks) {
        String sql = "INSERT INTO students(name, marks) VALUES(?, ?)";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, marks);

            ps.executeUpdate();
            System.out.println("Student Added!");

        } catch (Exception e) {
            System.out.println("Add Error: " + e.getMessage());
        }
    }

    // GET ALL STUDENTS
    public ArrayList<Student> getStudents() {
        ArrayList<Student> list = new ArrayList<>();

        String sql = "SELECT * FROM students";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                list.add(new Student(id, name, marks));
            }

        } catch (Exception e) {
            System.out.println("Fetch Error: " + e.getMessage());
        }

        return list;
    }

    // DELETE STUDENT
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student Deleted!");
            else
                System.out.println("ID Not Found!");

        } catch (Exception e) {
            System.out.println("Delete Error: " + e.getMessage());
        }
    }

    // UPDATE STUDENT
    public void updateStudent(int id, String newName, int newMarks) {
        String sql = "UPDATE students SET name = ?, marks = ? WHERE id = ?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newName);
            ps.setInt(2, newMarks);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student Updated!");
            else
                System.out.println("ID Not Found!");

        } catch (Exception e) {
            System.out.println("Update Error: " + e.getMessage());
        }
    }
}
