import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");  // Duplicate

        System.out.println(set); // Output: [Apple, Banana, Mango] (Order may vary)
    }
}
