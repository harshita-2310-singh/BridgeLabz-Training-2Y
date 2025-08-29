import java.util.*;
public class array_grade {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        
		        System.out.print("Enter number of students: ");
		        int n = sc.nextInt();

		       
		        int[][] marks = new int[n][3];      
		        double[] percentage = new double[n];
		        char[] grades = new char[n];

		        for (int i = 0; i < n; i++) {
		            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
		            for (int j = 0; j < 3; j++) {
		                String subject;

		                switch (j) {
		                    case 0:
		                        subject = "Physics";
		                        break;
		                    case 1:
		                        subject = "Chemistry";
		                        break;
		                    case 2:
		                        subject = "Math";
		                        break;
		                    default:
		                        subject = "Unknown";
		                }
		                int mark;
		                do {
		                    System.out.print("  Enter marks in " + subject + ": ");
		                    mark = sc.nextInt();
		                    if (mark < 0) {
		                        System.out.println("  Marks cannot be negative. Please enter again.");
		                    }
		                } while (mark < 0);

		                marks[i][j] = mark;
		            }

		            
		            int total = marks[i][0] + marks[i][1] + marks[i][2];
		            percentage[i] = total / 3.0;

		            
		            if (percentage[i] >= 80) {
		                grades[i] = 'A';
		            } else if (percentage[i] >= 70) {
		                grades[i] = 'B';
		            } else if (percentage[i] >= 60) {
		                grades[i] = 'C';
		            } else if (percentage[i] >= 50) {
		                grades[i] = 'D';
		            } else if (percentage[i] >= 40) {
		                grades[i] = 'E';
		            } else {
		                grades[i] = 'R';
		            }
		        }

		        
		        System.out.println("\n-------------------------------------------------------------");
		        System.out.println("\n"+
		                "	Student				" +"Physics				"+ "Chemistry				"+ "Math				"+ "Percentage				"+ "Grade");
		        System.out.println("-------------------------------------------------------------");

		        for (int i = 0; i < n; i++) {
		            System.out.println("\n"+
		                    (i + 1)+"				"+ marks[i][0]+"				"+ marks[i][1]+"				"+ marks[i][2]+"				"+ percentage[i]+"				"+grades[i]);
		        }

		        System.out.println("-------------------------------------------------------------");

		        
		    
		


	}

}
