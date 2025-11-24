import java.util.Scanner;

public class HillWeight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total levels: ");
        int totalLevels = sc.nextInt();

        System.out.print("Enter weight of head level: ");
        int headWeight = sc.nextInt();

        System.out.print("Enter weight increment per level: ");
        int increment = sc.nextInt();

        int totalWeight = 0;
        int currentWeight = headWeight;
        for (int level = 1; level <= totalLevels; level++) {
            int stars = level;     
            totalWeight += stars * currentWeight;
            currentWeight += increment;
        }

        System.out.println("Total weight of the hill pattern = " + totalWeight);
    }
}
