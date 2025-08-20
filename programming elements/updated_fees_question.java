package program;
import java.util.*;
public class updated_fees_question {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long  fee=sc.nextLong();
		int discountPercent =sc.nextInt();
		double discount =(fee*discountPercent)/100;
		double finalfees= fee-discount;
		System.out.print("The discount amount is INR "+ discount +" and the final discounted fee is INR "+ finalfees);
		

	}

}
