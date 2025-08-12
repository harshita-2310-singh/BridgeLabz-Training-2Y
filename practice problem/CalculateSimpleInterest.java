import java.util.*;
public class CalculateSimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		float SI=(p*r*t)/100;
		System.out.print(SI);

	}

}
