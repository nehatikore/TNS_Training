class Outer {
    static int data = 10;

    static class Inner {
        void display() {
            System.out.println("Data from Outer: " + data);
        }
    }

    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner(); // no need to create Outer object
        obj.display();
    }
}
