public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double doubleObj = 45.67;
        double primitiveDouble = doubleObj.doubleValue(); 
        int primitiveInt = (int) primitiveDouble;
        System.out.println("Wrapper object value: " + doubleObj);
        System.out.println("Primitive double value: " + primitiveDouble);
        System.out.println("Primitive int value (casted): " + primitiveInt);
    }
}
