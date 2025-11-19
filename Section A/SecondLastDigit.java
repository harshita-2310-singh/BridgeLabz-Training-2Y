import java.util.*;
public class SecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int secondLast = (n / 10) % 10;
        System.out.println(secondLast);
    }
}
