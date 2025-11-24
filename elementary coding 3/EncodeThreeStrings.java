import java.util.*;

public class EncodeThreeStrings {


    private static String[] splitIntoThree(String s) {
        int n = s.length();
        int part = n / 3;
        int rem = n % 3;

        int f = part;
        int m = part;
        int e = part;

    
        if (rem == 1) {
            m++;     
        } else if (rem == 2) {
            f++;     
            m++;    
        }

        String front = s.substring(0, f);
        String middle = s.substring(f, f + m);
        String end = s.substring(f + m);

        return new String[]{front, middle, end};
    }


    private static String toggleCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String s3 = sc.nextLine().trim();

    
        String[] a = splitIntoThree(s1);
        String[] b = splitIntoThree(s2);
        String[] c = splitIntoThree(s3);

    
        String out1 = a[0] + b[0] + c[0];
        String out2 = a[1] + b[1] + c[1];
        String out3 = a[2] + b[2] + c[2];

    
        out3 = toggleCase(out3);

    
        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);
    }
}
