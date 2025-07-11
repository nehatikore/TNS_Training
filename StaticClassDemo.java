class Outer {
    static class Inner {
        void msg() {
            System.out.println("Hello from static nested class");
        }
    }
}

class Test {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner(); // No Outer object needed
        obj.msg();
    }
}
