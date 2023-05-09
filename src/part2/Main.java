package part2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = { 5, 3, 8, 4, 2 };
        Selection.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] words = { "banana", "apple", "pear", "orange" };
        Selection.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
