import java.util.Scanner;
public class bonuses {

	public static void main(String[] args) {
	
		
		
		        Scanner sc = new Scanner(System.in);     
		        System.out.print("Enter your salary: ");
		        double salary = sc.nextDouble();
		        System.out.print("Enter your years of service: ");
		        int years = sc.nextInt();        
		        if (years > 5) {
		            double bonus = salary * 0.05; 
		            System.out.println("You are eligible for a bonus of: " + bonus);
		        } else {
		            System.out.println("No bonus! Work more than 5 years to get a bonus.");
		        }

		        sc.close();

			}
		

	

}
