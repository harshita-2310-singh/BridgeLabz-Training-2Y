import java.util.*;
public class friends {

	public static void main(String[] args) {

		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter Amar's age: ");
		        int ageAmar = sc.nextInt();
		        System.out.print("Enter Akbar's age: ");
		        int ageAkbar = sc.nextInt();
		        System.out.print("Enter Anthony's age: ");
		        int ageAnthony = sc.nextInt();
		        System.out.print("Enter Amar's height (in cm): ");
		        int heightAmar = sc.nextInt();
		        System.out.print("Enter Akbar's height (in cm): ");
		        int heightAkbar = sc.nextInt();
		        System.out.print("Enter Anthony's height (in cm): ");
		        int heightAnthony = sc.nextInt();

		        
		        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
		            System.out.println("Amar is the youngest.");
		        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
		            System.out.println("Akbar is the youngest.");
		        } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
		            System.out.println("Anthony is the youngest.");
		        } else {
		            System.out.println("Two or more friends have the same youngest age.");
		        }

		       
		        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
		            System.out.println("Amar is the tallest.");
		        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
		            System.out.println("Akbar is the tallest.");
		        } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
		            System.out.println("Anthony is the tallest.");
		        } else {
		            System.out.println("Two or more friends have the same tallest height.");
		        }

		        
		    

	}

}
