import java.util.Scanner;

public class SecondWordUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        if (words.length < 2) {
            System.out.println("There is no second word.");
        } else {
            String secondWord = words[1].toUpperCase();
            System.out.println("Second word in uppercase: " + secondWord);
        }
    }
}
