package program;

public class fee_discount {

	public static void main(String[] args) {
		double fee=125000;
		double discountPercent=10;
		double discount =(fee*discountPercent)/100;
		double finalfees= fee-discount;
		System.out.print("The discount amount is INR "+ discount +" and the final discounted fee is INR "+ finalfees);
		

	}

}
