import java.util.*;

class Parcel implements Comparable<Parcel> {
    String deliveryId;
    String destination;
    int priority; // Higher number = higher priority

    Parcel(String deliveryId, String destination, int priority) {
        this.deliveryId = deliveryId;
        this.destination = destination;
        this.priority = priority;
    }

    @Override
    public int compareTo(Parcel p) {
        return p.priority - this.priority; // Descending order
    }

    public String toString() {
        return "[" + deliveryId + "] " + destination + " (Priority: " + priority + ")";
    }
}

public class CourierDeliveryRoutingSystem {
    public static void main(String[] args) {
        PriorityQueue<Parcel> priorityQueue = new PriorityQueue<>();
        Queue<Parcel> normalQueue = new LinkedList<>();
        Set<String> assignedIDs = new HashSet<>();
        List<Parcel> completedDeliveries = new ArrayList<>();

        addParcel(priorityQueue, normalQueue, assignedIDs, new Parcel("P101", "Delhi", 5));
        addParcel(priorityQueue, normalQueue, assignedIDs, new Parcel("P102", "Mumbai", 3));
        addParcel(priorityQueue, normalQueue, assignedIDs, new Parcel("P103", "Kolkata", 1));
        addParcel(priorityQueue, normalQueue, assignedIDs, new Parcel("P101", "Chennai", 4)); // Duplicate ignored

        System.out.println("\nAssigning Delivery Agents (High Priority First):");
        while (!priorityQueue.isEmpty()) {
            Parcel p = priorityQueue.poll();
            System.out.println("Delivering: " + p);
            completedDeliveries.add(p);
        }

        System.out.println("\nProcessing Normal Deliveries:");
        while (!normalQueue.isEmpty()) {
            Parcel p = normalQueue.poll();
            System.out.println("Delivering: " + p);
            completedDeliveries.add(p);
        }

        System.out.println("\nCompleted Deliveries:");
        for (Parcel p : completedDeliveries) System.out.println(p);

        System.out.println("\nAssigned Delivery IDs: " + assignedIDs);
    }

    static void addParcel(PriorityQueue<Parcel> pq, Queue<Parcel> nq, Set<String> ids, Parcel parcel) {
        if (ids.add(parcel.deliveryId)) {
            if (parcel.priority >= 3) pq.add(parcel);
            else nq.add(parcel);
            System.out.println("Added: " + parcel);
        } else {
            System.out.println("Duplicate Delivery ID Ignored: " + parcel.deliveryId);
        }
    }
}
