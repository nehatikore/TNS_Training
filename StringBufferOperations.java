public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" Java");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, " World");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(6, 11, "Everyone");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(0, 6);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
