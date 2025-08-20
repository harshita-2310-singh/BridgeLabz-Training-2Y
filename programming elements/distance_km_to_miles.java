package program;
import java.util.*;
public class distance_km_to_miles {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double km=input.nextInt();
		double miles=1.6*km;
		System.out.print("The total miles is "+ miles+" mile for the given "+km +" km");

	}

}
