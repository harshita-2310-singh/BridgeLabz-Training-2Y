public class cyclicsum {

    public static int sumOfSumsOfDigits(int input1) {

        String num = String.valueOf(input1);
        int n = num.length();
        int totalSum = 0;

    
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = num.charAt(i) - '0';
        }

        
        for (int r = 0; r < n; r++) {
            int sum = 0;

        
            for (int i = 0; i < n; i++) {
                sum += digits[(r + i) % n];
            }

            totalSum += sum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int input = 582109;
        System.out.println(sumOfSumsOfDigits(input));  
    }
}
