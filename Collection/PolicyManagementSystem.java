import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyholderName() { return policyholderName; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premiumAmount; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyholderName + " | " + expiryDate + " | " + coverageType + " | ₹" + premiumAmount;
    }
}

public class PolicyManagementSystem {
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("HashSet (Unique Policies):");
        hashSet.forEach(System.out::println);
        System.out.println("\nLinkedHashSet (Insertion Order):");
        linkedHashSet.forEach(System.out::println);
        System.out.println("\nTreeSet (Sorted by Expiry Date):");
        treeSet.forEach(System.out::println);
    }

    public void displayExpiringSoon() {
        System.out.println("\nPolicies Expiring within 30 Days:");
        LocalDate today = LocalDate.now();
        treeSet.stream()
                .filter(p -> ChronoUnit.DAYS.between(today, p.getExpiryDate()) <= 30)
                .forEach(System.out::println);
    }

    public void displayByCoverageType(String type) {
        System.out.println("\nPolicies with Coverage Type: " + type);
        hashSet.stream()
                .filter(p -> p.getCoverageType().equalsIgnoreCase(type))
                .forEach(System.out::println);
    }

    public void findDuplicatePolicies(List<Policy> allPolicies) {
        System.out.println("\nDuplicate Policies (Based on Policy Number):");
        Set<String> seen = new HashSet<>();
        allPolicies.stream()
                .filter(p -> !seen.add(p.getPolicyNumber()))
                .forEach(System.out::println);
    }

    public void performanceComparison() {
        List<Policy> sampleList = new ArrayList<>(hashSet);
        long start, end;

        start = System.nanoTime();
        hashSet.contains(sampleList.get(0));
        end = System.nanoTime();
        System.out.println("\nHashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(sampleList.get(0));
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(sampleList.get(0));
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) {
        PolicyManagementSystem system = new PolicyManagementSystem();

        Policy p1 = new Policy("P101", "Aarav", LocalDate.now().plusDays(15), "Health", 12000);
        Policy p2 = new Policy("P102", "Diya", LocalDate.now().plusDays(45), "Auto", 8000);
        Policy p3 = new Policy("P103", "Rohan", LocalDate.now().plusDays(25), "Home", 15000);
        Policy p4 = new Policy("P101", "Aarav", LocalDate.now().plusDays(15), "Health", 12000);

        system.addPolicy(p1);
        system.addPolicy(p2);
        system.addPolicy(p3);
        system.addPolicy(p4);

        system.displayAllPolicies();
        system.displayExpiringSoon();
        system.displayByCoverageType("Health");
        system.findDuplicatePolicies(Arrays.asList(p1, p2, p3, p4));
        system.performanceComparison();
    }
}
