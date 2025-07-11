class Student {
    static String college = "ABC College"; // shared across all students
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " studies in " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Neha");
        Student s2 = new Student("Aman");

        s1.display();
        s2.display();
    }
}
