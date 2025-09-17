package constructorslevel1;

public class Circle {
		    double radius;

		    Circle() {
		        this(1.0);
		    }

		    Circle(double r) {
		        radius = r;
		    }

		    double area() {
		        return Math.PI * radius * radius;
		    }

		    double circumference() {
		        return 2 * Math.PI * radius;
		    }

		    void display() {
		        System.out.println("Radius: " + radius);
		        System.out.println("Area: " + area());
		        System.out.println("Circumference: " + circumference());
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        Circle c1 = new Circle();
		        c1.display();

		        Circle c2 = new Circle(5.5);
		        c2.display();
		    }
		}
