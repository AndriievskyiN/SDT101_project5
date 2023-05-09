package part7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {4, 2, 1, 6, 5, 3};
        Quick.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"pear", "apple", "orange", "banana"};
        Quick.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        Double[] arr3 = {1.2, 2.4, 0.5, 3.1, 2.0};
        Quick.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
