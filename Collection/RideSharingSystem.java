import java.util.*;

class RideRequest implements Comparable<RideRequest> {
    String user;
    int priority;
    RideRequest(String user, int priority) { this.user = user; this.priority = priority; }
    public int compareTo(RideRequest r) { return Integer.compare(r.priority, this.priority); }
    public String toString() { return user + "(Priority " + priority + ")"; }
}

class Driver {
    String name;
    Driver(String name) { this.name = name; }
    public boolean equals(Object o) { return o instanceof Driver && ((Driver)o).name.equals(this.name); }
    public int hashCode() { return Objects.hash(name); }
    public String toString() { return name; }
}

class Ride {
    String user;
    String driver;
    Ride(String user, String driver) { this.user = user; this.driver = driver; }
    public String toString() { return user + " → " + driver; }
}

public class RideSharingSystem {
    public static void main(String[] args) {
        PriorityQueue<RideRequest> requestQueue = new PriorityQueue<>();
        requestQueue.add(new RideRequest("User1", 3));
        requestQueue.add(new RideRequest("User2", 1));
        requestQueue.add(new RideRequest("User3", 5));

        Set<Driver> availableDrivers = new HashSet<>(Arrays.asList(
            new Driver("John"), new Driver("Emma"), new Driver("Alex")
        ));

        List<Ride> completedRides = new ArrayList<>();

        Iterator<Driver> driverIterator = availableDrivers.iterator();
        while (!requestQueue.isEmpty() && driverIterator.hasNext()) {
            RideRequest request = requestQueue.poll();
            Driver driver = driverIterator.next();
            completedRides.add(new Ride(request.user, driver.name));
        }

        System.out.println("Completed Rides:");
        for (Ride r : completedRides) System.out.println(r);
    }
}
