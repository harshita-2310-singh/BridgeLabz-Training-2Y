import java.util.Scanner;
public class leap_year {
		    public static boolean isLeapYear(int year) {
		        if (year < 1582) {
		            return false;  
		        }

		        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);
		        boolean conditionB = (year % 400 == 0);

		        return conditionA || conditionB;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a year (>= 1582): ");
		        int year = scanner.nextInt();

		        if (year < 1582) {
		            System.out.println("Year must be 1582 or later to use Gregorian calendar rules.");
		        } else {
		            if (isLeapYear(year)) {
		                System.out.println(year + " is a Leap Year.");
		            } else {
		                System.out.println(year + " is not a Leap Year.");
		            }
		        }

		        scanner.close();
		    }
		}
