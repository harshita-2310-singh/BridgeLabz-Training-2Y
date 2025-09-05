import java.util.Random;
	import java.util.Scanner;
public class matrix {
	    public static int[][] generateMatrix(int rows, int cols) {
	        int[][] matrix = new int[rows][cols];
	        Random rand = new Random();

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = rand.nextInt(10); 
	            }
	        }

	        return matrix;
	    }
	    public static int[][] addMatrices(int[][] A, int[][] B) {
	        int rows = A.length;
	        int cols = A[0].length;
	        int[][] sum = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sum[i][j] = A[i][j] + B[i][j];
	            }
	        }

	        return sum;
	    }
	    public static int[][] subtractMatrices(int[][] A, int[][] B) {
	        int rows = A.length;
	        int cols = A[0].length;
	        int[][] diff = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                diff[i][j] = A[i][j] - B[i][j];
	            }
	        }

	        return diff;
	    }
	    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
	        int rowsA = A.length;
	        int colsA = A[0].length;
	        int colsB = B[0].length;
	        int[][] product = new int[rowsA][colsB];

	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                product[i][j] = 0;
	                for (int k = 0; k < colsA; k++) {
	                    product[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }

	        return product;
	    }
	    public static void displayMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter number of rows for Matrix A:");
	        int rowsA = scanner.nextInt();
	        System.out.println("Enter number of columns for Matrix A:");
	        int colsA = scanner.nextInt();
	        System.out.println("Enter number of rows for Matrix B:");
	        int rowsB = scanner.nextInt();
	        System.out.println("Enter number of columns for Matrix B:");
	        int colsB = scanner.nextInt();
	        int[][] A = generateMatrix(rowsA, colsA);
	        int[][] B = generateMatrix(rowsB, colsB);

	        System.out.println("\nMatrix A:");
	        displayMatrix(A);

	        System.out.println("\nMatrix B:");
	        displayMatrix(B);
	        if (rowsA == rowsB && colsA == colsB) {
	            int[][] sum = addMatrices(A, B);
	            int[][] diff = subtractMatrices(A, B);

	            System.out.println("\nAddition (A + B):");
	            displayMatrix(sum);

	            System.out.println("\nSubtraction (A - B):");
	            displayMatrix(diff);
	        } else {
	            System.out.println("\nAddition/Subtraction not possible (dimension mismatch)");
	        }
	        if (colsA == rowsB) {
	            int[][] product = multiplyMatrices(A, B);
	            System.out.println("\nMultiplication (A x B):");
	            displayMatrix(product);
	        } else {
	            System.out.println("\nMultiplication not possible (A's columns != B's rows)");
	        }

	        scanner.close();
	    }
	}
