import java.util.*;

public class CopyListElements {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }

    public static void main(String[] args) {
        List<Number> destList = new ArrayList<>();
        List<Integer> srcList = Arrays.asList(10, 20, 30);

        copyList(destList, srcList);

        System.out.println("Destination List after copy: " + destList);
    }
}
