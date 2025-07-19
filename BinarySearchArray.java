import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        // Must be sorted for binary search!
        int index = Arrays.binarySearch(arr, key);

        if (index >= 0) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found.");
        }
    }
}
