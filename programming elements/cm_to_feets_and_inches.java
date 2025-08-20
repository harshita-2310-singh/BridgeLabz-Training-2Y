package program;
import java.util.*;

public class cm_to_feets_and_inches {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 double cm=sc.nextDouble();
	 double inch=cm*2.54;
	 double foot=12*2.54*cm;
	 System.out.print("Your Height in cm is "+ cm +" while in feet is "+ foot+" and inches is "+inch);
	 

	}

}
