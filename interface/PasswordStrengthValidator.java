public class PasswordStrengthValidator {

    interface PasswordValidator {
        boolean validate(String password);
    }

    static class StrongPasswordValidator implements PasswordValidator {
        public boolean validate(String password) {
            if (password.length() < 8) return false;
            if (!password.matches(".*[A-Z].*")) return false;
            if (!password.matches(".*\\d.*")) return false;
            if (!password.matches(".*[!@#$%^&*()].*")) return false;
            return true;
        }
    }

    public static void main(String[] args) {
        PasswordValidator validatorObj = new StrongPasswordValidator();

        PasswordValidator validatorLambda = password -> {
            if (password.length() < 8) return false;
            if (!password.matches(".*[A-Z].*")) return false;
            if (!password.matches(".*\\d.*")) return false;
            if (!password.matches(".*[!@#$%^&*()].*")) return false;
            return true;
        };

        String[] passwords = {"Abc123!", "Abc123!@#"};

        System.out.println("Password Strength Check:\n");

        for (String pwd : passwords) {
            boolean objResult = validatorObj.validate(pwd);
            boolean lambdaResult = validatorLambda.validate(pwd);

            System.out.printf("Password: %-10s | Object Result: %-5s | Lambda Result: %-5s%n",
                              pwd, objResult, lambdaResult);
        }
    }
}
