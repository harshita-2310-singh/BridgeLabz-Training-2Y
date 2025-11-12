import java.util.*;

class Package {
    String packageId;
    String recipient;
    String status; // Pending, Delivered, Returned

    Package(String packageId, String recipient) {
        this.packageId = packageId;
        this.recipient = recipient;
        this.status = "Pending";
    }

    public String toString() {
        return packageId + " → " + recipient + " (" + status + ")";
    }
}

public class WarehouseDeliverySystem {
    public static void main(String[] args) {
        Queue<Package> pendingDeliveries = new LinkedList<>();
        Set<String> uniquePackageIds = new HashSet<>();
        List<Package> deliveredList = new ArrayList<>();
        Stack<Package> returnedStack = new Stack<>();

        addPackage(pendingDeliveries, uniquePackageIds, new Package("P101", "Alice"));
        addPackage(pendingDeliveries, uniquePackageIds, new Package("P102", "Bob"));
        addPackage(pendingDeliveries, uniquePackageIds, new Package("P103", "Charlie"));
        addPackage(pendingDeliveries, uniquePackageIds, new Package("P101", "Alice")); // Duplicate ignored

        System.out.println("Processing Deliveries...\n");
        while (!pendingDeliveries.isEmpty()) {
            Package pkg = pendingDeliveries.poll();
            if (pkg.recipient.equals("Bob")) {
                pkg.status = "Returned";
                returnedStack.push(pkg);
                System.out.println("Returned: " + pkg);
            } else {
                pkg.status = "Delivered";
                deliveredList.add(pkg);
                System.out.println("Delivered: " + pkg);
            }
        }

        System.out.println("\nSummary:");
        System.out.println("Delivered Packages:");
        for (Package p : deliveredList) System.out.println(p);

        System.out.println("\nReturned Packages:");
        while (!returnedStack.isEmpty()) System.out.println(returnedStack.pop());

        System.out.println("\nUnique Package IDs: " + uniquePackageIds);
    }

    static void addPackage(Queue<Package> queue, Set<String> idSet, Package pkg) {
        if (idSet.add(pkg.packageId)) queue.add(pkg);
        else System.out.println("Duplicate Package ID Ignored: " + pkg.packageId);
    }
}
