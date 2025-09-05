import java.util.Scanner;
public class age {
	    public static boolean canStudentVote(int age) {
	        if (age < 0) {
	            return false;
	        } else if (age >= 18) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] studentAges = new int[10];

	        for (int i = 0; i < studentAges.length; i++) {
	            System.out.print("Enter age of student " + (i + 1) + ": ");
	            studentAges[i] = scanner.nextInt();

	            boolean canVote = canStudentVote(studentAges[i]); // Directly call static method

	            if (studentAges[i] < 0) {
	                System.out.println("Invalid age entered. Age cannot be negative.");
	            } else if (canVote) {
	                System.out.println("Student " + (i + 1) + " can vote.");
	            } else {
	                System.out.println("Student " + (i + 1) + " cannot vote.");
	            }
	        }

	        scanner.close();
	    }
	}
