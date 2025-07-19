public class Main {
    public static void main(String[] args) {
        int[] arr = {40, 10, 25, 70, 60};
        int key = 70;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}
