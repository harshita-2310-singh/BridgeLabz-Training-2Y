public class BankTransactionLimits {

    public static double getRemainingLimit(Double limit, double withdrawn) {
        if (limit == null) {
            return 0.0;
        }
        return limit - withdrawn;
    }

    public static void main(String[] args) {
        Double limit1 = 1000.0;
        Double limit2 = null;
        double withdrawn = 250.0;

        System.out.println("Remaining limit (account 1): " + getRemainingLimit(limit1, withdrawn));
        System.out.println("Remaining limit (account 2): " + getRemainingLimit(limit2, withdrawn));
    }
}
