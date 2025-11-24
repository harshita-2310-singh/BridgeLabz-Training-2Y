class Result {
    public int output1; 
    public int output2; 
}

public class encode{

    public Result findOriginalFirstAndSum(int[] encoded, int n) {

        int[] original = new int[n];

      
        original[n - 1] = encoded[n - 1];

      
        for (int i = n - 2; i >= 0; i--) {
            original[i] = encoded[i] - original[i + 1];
        }

        Result res = new Result();
        res.output1 = original[0];

       
        int sum = 0;
        for (int num : original) {
            sum += num;
        }
        res.output2 = sum;

        return res;
    }


    public static void main(String[] args) {
        encode s = new encode();
        int[] arr = {7, 6, 8, 16, 12, 3};
        Result r = s.findOriginalFirstAndSum(arr, arr.length);

        System.out.println("First original number: " + r.output1);
        System.out.println("Sum of original numbers: " + r.output2);
    }
}
