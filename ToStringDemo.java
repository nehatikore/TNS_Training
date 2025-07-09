class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Neha");
        System.out.println(s1);  // Output: Student ID: 101, Name: Neha
    }
}
