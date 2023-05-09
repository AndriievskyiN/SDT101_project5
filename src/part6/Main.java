package part6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {13, 75, 12, 4, 18, 6, 9, 10, 7, 14, 15};
        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
