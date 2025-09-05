import java.util.Scanner;
public class calender {
		    static String[] months = {
		        "January", "February", "March", "April", "May", "June",
		        "July", "August", "September", "October", "November", "December"
		    };
		    static int[] daysInMonth = {
		        31, 28, 31, 30, 31, 30,
		        31, 31, 30, 31, 30, 31
		    };
		    public static boolean isLeapYear(int year) {
		        if (year % 400 == 0)
		            return true;
		        if (year % 100 == 0)
		            return false;
		        if (year % 4 == 0)
		            return true;
		        return false;
		    }
		    public static int getDaysInMonth(int month, int year) {
		        if (month == 1) { 
		            if (isLeapYear(year)) {
		                return 29;
		            } else {
		                return 28;
		            }
		        }
		        return daysInMonth[month];
		    }

		    public static int getFirstDay(int month, int year) {
		        int y = year;
		        int m = month + 1;
		        if (m < 3) {
		            m += 12;
		            y -= 1;
		        }
		        int k = y % 100;
		        int j = y / 100;
		        int d = 1; 

		        int f = d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j);
		        int day = f % 7;
		        day = (day + 6) % 7;

		        return day;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter month (1-12): ");
		        int month = scanner.nextInt() - 1; 

		        System.out.print("Enter year: ");
		        int year = scanner.nextInt();

		     
		        String monthName = months[month];
		        int numberOfDays = getDaysInMonth(month, year);
		        int firstDay = getFirstDay(month, year);
		        System.out.println("     " + monthName + " " + year);
		        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		        for (int i = 0; i < firstDay; i++) {
		            System.out.print("    ");
		        }
		        for (int day = 1; day <= numberOfDays; day++) {
		            if (day < 10) {
		                System.out.print("  " + day + " ");
		            } else {
		                System.out.print(" " + day + " ");
		            }
		            if ((firstDay + day) % 7 == 0) {
		                System.out.println();
		            }
		        }

		        System.out.println(); 
		        scanner.close();
		    }
		}
