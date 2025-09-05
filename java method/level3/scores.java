
	import java.util.Random;
	import java.util.Scanner;
	public class scores {
	    public static int[][] generateScores(int students) {
	        int[][] scores = new int[students][3]; 
	        Random rand = new Random();

	        for (int i = 0; i < students; i++) {
	            scores[i][0] = 50 + rand.nextInt(51);
	            scores[i][1] = 50 + rand.nextInt(51);
	            scores[i][2] = 50 + rand.nextInt(51); 
	        }

	        return scores;
	    }
	    public static double[][] calculateResults(int[][] scores) {
	        int students = scores.length;
	        double[][] results = new double[students][3]; 

	        for (int i = 0; i < students; i++) {
	            int total = scores[i][0] + scores[i][1] + scores[i][2];
	            double average = total / 3.0;
	            double percentage = (total / 300.0) * 100;

	            results[i][0] = total;
	            results[i][1] = Math.round(average * 100.0) / 100.0;
	            results[i][2] = Math.round(percentage * 100.0) / 100.0;
	        }

	        return results;
	    }
	    public static String getGrade(double percentage) {
	        if (percentage >= 80) return "A";
	        else if (percentage >= 70) return "B";
	        else if (percentage >= 60) return "C";
	        else if (percentage >= 50) return "D";
	        else if (percentage >= 40) return "E";
	        else return "R";
	    }
	    public static void displayScorecard(int[][] scores, double[][] results) {
	        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\t\tPercentage\tGrade");
	        System.out.println("---------------------------------------------------------------------------");

	        for (int i = 0; i < scores.length; i++) {
	            int physics = scores[i][0];
	            int chemistry = scores[i][1];
	            int math = scores[i][2];

	            int total = (int) results[i][0];
	            double average = results[i][1];
	            double percentage = results[i][2];

	            String grade = getGrade(percentage);

	            System.out.println((i + 1) + "\t" + physics + "\t" + chemistry + "\t\t" + math + "\t" +
	                    total + "\t" + average + "\t\t" + percentage + "\t\t" + grade);
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter number of students:");
	        int num = scanner.nextInt();

	        int[][] scores = generateScores(num);
	        double[][] results = calculateResults(scores);
	        displayScorecard(scores, results);

	        scanner.close();
	    }
	}


