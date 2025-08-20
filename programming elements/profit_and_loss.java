package program;

public class profit_and_loss {

	public static void main(String[] args) {
		int cost_price=129;
		int selling_price=191;
		double profit=selling_price-cost_price;
		double percent= (profit/cost_price)*100;
		System.out.print("The Cost Price is INR "+cost_price +"  and Selling Price is INR "
+ selling_price +"\n" +"The Profit is INR "+ profit + "and the Profit Percentage is  "+percent);


	}

}
