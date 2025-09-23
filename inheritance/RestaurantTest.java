
class PersonBase {
    String name;
    int id;

    PersonBase(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {
    void performDuties();
}

class ChefEx extends PersonBase implements Worker {
    String specialty;

    ChefEx(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking " + specialty + " dishes.");
    }
}

class WaiterEx extends PersonBase implements Worker {
    int tableCount;

    WaiterEx(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tableCount + " tables.");
    }
}
public class RestaurantTest {
    public static void main(String[] args) {
        ChefEx chef = new ChefEx("Alice", 101, "Italian");
        WaiterEx waiter = new WaiterEx("Bob", 201, 5);

        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        waiter.displayDetails();
        waiter.performDuties();
    }
}
