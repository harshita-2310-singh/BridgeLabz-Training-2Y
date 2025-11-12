public class GenericMaximum {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum of 3, 7, 5: " + maximum(3, 7, 5));
        System.out.println("Maximum of 6.6, 8.8, 7.7: " + maximum(6.6, 8.8, 7.7));
        System.out.println("Maximum of pear, apple, orange: " + maximum("pear", "apple", "orange"));
    }
}
