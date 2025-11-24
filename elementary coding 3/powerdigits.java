public class powerdigits {

    public static long sumOfPowerOfDigits(long input1) {
        String num = String.valueOf(input1);
        long sum = 0;

        for (int i = 0; i < num.length(); i++) {
            int currentDigit = num.charAt(i) - '0';

           
            if (i < num.length() - 1) {
                int nextDigit = num.charAt(i + 1) - '0';
                sum += Math.pow(currentDigit, nextDigit);
            } 
           
            else {
                sum += Math.pow(currentDigit, 0);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        long input = 582109;
        System.out.println(sumOfPowerOfDigits(input));  
    }
}
