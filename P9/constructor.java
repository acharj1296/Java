class const1 {
    String name;
    int age;
//default constructor
    const1() {
        name = "Arjun";
        age = 10;
    }
//parameterized constructor
    const1(String n, int a) {
        this.name = n;
        this.age = a;
    }
//copy constructor
    const1(const1 obj) {
        this.name = obj.name;
        this.age = obj.age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class ConstDemo {
    public static void main(String[] args) {
        // Using default constructor
        System.out.println("Default constructor:");
        const1 obj1 = new const1();
        obj1.display();

        // Using parameterized constructor
        System.out.println("Parameterized constructor:");
        const1 obj2 = new const1("Tanu", 20);
        obj2.display();

        // Using copy constructor
        System.out.println("Copy constructor:");
        const1 obj3 = new const1(obj2);
        obj3.display();
    }
}