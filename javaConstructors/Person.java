package constructorslevel1;

public class Person {
		    String name;
		    int age;

		    Person(String n, int a) {
		        name = n;
		        age = a;
		    }

		    Person(Person p) {
		        name = p.name;
		        age = p.age;
		    }

		    void display() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        Person p1 = new Person("Alice", 25);
		        p1.display();

		        Person p2 = new Person(p1);
		        p2.display();
		    }
		}
