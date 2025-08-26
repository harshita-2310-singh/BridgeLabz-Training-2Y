import java.util.*;
public class diamond {


		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of rows for half diamond: ");
		        int n = sc.nextInt();

		        // Upper half of diamond
		        for (int i = 1; i <= n; i++) {
		            for (int j = i; j < n; j++) {
		                System.out.print(" "); // print spaces
		            }
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print("*"); // print stars
		            }
		            System.out.println();
		        }

		        // Lower half of diamond
		        for (int i = n - 1; i >= 1; i--) {
		            for (int j = n; j > i; j--) {
		                System.out.print(" "); // print spaces
		            }
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print("*"); // print stars
		            }
		            System.out.println();
		        }
		        
		    
		

	}

}
