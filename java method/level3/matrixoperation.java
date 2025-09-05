import java.util.Random;
	import java.util.Scanner;
public class matrixoperation {
	    public static int[][] createRandomMatrix(int rows, int cols) {
	        Random rand = new Random();
	        int[][] matrix = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = rand.nextInt(10); 
	            }
	        }
	        return matrix;
	    }
	    public static int[][] transpose(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int[][] transposed = new int[cols][rows];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transposed[j][i] = matrix[i][j];
	            }
	        }
	        return transposed;
	    }
	    public static void displayMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    public static int determinant2x2(int[][] matrix) {
	        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
	    }
	    public static int determinant3x3(int[][] matrix) {
	        int a = matrix[0][0];
	        int b = matrix[0][1];
	        int c = matrix[0][2];
	        int d = matrix[1][0];
	        int e = matrix[1][1];
	        int f = matrix[1][2];
	        int g = matrix[2][0];
	        int h = matrix[2][1];
	        int i = matrix[2][2];

	        int det = a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
	        return det;
	    }
	    public static double[][] inverse2x2(int[][] matrix) {
	        int det = determinant2x2(matrix);
	        if (det == 0) {
	            return null; 
	        }
	        double[][] inverse = new double[2][2];
	        inverse[0][0] = matrix[1][1] / (double)det;
	        inverse[0][1] = -matrix[0][1] / (double)det;
	        inverse[1][0] = -matrix[1][0] / (double)det;
	        inverse[1][1] = matrix[0][0] / (double)det;
	        return inverse;
	    }
	    public static double[][] inverse3x3(int[][] matrix) {
	        int det = determinant3x3(matrix);
	        if (det == 0) {
	            return null; 
	        }

	        double[][] inv = new double[3][3];
	        inv[0][0] =  determinant2x2(new int[][] {{matrix[1][1], matrix[1][2]}, {matrix[2][1], matrix[2][2]}});
	        inv[0][1] = -determinant2x2(new int[][] {{matrix[1][0], matrix[1][2]}, {matrix[2][0], matrix[2][2]}});
	        inv[0][2] =  determinant2x2(new int[][] {{matrix[1][0], matrix[1][1]}, {matrix[2][0], matrix[2][1]}});
	        
	        inv[1][0] = -determinant2x2(new int[][] {{matrix[0][1], matrix[0][2]}, {matrix[2][1], matrix[2][2]}});
	        inv[1][1] =  determinant2x2(new int[][] {{matrix[0][0], matrix[0][2]}, {matrix[2][0], matrix[2][2]}});
	        inv[1][2] = -determinant2x2(new int[][] {{matrix[0][0], matrix[0][1]}, {matrix[2][0], matrix[2][1]}});
	        
	        inv[2][0] =  determinant2x2(new int[][] {{matrix[0][1], matrix[0][2]}, {matrix[1][1], matrix[1][2]}});
	        inv[2][1] = -determinant2x2(new int[][] {{matrix[0][0], matrix[0][2]}, {matrix[1][0], matrix[1][2]}});
	        inv[2][2] =  determinant2x2(new int[][] {{matrix[0][0], matrix[0][1]}, {matrix[1][0], matrix[1][1]}});
	        double[][] adj = new double[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                adj[i][j] = inv[j][i];
	            }
	        }
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                adj[i][j] = adj[i][j] / det;
	            }
	        }

	        return adj;
	    }
	    public static void displayMatrixDouble(double[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter rows:");
	        int rows = sc.nextInt();
	        System.out.println("Enter cols:");
	        int cols = sc.nextInt();

	        int[][] matrix = createRandomMatrix(rows, cols);
	        System.out.println("Random Matrix:");
	        displayMatrix(matrix);

	        int[][] transposed = transpose(matrix);
	        System.out.println("Transposed Matrix:");
	        displayMatrix(transposed);

	        if (rows == 2 && cols == 2) {
	            int det = determinant2x2(matrix);
	            System.out.println("Determinant (2x2): " + det);

	            double[][] inv = inverse2x2(matrix);
	            if (inv != null) {
	                System.out.println("Inverse (2x2):");
	                displayMatrixDouble(inv);
	            } else {
	                System.out.println("Inverse does not exist for this matrix.");
	            }
	        } else if (rows == 3 && cols == 3) {
	            int det = determinant3x3(matrix);
	            System.out.println("Determinant (3x3): " + det);

	            double[][] inv = inverse3x3(matrix);
	            if (inv != null) {
	                System.out.println("Inverse (3x3):");
	                displayMatrixDouble(inv);
	            } else {
	                System.out.println("Inverse does not exist for this matrix.");
	            }
	        } else {
	            System.out.println("Determinant and inverse calculation only supported for 2x2 and 3x3 matrices.");
	        }

	        sc.close();
	    }
	}
