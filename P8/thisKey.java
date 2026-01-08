class student {
    int id;
    String name;

    student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + this.id + ", Name: " + this.name);
    }
}

class a1 {
    public static void main(String[] args) {
        student s1 = new student(1, "Arjun");
        student s2 = new student(2, "Moli");

        s1.display();
        s2.display();
    }
}