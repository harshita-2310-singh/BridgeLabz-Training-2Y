import java.util.*;
public class randomstats {
		    public int[] generate4DigitRandomArray(int size) {
		        int[] randomNumbers = new int[size];
		        for (int i = 0; i < size; i++) {
		            randomNumbers[i] = (int)(Math.random() * 9000) + 1000;
		        }
		        return randomNumbers;
		    }
		    public double[] findAverageMinMax(int[] numbers) {
		        int min = numbers[0];
		        int max = numbers[0];
		        int sum = 0;

		        for (int i = 0; i < numbers.length; i++) {
		            sum += numbers[i];
		            min = Math.min(min, numbers[i]);
		            max = Math.max(max, numbers[i]);
		        }

		        double average = (double) sum / numbers.length;
		        return new double[]{average, min, max};
		    }

		    public static void main(String[] args) {
		        randomstats obj = new randomstats();

		        int[] randomNumbers = obj.generate4DigitRandomArray(5);
		        System.out.println("Generated 4-digit random numbers:");
		        for (int i = 0; i < randomNumbers.length; i++) {
		            System.out.println("Number " + (i + 1) + ": " + randomNumbers[i]);
		        }

		        double[] results = obj.findAverageMinMax(randomNumbers);

		        System.out.println("\nResults:");
		        System.out.println("Average: " + results[0]);
		        System.out.println("Minimum: " + results[1]);
		        System.out.println("Maximum: " + results[2]);
		    }
		}
