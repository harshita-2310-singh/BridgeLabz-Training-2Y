
public class otp {
		    public static int generateOTP() {
		        return (int)(Math.random() * 1000000);
		    }
		    public static boolean areOTPsUnique(int[] otps) {
		        for (int i = 0; i < otps.length; i++) {
		            for (int j = i + 1; j < otps.length; j++) {
		                if (otps[i] == otps[j]) {
		                    return false;
		                }
		            }
		        }
		        return true;
		    }
		    public static String toSixDigitString(int number) {
		        String numStr = Integer.toString(number);
		        while (numStr.length() < 6) {
		            numStr = "0" + numStr;
		        }
		        return numStr;
		    }

		    public static void main(String[] args) {
		        int[] otpArray = new int[10];
		        for (int i = 0; i < otpArray.length; i++) {
		            otpArray[i] = generateOTP();
		        }
		        System.out.println("Generated OTPs:");
		        for (int i = 0; i < otpArray.length; i++) {
		            System.out.println(toSixDigitString(otpArray[i]));
		        }
		        boolean unique = areOTPsUnique(otpArray);
		        System.out.println("Are all OTPs unique? " + (unique ? "Yes" : "No"));
		    }
		}
