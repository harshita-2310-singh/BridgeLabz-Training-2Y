import java.util.Scanner;

public class AsciiCodeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String code = "";

        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);  
            code += ascii;  
        }

        System.out.println("Generated Numeric Code: " + code);
    }
}
