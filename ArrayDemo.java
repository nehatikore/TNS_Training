import java.util.*;

class Main {
    public static void main(String[] args) {
        
        int[] arr = new int[3];
        int[] arr1 = {1, 2, 3, 4, 5};

        arr[0] = 25;
        arr[1] = 50;
        arr[2] = 20;

        // Print array using Arrays.toString()
        System.out.println("Original arr: " + Arrays.toString(arr));
        
        // Print specific element
        System.out.println("arr[1]: " + arr[1]);

        // Using traditional for loop
        System.out.println("Using for loop:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Using enhanced for-each loop
        System.out.println("Using for-each loop:");
        for(int val : arr) {
            System.out.println(val);
        }

        // Print arr1
        System.out.println("arr1: " + Arrays.toString(arr1));

        // Compare array references (false)
        System.out.println("arr.equals(arr1): " + arr.equals(arr1));

        // Compare actual contents
        System.out.println("Arrays.equals(arr, arr1): " + Arrays.equals(arr, arr1));

        // Sort arr
        Arrays.sort(arr);
        System.out.println("Sorted arr: " + Arrays.toString(arr));

        // Copy array
        int[] arr2 = Arrays.copyOf(arr, 5);
        System.out.println("Copied arr2: " + Arrays.toString(arr2));

        // Fill array with a single value
        Arrays.fill(arr, 33);
        System.out.println("Filled arr: " + Arrays.toString(arr));

        // Binary search example
        int[] searchArr = {10, 20, 30, 40, 50};
        Arrays.sort(searchArr); // binarySearch needs sorted array
        int key = 30;
        int index = Arrays.binarySearch(searchArr, key);
        System.out.println("Binary search for " + key + ": found at index " + index);
    }
}
