import java.util.Random;
import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter number of students: ");
		        int numStudents = scanner.nextInt();

		      
		        int[][] pcmMarks = generateRandomScores(numStudents);

		       
		        double[][] stats = calculateStats(pcmMarks);

		       
		        String[] grades = calculateGrades(stats);
		        displayScoreCard(pcmMarks, stats, grades);

		        scanner.close();
		    }

		  
		    public static int[][] generateRandomScores(int students) {
		        Random rand = new Random();
		        int[][] scores = new int[students][3];

		        for (int i = 0; i < students; i++) {
		            for (int j = 0; j < 3; j++) {
		                scores[i][j] = rand.nextInt(91) + 10; 
		            }
		        }

		        return scores;
		    }
		    public static double[][] calculateStats(int[][] scores) {
		        double[][] stats = new double[scores.length][3]; 

		        for (int i = 0; i < scores.length; i++) {
		            int total = scores[i][0] + scores[i][1] + scores[i][2];
		            double average = total / 3.0;
		            double percentage = Math.round((average * 100.0) / 100.0 * 100.0) / 100.0; // Rounded to 2 digits

		            stats[i][0] = total;
		            stats[i][1] = Math.round(average * 100.0) / 100.0;
		            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
		        }

		        return stats;
		    }
		    public static String[] calculateGrades(double[][] stats) {
		        String[] grades = new String[stats.length];

		        for (int i = 0; i < stats.length; i++) {
		            double percent = stats[i][2];

		            if (percent >= 80) grades[i] = "A";
		            else if (percent >= 70) grades[i] = "B";
		            else if (percent >= 60) grades[i] = "C";
		            else if (percent >= 50) grades[i] = "D";
		            else if (percent >= 40) grades[i] = "E";
		            else grades[i] = "R";
		        }

		        return grades;
		    }
		    public static void displayScoreCard(int[][] scores, double[][] stats, String[] grades) {
		        System.out.println("\n--- STUDENT SCORECARD ---");
		        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAverage\t\t%age\tGrade");
		        System.out.println("-----------------------------------------------------------------------");

		        for (int i = 0; i < scores.length; i++) {
		            System.out.println((i + 1) + "\t" +
		                scores[i][0] + "\t" +
		                scores[i][1] + "\t" +
		                scores[i][2] + "\t" +
		                (int) stats[i][0] + "\t" +
		                stats[i][1] + "\t\t" +
		                stats[i][2] + "\t" +
		                grades[i]);
		        }
		    }
		}

	
