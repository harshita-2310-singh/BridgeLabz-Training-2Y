import java.util.*;
public class compare_char_at{
        Scanner sc = new Scanner(System.in);
            public static boolean compareStrings(String str1, String str2) {
                if (str1.length() != str2.length()) {
                    return false;  
                }

               
                for (int i = 0; i < str1.length(); i++) {
                    if (str1.charAt(i) != str2.charAt(i)) {
                        return false;  
                    }
                }

                return true; 
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter first string: ");
                String string1 = sc.next();

                System.out.print("Enter second string: ");
                String string2 = sc.next();
                boolean resultFromCharAt = compareStrings(string1, string2);
                boolean resultFromEquals = string1.equals(string2);
                System.out.println("Result from charAt comparison: " + resultFromCharAt);
                System.out.println("Result from equals() method: " + resultFromEquals);

               
                if (resultFromCharAt == resultFromEquals) {
                    System.out.println("Both methods gave the same result.");
                } else {
                    System.out.println("Methods gave different results.");
                }

               
            }
        }

    

