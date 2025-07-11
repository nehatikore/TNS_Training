class Utility {
    static int square(int x) {
        return x * x;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Utility.square(5)); // No need to create Utility object
    }
}
