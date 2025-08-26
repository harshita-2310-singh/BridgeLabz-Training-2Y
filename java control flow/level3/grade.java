import java.util.*;
public class grade {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input marks
		        System.out.print("Enter marks in Physics: ");
		        int physics = scanner.nextInt();

		        System.out.print("Enter marks in Chemistry: ");
		        int chemistry = scanner.nextInt();

		        System.out.print("Enter marks in Maths: ");
		        int maths = scanner.nextInt();
		        
		        double average = (physics + chemistry + maths) / 3.0;
		        String grade = "";
		        String remark = "";

		        if (average >= 80) {
		            grade = "A";
		            remark = "Level 4, above agency-normalized standards";
		        } else if (average >= 70) {
		            grade = "B";
		            remark = "Level 3, at agency-normalized standards";
		        } else if (average >= 60) {
		            grade = "C";
		            remark = "Level 2, below, but approaching agency-normalized standards";
		        } else if (average >= 50) {
		            grade = "D";
		            remark = "Level 1, well below agency-normalized standards";
		        } else if (average >= 40) {
		            grade = "E";
		            remark = "Level 1, too below agency-normalized standards";
		        } else {
		            grade = "R";
		            remark = "Remedial standards";
		        }

		        System.out.println("\n=== Result ===");
		        System.out.println("Average Marks:"+ average);
		        System.out.println("Grade: " + grade);
		        System.out.println("Remarks: " + remark);
		    }
		


	}


