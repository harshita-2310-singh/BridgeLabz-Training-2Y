import java.util.*;
public class youngest_friends {
		    public static int findYoungest(int[] ages) {
		        int minIndex = 0;
		        for (int i = 1; i < ages.length; i++) {
		            if (ages[i] < ages[minIndex]) {
		                minIndex = i;
		            }
		        }
		        return minIndex;
		    }
		    public static int findTallest(float[] heights) {
		        int maxIndex = 0;
		        for (int i = 1; i < heights.length; i++) {
		            if (heights[i] > heights[maxIndex]) {
		                maxIndex = i;
		            }
		        }
		        return maxIndex;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        String[] names = {"Amar", "Akbar", "Anthony"};
		        int[] ages = new int[3];
		        float[] heights = new float[3];
		        for (int i = 0; i < 3; i++) {
		            System.out.print("Enter age of " + names[i] + ": ");
		            ages[i] = scanner.nextInt();

		            System.out.print("Enter height of " + names[i] + " in feet (e.g., 5.9): ");
		            heights[i] = scanner.nextFloat();
		        }

		        int youngestIndex = findYoungest(ages);
		        int tallestIndex = findTallest(heights);

		        System.out.println("\nResults:");
		        System.out.println("Youngest friend is: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
		        System.out.println("Tallest friend is: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " ft)");

		        scanner.close();
		    }
		}

