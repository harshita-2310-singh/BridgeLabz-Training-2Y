import java.util.*;
public class leap_year_logical {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int year=sc.nextInt();

		        if (year < 1582) {
		            System.out.println("The program only works for years >= 1582.");
		        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		            System.out.println("The year is a Leap Year.");
		        } else {
		            System.out.println("The year is not a Leap Year.");
		        }

		    }

	}


