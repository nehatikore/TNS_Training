// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        // stream is used to perform operations on data without changing the original data
        int sum = Arrays.stream(arr).sum();
        
        System.out.println(sum); // Output: 150
    }
}
