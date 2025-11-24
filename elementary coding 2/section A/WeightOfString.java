import java.util.Scanner;

public class WeightOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input1 = sc.nextLine();

        System.out.print("Enter 0 (ignore vowels) or 1 (include vowels): ");
        int input2 = sc.nextInt();

        int weight = 0;

        input1 = input1.toLowerCase();

        for (int i = 0; i < input1.length(); i++) {
            char ch = input1.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                boolean isVowel = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');

                if (isVowel && input2 == 0) {
                    continue; // skip vowels
                }

                weight += ch - 'a' + 1; // alphabetical position
            }
        }

        System.out.println("Weight of the string = " + weight);
    }
}
