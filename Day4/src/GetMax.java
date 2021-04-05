import java.util.Arrays;

public class GetMax <T extends Comparable<T>>{
    public static void main(String[] args) {
        Integer[] intArray = {2,3,4};
        Float[] flArray = {-1.0f, -2.2f, 0.01f};
        String[] strArray = {"How","Hello","Hu"};
        getMaxString(intArray);
        getMaxString(flArray);
        getMaxString(strArray);

        getMaxGen(intArray);
        getMaxGen(flArray);
        getMaxGen(strArray);
    }

    private static <T extends Comparable<T>> void getMaxGen(T[] inpArray) {
        Arrays.stream(inpArray).max(T::compareTo).ifPresent(System.out::println);
        Arrays.stream(inpArray).sorted(T::compareTo).forEach(System.out::println);
    }

    private static void getMaxString(String[] strArray) {
        Arrays.stream(strArray).max(String::compareTo).ifPresent(System.out::println);
    }

    private static void getMaxString(Float[] flArray) {
        Arrays.stream(flArray).max(Float::compareTo).ifPresent(System.out::println);
    }

    private static void getMaxString(Integer[] intArray) {
        Arrays.stream(intArray).max(Integer::compareTo).ifPresent(System.out::println);
    }
}
