import java.util.*;
public class harshad_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num; 
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;  
            sum += digit;           
            temp = temp / 10;       
        }
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is Not a Harshad Number.");
        }

	}

}
