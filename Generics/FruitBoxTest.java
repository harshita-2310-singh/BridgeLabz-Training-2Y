import java.util.*;

class Fruit {
    String name;
    Fruit(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple");
    }
}

class Mango extends Fruit {
    Mango() {
        super("Mango");
    }
}

class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public void displayFruits() {
        for (T fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

public class FruitBoxTest {
    public static void main(String[] args) {
        FruitBox<Fruit> box1 = new FruitBox<>();
        box1.addFruit(new Apple());
        box1.addFruit(new Mango());
        box1.displayFruits();
        // FruitBox<Car> carBox = new FruitBox<>();
    }
}

class Car {
    String model = "Tesla";
}
