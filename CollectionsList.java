import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        
        System.out.println("Fruits: " + list);
        
        list.remove("Banana");
        
        System.out.println("After removing Banana: " + list);
    }
}
