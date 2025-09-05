import java.util.Random;
public class football {
		    public static int[] generateRandomHeights(int size) {
		        int[] heights = new int[size];
		        Random rand = new Random();

		        for (int i = 0; i < size; i++) {
		            heights[i] = rand.nextInt(101) + 150;
		        }

		        return heights;
		    }
		    public static int findSum(int[] heights) {
		        int sum = 0;
		        for (int i = 0; i < heights.length; i++) {
		            sum += heights[i];
		        }
		        return sum;
		    }
		    public static double findMean(int[] heights) {
		        int sum = findSum(heights);
		        return (double) sum / heights.length;
		    }

		    public static int findShortest(int[] heights) {
		        int min = heights[0];
		        for (int i = 1; i < heights.length; i++) {
		            if (heights[i] < min) {
		                min = heights[i];
		            }
		        }
		        return min;
		    }
		    public static int findTallest(int[] heights) {
		        int max = heights[0];
		        for (int i = 1; i < heights.length; i++) {
		            if (heights[i] > max) {
		                max = heights[i];
		            }
		        }
		        return max;
		    }

		    public static void main(String[] args) {
		        int[] heights = generateRandomHeights(11);
		        System.out.println("Player heights (in cm):");
		        for (int i = 0; i < heights.length; i++) {
		            System.out.println("Player " + (i + 1) + ": " + heights[i]);
		        }
		        int shortest = findShortest(heights);
		        int tallest = findTallest(heights);
		        double mean = findMean(heights);

		        System.out.println("\nSummary:");
		        System.out.println("Shortest height: " + shortest + " cm");
		        System.out.println("Tallest height: " + tallest + " cm");
		        System.out.println("Mean height: " + mean + " cm");
		    }
		}
