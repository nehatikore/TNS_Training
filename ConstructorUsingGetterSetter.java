public class Customer {
    private int id;
    private String name;
    private int age;

    // Default Constructor
    public Customer() {
        System.out.println("Default Constructor.......");
    }

    // Parameterized Constructor
    public Customer(int id, String name, int age) {
        System.out.println("Parameterized Constructor called.....");
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        
        Customer c1 = new Customer();
        c1.setId(100);
        c1.setName("Ravi");
        c1.setAge(25);
        c1.display();

        Customer c2 = new Customer();
        // c2.display(); // This line is commented
    }
}
