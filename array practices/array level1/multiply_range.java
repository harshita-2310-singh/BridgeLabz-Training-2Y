import java.util.Scanner;

import java.util.*;
public class multiply_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a number to get its multiplication table from 6 to 9: ");
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }
        System.out.println("\nMultiplication Table for " + number + " from 6 to 9:");
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

  
    }
}
