import java.util.*;
public class Multi_Dimensional_Arrays {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		       
		        System.out.print("Enter the number of rows: ");
		        int rows = sc.nextInt();

		        System.out.print("Enter the number of columns: ");
		        int columns = sc.nextInt();

		       
		        int[][] matrix = new int[rows][columns];

		        System.out.println("Enter elements of the matrix:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                System.out.print("Element [" + i + "][" + j + "]: ");
		                matrix[i][j] = sc.nextInt();
		            }
		        }

		        
		        int[] array = new int[rows * columns];

		        int index = 0;
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                array[index] = matrix[i][j];
		                index++;
		            }
		        }
		        System.out.println("\n1D Array copied from 2D matrix:");
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }

		        System.out.println(); 
		      
		    
		


	}

}
