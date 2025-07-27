public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // 1. Length
        System.out.println("Length of str1: " + str1.length());

        // 2. Concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated: " + str3);

        // 3. charAt
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 4. substring
        System.out.println("Substring of str3 (0 to 5): " + str3.substring(0, 5));

        // 5. equals
        System.out.println("str1 equals str2? " + str1.equals(str2));

        // 6. equalsIgnoreCase
        System.out.println("HELLO equalsIgnoreCase str1? " + "HELLO".equalsIgnoreCase(str1));

        // 7. compareTo
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 8. toUpperCase and toLowerCase
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        // 9. contains
        System.out.println("Does str3 contain 'lo'? " + str3.contains("lo"));

        // 10. replace
        System.out.println("Replace 'l' with 'x' in str1: " + str1.replace('l', 'x'));

        // 11. trim
        String str4 = "   Hello Java   ";
        System.out.println("Before trim: '" + str4 + "'");
        System.out.println("After trim: '" + str4.trim() + "'");

        // 12. startsWith and endsWith
        System.out.println("str1 starts with 'He'? " + str1.startsWith("He"));
        System.out.println("str2 ends with 'ld'? " + str2.endsWith("ld"));

        // 13. indexOf
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));

        // 14. lastIndexOf
        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));

        // 15. isEmpty
        String emptyStr = "";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());

        // 16. split
        String line = "Java is fun";
        String[] words = line.split(" ");
        System.out.println("Words in line:");
        for (String word : words) {
            System.out.println(word);
        }

        // 17. toCharArray
        char[] chars = str1.toCharArray();
        System.out.println("Characters in str1:");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 18. StringBuilder (bonus - mutable string)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("Using StringBuilder: " + sb);
    }
}
